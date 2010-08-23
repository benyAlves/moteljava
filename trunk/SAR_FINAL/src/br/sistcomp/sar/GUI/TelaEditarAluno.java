package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.Adesao;
import br.sistcomp.sar.dominio.Aluno;
import br.sistcomp.sar.dominio.CaixaAlta;
import br.sistcomp.sar.dominio.Mensalidade;
import br.sistcomp.sar.dominio.MetodosWebCam;
import br.sistcomp.sar.dominio.Plano;
import br.sistcomp.sar.dominio.Turma;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import java.awt.Image;
import java.io.File;
import java.lang.Double;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * TelaCadastroAluno.java
 *
 * Created on 09/07/2010, 02:15:49
 */
/**
 *
 * @author Paulinho
 */
public class TelaEditarAluno extends javax.swing.JFrame {

    private boolean entrou, visualizar = false, alterar = false;
    private File file;
    Fachada fachada = new Fachada();
    static List<Adesao> adesoes = new ArrayList<Adesao>();

    /** Creates new form TelaCadastroAluno */
    public TelaEditarAluno() {
        initComponents();
        caixaAlta();
        setLocationRelativeTo(null);
        setModalidade();
        campoMatricula.setText(Integer.toString(fachada.getProximaMatricula()));
        campoDataMatricula.setText(Utilitario.dataDoSistema());
        //selecaoHorario.setModel(new DefaultComboBoxModel(getTurmas()));
    }

    public void preencheAdesoes(){
        tabelaModalidadeAluno.getColumnModel().getColumn(0);
        tabelaModalidadeAluno.getColumnModel().getColumn(1);
        tabelaModalidadeAluno.getColumnModel().getColumn(2);
        tabelaModalidadeAluno.getColumnModel().getColumn(3);
        tabelaModalidadeAluno.getColumnModel().getColumn(4);
        DefaultTableModel modelo = (DefaultTableModel) tabelaModalidadeAluno.getModel();
        modelo.setNumRows(0);

        for (Adesao adesao : adesoes) {
            String nomeModalidade = adesao.getPlano().getModalidade().getNome();
            String nomePlano = adesao.getPlano().getNome();
            double valor = adesao.getValor();
            Turma turma = adesao.getTurma();
            String nomeProfessor = turma.getProfessor().getNome();
            String diaEhorario = TelaCadastroAluno.getHorarioTurmas(turma);
            modelo.addRow(new Object[]{nomeModalidade, nomeProfessor, nomePlano, diaEhorario, valor});
        }
    }

    public void caixaAlta() {
        campoNomeAluno.setDocument(new CaixaAlta());
        campoEnderecoAluno.setDocument(new CaixaAlta());
        campoBairroAluno.setDocument(new CaixaAlta());
        campoCidadeAluno.setDocument(new CaixaAlta());
        campoIndicacao.setDocument(new CaixaAlta());
    }

    public void setModalidade() {
        Vector<String> modalidades = fachada.getNomesModalidades();
        modalidades.add(0, "- Selecione -");
        selecaoModalidade.setModel(new DefaultComboBoxModel(modalidades));
    }
    // MÃ©todo que inseri todos os professores de uma modalidade no combobox

    public void setProfessores(String modalidade) {
        Vector<String> professores = fachada.getProfessorPorModalidade(modalidade);
        professores.add(0, "- Selecione -");
        selecaoProfessor.setModel(new DefaultComboBoxModel(professores));
    }

    public void setPlanos(String modalidade) {
        Vector<String> planos = fachada.planoPorModalidade(modalidade);
        planos.add(0, "- Selecione -");
        selecaoPlano.setModel(new DefaultComboBoxModel(planos));
    }

    public void travaCampos() {
        selecaoModalidade.setEnabled(false);
        //selecaoProfessor.setEnabled(false);
        selecaoPlano.setEnabled(false);
        campoDiaPagamento.setEnabled(false);
        campoVencimento.setEnabled(false);
        campoValor.setEnabled(false);
        campoDesconto.setEnabled(false);
        selecaoPagamento.setEnabled(false);
        campoParcelas.setEnabled(false);
        //selecaoHorario.setEnabled(false);
    }

