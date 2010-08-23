/*
 * TelaCadastroModalidade.java
 *
 * Created on 19/07/2010, 00:25:11
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.CaixaAlta;
import br.sistcomp.sar.dominio.Modalidade;
import br.sistcomp.sar.fachada.Fachada;
import br.sistcomp.sar.servico.ModalidadeDAO;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaCadastroModalidade extends javax.swing.JFrame {

    private int linha = 0;
    private int coluna = 0;
    Fachada fachada = new Fachada();
    private Boolean liberar = true, editar = false;

    /** Creates new form TelaCadastroModalidade */
    public TelaCadastroModalidade() {
        initComponents();
        campoNome.setDocument(new CaixaAlta());
        campoAmbiente.setDocument(new CaixaAlta());
        setValorDoCodigo();
        preencheTabela();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAmbiente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caixaNumeroDeAlunos = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroDeModalidade = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Modalidades");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        campoCodigo.setEditable(false);
        campoCodigo.setFont(new java.awt.Font("sansserif", 1, 12));
        campoCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Código");

        jLabel3.setText("Nome");

        jLabel4.setText("Ambiente");

        caixaNumeroDeAlunos.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel5.setText("Número de Alunos");

        tabelaCadastroDeModalidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Ambiente", "Número de Alunos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroDeModalidade.getTableHeader().setReorderingAllowed(false);
        tabelaCadastroDeModalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCadastroDeModalidadeMousePressed(evt);
            }
        });
        tabelaCadastroDeModalidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaCadastroDeModalidadeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroDeModalidade);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(0).setResizable(false);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(1).setResizable(false);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(2).setResizable(false);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabelaCadastroDeModalidade.getColumnModel().getColumn(3).setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campoAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caixaNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(caixaNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ® SAR - Gerenciador Fitness");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

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

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    public void ativaCampos(){
        campoCodigo.setEnabled(true);
        campoNome.setEnabled(true);
        campoAmbiente.setEnabled(true);
        caixaNumeroDeAlunos.setEnabled(true);
    }

    public void preencheTabela() {
        Vector<String> modalidades = fachada.getNomesModalidades();
        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDeModalidade.getModel();
        modelo.setNumRows(0);
        if (modalidades != null) {
            for (String s : modalidades) {

                    Modalidade modalidade = ModalidadeDAO.getInstance().getModalidades(s);
                    int codigo = modalidade.getCodigo();
                    String nome = modalidade.getNome();
                    String ambiente = modalidade.getAmbiente();
                    int numeroAlunos = modalidade.getAlunosPorTurma();
                    tabelaCadastroDeModalidade.getColumnModel().getColumn(0);
                    tabelaCadastroDeModalidade.getColumnModel().getColumn(1);
                    tabelaCadastroDeModalidade.getColumnModel().getColumn(2);
                    tabelaCadastroDeModalidade.getColumnModel().getColumn(3);
                    modelo.addRow(new Object[]{codigo, nome,ambiente, numeroAlunos});

            }
        }
    }

    public void setValorDoCodigo() {
        int codigo = fachada.proximoCodigoModalidade();
        campoCodigo.setText(Integer.toString(codigo));
    }
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        if(editar){
            JOptionPane.showMessageDialog(null,"Salve as alterações antes de cadastrar uma nova Modalidade!");
        }
        else {
            if (liberar == false){
                JOptionPane.showMessageDialog(null,"Preencha os campos da nova Modalidade!");
                ativaCampos();
                setValorDoCodigo();
                zerarCampos();
                liberar = true;
            }
            else{
                if (campoNome.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Digite o Nome");
                    } else {
                        if (campoAmbiente.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Digite o Ambiente");
                        } else {
                            if ((Integer) caixaNumeroDeAlunos.getValue() == 0) {
                                JOptionPane.showMessageDialog(null, "Digite a Quantidade Alunos");
                            } else {
                                int codigo = Integer.parseInt(campoCodigo.getText());
                                String nome = campoNome.getText();
                                String ambiente = campoAmbiente.getText();
                                int qtdeAlunos = (Integer) caixaNumeroDeAlunos.getValue();
                                Modalidade modalidade = new Modalidade(codigo, nome, ambiente, qtdeAlunos);
                                fachada.cadastrarModalidade(modalidade);
                                setValorDoCodigo();
                                tabelaCadastroDeModalidade.getColumnModel().getColumn(0);
                                tabelaCadastroDeModalidade.getColumnModel().getColumn(1);
                                tabelaCadastroDeModalidade.getColumnModel().getColumn(2);
                                tabelaCadastroDeModalidade.getColumnModel().getColumn(3);
                                DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDeModalidade.getModel();
                                modelo.addRow(new Object[]{codigo, nome,ambiente, qtdeAlunos});
                                zerarCampos();
                                setValorDoCodigo();
                            }
                        }
            
              }
            }
        }


    }//GEN-LAST:event_botaoCadastrarActionPerformed

   public void zerarCampos() {
        campoNome.setText("");
        campoAmbiente.setText("");
        caixaNumeroDeAlunos.setValue(0);
    }
    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        int row = tabelaCadastroDeModalidade.getSelectedRow();
        
        String nome = (String) tabelaCadastroDeModalidade.getValueAt(row, 1);
        
        ((DefaultTableModel) tabelaCadastroDeModalidade.getModel()).removeRow(tabelaCadastroDeModalidade.getSelectedRow());
        fachada.removerModalidade(nome);
        coluna = 0;
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        liberar = false;
        editar = true;
        campoCodigo.setEnabled(true);
        campoNome.setEnabled(true);
        campoAmbiente.setEnabled(true);
        caixaNumeroDeAlunos.setEnabled(true);
    }//GEN-LAST:event_botaoEditarActionPerformed
    public void bloquearCampos(){
        liberar = false;
        campoCodigo.setEditable(true);
        campoCodigo.setText(Integer.toString((Integer) tabelaCadastroDeModalidade.getValueAt(tabelaCadastroDeModalidade.getSelectedRow(),0)));
        campoCodigo.setEditable(false);
        campoNome.setText((String) tabelaCadastroDeModalidade.getValueAt(tabelaCadastroDeModalidade.getSelectedRow(), 1));
        campoAmbiente.setText((String) tabelaCadastroDeModalidade.getValueAt(tabelaCadastroDeModalidade.getSelectedRow(),2));
        caixaNumeroDeAlunos.setValue((Object) tabelaCadastroDeModalidade.getValueAt(tabelaCadastroDeModalidade.getSelectedRow(), 3));
        campoCodigo.setEnabled(false);
        campoNome.setEnabled(false);
        campoAmbiente.setEnabled(false);
        caixaNumeroDeAlunos.setEnabled(false);
    }
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        liberar = true;
        editar = false;
        int codigo = Integer.parseInt(campoCodigo.getText());
        String nome = campoNome.getText();
        String ambiente = campoAmbiente.getText();
        int qtdeAlunos = (Integer) caixaNumeroDeAlunos.getValue();
        tabelaCadastroDeModalidade.setValueAt(codigo, tabelaCadastroDeModalidade.getSelectedRow(), 0);
        tabelaCadastroDeModalidade.setValueAt(nome,  tabelaCadastroDeModalidade.getSelectedRow(), 1);
        tabelaCadastroDeModalidade.setValueAt(ambiente,  tabelaCadastroDeModalidade.getSelectedRow(),2);
        tabelaCadastroDeModalidade.setValueAt(qtdeAlunos,  tabelaCadastroDeModalidade.getSelectedRow(),3);
        Modalidade modalidade = new Modalidade(codigo, nome, ambiente, qtdeAlunos);
        fachada.editarModalidade(modalidade);
        zerarCampos();
        setValorDoCodigo();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void tabelaCadastroDeModalidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCadastroDeModalidadeKeyReleased
        bloquearCampos();
    }//GEN-LAST:event_tabelaCadastroDeModalidadeKeyReleased

    private void tabelaCadastroDeModalidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroDeModalidadeMousePressed
        bloquearCampos();
    }//GEN-LAST:event_tabelaCadastroDeModalidadeMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JSpinner caixaNumeroDeAlunos;
    private javax.swing.JTextField campoAmbiente;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaCadastroDeModalidade;
    // End of variables declaration//GEN-END:variables
}
