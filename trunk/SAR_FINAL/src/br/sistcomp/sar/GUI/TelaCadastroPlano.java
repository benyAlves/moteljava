
/*
 * TelaCadastroMensalidade.java
 *
 * Created on 19/07/2010, 17:54:16
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.utilidades.CaixaAlta;
import br.sistcomp.sar.dominio.Plano;
import br.sistcomp.sar.fachada.Fachada;
import br.sistcomp.sar.servico.PlanoDAO;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaCadastroPlano extends javax.swing.JFrame {

    Fachada fachada = new Fachada();
    private int linha = 0;
    private int coluna = 0;
    private Boolean liberar = true, editar = false;

    /** Creates new form TelaCadastroMensalidade */
    public TelaCadastroPlano() {
        initComponents();
        campoNome.setDocument(new CaixaAlta());
        setLocationRelativeTo(null);
        preencheTabela();
        campoCodigo.setText(Integer.toString(fachada.proximoCodigo()));
        setModalidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroDePlano = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        selecaoDuracao = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selecaoStatus = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        selecaoModalidade = new javax.swing.JComboBox();
        botaoCadastrar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Plano");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        campoCodigo.setEditable(false);
        campoCodigo.setFont(new java.awt.Font("sansserif", 1, 12));
        campoCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Código");

        tabelaCadastroDePlano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Duração", "Modalidade", "Valor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroDePlano.getTableHeader().setReorderingAllowed(false);
        tabelaCadastroDePlano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCadastroDePlanoMousePressed(evt);
            }
        });
        tabelaCadastroDePlano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaCadastroDePlanoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroDePlano);
        tabelaCadastroDePlano.getColumnModel().getColumn(0).setResizable(false);
        tabelaCadastroDePlano.getColumnModel().getColumn(1).setResizable(false);
        tabelaCadastroDePlano.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelaCadastroDePlano.getColumnModel().getColumn(2).setResizable(false);
        tabelaCadastroDePlano.getColumnModel().getColumn(3).setResizable(false);
        tabelaCadastroDePlano.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaCadastroDePlano.getColumnModel().getColumn(4).setResizable(false);
        tabelaCadastroDePlano.getColumnModel().getColumn(5).setResizable(false);

        jLabel3.setText("Nome");

        selecaoDuracao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "1 Mês", "2 Meses", "3 Meses", "4 Meses", "5 Meses", "6 Meses", "7 Meses", "8 Meses", "9 Meses", "10 Meses", "11 Meses", "12 Meses" }));

        jLabel4.setText("Duração");

        campoValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Valor");

        selecaoStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        jLabel6.setText("Status");

        jLabel7.setText("Modalidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(selecaoModalidade, 0, 346, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(selecaoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(selecaoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(32, 32, 32))
                                .addComponent(selecaoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ® SAR - Gerenciador Fitness");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
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
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-750)/2, (screenSize.height-578)/2, 750, 578);
    }// </editor-fold>//GEN-END:initComponents

    public void setModalidades() {
        Vector<String> nomes = fachada.getNomesModalidades();
        nomes.add(0, "- Selecione -");
        selecaoModalidade.setModel(new DefaultComboBoxModel(nomes));
    }

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
}//GEN-LAST:event_botaoVoltarActionPerformed

    public void preencheTabela() {

        tabelaCadastroDePlano.getColumnModel().getColumn(0);
        tabelaCadastroDePlano.getColumnModel().getColumn(1);
        tabelaCadastroDePlano.getColumnModel().getColumn(2);
        tabelaCadastroDePlano.getColumnModel().getColumn(3);
        tabelaCadastroDePlano.getColumnModel().getColumn(4);
        tabelaCadastroDePlano.getColumnModel().getColumn(5);
        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDePlano.getModel();
        modelo.setNumRows(0);
        Vector<Plano> planos = fachada.todosOsPlanos();
        if (planos != null) {
            for (Plano plano : planos) {
                int codigo = plano.getCodigo();
                String nome = plano.getNome();
                int duracao = plano.getDuracao();
                String nomeModadalidade = plano.getModalidade().getNome();
                double valor = plano.getValor();
                String status = plano.getStatus();
                modelo.addRow(new Object[]{codigo, nome, duracao, nomeModadalidade, valor, status});
            }
        }
    }
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        if (editar) {
            JOptionPane.showMessageDialog(rootPane, "Salve as Alterações Antes de Cadastrar um Novo Plano!", "Erro!", JOptionPane.WARNING_MESSAGE);
        } else {
            if (liberar == false) {
                JOptionPane.showMessageDialog(rootPane, "Preencha os Campos do Novo Plano!", "Novo!", JOptionPane.INFORMATION_MESSAGE);
                ativaCampos();
                zerarCampos();
                liberar = true;
            } else {
                if (campoNome.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "Digite o Nome!", "Erro!", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (selecaoDuracao.getSelectedItem().equals("- Selecione -")) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione a Duração!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (campoValor.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(rootPane, "Digite um Valor!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (selecaoModalidade.getSelectedItem().equals("- Selecione -")) {
                                JOptionPane.showMessageDialog(rootPane, "Selecione a Modalidade!", "Erro!", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (selecaoStatus.getSelectedItem().equals("Inativo")) {
                                    JOptionPane.showMessageDialog(rootPane, "O Status no cadastro não pode ser Inativo!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    if (campoValor.getText().contains(".") == false) {
                                        JOptionPane.showMessageDialog(rootPane, "Digite o valor no seguinte formato: 10.00!", "Erro!", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        int codigo = Integer.parseInt(campoCodigo.getText());
                                        String nome = campoNome.getText();
                                        int duracao = (selecaoDuracao.getSelectedIndex());
                                        double valor = Double.parseDouble(campoValor.getText());
                                        String modalidade = selecaoModalidade.getSelectedItem().toString();
                                        String status = selecaoStatus.getSelectedItem().toString();
                                        Plano plano = new Plano(codigo, nome, duracao, valor, fachada.getModalidade(modalidade), status);
                                        fachada.cadastrarPlano(plano);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(0);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(1);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(2);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(3);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(4);
                                        tabelaCadastroDePlano.getColumnModel().getColumn(5);
                                        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDePlano.getModel();
                                        modelo.addRow(new Object[]{codigo, nome, duracao, modalidade, valor, status});
                                        zerarCampos();
                                        JOptionPane.showMessageDialog(rootPane, "Plano Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        if (tabelaCadastroDePlano.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione Um Plano", "Plano Não Selecionado!", JOptionPane.ERROR_MESSAGE);
        } else {
            int codPlano = (Integer) (tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 0));
            if (fachada.liberarExclusaoPlano(codPlano)) {
                int row = tabelaCadastroDePlano.getSelectedRow();
                coluna = 1;
                String nome = (String) tabelaCadastroDePlano.getValueAt(row, coluna);
                ((DefaultTableModel) tabelaCadastroDePlano.getModel()).removeRow(tabelaCadastroDePlano.getSelectedRow());
                fachada.removerPlano(nome);
                JOptionPane.showMessageDialog(rootPane, "Plano Excluído com Sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Plano pertence há alguma Adesão!", "Impossivel Remover Plano!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        if (tabelaCadastroDePlano.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Plano!", "Impossivel Editar Plano!", JOptionPane.ERROR_MESSAGE);
        } else {
            liberar = false;
            editar = true;
            ativaCampos();
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (editar) {
            liberar = true;
            editar = false;
            int codigo = Integer.parseInt(campoCodigo.getText());
            String nome = campoNome.getText();
            int duracao = (selecaoDuracao.getSelectedIndex());
            String modalidade = selecaoModalidade.getSelectedItem().toString();
            double valor = Double.parseDouble(campoValor.getText());
            String status = selecaoStatus.getSelectedItem().toString();

            tabelaCadastroDePlano.setValueAt(codigo, tabelaCadastroDePlano.getSelectedRow(), 0);
            tabelaCadastroDePlano.setValueAt(nome, tabelaCadastroDePlano.getSelectedRow(), 1);
            tabelaCadastroDePlano.setValueAt(duracao, tabelaCadastroDePlano.getSelectedRow(), 2);
            tabelaCadastroDePlano.setValueAt(modalidade, tabelaCadastroDePlano.getSelectedRow(), 3);
            tabelaCadastroDePlano.setValueAt(valor, tabelaCadastroDePlano.getSelectedRow(), 4);
            tabelaCadastroDePlano.setValueAt(status, tabelaCadastroDePlano.getSelectedRow(), 5);
            Plano plano = new Plano(codigo, nome, duracao, valor, fachada.getModalidade(modalidade), status);
            fachada.editarPlano(plano);
            JOptionPane.showMessageDialog(rootPane, "Plano Salvo com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            zerarCampos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não há Plano em Edição!", "Impossivel Salvar Plano!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void tabelaCadastroDePlanoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCadastroDePlanoKeyReleased
        bloquearCampos();
    }//GEN-LAST:event_tabelaCadastroDePlanoKeyReleased

    private void tabelaCadastroDePlanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroDePlanoMousePressed
        bloquearCampos();

    }//GEN-LAST:event_tabelaCadastroDePlanoMousePressed

    public void bloquearCampos() {
        if (tabelaCadastroDePlano.getModel().getRowCount() > 0) {
            liberar = false;
            campoCodigo.setEditable(true);
            campoCodigo.setText(Integer.toString((Integer) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 0)));
            campoCodigo.setEditable(false);
            campoNome.setText((String) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 1));
            selecaoDuracao.setSelectedIndex((Integer) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 2));
            selecaoModalidade.setSelectedItem((Object) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 3));
            campoValor.setText(Double.toString((Double) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 4)));
            selecaoStatus.setSelectedItem((Object) tabelaCadastroDePlano.getValueAt(tabelaCadastroDePlano.getSelectedRow(), 5));
            campoCodigo.setEnabled(false);
            campoNome.setEnabled(false);
            selecaoDuracao.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            campoValor.setEnabled(false);
            selecaoStatus.setEnabled(false);
        }
    }

    public void ativaCampos() {
        campoCodigo.setEnabled(true);
        campoNome.setEnabled(true);
        selecaoDuracao.setEnabled(true);
        selecaoModalidade.setEnabled(true);
        campoValor.setEnabled(true);
        selecaoStatus.setEnabled(true);
    }

    public void zerarCampos() {
        campoCodigo.setText(Integer.toString(fachada.proximoCodigo()));
        campoNome.setText("");
        selecaoDuracao.setSelectedIndex(0);
        campoValor.setText("");
        selecaoModalidade.setSelectedIndex(0);
        selecaoStatus.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox selecaoDuracao;
    private javax.swing.JComboBox selecaoModalidade;
    private javax.swing.JComboBox selecaoStatus;
    private javax.swing.JTable tabelaCadastroDePlano;
    // End of variables declaration//GEN-END:variables
}