    public void ativaCampos() {
        selecaoModalidade.setEnabled(true);
        selecaoProfessor.setEnabled(true);
        selecaoPlano.setEnabled(true);
        campoDiaPagamento.setEnabled(true);
        campoVencimento.setEnabled(true);
        campoValor.setEnabled(true);
        campoDesconto.setEnabled(true);
        selecaoPagamento.setEnabled(true);
        campoParcelas.setEnabled(true);
        selecaoHorario.setEnabled(true);
    }

    public void preenchePagamentos() {
        selecaoPagamento.addItem("A Vista");
        selecaoPagamento.addItem("Parcelado");
        selecaoPagamento.addItem("Bolsista Parcial");
        selecaoPagamento.addItem("Bolsista Integral");
    }

    public void zeraCampoModalidade() {
        selecaoModalidade.setSelectedIndex(0);
        selecaoHorario.setSelectedIndex(0);
        campoValor.setText("");
        campoIndicacao.setText("");
        campoParcelas.setText("");
        campoDesconto.setText("");
        campoVencimento.setText("");
        campoDiaPagamento.setText("");
    }

    public List<Turma> retornaTurma(String professor) {
        List<Turma> turmas = new ArrayList<Turma>();
        turmas = fachada.turmasPorProfessor(professor);
        return turmas;
    }

    public Vector<String> getTurmas(List<Turma> turmas) {
        String dias = "", texto = "";
        Vector<String> nometurmas = new Vector<String>();
        nometurmas.add(0, "- Selecione -");
        for (Turma t : turmas) {
            dias = "";
            if (t.getDias().get("Segunda")) {
                dias += "Seg ";
            }
            if (t.getDias().get("Terca")) {
                dias += "Ter ";
            }
            if (t.getDias().get("Quarta")) {
                dias += "Qua ";
            }
            if (t.getDias().get("Quinta")) {
                dias += "Qui ";
            }
            if (t.getDias().get("Sexta")) {
                dias += "Sex ";
            }
            if (t.getDias().get("Sabado")) {
                dias += "Sab ";
            }
            if (t.getDias().get("Domingo")) {
                dias += "Dom ";
            }
            texto = t.getCodigo() + "| " + dias + "  [" + t.getHoraInicio().substring(0, 5) + " as " + t.getHoraFinal().substring(0, 5) + "]";
            nometurmas.add(texto);
        }
        return nometurmas;
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
        campoMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        painelFotoAluno = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        campoEnderecoAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBairroAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoCidadeAluno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        selecaoEstadoAluno = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        selecaoSexoAluno = new javax.swing.JComboBox();
        botaoInserirFotoAluno = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        campoIdentidadeAluno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        selecaoOrgaoEmissorAluno = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        campoEmailAluno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaObservacoesAluno = new javax.swing.JTextPane();
        campoDataNascimentoAluno = new javax.swing.JFormattedTextField();
        campoDataMatricula = new javax.swing.JFormattedTextField();
        campoCepAluno = new javax.swing.JFormattedTextField();
        campoCelularAluno = new javax.swing.JFormattedTextField();
        campoTelefoneAluno = new javax.swing.JFormattedTextField();
        campoCpfAluno = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        campoIndicacao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        selecaoPlano = new javax.swing.JComboBox();
        botaoExcluir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        campoParcelas = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        selecaoPagamento = new javax.swing.JComboBox();
        selecaoProfessor = new javax.swing.JComboBox();
        selecaoHorario = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        campoDesconto = new javax.swing.JTextField();
        selecaoModalidade = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        campoVencimento = new javax.swing.JFormattedTextField();
        campoDiaPagamento = new javax.swing.JFormattedTextField();
        campoValor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaModalidadeAluno = new javax.swing.JTable();
        botaoAdicionar1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        alterarTurma = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Aluno");
        setMinimumSize(new java.awt.Dimension(734, 467));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel2.setText("Matrícula");

        campoMatricula.setEditable(false);
        campoMatricula.setFont(new java.awt.Font("sansserif", 1, 12));
        campoMatricula.setForeground(new java.awt.Color(204, 0, 0));
        campoMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Data Matrícula");

        painelFotoAluno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        painelFotoAluno.setMaximumSize(new java.awt.Dimension(140, 160));
        painelFotoAluno.setMinimumSize(new java.awt.Dimension(140, 160));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png"))); // NOI18N

        javax.swing.GroupLayout painelFotoAlunoLayout = new javax.swing.GroupLayout(painelFotoAluno);
        painelFotoAluno.setLayout(painelFotoAlunoLayout);
        painelFotoAlunoLayout.setHorizontalGroup(
            painelFotoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFotoAlunoLayout.setVerticalGroup(
            painelFotoAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setText("Nome");

        jLabel6.setText("Endereço");

        jLabel7.setText("Bairro");

        jLabel8.setText("Cep");

        jLabel9.setText("Cidade");

        jLabel10.setText("UF");

        selecaoEstadoAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel11.setText("Telefone");

        jLabel12.setText("Celular");

        jLabel13.setText("Sexo");

        selecaoSexoAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        botaoInserirFotoAluno.setText("Alterar Foto");
        botaoInserirFotoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirFotoAlunoActionPerformed(evt);
            }
        });

