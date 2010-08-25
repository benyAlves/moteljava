package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.CaixaAlta;
import br.sistcomp.sar.dominio.MetodosWebCam;
import br.sistcomp.sar.dominio.Professor;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import java.awt.Image;
import java.io.File;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Araujo.
 */
public class TelaCadastroProfessor extends javax.swing.JFrame {
  
    private boolean entrou;
    public static File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\semFoto.png");
    Fachada fachada = new Fachada();
    /** Creates new form TelaCadastroAluno */
    public TelaCadastroProfessor() {
        initComponents();
        caixaAlta();
        setLocationRelativeTo(null);
        setModalidades();
        proximaMatricula();
    }
     public void caixaAlta(){
        campoNomeProfessor.setDocument(new CaixaAlta());
        campoEnderecoProfessor.setDocument(new CaixaAlta());
        campoBairroProfessor.setDocument(new CaixaAlta());
        campoCidadeProfessor.setDocument(new CaixaAlta());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoMatriculaProfessor = new javax.swing.JTextField();
        painelFotoProfessor = new javax.swing.JPanel();
        labelFotoProfessor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNomeProfessor = new javax.swing.JTextField();
        campoEnderecoProfessor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBairroProfessor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoCidadeProfessor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        selecaoEstadoProfessor = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selecaoSexoProfessor = new javax.swing.JComboBox();
        botaoInserirFotoProfessor = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoIdentidadeProfessor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        selecaoOrgaoEmissorProfessor = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        campoEmailProfessor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaObservacoesProfessor = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        selecaoModalidadeProfessor = new javax.swing.JComboBox();
        campoCepProfessor = new javax.swing.JFormattedTextField();
        campoTelefoneProfessor = new javax.swing.JFormattedTextField();
        campoCelularProfessor = new javax.swing.JFormattedTextField();
        campoCpfProfessor = new javax.swing.JFormattedTextField();
        campoDataNascimentoProfessor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltarProfessor = new javax.swing.JButton();
        botaoCadastrarProfessor = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Professor");
        setMinimumSize(new java.awt.Dimension(734, 467));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel2.setText("Matrícula");

        campoMatriculaProfessor.setEditable(false);
        campoMatriculaProfessor.setFont(new java.awt.Font("sansserif", 1, 12));
        campoMatriculaProfessor.setForeground(new java.awt.Color(204, 0, 0));
        campoMatriculaProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        painelFotoProfessor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        painelFotoProfessor.setMaximumSize(new java.awt.Dimension(140, 160));
        painelFotoProfessor.setMinimumSize(new java.awt.Dimension(140, 160));

        labelFotoProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFotoProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png"))); // NOI18N

        javax.swing.GroupLayout painelFotoProfessorLayout = new javax.swing.GroupLayout(painelFotoProfessor);
        painelFotoProfessor.setLayout(painelFotoProfessorLayout);
        painelFotoProfessorLayout.setHorizontalGroup(
            painelFotoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFotoProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFotoProfessorLayout.setVerticalGroup(
            painelFotoProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFotoProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setText("Nome");

        jLabel6.setText("Endereço");

        jLabel7.setText("Bairro");

        jLabel8.setText("Cep");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF");

        selecaoEstadoProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel11.setText("Telefone");

        jLabel12.setText("Celular");

        jLabel13.setText("Sexo");

        selecaoSexoProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        botaoInserirFotoProfessor.setText("Inserir Foto");
        botaoInserirFotoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirFotoProfessorActionPerformed(evt);
            }
        });

        jLabel14.setText("CPF");

        jLabel15.setText("Identidade");

        jLabel16.setText("Orgão Emissor");

        selecaoOrgaoEmissorProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel17.setText("Email");

