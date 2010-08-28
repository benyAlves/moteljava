
/*
 * Tela.java
 *
 * Created on 23/07/2010, 00:02:28
 */
package br.sistcomp.sar.GUI;

import javax.swing.JPanel;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaAcessoModuloCadastro extends javax.swing.JFrame {

    public static boolean aluno, professor, funcionario;
    /** Creates new form Tela */
    public TelaAcessoModuloCadastro() {
        aluno = false;
        professor = false;
        funcionario = false;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoAluno = new javax.swing.JButton();
        botaoProfessor = new javax.swing.JButton();
        botaoFuncionario = new javax.swing.JButton();
        botaoPlano = new javax.swing.JButton();
        botaoTurma = new javax.swing.JButton();
        botaoModalidade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Módulo de Acesso");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fundoModuloCadastroCima.png"))); // NOI18N

        botaoAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloAluno.png"))); // NOI18N
        botaoAluno.setText("Aluno");
        botaoAluno.setToolTipText("Módulo Aluno");
        botaoAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlunoActionPerformed(evt);
            }
        });

        botaoProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloProfessorr.png"))); // NOI18N
        botaoProfessor.setText("Professor");
        botaoProfessor.setToolTipText("Módulo Professor");
        botaoProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProfessorActionPerformed(evt);
            }
        });

        botaoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloFuncionario.png"))); // NOI18N
        botaoFuncionario.setText("Funcionário");
        botaoFuncionario.setToolTipText("Módulo Funcionário");
        botaoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFuncionarioActionPerformed(evt);
            }
        });

        botaoPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloPlano.png"))); // NOI18N
        botaoPlano.setText("Plano");
        botaoPlano.setToolTipText("Módulo Plano");
        botaoPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPlanoActionPerformed(evt);
            }
        });

        botaoTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloTurma.png"))); // NOI18N
        botaoTurma.setText("Turma");
        botaoTurma.setToolTipText("Módulo Turma");
        botaoTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTurmaActionPerformed(evt);
            }
        });

        botaoModalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/moduloModalidadee.png"))); // NOI18N
        botaoModalidade.setText("Modalidade");
        botaoModalidade.setToolTipText("Módulo Modalidade");
        botaoModalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoModalidadeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" ® SAR - Gerenciador Fitness");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlunoActionPerformed
        setVisible(false);
        new TelaAcessoCadastroAluno().setVisible(true);
        aluno = true;
    }//GEN-LAST:event_botaoAlunoActionPerformed

    private void botaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProfessorActionPerformed
        setVisible(false);
        new TelaAcessoCadastroProfessor().setVisible(true);
        professor = true;
    }//GEN-LAST:event_botaoProfessorActionPerformed

    private void botaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFuncionarioActionPerformed
        setVisible(false);
        new TelaAcessoCadastroFuncionario().setVisible(true);
        funcionario =true;
    }//GEN-LAST:event_botaoFuncionarioActionPerformed

    private void botaoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPlanoActionPerformed
        setVisible(false);
        new TelaCadastroPlano().setVisible(true);
    }//GEN-LAST:event_botaoPlanoActionPerformed

    private void botaoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTurmaActionPerformed
        setVisible(false);
        new TelaCadastroTurma().setVisible(true);
    }//GEN-LAST:event_botaoTurmaActionPerformed

    private void botaoModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoModalidadeActionPerformed
        setVisible(false);
        new TelaCadastroModalidade().setVisible(true);
    }//GEN-LAST:event_botaoModalidadeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoAluno;
    public static javax.swing.JButton botaoFuncionario;
    private javax.swing.JButton botaoModalidade;
    private javax.swing.JButton botaoPlano;
    public static javax.swing.JButton botaoProfessor;
    private javax.swing.JButton botaoTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