        jLabel14.setText("CPF");

        jLabel15.setText("Identidade");

        jLabel16.setText("Orgão Emissor");

        selecaoOrgaoEmissorAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PB", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel17.setText("Email");

        jLabel18.setText("Data de Nacimento");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        jScrollPane1.setViewportView(caixaObservacoesAluno);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        try {
            campoDataNascimentoAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataNascimentoAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDataMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        try {
            campoCepAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCepAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCelularAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelularAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoTelefoneAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefoneAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCpfAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfAluno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                                .addComponent(campoEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataNascimentoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(campoEnderecoAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCepAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(campoCidadeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoEstadoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCpfAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(campoTelefoneAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoIdentidadeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoOrgaoEmissorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecaoSexoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoInserirFotoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelFotoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelFotoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(campoDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEnderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(campoCepAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoCidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecaoEstadoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoInserirFotoAluno)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecaoSexoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(campoCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(campoTelefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(campoIdentidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoOrgaoEmissorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campoCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(campoDataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Cadastrais", jPanel2);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel19.setText("Desconto");

        jLabel20.setText("Dia do Pagamento");

        selecaoPlano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));
        selecaoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoPlanoActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel21.setText("Plano de Matrícula");

        jLabel22.setText("Indicação");

        jLabel23.setText("Professor");

        campoParcelas.setEditable(false);
        campoParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setText("Forma de Pagamento ");

        selecaoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));
        selecaoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoPagamentoActionPerformed(evt);
            }
        });

        selecaoProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));
        selecaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoProfessorActionPerformed(evt);
            }
        });

        selecaoHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));
        selecaoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoHorarioActionPerformed(evt);
            }
        });

        jLabel25.setText("Horário");

        jLabel26.setText("Valor");

        campoDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoDescontoKeyReleased(evt);
            }
        });

        selecaoModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoModalidadeActionPerformed(evt);
            }
        });

        jLabel27.setText("Nº de Parcelas");

        jLabel28.setText("Modalidade");

        campoVencimento.setEditable(false);
        try {
            campoVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoDiaPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDiaPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDiaPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        campoValor.setEditable(false);
        campoValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel29.setText("Venc. do Plano");

        tabelaModalidadeAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modalidade", "Professor", "Plano", "Horário", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaModalidadeAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaModalidadeAlunoMousePressed(evt);
            }
        });
        tabelaModalidadeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaModalidadeAlunoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaModalidadeAluno);
        tabelaModalidadeAluno.getColumnModel().getColumn(0).setResizable(false);
        tabelaModalidadeAluno.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaModalidadeAluno.getColumnModel().getColumn(1).setResizable(false);
        tabelaModalidadeAluno.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaModalidadeAluno.getColumnModel().getColumn(2).setResizable(false);
        tabelaModalidadeAluno.getColumnModel().getColumn(3).setResizable(false);
        tabelaModalidadeAluno.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelaModalidadeAluno.getColumnModel().getColumn(4).setResizable(false);

        botaoAdicionar1.setText("Adicionar");
        botaoAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionar1ActionPerformed(evt);
            }
        });

        jLabel30.setText("R$");

        jLabel31.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(210, 210, 210))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(selecaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(selecaoPlano, 0, 175, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29)))
                            .addComponent(jLabel25)
                            .addComponent(selecaoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(campoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31)
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(selecaoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(campoIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoAdicionar1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(campoParcelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel29)
                                .addComponent(jLabel19)
                                .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoDiaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31)
                                .addComponent(jLabel30)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selecaoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecaoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIndicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAdicionar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modalidades", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
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

        botaoVoltar.setText("Voltar");
        botaoVoltar.setMaximumSize(new java.awt.Dimension(83, 28));
        botaoVoltar.setMinimumSize(new java.awt.Dimension(83, 28));
        botaoVoltar.setPreferredSize(new java.awt.Dimension(83, 28));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        alterarTurma.setText("Alterar");
        alterarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarTurmaActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alterarTurma)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar)
                    .addComponent(alterarTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-759)/2, (screenSize.height-578)/2, 759, 578);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        try {
            MetodosWebCam.player.close();
            setVisible(false);
            new TelaAcessoCadastroAluno().setVisible(true);
        } catch (Exception e) {
            setVisible(false);
            new TelaAcessoCadastroAluno().setVisible(true);
        }
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoInserirFotoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirFotoAlunoActionPerformed

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
                    JOptionPane.showMessageDialog(null, "Nao foi possível carregar a foto.");
                }
            }
        }

    }//GEN-LAST:event_botaoInserirFotoAlunoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (campoNomeAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Nome");
        } else {
            if (campoDataNascimentoAluno.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite a Data do Nascimento");
            } else {
                if (campoCpfAluno.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite o CPF");
                } else {
                    if (campoIdentidadeAluno.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite a Identidade");
                    } else {
                        int matricula = Integer.parseInt(campoMatricula.getText());
                        String nomeAluno = campoNomeAluno.getText();
                        //String dataMatricula = campoDataMatricula.getText();
                        String endereco = campoEnderecoAluno.getText();
                        String bairro = campoBairroAluno.getText();
                        String cep = campoCepAluno.getText();
                        String cidade = campoCidadeAluno.getText();
                        String estado = selecaoEstadoAluno.getSelectedItem().toString();
                        String telefone = campoTelefoneAluno.getText();
                        String celular = campoCelularAluno.getText();
                        String sexo = selecaoSexoAluno.getSelectedItem().toString();
                        String identidade = campoIdentidadeAluno.getText();
                        String cpf = campoCpfAluno.getText();
                        String orgaoEmissor = selecaoOrgaoEmissorAluno.getSelectedItem().toString();
                        String email = campoEmailAluno.getText();
                        String dataNascimento = campoDataNascimentoAluno.getText();
                        String observacoes = caixaObservacoesAluno.getText();

                        // SEGUNDA ABA

                        String indicacao = campoIndicacao.getText();
                        String bolsista = "";
                        if (selecaoPagamento.getSelectedItem().toString().equals("Bolsista Integral")) {
                            bolsista = "integral";
                        } else {
                            if (selecaoPagamento.getSelectedItem().toString().equals("Bolsista Parcial")) {
                                bolsista = "parcial";
                            }
                        }



                        Aluno aluno = new Aluno(matricula, nomeAluno, email, dataNascimento,
                                sexo, cpf, identidade, orgaoEmissor,
                                endereco, bairro, cidade, estado,
                                cep, telefone, celular, observacoes,
                                adesoes, indicacao, bolsista);

                        fachada.editarAluno(aluno);
                        JOptionPane.showMessageDialog(null,"Atualização Realizada com Sucesso!");
                        setVisible(false);
                        new TelaAcessoCadastroAluno().setVisible(true);


                    }
                }
            }
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        for (Adesao adesao : adesoes) {
            if (adesao.getPlano().getNome().equals((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 2)))) {
                fachada.removerAdesao(adesao.getCodAdesao());
                adesoes.remove(adesao);
                preencheAdesoes();
                ativaCampos();
                zeraCampoModalidade();
                visualizar = false;
                alterar = false;
                break;
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void campoDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDescontoKeyReleased
        String nomePlano = selecaoPlano.getSelectedItem().toString();
        Plano plano = fachada.pesquisarPlano(nomePlano);
        campoValor.setText(Double.toString(plano.getValor()));
        String desconto = campoDesconto.getText();
        String valor = campoValor.getText();
        if (campoDesconto.getText().contains(",")) {
            JOptionPane.showMessageDialog(null, "Separe as casas decimais com um ponto(.)");
            campoDesconto.setText("");
        } else {
            if (campoDesconto.getText().equals("")) {
                desconto = "0";
            }
            double descontoDouble = Double.parseDouble(desconto);
            double valorDouble = Double.parseDouble(valor);
            descontoDouble = descontoDouble * valorDouble / 100;
            valorDouble -= descontoDouble;
            campoValor.setText(Double.toString(valorDouble));
        }
    }//GEN-LAST:event_campoDescontoKeyReleased

    private void selecaoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoPlanoActionPerformed
        String nomePlano = selecaoPlano.getSelectedItem().toString();
        Plano plano = fachada.pesquisarPlano(nomePlano);
        campoValor.setText(Double.toString(plano.getValor()));
        campoDiaPagamento.setText(Utilitario.dataDoSistema());
        campoParcelas.setText(Integer.toString(plano.getDuracao()));
        campoVencimento.setText(Utilitario.somaDoMesParaVencimentoDoPlano(plano.getDuracao()));
        campoDesconto.setText("0");
        preenchePagamentos();

    }//GEN-LAST:event_selecaoPlanoActionPerformed

    private void selecaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoProfessorActionPerformed
        List<Turma> turmas = retornaTurma(selecaoProfessor.getSelectedItem().toString());
        Vector<String> nomesturmas = getTurmas(turmas);
        selecaoHorario.setModel(new DefaultComboBoxModel(nomesturmas));
    }//GEN-LAST:event_selecaoProfessorActionPerformed

    private void selecaoModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoModalidadeActionPerformed
        selecaoProfessor.setModel(new DefaultComboBoxModel());
        String modalidade = selecaoModalidade.getSelectedItem().toString();
        setProfessores(modalidade);

        selecaoPlano.setModel(new DefaultComboBoxModel());
        String modalidadePlano = selecaoModalidade.getSelectedItem().toString();
        setPlanos(modalidadePlano);

        selecaoPagamento.setModel(new DefaultComboBoxModel());
        selecaoPagamento.addItem("- Selecione -");

    }//GEN-LAST:event_selecaoModalidadeActionPerformed

    private void selecaoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoPagamentoActionPerformed
        campoValor.setText(Double.toString(fachada.valorPorNome(selecaoPlano.getSelectedItem().toString())));
        if (selecaoPagamento.getSelectedItem().toString().equals("A Vista")) {
            campoParcelas.setEditable(false);
            campoParcelas.setText("1");
        }
        if (selecaoPagamento.getSelectedItem().toString().equals("Parcelado")) {
            campoParcelas.setEditable(true);
            campoParcelas.setText(Integer.toString(fachada.duracaoPorNome(selecaoPlano.getSelectedItem().toString())));
        }
        if (selecaoPagamento.getSelectedItem().toString().equals("Bolsista Integral")) {
            campoParcelas.setEditable(false);
            campoValor.setText("0.0");
            campoParcelas.setText("0");
        }
        if (selecaoPagamento.getSelectedItem().toString().equals("Bolsista Parcial")) {
            double valor = Double.parseDouble(campoValor.getText());
            valor = valor / 2;
            campoValor.setText(Double.toString(valor));
            campoParcelas.setEditable(true);
            campoParcelas.setText(Integer.toString(fachada.duracaoPorNome(selecaoPlano.getSelectedItem().toString())));

        }
    }//GEN-LAST:event_selecaoPagamentoActionPerformed

    private void botaoAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionar1ActionPerformed
        if (visualizar) {
            JOptionPane.showMessageDialog(null, "Preencha os Campos!");
            visualizar = false;
            ativaCampos();
            zeraCampoModalidade();
        } else {
            if (selecaoModalidade.getSelectedItem().toString().equals("- Selecione -")) {
                JOptionPane.showMessageDialog(null, "Selecione uma Modalidade!");
            } else {
                if (selecaoProfessor.getSelectedItem().toString().equals("- Selecione -")) {
                    JOptionPane.showMessageDialog(null, "Selecione um Professor!");
                } else {
                    if (selecaoPlano.getSelectedItem().toString().equals("- Selecione -")) {
                        JOptionPane.showMessageDialog(null, "Selecione um Plano!");
                    } else {
                        if (selecaoPagamento.getSelectedItem().toString().equals("- Selecione -")) {
                            JOptionPane.showMessageDialog(null, "Selecione uma Forma de Pagamento!");
                        } else {
                            if (selecaoHorario.getSelectedItem().toString().equals("- Selecione -")) {
                                JOptionPane.showMessageDialog(null, "Selecione um Horário!");
                            } else {
                                int duracao = fachada.duracaoPorNome(selecaoPlano.getSelectedItem().toString());
                                if (duracao < Integer.parseInt(campoParcelas.getText())) {
                                    JOptionPane.showMessageDialog(null, "A quantidade parcelas não pode ser\n maior que a duração do plano!");
                                    campoParcelas.setText(Integer.toString(duracao));
                                } else {

                                    int codAdesao = fachada.proximoCodigoAdesao();
                                    int matriculaAluno = Integer.parseInt(campoMatricula.getText());
                                    Plano plano = fachada.pesquisarPlano(selecaoPlano.getSelectedItem().toString());
                                    String dataAdesao = Utilitario.dataDoSistema();
                                    Double valor = Double.parseDouble(campoValor.getText());
                                    Double desconto = Double.parseDouble(campoDesconto.getText());
                                    int parcelas = Integer.parseInt(campoParcelas.getText());
                                    String formaDePagamento = selecaoPagamento.getSelectedItem().toString();
                                    Boolean status = true;
                                    List<Mensalidade> mensalidadesPorAdesao = new ArrayList<Mensalidade>();

                                    Double valorMensalidade = valor/parcelas;
                                    for (int i = 0; i < parcelas; i++) {
                                        Mensalidade mensalidade = new Mensalidade(valorMensalidade, Utilitario.somaDoMesParaVencimentoDoPlano(i));
                                        mensalidadesPorAdesao.add(mensalidade);
                                    }

                                    String codigoString = "";
                                    int codTurma;
                                    String[] codigoArray = selecaoHorario.getSelectedItem().toString().split("\\|");
                                    codigoString += codigoArray[0];
                                    codTurma = Integer.parseInt(codigoString);
                                    Turma turma = fachada.pesquisarTurma(codTurma);

                                    Adesao adesao = new Adesao(codAdesao,matriculaAluno,plano,dataAdesao,valor,desconto,parcelas,formaDePagamento,status,mensalidadesPorAdesao,turma);

                                    fachada.inserirAdesao(Integer.parseInt(campoMatricula.getText()), adesao);
                                    adesoes.add(adesao);
                                    preencheAdesoes();
                                    JOptionPane.showMessageDialog(null, "Plano Adicionado com Sucesso");
                                    zeraCampoModalidade();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_botaoAdicionar1ActionPerformed

    private void selecaoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoHorarioActionPerformed
        alterar = true;
    }//GEN-LAST:event_selecaoHorarioActionPerformed

    private void tabelaModalidadeAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaModalidadeAlunoKeyReleased
        ativaCampos();
        Adesao a = null;
        for (Adesao adesao: adesoes){
            if (adesao.getPlano().getNome().equals((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 2)))){
                a = adesao;
                break;
            }
        }
        selecaoModalidade.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 0)));
        selecaoProfessor.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 1)));
        selecaoPlano.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 2)));
        selecaoHorario.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 3)));
        campoDesconto.setText(Double.toString(a.getDesconto()));
        preenchePagamentos();
        selecaoPagamento.setSelectedItem(a.getFormaDePagamento());
        campoParcelas.setText(Integer.toString(a.getParcelas()));
        campoValor.setText(Double.toString(a.getValor()));
        campoDiaPagamento.setText(a.getDataAdesao());
        //campoVencimento.setText(p.getDiaDoPagamento())
        visualizar = true;
        travaCampos();
        if (a.getStatus() == false){
            selecaoProfessor.setEnabled(false);
            selecaoHorario.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Plano Vencido");
        }
    }//GEN-LAST:event_tabelaModalidadeAlunoKeyReleased

    private void tabelaModalidadeAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaModalidadeAlunoMousePressed
        ativaCampos();
        Adesao a = null;
        for (Adesao adesao: adesoes){
            if (adesao.getPlano().getNome().equals((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 2)))){
                a = adesao;
                break;
            }
        }
        selecaoModalidade.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 0)));
        selecaoProfessor.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 1)));
        selecaoPlano.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 2)));
        selecaoHorario.setSelectedItem((tabelaModalidadeAluno.getValueAt(tabelaModalidadeAluno.getSelectedRow(), 3)));
        campoDesconto.setText(Double.toString(a.getDesconto()));
        preenchePagamentos();
        selecaoPagamento.setSelectedItem(a.getFormaDePagamento());
        campoParcelas.setText(Integer.toString(a.getParcelas()));
        campoValor.setText(Double.toString(a.getValor()));
        campoDiaPagamento.setText(a.getDataAdesao());
        visualizar = true;
        travaCampos();
        if (a.getStatus() == false){
            selecaoProfessor.setEnabled(false);
            selecaoHorario.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Plano Vencido");
        }
    }//GEN-LAST:event_tabelaModalidadeAlunoMousePressed

    private void alterarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarTurmaActionPerformed
        if (alterar) {
            String codigoString = "";
            int codTurma;
            String[] codigoArray = selecaoHorario.getSelectedItem().toString().split("\\|");
            codigoString += codigoArray[0];
            codTurma = Integer.parseInt(codigoString);
            Turma turma = fachada.pesquisarTurma(codTurma);

            for (Adesao adesao : adesoes) {
                if (adesao.getPlano().getNome().equals(selecaoPlano.getSelectedItem().toString())) {
                    fachada.trocarTurma(adesao.getCodAdesao(),codTurma);
                    JOptionPane.showMessageDialog(null, "Turma Alterada!");
                    adesao.setTurma(turma);
                    preencheAdesoes();
                    break;
                }
            }
        }
    }//GEN-LAST:event_alterarTurmaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarTurma;
    private javax.swing.JButton botaoAdicionar1;
    private javax.swing.JButton botaoExcluir;
    public static javax.swing.JButton botaoInserirFotoAluno;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    public static javax.swing.JTextPane caixaObservacoesAluno;
    public static javax.swing.JTextField campoBairroAluno;
    public static javax.swing.JFormattedTextField campoCelularAluno;
    public static javax.swing.JFormattedTextField campoCepAluno;
    public static javax.swing.JTextField campoCidadeAluno;
    public static javax.swing.JFormattedTextField campoCpfAluno;
    public static javax.swing.JFormattedTextField campoDataMatricula;
    public static javax.swing.JFormattedTextField campoDataNascimentoAluno;
    private javax.swing.JTextField campoDesconto;
    private javax.swing.JFormattedTextField campoDiaPagamento;
    public static javax.swing.JTextField campoEmailAluno;
    public static javax.swing.JTextField campoEnderecoAluno;
    public static javax.swing.JTextField campoIdentidadeAluno;
    public static javax.swing.JTextField campoIndicacao;
    public static javax.swing.JTextField campoMatricula;
    public static javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoParcelas;
    public static javax.swing.JFormattedTextField campoTelefoneAluno;
    private javax.swing.JTextField campoValor;
    private javax.swing.JFormattedTextField campoVencimento;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel labelFoto;
    private javax.swing.JPanel painelFotoAluno;
    public static javax.swing.JComboBox selecaoEstadoAluno;
    private javax.swing.JComboBox selecaoHorario;
    private javax.swing.JComboBox selecaoModalidade;
    public static javax.swing.JComboBox selecaoOrgaoEmissorAluno;
    public static javax.swing.JComboBox selecaoPagamento;
    private javax.swing.JComboBox selecaoPlano;
    private javax.swing.JComboBox selecaoProfessor;
    public static javax.swing.JComboBox selecaoSexoAluno;
    public static javax.swing.JTable tabelaModalidadeAluno;
    // End of variables declaration//GEN-END:variables
}
