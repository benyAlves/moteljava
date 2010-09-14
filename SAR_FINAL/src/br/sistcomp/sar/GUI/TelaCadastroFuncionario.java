package br.sistcomp.sar.GUI;

import br.sistcomp.sar.utilidades.CaixaAlta;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import br.sistcomp.sar.dominio.Funcionario;
import br.sistcomp.sar.utilidades.MetodosWebCam;
import br.sistcomp.sar.utilidades.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Araujo
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    private boolean entrou;
    public static File file = new File(System.getProperty("user.dir") + "\\src\\br\\sistcomp\\sar\\imagens\\semFoto.png");
    private Fachada fachada = new Fachada();

    /** Creates new form TelaCadastroAluno */
    public TelaCadastroFuncionario() {
        initComponents();
        caixaAlta();
        setLocationRelativeTo(null);
        proximaMatricula();

    }

     public void proximaMatricula(){
            campoMatriculaSecretaria.setText(Integer.toString(fachada.getProximaMatricula()));
    }
     public void caixaAlta(){
        campoNomeSecretaria.setDocument(new CaixaAlta());
        campoEnderecoSecretaria.setDocument(new CaixaAlta());
        campoBairroSecretaria.setDocument(new CaixaAlta());
        campoCidadeSecretaria.setDocument(new CaixaAlta());
        
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
        campoMatriculaSecretaria = new javax.swing.JTextField();
        painelFotoSecretaria = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNomeSecretaria = new javax.swing.JTextField();
        campoEnderecoSecretaria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBairroSecretaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoCidadeSecretaria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        selecaoEstadoSecretaria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selecaoSexoSecretaria = new javax.swing.JComboBox();
        botaoInserirFotoSecretaria = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoIdentidadeSecretaria = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        selecaoOrgaoEmissorSecretaria = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        campoEmailSecretaria = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaObservacoesSecretaria = new javax.swing.JTextPane();
        campoCepSecretaria = new javax.swing.JFormattedTextField();
        campoTelefoneSecretaria = new javax.swing.JFormattedTextField();
        campoCelularSecretaria = new javax.swing.JFormattedTextField();
        campoCpfSecretaria = new javax.swing.JFormattedTextField();
        campoDataNascimentoSecretaria = new javax.swing.JFormattedTextField();
        campoSenhaSecretaria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltarSecretaria = new javax.swing.JButton();
        botaoCadastrarSecretaria = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setMinimumSize(new java.awt.Dimension(734, 467));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel2.setText("Matrícula");

        campoMatriculaSecretaria.setEditable(false);
        campoMatriculaSecretaria.setFont(new java.awt.Font("sansserif", 1, 12));
        campoMatriculaSecretaria.setForeground(new java.awt.Color(204, 0, 0));
        campoMatriculaSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        painelFotoSecretaria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        painelFotoSecretaria.setMaximumSize(new java.awt.Dimension(140, 160));
        painelFotoSecretaria.setMinimumSize(new java.awt.Dimension(140, 160));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png"))); // NOI18N

        javax.swing.GroupLayout painelFotoSecretariaLayout = new javax.swing.GroupLayout(painelFotoSecretaria);
        painelFotoSecretaria.setLayout(painelFotoSecretariaLayout);
        painelFotoSecretariaLayout.setHorizontalGroup(
            painelFotoSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFotoSecretariaLayout.setVerticalGroup(
            painelFotoSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setText("Nome");

        jLabel6.setText("Endereço");

        jLabel7.setText("Bairro");

        jLabel8.setText("Cep");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF");

        selecaoEstadoSecretaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel11.setText("Telefone");

        jLabel12.setText("Celular");

        jLabel13.setText("Sexo");

        selecaoSexoSecretaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        botaoInserirFotoSecretaria.setText("Inserir Foto");
        botaoInserirFotoSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirFotoSecretariaActionPerformed(evt);
            }
        });

        jLabel14.setText("CPF");

        jLabel15.setText("Identidade");

        jLabel16.setText("Orgão Emissor");

        selecaoOrgaoEmissorSecretaria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel17.setText("Email");

        jLabel18.setText("Data de Nacimento");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        jScrollPane1.setViewportView(caixaObservacoesSecretaria);

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

        try {
            campoCepSecretaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCepSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoTelefoneSecretaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefoneSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCelularSecretaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelularSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCpfSecretaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoDataNascimentoSecretaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataNascimentoSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoSenhaSecretaria.setFont(new java.awt.Font("sansserif", 1, 12));
        campoSenhaSecretaria.setForeground(new java.awt.Color(204, 0, 0));
        campoSenhaSecretaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Senha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel14)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoEmailSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataNascimentoSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addComponent(campoEnderecoSecretaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoMatriculaSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoSenhaSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNomeSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoBairroSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCepSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoCidadeSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoEstadoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCpfSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(campoTelefoneSecretaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoIdentidadeSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoOrgaoEmissorSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCelularSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoSexoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoInserirFotoSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelFotoSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFotoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoMatriculaSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(campoSenhaSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoNomeSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEnderecoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoBairroSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(campoCepSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoCidadeSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(selecaoEstadoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoInserirFotoSecretaria)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecaoSexoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(campoTelefoneSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(campoCelularSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(campoIdentidadeSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoOrgaoEmissorSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campoCpfSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoEmailSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(campoDataNascimentoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        botaoVoltarSecretaria.setText("Voltar");
        botaoVoltarSecretaria.setMaximumSize(new java.awt.Dimension(83, 28));
        botaoVoltarSecretaria.setMinimumSize(new java.awt.Dimension(83, 28));
        botaoVoltarSecretaria.setPreferredSize(new java.awt.Dimension(83, 28));
        botaoVoltarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarSecretariaActionPerformed(evt);
            }
        });

        botaoCadastrarSecretaria.setText("Cadastrar");
        botaoCadastrarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarSecretariaActionPerformed(evt);
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
                        .addComponent(botaoCadastrarSecretaria)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarSecretaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarSecretariaActionPerformed
       try {
            MetodosWebCam.player.close();
            setVisible(false);
            new TelaAcessoCadastroFuncionario().setVisible(true);
        } catch (Exception e) {
            setVisible(false);
            new TelaAcessoCadastroFuncionario().setVisible(true);
        }
    }//GEN-LAST:event_botaoVoltarSecretariaActionPerformed

    private void botaoInserirFotoSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirFotoSecretariaActionPerformed
        String opcoes[] = {"1. Da WebCam", "2. Do Arquivo"};
        String op = (String) JOptionPane.showInputDialog(null, "Escolha uma Opção", "Inserir Imagem", JOptionPane.INFORMATION_MESSAGE, null, opcoes, "1. teste");
        if (op != null) {
            if (op.equals(opcoes[0])) {
                new TelaWebCam().setVisible(true);
            } else if (op.equals(opcoes[1])) {
                try {
                    labelFoto.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));
                    final JFileChooser busca_foto = new JFileChooser();
                    busca_foto.setCurrentDirectory(new File("")); // Deixe assim que ele pega por default Meus Documentos de C:
                    busca_foto.setDialogTitle("Carregar imagem ");
                    busca_foto.showOpenDialog(this);

                    if (busca_foto != null && entrou == false) {
                        if (busca_foto.getSelectedFile() == null) {
                            labelFoto.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));
                        } else {
                            file = busca_foto.getSelectedFile();
                            Image image = ImageIO.read(file);
                            labelFoto.setIcon(new ImageIcon(image.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), image.SCALE_DEFAULT)));

                        }
                    }

                    entrou = false;
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Não foi possível carregar a foto.");
                }


            } else if (op.equals(opcoes[1])) {
                new TelaWebCam().setVisible(true);
            }
        }
    }//GEN-LAST:event_botaoInserirFotoSecretariaActionPerformed
    private void botaoCadastrarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarSecretariaActionPerformed
        if (campoNomeSecretaria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Nome");
        } else {
            if (campoDataNascimentoSecretaria.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite a Data do Nascimento");
            } else {
                if (campoCpfSecretaria.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite o CPF");
                } else {
                    if (campoIdentidadeSecretaria.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite a Identidade");
                    } else {
                        if (campoSenhaSecretaria.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Digite uma Senha");
                        } else {
                            int matricula = Integer.parseInt(campoMatriculaSecretaria.getText());
                            String nomeSecretaria = campoNomeSecretaria.getText();
                            String senha = campoSenhaSecretaria.getText();
                            String endereco = campoEnderecoSecretaria.getText();
                            String bairro = campoBairroSecretaria.getText();
                            String cep = campoCepSecretaria.getText();
                            String cidade = campoCidadeSecretaria.getText();
                            String estado = selecaoEstadoSecretaria.getSelectedItem().toString();
                            String telefone = campoTelefoneSecretaria.getText();
                            String celular = campoCelularSecretaria.getText();
                            String sexo = selecaoSexoSecretaria.getSelectedItem().toString();
                            String cpf = campoCpfSecretaria.getText();
                            String identidade = campoIdentidadeSecretaria.getText();
                            String orgaoEmissor = selecaoOrgaoEmissorSecretaria.getSelectedItem().toString();
                            String email = campoEmailSecretaria.getText();
                            String dataNascimento = campoDataNascimentoSecretaria.getText();
                            String observacoes = caixaObservacoesSecretaria.getText();

                            Funcionario funcionario = new Funcionario(matricula, nomeSecretaria, email, dataNascimento, sexo, cpf,
                                    identidade, orgaoEmissor, endereco, bairro, cidade, estado, cep, telefone, celular, observacoes, senha);

                            fachada.cadastrarfuncionario(funcionario);
                            zerarCampos();
                            proximaMatricula();
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_botaoCadastrarSecretariaActionPerformed

    public void zerarCampos() {
        campoMatriculaSecretaria.setText(Integer.toString(fachada.getProximaMatricula()));
        campoNomeSecretaria.setText("");
        campoEnderecoSecretaria.setText("");
        campoBairroSecretaria.setText("");
        campoCepSecretaria.setText("");
        campoCidadeSecretaria.setText("");
        selecaoEstadoSecretaria.setSelectedIndex(0);
        campoTelefoneSecretaria.setText("");
        campoCelularSecretaria.setText("");
        selecaoSexoSecretaria.setSelectedIndex(0);
        campoCpfSecretaria.setText("");
        campoIdentidadeSecretaria.setText("");
        selecaoOrgaoEmissorSecretaria.setSelectedIndex(0);
        campoEmailSecretaria.setText("");
        campoDataNascimentoSecretaria.setText("");
        caixaObservacoesSecretaria.setText("");
        campoSenhaSecretaria.setText("");
        labelFoto.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarSecretaria;
    private javax.swing.JButton botaoInserirFotoSecretaria;
    private javax.swing.JButton botaoVoltarSecretaria;
    private javax.swing.JTextPane caixaObservacoesSecretaria;
    private javax.swing.JTextField campoBairroSecretaria;
    private javax.swing.JFormattedTextField campoCelularSecretaria;
    private javax.swing.JFormattedTextField campoCepSecretaria;
    private javax.swing.JTextField campoCidadeSecretaria;
    private javax.swing.JFormattedTextField campoCpfSecretaria;
    private javax.swing.JFormattedTextField campoDataNascimentoSecretaria;
    private javax.swing.JTextField campoEmailSecretaria;
    private javax.swing.JTextField campoEnderecoSecretaria;
    private javax.swing.JTextField campoIdentidadeSecretaria;
    private javax.swing.JTextField campoMatriculaSecretaria;
    private javax.swing.JTextField campoNomeSecretaria;
    private javax.swing.JTextField campoSenhaSecretaria;
    private javax.swing.JFormattedTextField campoTelefoneSecretaria;
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
    public static javax.swing.JLabel labelFoto;
    private javax.swing.JPanel painelFotoSecretaria;
    private javax.swing.JComboBox selecaoEstadoSecretaria;
    private javax.swing.JComboBox selecaoOrgaoEmissorSecretaria;
    private javax.swing.JComboBox selecaoSexoSecretaria;
    // End of variables declaration//GEN-END:variables
}
