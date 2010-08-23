/*
 * TelaAcessoCadastroAluno.java
 *
 * Created on 23/07/2010, 01:52:49
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.Adesao;
import br.sistcomp.sar.dominio.Aluno;
import br.sistcomp.sar.dominio.CustonDocument;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Plano;
import br.sistcomp.sar.dominio.Turma;
import br.sistcomp.sar.fachada.Fachada;
import java.awt.Image;
import java.util.Vector;
import java.util.regex.PatternSyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaAcessoCadastroAluno extends javax.swing.JFrame {

    /** Creates new form TelaAcessoCadastroAluno */
    public static boolean teste;
    private int coluna = 0;
    ImageIcon image;
    Image i;
    Fachada fachada = new Fachada();

    /** Creates new form TelaAcessoCadastroAluno */
    public TelaAcessoCadastroAluno() {
        teste = false;
        initComponents();
        campoBuscar.setDocument(new CustonDocument());
        setLocationRelativeTo(null);
        preencheTabela();
        informacoes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroDeAluno = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        painelFoto = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        selecaoListar = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelCadastrados = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelAtivos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelInativos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelExcluidos = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acesso Aluno");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        tabelaCadastroDeAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome do Aluno", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroDeAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCadastroDeAlunoMousePressed(evt);
            }
        });
        tabelaCadastroDeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaCadastroDeAlunoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroDeAluno);
        tabelaCadastroDeAluno.getColumnModel().getColumn(1).setMinWidth(300);
        tabelaCadastroDeAluno.getColumnModel().getColumn(1).setMaxWidth(300);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        painelFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png"))); // NOI18N

        javax.swing.GroupLayout painelFotoLayout = new javax.swing.GroupLayout(painelFoto);
        painelFoto.setLayout(painelFotoLayout);
        painelFotoLayout.setHorizontalGroup(
            painelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelFotoLayout.setVerticalGroup(
            painelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setText("Buscar Aluno");

        campoBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscarKeyPressed(evt);
            }
        });

        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/lupa.png"))); // NOI18N
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Listar");

        selecaoListar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos os Alunos", "Ativos", "Inativos" }));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Informações");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Cadastrados:");

        labelCadastrados.setFont(new java.awt.Font("sansserif", 1, 12));
        labelCadastrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastrados.setText("0000");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Ativos:");

        labelAtivos.setFont(new java.awt.Font("sansserif", 1, 12));
        labelAtivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAtivos.setText("0000");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Inativos:");

        labelInativos.setFont(new java.awt.Font("sansserif", 1, 12));
        labelInativos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInativos.setText("0000");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Excluidos:");

        labelExcluidos.setFont(new java.awt.Font("sansserif", 1, 12));
        labelExcluidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExcluidos.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(painelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecaoListar, 0, 165, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelExcluidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInativos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelCadastrados))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelAtivos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelInativos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelExcluidos))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        botaoVoltar.setText("Sair");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" ® SAR - Gerenciador Fitness");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoVoltar)
                        .addComponent(botaoCadastrar)
                        .addComponent(botaoRemover))
                    .addComponent(botaoEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void informacoes() {
        labelCadastrados.setText(Integer.toString(fachada.todosAlunos().size()));
        labelAtivos.setText(Integer.toString(fachada.alunosAtivos()));
        labelInativos.setText(Integer.toString(fachada.todosAlunos().size() - fachada.alunosAtivos()));

    }

    public void preencheTabela() {
        tabelaCadastroDeAluno.getColumnModel().getColumn(0);
        tabelaCadastroDeAluno.getColumnModel().getColumn(1);
        tabelaCadastroDeAluno.getColumnModel().getColumn(2);
        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDeAluno.getModel();
        modelo.setNumRows(0);

        Vector<Pessoa> pessoas = fachada.todosAlunos();
        if (pessoas != null) {
            for (Pessoa pessoa : pessoas) {
                //String primeiroNome[] = pessoa.getNome().split(" ");
                String nome = pessoa.getNome();
                int matricula = pessoa.getIdPessoa();
                String telefone = pessoa.getTelefone();
                modelo.addRow(new Object[]{matricula, nome, telefone});

            }
        }
    }
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        setVisible(false);
        new TelaCadastroAluno().setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        setVisible(false);
        new TelaEditarAluno().setVisible(true);
        Aluno aluno = fachada.pesquisarAluno((Integer) tabelaCadastroDeAluno.getValueAt(tabelaCadastroDeAluno.getSelectedRow(), 0));
        //preenchendo os campos pra serem editados
        TelaEditarAluno.campoMatricula.setEditable(true);
        TelaEditarAluno.campoMatricula.setText(Integer.toString(aluno.getIdPessoa()));
        TelaEditarAluno.campoMatricula.setEditable(false);
        TelaEditarAluno.campoDataMatricula.setText(aluno.getDataCadastro());
        TelaEditarAluno.campoNomeAluno.setText(aluno.getNome());
        TelaEditarAluno.caixaObservacoesAluno.setText(aluno.getObservacoes());
        TelaEditarAluno.campoEnderecoAluno.setText(aluno.getEndereco());
        TelaEditarAluno.campoBairroAluno.setText(aluno.getBairro());
        TelaEditarAluno.campoCelularAluno.setText(aluno.getCelular());
        TelaEditarAluno.campoCepAluno.setText(aluno.getCep());
        TelaEditarAluno.campoCidadeAluno.setText(aluno.getCidade());
        TelaEditarAluno.campoCpfAluno.setText(aluno.getCpf());
        TelaEditarAluno.campoDataNascimentoAluno.setText(aluno.getNascimento());
        TelaEditarAluno.campoEmailAluno.setText(aluno.getEmail());
        TelaEditarAluno.campoIdentidadeAluno.setText(aluno.getRgNumero());
        TelaEditarAluno.campoTelefoneAluno.setText(aluno.getTelefone());
        TelaEditarAluno.selecaoEstadoAluno.setSelectedItem(aluno.getEstado());
        TelaEditarAluno.selecaoOrgaoEmissorAluno.setSelectedItem(aluno.getRgUf());
        TelaEditarAluno.selecaoSexoAluno.setSelectedItem(aluno.getSexo());
        TelaEditarAluno.campoIndicacao.setText(aluno.getIndicacao());
        // setando a imagem no label.
        image = fachada.pesquisarFoto(aluno.getIdPessoa());
        i = image.getImage();
        TelaEditarAluno.labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));
        //Inserindo dados na tabela que edita a Modalidade.
        TelaEditarAluno.tabelaModalidadeAluno.getColumnModel().getColumn(0);
        TelaEditarAluno.tabelaModalidadeAluno.getColumnModel().getColumn(1);
        TelaEditarAluno.tabelaModalidadeAluno.getColumnModel().getColumn(2);
        TelaEditarAluno.tabelaModalidadeAluno.getColumnModel().getColumn(3);
        TelaEditarAluno.tabelaModalidadeAluno.getColumnModel().getColumn(4);
        DefaultTableModel modelo = (DefaultTableModel) TelaEditarAluno.tabelaModalidadeAluno.getModel();
        modelo.setNumRows(0);

        for (Adesao adesao : aluno.getAdesoes()) {
            String nomeModalidade = adesao.getPlano().getModalidade().getNome();
            String nomePlano = adesao.getPlano().getNome();
            double valor = adesao.getValor();
            Turma turma = adesao.getTurma();
            String nomeProfessor = turma.getProfessor().getNome();
            String diaEhorario = TelaCadastroAluno.getHorarioTurmas(turma);
            modelo.addRow(new Object[]{nomeModalidade, nomeProfessor, nomePlano, diaEhorario, valor});

        }
        TelaEditarAluno.adesoes = aluno.getAdesoes();
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        if (evt.getKeyCode() == 10) {
            botaoPesquisar.doClick();
        }
    }//GEN-LAST:event_campoBuscarKeyPressed

    public void setFoto() {

        image = fachada.pesquisarFoto((Integer) tabelaCadastroDeAluno.getValueAt(tabelaCadastroDeAluno.getSelectedRow(), coluna));
        i = image.getImage();
        labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));


    }
    private void tabelaCadastroDeAlunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroDeAlunoMousePressed
        setFoto();
    }//GEN-LAST:event_tabelaCadastroDeAlunoMousePressed

    private void tabelaCadastroDeAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCadastroDeAlunoKeyReleased
        setFoto();

    }//GEN-LAST:event_tabelaCadastroDeAlunoKeyReleased

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed

      DefaultTableModel tabela_clientes = (DefaultTableModel) tabelaCadastroDeAluno.getModel();
      final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela_clientes);
      tabelaCadastroDeAluno.setRowSorter(sorter);
      String nome = campoBuscar.getText().toUpperCase();
      if (nome.length() == 0) {
                      sorter.setRowFilter(null);
                     } else {
                       try {
                         sorter.setRowFilter(
                             RowFilter.regexFilter(nome));
                         campoBuscar.setText("");
                       } catch (PatternSyntaxException pse) {
                          JOptionPane.showMessageDialog(null, "Não existe.", "Erro", JOptionPane.ERROR_MESSAGE);
                       }
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
//      int row = tabelaCadastroDeAluno.getSelectedRow();
//
//        try {
//            int matricula = (Integer) tabelaCadastroDeAluno.getValueAt(row, 0);
//            ((DefaultTableModel) tabelaCadastroDeAluno.getModel()).removeRow(tabelaCadastroDeAluno.getSelectedRow());
//            FuncionarioDAO.getInstance().removerSecretaria(matricula);
//        }
//        catch(Exception e) {
//            JOptionPane.showMessageDialog(null, "Nao ha o que remover!","Erro", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelAtivos;
    private javax.swing.JLabel labelCadastrados;
    private javax.swing.JLabel labelExcluidos;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelInativos;
    private javax.swing.JPanel painelFoto;
    private javax.swing.JComboBox selecaoListar;
    public static javax.swing.JTable tabelaCadastroDeAluno;
    // End of variables declaration//GEN-END:variables
}
