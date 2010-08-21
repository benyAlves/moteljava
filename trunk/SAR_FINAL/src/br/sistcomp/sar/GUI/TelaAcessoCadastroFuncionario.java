/*
 * TelaAcessoCadastroFuncionario.java
 *
 * Created on 23/07/2010, 03:56:19
 */

package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.CustonDocument;
import br.sistcomp.sar.dominio.Funcionario;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import br.sistcomp.sar.servico.FuncionarioDAO;
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
public class TelaAcessoCadastroFuncionario extends javax.swing.JFrame {

    /** Creates new form TelaAcessoCadastroFuncionario */
    Fachada fachada = new Fachada();
    ImageIcon image;
    Image i;

    public TelaAcessoCadastroFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        preencheTabela();
        labelCadastrados.setText(Integer.toString(fachada.todosFuncionarioAtivos().size()));
        labelAtivos.setText(Integer.toString(fachada.todosFuncionarioAtivos().size()));
        campoBuscar.setDocument(new CustonDocument());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoRemover = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAcessoFuncionario = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
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
        jSeparator3 = new javax.swing.JSeparator();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acesso Funcionário");
        setResizable(false);

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        tabelaAcessoFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome do Funcionário", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAcessoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaAcessoFuncionarioMousePressed(evt);
            }
        });
        tabelaAcessoFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaAcessoFuncionarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAcessoFuncionario);
        tabelaAcessoFuncionario.getColumnModel().getColumn(1).setMinWidth(300);
        tabelaAcessoFuncionario.getColumnModel().getColumn(1).setMaxWidth(300);

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

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" ® SAR - Gerenciador Fitness");

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

        jLabel1.setText("Buscar Funcionário");

        campoBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        selecaoListar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos os Funcionários", "Ativos", "Inativos" }));
        selecaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoListarActionPerformed(evt);
            }
        });

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

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoEditar)
                    .addComponent(botaoRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
}//GEN-LAST:event_botaoVoltarActionPerformed

    public void preencheTabela() {
        tabelaAcessoFuncionario.getColumnModel().getColumn(0);
        tabelaAcessoFuncionario.getColumnModel().getColumn(1);
        tabelaAcessoFuncionario.getColumnModel().getColumn(2);
        DefaultTableModel modelo = (DefaultTableModel) tabelaAcessoFuncionario.getModel();
        modelo.setNumRows(0);

        Vector<Pessoa> pessoas = fachada.todosFuncionarios();
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

     public void preencheTabelaFuncionariosAtivos() {
        tabelaAcessoFuncionario.getColumnModel().getColumn(0);
        tabelaAcessoFuncionario.getColumnModel().getColumn(1);
        tabelaAcessoFuncionario.getColumnModel().getColumn(2);
        DefaultTableModel modelo = (DefaultTableModel) tabelaAcessoFuncionario.getModel();
        modelo.setNumRows(0);

        Vector<Integer> matriculas = fachada.todosFuncionarioAtivos();
        if (matriculas != null) {
            for (Integer matricula : matriculas) {
                
                Funcionario funcionario = fachada.pesquisaFuncionarioPelaMatricula(matricula);
                int idPessoa = funcionario.getIdPessoa();
                String nome = funcionario.getNome();
                String telefone = funcionario.getTelefone();
                modelo.addRow(new Object[]{idPessoa,nome,telefone});

            }
        }
    }
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        setVisible(false);
        new TelaCadastroFuncionario().setVisible(true);
}//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        Funcionario funcionario;
        int matricula = 0;

        setVisible(false);
        new TelaEditarFuncionario().setVisible(true);

        TelaEditarFuncionario.campoMatriculaSecretaria.setEditable(true);
        TelaEditarFuncionario.campoMatriculaSecretaria.setText(Integer.toString((Integer)tabelaAcessoFuncionario.getValueAt(tabelaAcessoFuncionario.getSelectedRow(), 0)));
        TelaEditarFuncionario.campoMatriculaSecretaria.setEditable(false);
        matricula = Integer.parseInt(TelaEditarFuncionario.campoMatriculaSecretaria.getText());
        funcionario = fachada.pesquisaFuncionarioPelaMatricula(matricula);
        TelaEditarFuncionario.campoNomeSecretaria.setText(funcionario.getNome());
        TelaEditarFuncionario.campoSenhaSecretaria.setText(funcionario.getFuncao());
        TelaEditarFuncionario.campoEnderecoSecretaria.setText(funcionario.getEndereco());
        TelaEditarFuncionario.campoBairroSecretaria.setText(funcionario.getBairro());
        TelaEditarFuncionario.campoCepSecretaria.setText(funcionario.getCep());
        TelaEditarFuncionario.campoCidadeSecretaria.setText(funcionario.getCidade());
        TelaEditarFuncionario.selecaoEstadoSecretaria.setSelectedItem(funcionario.getEstado());
        TelaEditarFuncionario.campoTelefoneSecretaria.setText(funcionario.getTelefone());
        TelaEditarFuncionario.campoCelularSecretaria.setText(funcionario.getCelular());
        TelaEditarFuncionario.selecaoSexoSecretaria.setSelectedItem(funcionario.getSexo());
        TelaEditarFuncionario.campoCpfSecretaria.setText(funcionario.getCpf());
        TelaEditarFuncionario.campoIdentidadeSecretaria.setText(funcionario.getRgNumero());
        TelaEditarFuncionario.selecaoOrgaoEmissorSecretaria.setSelectedItem(funcionario.getRgUf());
        TelaEditarFuncionario.campoEmailSecretaria.setText(funcionario.getEmail());
        TelaEditarFuncionario.campoDataNascimentoSecretaria.setText(funcionario.getNascimento());
        TelaEditarFuncionario.caixaObservacoesSecretaria.setText(funcionario.getObservacoes());

        image = fachada.pesquisarFoto(funcionario.getIdPessoa());
        i = image.getImage();
        TelaEditarFuncionario.labelFoto.setIcon(new ImageIcon(i.getScaledInstance(TelaEditarFuncionario.labelFoto.getWidth(), TelaEditarFuncionario.labelFoto.getHeight(), i.SCALE_DEFAULT)));



    }//GEN-LAST:event_botaoEditarActionPerformed

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        if (evt.getKeyCode() == 10) {
            botaoPesquisar.doClick();
        }
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed

      DefaultTableModel tabela_clientes = (DefaultTableModel) tabelaAcessoFuncionario.getModel();
      final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela_clientes);
      tabelaAcessoFuncionario.setRowSorter(sorter);
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
       int row = tabelaAcessoFuncionario.getSelectedRow();

        try {
            int matricula = (Integer) tabelaAcessoFuncionario.getValueAt(row, 0);
            Object[] options = { "Sim", "Não" };
            int sd =
            JOptionPane.showOptionDialog(null, "Deseja realmente excluir o funcionário?", 
                    "Excluir Funcionário",JOptionPane.INFORMATION_MESSAGE, 
                    JOptionPane.WARNING_MESSAGE,  null, options, options[0]);

            if (sd == 0) {
            ((DefaultTableModel) tabelaAcessoFuncionario.getModel()).removeRow(tabelaAcessoFuncionario.getSelectedRow());
            fachada.removerFoto(Utilitario.retornaIdPessoa(matricula));
            FuncionarioDAO.getInstance().removerSecretaria(matricula);
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    public void setFoto() {

        image = fachada.pesquisarFoto((Integer) tabelaAcessoFuncionario.getValueAt(tabelaAcessoFuncionario.getSelectedRow(), 0));
        i = image.getImage();
        labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));


    }
    private void tabelaAcessoFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaAcessoFuncionarioKeyReleased
        setFoto();
    }//GEN-LAST:event_tabelaAcessoFuncionarioKeyReleased

    private void tabelaAcessoFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAcessoFuncionarioMousePressed
        setFoto();
    }//GEN-LAST:event_tabelaAcessoFuncionarioMousePressed

    private void selecaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoListarActionPerformed
      if(selecaoListar.getSelectedItem().equals("Ativos")){
          preencheTabelaFuncionariosAtivos();
      }
    }//GEN-LAST:event_selecaoListarActionPerformed


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
    public static javax.swing.JTable tabelaAcessoFuncionario;
    // End of variables declaration//GEN-END:variables

}
