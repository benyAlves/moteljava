package br.sistcomp.sar.dominio;

import java.awt.Component;
import java.awt.Image;
import javax.media.Buffer;
import javax.media.CaptureDeviceInfo;
import javax.media.Player;
import javax.media.CaptureDeviceManager;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import javax.swing.JOptionPane;
import br.sistcomp.sar.GUI.TelaWebCam;
import br.sistcomp.sar.GUI.TelaCadastroAluno;
import br.sistcomp.sar.GUI.TelaAcessoModuloCadastro;
import br.sistcomp.sar.GUI.TelaCadastroProfessor;
import br.sistcomp.sar.GUI.TelaCadastroFuncionario;
import br.sistcomp.sar.GUI.TelaEditarAluno;
import br.sistcomp.sar.GUI.TelaEditarFuncionario;
import br.sistcomp.sar.GUI.TelaEditarProfessor;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Thiago Ramalho
 */
public class MetodosWebCam {

    public static CaptureDeviceInfo di;
    public static MediaLocator ml;
    public static Player player;
    public static Buffer buf;
    public static BufferToImage btoi;
    public static Image img, novaImagem;
    public static ImageIcon imagem;

    public static void capturarImagem() {

        FrameGrabbingControl fgc = (FrameGrabbingControl) player.getControl("javax.media.control.FrameGrabbingControl");
        buf = fgc.grabFrame();
        // Convertendo para imagem
        btoi = new BufferToImage((VideoFormat) buf.getFormat());
        img = btoi.createImage(buf);
        novaImagem = img.getScaledInstance(161, 161, 100);
        player.stop();

    }

    public static void visualizarVideo() {

        String str2 = "vfw//0";
        di = CaptureDeviceManager.getDevice(str2);
        ml = new MediaLocator("vfw://0");
        try {
            player = Manager.createRealizedPlayer(ml);
            player.start();

            Component comp;
            if ((comp = player.getVisualComponent()) != null) {
                comp.setSize(265, 211);
                TelaWebCam.painelWebCam.add(comp);
            }


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não Conectado");
        }

    }

    public static void aceitarImagem() {
        String caminho = System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\Foto.png";
        File f = new File(caminho);
        try {

            ImageIO.write((RenderedImage) img, "PNG", f);
            player.close();
            distinguirPessoa();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "não foi possivel encontrar "
                    + "o dispositivo para a captura da imagem.");
            e.printStackTrace();
        }

    }

    public static void distinguirPessoa() {
        if (TelaAcessoModuloCadastro.aluno == true) {
            try {
                TelaCadastroAluno.labelFoto.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaCadastroAluno.labelFoto.getWidth(), TelaCadastroAluno.labelFoto.getHeight(), novaImagem.SCALE_DEFAULT)));
            } catch (Exception e) {
                TelaEditarAluno.labelFoto.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaEditarAluno.labelFoto.getWidth(), TelaEditarAluno.labelFoto.getHeight(), novaImagem.SCALE_DEFAULT)));
            }
        } else if (TelaAcessoModuloCadastro.professor == true) {
            try {
                TelaCadastroProfessor.labelFotoProfessor.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaCadastroProfessor.labelFotoProfessor.getWidth(), TelaCadastroProfessor.labelFotoProfessor.getHeight(), novaImagem.SCALE_DEFAULT)));
            } catch (Exception e) {
                TelaEditarProfessor.labelFotoProfessor.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaEditarProfessor.labelFotoProfessor.getWidth(), TelaEditarProfessor.labelFotoProfessor.getHeight(), novaImagem.SCALE_DEFAULT)));
            }
        } else if (TelaAcessoModuloCadastro.funcionario == true) {
            try {
                TelaCadastroFuncionario.labelFoto.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaCadastroFuncionario.labelFoto.getWidth(), TelaCadastroFuncionario.labelFoto.getHeight(), novaImagem.SCALE_DEFAULT)));
            } catch (Exception e) {
                TelaEditarFuncionario.labelFoto.setIcon(new ImageIcon(novaImagem.getScaledInstance(TelaEditarFuncionario.labelFoto.getWidth(), TelaEditarFuncionario.labelFoto.getHeight(), novaImagem.SCALE_DEFAULT)));
            }
        }
    }

    public static void descartaImagem() {
        player.start();
    }
}
