/*
 * TelaAcessoCadastroProfessor.java
 *
 * Created on 23/07/2010, 03:51:49
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.CustonDocument;
import br.sistcomp.sar.dominio.Pessoa;
import br.sistcomp.sar.dominio.Professor;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import br.sistcomp.sar.servico.TurmaDAO;
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
public class TelaAcessoCadastroProfessor extends javax.swing.JFrame {

    Fachada fachada = new Fachada();
    Image i;
    ImageIcon image;

    /** Creates new form TelaAcessoCadastroProfessor */
    public TelaAcessoCadastroProfessor() {
        initComponents();
        setLocationRelativeTo(null);
        campoBuscar.setDocument(new CustonDocument());
        setInformações();
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoEditar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
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
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botaoRemover = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAcessoProfessor = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acesso Professor");
        setResizable(false);

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

        jLabel1.setText("Buscar Professor");

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

        selecaoListar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos os Professores", "Ativos", "Inativos" }));

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

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" ® SAR - Gerenciador Fitness");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        tabelaAcessoProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome do Professor", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAcessoProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaAcessoProfessorMousePressed(evt);
            }
        });
        tabelaAcessoProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaAcessoProfessorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAcessoProfessor);
        tabelaAcessoProfessor.getColumnModel().getColumn(1).setMinWidth(300);
        tabelaAcessoProfessor.getColumnModel().getColumn(1).setMaxWidth(300);

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

        botaoVoltar.setText("Sair");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
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

    public void preencheTabela() {
        tabelaAcessoProfessor.getColumnModel().getColumn(0);
        tabelaAcessoProfessor.getColumnModel().getColumn(1);
        tabelaAcessoProfessor.getColumnModel().getColumn(2);
        DefaultTableModel modelo = (DefaultTableModel) tabelaAcessoProfessor.getModel();
        modelo.setNumRows(0);
        Vector<Pessoa> pessoas = fachada.todosProfessores();
        if (pessoas != null) {
            for (Pessoa pessoa : pessoas) {
                String nome = pessoa.getNome();
                int matricula = pessoa.getIdPessoa();
                String telefone = pessoa.getTelefone();
                modelo.addRow(new Object[]{matricula, nome, telefone});

            }
        }
    }
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        setVisible(false);
        new TelaCadastroProfessor().setVisible(true);
}//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
}//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed

        Professor professor;
        int matriculaProfessor = -1;

        setVisible(false);
        new TelaEditarProfessor().setVisible(true);

        TelaEditarProfessor.campoMatriculaProfessor.setEditable(true);
        TelaEditarProfessor.campoMatriculaProfessor.setText(Integer.toString((Integer) tabelaAcessoProfessor.getValueAt(tabelaAcessoProfessor.getSelectedRow(), 0)));
        TelaEditarProfessor.campoMatriculaProfessor.setEditable(false);
        matriculaProfessor = Integer.parseInt(TelaEditarProfessor.campoMatriculaProfessor.getText());
        professor = fachada.pesquisarProfessorPorMatricula(matriculaProfessor);
        TelaEditarProfessor.campoNomeProfessor.setText(professor.getNome());
        TelaEditarProfessor.selecaoModalidadeProfessor.setSelectedItem(professor.getModalidade().getNome());
        TelaEditarProfessor.campoEnderecoProfessor.setText(professor.getEndereco());
        TelaEditarProfessor.campoBairroProfessor.setText(professor.getBairro());
        TelaEditarProfessor.campoCepProfessor.setText(professor.getCep());
        TelaEditarProfessor.campoCidadeProfessor.setText(professor.getCidade());
        TelaEditarProfessor.selecaoEstadoProfessor.setSelectedItem(professor.getEstado());
        TelaEditarProfessor.campoTelefoneProfessor.setText(professor.getTelefone());
        TelaEditarProfessor.campoCelularProfessor.setText(professor.getCelular());
        TelaEditarProfessor.selecaoSexoProfessor.setSelectedItem(professor.getSexo());
        TelaEditarProfessor.campoCpfProfessor.setText(professor.getCpf());
        TelaEditarProfessor.campoIdentidadeProfessor.setText(professor.getRgNumero());
        TelaEditarProfessor.selecaoOrgaoEmissorProfessor.setSelectedItem(professor.getRgUf());
        TelaEditarProfessor.campoEmailProfessor.setText(professor.getEmail());
        TelaEditarProfessor.campoDataNascimentoProfessor.setText(professor.getNascimento());
        TelaEditarProfessor.caixaObservacoesProfessor.setText(professor.getObservacoes());

        image = fachada.pesquisarFoto(professor.getIdPessoa());
        i = image.getImage();
        TelaEditarProfessor.labelFotoProfessor.setIcon(new ImageIcon(i.getScaledInstance(TelaEditarProfessor.labelFotoProfessor.getWidth(), TelaEditarProfessor.labelFotoProfessor.getHeight(), i.SCALE_DEFAULT)));

    }//GEN-LAST:event_botaoEditarActionPerformed

    public void setInformações() {
        labelCadastrados.setText(Integer.toString(fachada.todosProfessores().size()));
        labelAtivos.setText(Integer.toString(fachada.professoresAtivos()));
        labelInativos.setText(Integer.toString(fachada.todosProfessores().size() - fachada.professoresAtivos()));
    }
    public void setFoto() {

        image = fachada.pesquisarFoto((Integer) tabelaAcessoProfessor.getValueAt(tabelaAcessoProfessor.getSelectedRow(), 0));
        i = image.getImage();
        labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));


    }
    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        if (evt.getKeyCode() == 10) {
            botaoPesquisar.doClick();
        }
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        DefaultTableModel tabela_clientes = (DefaultTableModel) tabelaAcessoProfessor.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela_clientes);
        tabelaAcessoProfessor.setRowSorter(sorter);
        String nome = campoBuscar.getText().toUpperCase();
        if (nome.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(
                        RowFilter.regexFilter(nome));
                campoBuscar.setText("");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não existe.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        int row = tabelaAcessoProfessor.getSelectedRow();

        try {
            int matricula = (Integer) tabelaAcessoProfessor.getValueAt(row, 0);
            if (TurmaDAO.getInstance().pesquisaProfessorEmTurma(matricula) == true) {
                JOptionPane.showMessageDialog(null, "Professor responsável por uma Turma!", "Impossível remover Professor", JOptionPane.ERROR_MESSAGE);
            } else {
                Object[] options = {"Sim", "Não"};
                int sd =
                        JOptionPane.showOptionDialog(null, "Deseja, realmente, excluir o Professor?",
                        "Excluir Professor", JOptionPane.INFORMATION_MESSAGE,
                        JOptionPane.WARNING_MESSAGE, null, options, options[0]);

                if (sd == 0) {
                    ((DefaultTableModel) tabelaAcessoProfessor.getModel()).removeRow(tabelaAcessoProfessor.getSelectedRow());
                    fachada.removerFoto(Utilitario.retornaIdPessoa(matricula));
                    fachada.removerProfessor(matricula);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nao ha o que remover!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void tabelaAcessoProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaAcessoProfessorKeyReleased
        setFoto();
    }//GEN-LAST:event_tabelaAcessoProfessorKeyReleased

    private void tabelaAcessoProfessorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAcessoProfessorMousePressed
        setFoto();
    }//GEN-LAST:event_tabelaAcessoProfessorMousePressed
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
    public static javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelInativos;
    private javax.swing.JPanel painelFoto;
    private javax.swing.JComboBox selecaoListar;
    public static javax.swing.JTable tabelaAcessoProfessor;
    // End of variables declaration//GEN-END:variables
}
