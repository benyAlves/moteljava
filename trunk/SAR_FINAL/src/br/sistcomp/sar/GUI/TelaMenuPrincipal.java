/*
 * NewJFrame.java
 *
 * Created on 27/07/2010, 00:22:31
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.Utilitario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaMenuPrincipal extends javax.swing.JFrame {

    Utilitario utilitario;

    /** Creates new form NewJFrame */
    public TelaMenuPrincipal() {
        initComponents();
        utilitario = new Utilitario();
        utilitario.le_Data();
        labelUtilitarioData.setText(utilitario.dia_semana + ", " + utilitario.dia + " " + utilitario.mes + " " + utilitario.ano);
        timerMenu.start();
        setLocationRelativeTo(null);
        botaoCadastro.setMnemonic(KeyEvent.VK_C);
        botaoRelatorio.setMnemonic(KeyEvent.VK_R);
        botaoFinanceiro.setMnemonic(KeyEvent.VK_F);
        botaoOperacional.setMnemonic(KeyEvent.VK_O);
        botaoAcesso.setMnemonic(KeyEvent.VK_A);
        botaoFicha.setMnemonic(KeyEvent.VK_H);
        conect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timerMenu = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painelTransparencia = new org.jdesktop.swingx.JXPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        botaoAcesso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoRelatorio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        botaoCadastro = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        botaoFicha = new javax.swing.JButton();
        botaoFinanceiro = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        botaoOperacional = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelUtilitarioData = new javax.swing.JLabel();
        labelUtilitarioHora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        busy = new org.jdesktop.swingx.JXBusyLabel();

        timerMenu.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timerMenuOnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fundoMenuCimaa.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fundoMenuBaixo.png"))); // NOI18N

        painelTransparencia.setBorder(null);

        jLabel16.setText("Pressione Alt + H para acessar o Módulo");

        jLabel17.setText("Pressione Alt + A para acessar o Módulo");

        botaoAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoAcesso.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel3.setText("Cadastros");

        botaoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoRelatorio.png"))); // NOI18N
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        jLabel20.setText("Pressione Alt + O para acessar o Módulo");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel4.setText("Relatórios");

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel19.setText("Ficha");

        botaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoCadastro.png"))); // NOI18N
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        jLabel6.setText("Cadastro de Alunos, Professores, Turmas e outros.");

        botaoFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoFicha.png"))); // NOI18N

        botaoFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoFinanceiro.png"))); // NOI18N
        botaoFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinanceiroActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel18.setText("Acesso");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel5.setText("Financeiro");

        jLabel7.setText("Geração de Relatórios");

        jLabel8.setText("Controle Financeiro, Caixa e Resultados");

        jLabel9.setText("Pressione Alt + C para acessar o Módulo");

        jLabel14.setText("Cadastro da Ficha de Série do Aluno.");

        botaoOperacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoOperacional.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 19));
        jLabel15.setText("Operacional");

        jLabel11.setText("Pressione Alt + F para acessar o Módulo");

        jLabel10.setText("Pressione Alt + R para acessar o Módulo");

        jLabel13.setText("Backup e Manutenção");

        jLabel12.setText("Sistema de Acesso a Academia");

        javax.swing.GroupLayout painelTransparenciaLayout = new javax.swing.GroupLayout(painelTransparencia);
        painelTransparencia.setLayout(painelTransparenciaLayout);
        painelTransparenciaLayout.setHorizontalGroup(
            painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(botaoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                    .addGap(51, 51, 51)
                    .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(botaoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(botaoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                .addComponent(botaoOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)))
        );
        painelTransparenciaLayout.setVerticalGroup(
            painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel20))))
                        .addGroup(painelTransparenciaLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelTransparenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelTransparenciaLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)))))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        labelUtilitarioData.setFont(new java.awt.Font("sansserif", 1, 14));
        labelUtilitarioData.setText("Data");

        labelUtilitarioHora.setFont(new java.awt.Font("sansserif", 1, 14));
        labelUtilitarioHora.setText("00:00:00");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoSair.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        busy.setBusy(true);
        busy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(busy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 697, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUtilitarioData, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUtilitarioHora, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(painelTransparencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(busy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUtilitarioHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUtilitarioData)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addContainerGap(461, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(461, Short.MAX_VALUE)
                    .addComponent(jLabel2)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(painelTransparencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed
        new TelaRelatorio().setVisible(true);
}//GEN-LAST:event_botaoRelatorioActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        new TelaAcessoModuloCadastro().setVisible(true);
}//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinanceiroActionPerformed
        new TelaFinanceiro().setVisible(true);
}//GEN-LAST:event_botaoFinanceiroActionPerformed

    private void timerMenuOnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerMenuOnTime
        utilitario.le_Hora();
        labelUtilitarioHora.setText(utilitario.hora);
    }//GEN-LAST:event_timerMenuOnTime

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String opcoes[] = {"1. Deslogar", "2. Sair do Sistema"};
        String op = (String) JOptionPane.showInputDialog(null, "Escolha", "SAR - Gerenciador Fitness", JOptionPane.ERROR_MESSAGE, null, opcoes, "1. teste");
        if (op != null) {
            if (op.equals(opcoes[0])) {
                setVisible(false);
                new TelaLogin().setVisible(true);
            } else if (op.equals(opcoes[1])) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void conect() {
        (new Thread(new Runnable() {

            public void run() {
                try {
//                    busy.setVisible(true);
//                    busy.setBusy(true);
                    painelTransparencia.setAlpha(0.1F);
                    Thread.sleep(1500L);
                    new TelaAvisoInicial().setVisible(true);
                    busy.setVisible(false);
                    painelTransparencia.setAlpha(1.0F);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possível iniciar o Busy !!!");
                }
                setCursor(Utilitario.stopCursor());
            }
        })).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAcesso;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoFicha;
    private javax.swing.JButton botaoFinanceiro;
    private javax.swing.JButton botaoOperacional;
    private javax.swing.JButton botaoRelatorio;
    private org.jdesktop.swingx.JXBusyLabel busy;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelUtilitarioData;
    private javax.swing.JLabel labelUtilitarioHora;
    private org.jdesktop.swingx.JXPanel painelTransparencia;
    private org.netbeans.examples.lib.timerbean.Timer timerMenu;
    // End of variables declaration//GEN-END:variables
}