        jLabel18.setText("Data de Nascimento");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        jScrollPane1.setViewportView(caixaObservacoesProfessor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        jLabel3.setText("Modalidade");

        selecaoModalidadeProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));

        try {
            campoCepProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCepProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoTelefoneProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefoneProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCelularProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelularProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCpfProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoDataNascimentoProfessor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataNascimentoProfessor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataNascimentoProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addComponent(campoEnderecoProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoMatriculaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoModalidadeProfessor, 0, 241, Short.MAX_VALUE))
                            .addComponent(campoNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCepProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoCidadeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoEstadoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(campoTelefoneProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoIdentidadeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoOrgaoEmissorProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCelularProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoSexoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoInserirFotoProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelFotoProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFotoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoMatriculaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(selecaoModalidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEnderecoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoBairroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(campoCepProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoCidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(selecaoEstadoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoInserirFotoProfessor)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecaoSexoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(campoTelefoneProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(campoCelularProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(campoIdentidadeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoOrgaoEmissorProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(campoDataNascimentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Cadastrais", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ® SAR - Gerenciador Fitness");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        botaoVoltarProfessor.setText("Voltar");
        botaoVoltarProfessor.setMaximumSize(new java.awt.Dimension(83, 28));
        botaoVoltarProfessor.setMinimumSize(new java.awt.Dimension(83, 28));
        botaoVoltarProfessor.setPreferredSize(new java.awt.Dimension(83, 28));
        botaoVoltarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarProfessorActionPerformed(evt);
            }
        });

        botaoCadastrarProfessor.setText("Cadastrar");
        botaoCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrarProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void proximaMatricula(){
        campoMatriculaProfessor.setText(Integer.toString(fachada.getProximaMatricula()));
    }
    public void setModalidades(){
        Vector<String> nomes = fachada.getNomesModalidades();
        nomes.add(0,"- Selecione -");
        selecaoModalidadeProfessor.setModel(new DefaultComboBoxModel(nomes));
    }

    private void botaoVoltarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarProfessorActionPerformed
        try {
            MetodosWebCam.player.close();
            setVisible(false);
            new TelaAcessoCadastroProfessor().setVisible(true);
        } catch (Exception e) {
            setVisible(false);
            new TelaAcessoCadastroProfessor().setVisible(true);
        }
    }//GEN-LAST:event_botaoVoltarProfessorActionPerformed

    private void botaoInserirFotoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirFotoProfessorActionPerformed
        
        String opcoes[] = {"1. Da WebCam", "2. Do Arquivo"};
        String op = (String) JOptionPane.showInputDialog(null, "Escolha uma Opção", "Inserir Imagem", JOptionPane.INFORMATION_MESSAGE, null, opcoes, "1. teste");
        if (op != null) {
            if (op.equals(opcoes[0])) {

                new TelaWebCam().setVisible(true);
            } else if (op.equals(opcoes[1])) {
                try {
                    labelFotoProfessor.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));
                    final JFileChooser busca_foto = new JFileChooser();
                    busca_foto.setCurrentDirectory(new File("")); // Deixe assim que ele pega por default Meus Documentos de C:
                    busca_foto.setDialogTitle("Carregar imagem ");
                    busca_foto.showOpenDialog(this);

                    if (busca_foto != null && entrou == false) {
                        if (busca_foto.getSelectedFile() == null) {
                            labelFotoProfessor.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));
                        } else {
                            file = busca_foto.getSelectedFile();
                            Image image = ImageIO.read(file);
                            labelFotoProfessor.setIcon(new ImageIcon(image.getScaledInstance(labelFotoProfessor.getWidth(), labelFotoProfessor.getHeight(), image.SCALE_DEFAULT)));

                        }
                    }

                    entrou = false;
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Nao foi possível carregar a foto.");
                }
            }
        }
    }//GEN-LAST:event_botaoInserirFotoProfessorActionPerformed

    private void botaoCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarProfessorActionPerformed
        if (campoNomeProfessor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite o Nome");
        }
        else {
            if (campoDataNascimentoProfessor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite a Data do Nascimento");
            }
            else {
                if (campoCpfProfessor.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Digite o CPF");
                }
                else {
                    if (campoIdentidadeProfessor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Digite a Identidade");
                    }
                    else {
                         if (selecaoModalidadeProfessor.getSelectedItem().toString().equals("- Selecione -"))   {
                             JOptionPane.showMessageDialog(null,"Selecione uma Modalidade!");
                         }
                        else {
                            int matricula = Integer.parseInt(campoMatriculaProfessor.getText());
                            String modalidadeProfessor = selecaoModalidadeProfessor.getSelectedItem().toString();
                            String nomeProfessor = campoNomeProfessor.getText();
                            String endereco = campoEnderecoProfessor.getText();
                            String bairro = campoBairroProfessor.getText();
                            String cep = campoCepProfessor.getText();
                            String cidade = campoCidadeProfessor.getText();
                            String estado = selecaoEstadoProfessor.getSelectedItem().toString();
                            String telefone = campoTelefoneProfessor.getText();
                            String celular = campoCelularProfessor.getText();
                            String sexo = selecaoSexoProfessor.getSelectedItem().toString();
                            String cpf = campoCpfProfessor.getText();
                            String identidade = campoIdentidadeProfessor.getText();
                            String orgaoEmissor = selecaoOrgaoEmissorProfessor.getSelectedItem().toString();
                            String email = campoEmailProfessor.getText();
                            String dataNascimento = campoDataNascimentoProfessor.getText();
                            String observacoes = caixaObservacoesProfessor.getText();

                            Professor professor = new Professor(matricula, nomeProfessor, email, dataNascimento, sexo, cpf, identidade,
                                    orgaoEmissor, endereco, bairro, cidade, estado, cep, telefone, celular, observacoes, fachada.getModalidade(modalidadeProfessor));

                            fachada.cadastrarProfessor(professor);
                            TelaAcessoCadastroProfessor.tabelaAcessoProfessor.getColumnModel().getColumn(0) ;
                            TelaAcessoCadastroProfessor.tabelaAcessoProfessor.getColumnModel().getColumn(1);
                            TelaAcessoCadastroProfessor.tabelaAcessoProfessor.getColumnModel().getColumn(2);
                            DefaultTableModel modelo = (DefaultTableModel) TelaAcessoCadastroProfessor.tabelaAcessoProfessor.getModel();
                            modelo.addRow(new Object[]{professor.getIdPessoa(), professor.getNome(),professor.getTelefone()});
                            zerarCampos();
                            proximaMatricula();
                                                    }
                    }
                }
            }
        }

    }//GEN-LAST:event_botaoCadastrarProfessorActionPerformed

    public void zerarCampos() {
        campoMatriculaProfessor.setText(Integer.toString(fachada.getProximaMatricula()));
        selecaoModalidadeProfessor.setSelectedIndex(0);
        campoNomeProfessor.setText("");
        campoEnderecoProfessor.setText("");
        campoBairroProfessor.setText("");
        campoCepProfessor.setText("");
        campoCidadeProfessor.setText("");
        selecaoEstadoProfessor.setSelectedIndex(0);
        campoTelefoneProfessor.setText("");
        campoCelularProfessor.setText("");
        selecaoSexoProfessor.setSelectedIndex(0);
        campoCpfProfessor.setText("");
        campoIdentidadeProfessor.setText("");
        selecaoOrgaoEmissorProfessor.setSelectedIndex(0);
        campoEmailProfessor.setText("");
        campoDataNascimentoProfessor.setText("");
        caixaObservacoesProfessor.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarProfessor;
    private javax.swing.JButton botaoInserirFotoProfessor;
    private javax.swing.JButton botaoVoltarProfessor;
    private javax.swing.JTextPane caixaObservacoesProfessor;
    private javax.swing.JTextField campoBairroProfessor;
    private javax.swing.JFormattedTextField campoCelularProfessor;
    private javax.swing.JFormattedTextField campoCepProfessor;
    private javax.swing.JTextField campoCidadeProfessor;
    private javax.swing.JFormattedTextField campoCpfProfessor;
    private javax.swing.JFormattedTextField campoDataNascimentoProfessor;
    private javax.swing.JTextField campoEmailProfessor;
    private javax.swing.JTextField campoEnderecoProfessor;
    private javax.swing.JTextField campoIdentidadeProfessor;
    private javax.swing.JTextField campoMatriculaProfessor;
    private javax.swing.JTextField campoNomeProfessor;
    private javax.swing.JFormattedTextField campoTelefoneProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel labelFotoProfessor;
    private javax.swing.JPanel painelFotoProfessor;
    private javax.swing.JComboBox selecaoEstadoProfessor;
    private javax.swing.JComboBox selecaoModalidadeProfessor;
    private javax.swing.JComboBox selecaoOrgaoEmissorProfessor;
    private javax.swing.JComboBox selecaoSexoProfessor;
    // End of variables declaration//GEN-END:variables
}
