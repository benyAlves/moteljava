/*
 * TelaWebCam.java
 *
 * Created on 15/07/2010, 02:44:14
 */

package br.sistcomp.sar.GUI;

import br.sistcomp.sar.utilidades.MetodosWebCam;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaWebCam extends javax.swing.JFrame {
    public static boolean teste;
    /** Creates new form TelaWebCam */
    public TelaWebCam() {
        //teste para foto. Se teste igual a false, salva afoto Default.
        teste = false;
        try {
            MetodosWebCam.player.close();
            initComponents();
            setLocationRelativeTo(null);
        } catch (Exception e) {
            initComponents();
            setLocationRelativeTo(null);
        }
        MetodosWebCam.visualizarVideo();
        //   setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaoCapturar = new javax.swing.JButton();
        botaoDescartar = new javax.swing.JButton();
        painelWebCam = new javax.swing.JPanel();
        botaoAceitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/LogoCamera.png"))); // NOI18N

        botaoCapturar.setBackground(new java.awt.Color(51, 51, 51));
        botaoCapturar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/capturar.png"))); // NOI18N
        botaoCapturar.setToolTipText("Capturar Imagem");
        botaoCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCapturarActionPerformed(evt);
            }
        });

        botaoDescartar.setBackground(new java.awt.Color(51, 51, 51));
        botaoDescartar.setForeground(new java.awt.Color(51, 51, 51));
        botaoDescartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/botaoCancelaWeb.png"))); // NOI18N
        botaoDescartar.setToolTipText("Descartar Imagem");
        botaoDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDescartarActionPerformed(evt);
            }
        });

        painelWebCam.setBorder(null);

        javax.swing.GroupLayout painelWebCamLayout = new javax.swing.GroupLayout(painelWebCam);
        painelWebCam.setLayout(painelWebCamLayout);
        painelWebCamLayout.setHorizontalGroup(
            painelWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );
        painelWebCamLayout.setVerticalGroup(
            painelWebCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        botaoAceitar.setBackground(new java.awt.Color(51, 51, 51));
        botaoAceitar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        botaoAceitar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAceitar.setText("OK");
        botaoAceitar.setToolTipText("Aceitar Imagem");
        botaoAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAceitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(botaoDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(painelWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botaoDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(botaoCapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(painelWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCapturarActionPerformed
        MetodosWebCam.capturarImagem();
        
    }//GEN-LAST:event_botaoCapturarActionPerformed

    private void botaoDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDescartarActionPerformed
        MetodosWebCam.descartaImagem();

    }//GEN-LAST:event_botaoDescartarActionPerformed

    private void botaoAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAceitarActionPerformed
        MetodosWebCam.aceitarImagem();
        teste = true;
        setVisible(false);
    }//GEN-LAST:event_botaoAceitarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAceitar;
    private javax.swing.JButton botaoCapturar;
    private javax.swing.JButton botaoDescartar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel painelWebCam;
    // End of variables declaration//GEN-END:variables

}
