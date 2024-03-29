
/*
 * TelaAcessoModuloRelatorio.java
 *
 * Created on 24/07/2010, 22:41:28
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.fachada.Fachada;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaRelatorio extends javax.swing.JFrame {

    Fachada fachada;

    /** Creates new form TelaAcessoModuloRelatorio */
    public TelaRelatorio() {
        initComponents();
        setLocationRelativeTo(null);
        fachada = new Fachada();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotoes = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        painelDaImagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        painelRelatorioAlunos = new javax.swing.JPanel();
        botaoGerarRelatorio = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        relacaoAlunos = new javax.swing.JRadioButton();
        alunosHorario = new javax.swing.JRadioButton();
        alunosPlanosVencidos = new javax.swing.JRadioButton();
        alunosAniversariantes = new javax.swing.JRadioButton();
        alunosIdadeEntre = new javax.swing.JRadioButton();
        alunosModalidade = new javax.swing.JRadioButton();
        alunosBolsistas = new javax.swing.JRadioButton();
        selecaoBolsistas = new javax.swing.JComboBox();
        selecaoRelacao = new javax.swing.JComboBox();
        campoHorario = new javax.swing.JFormattedTextField();
        selecaoAniversariantes = new javax.swing.JComboBox();
        campoIdadeInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        selecaoModalidade = new javax.swing.JComboBox();
        campoIdadeFim = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRelatorios = new javax.swing.JMenu();
        itemAlunos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Módulo Relatório"); // NOI18N
        setResizable(false);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fundoModuloRelatorioCima.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoAcademiaPequeno.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Clique na aba Relatórios acima para ter acesso aos relatórios");

        javax.swing.GroupLayout painelDaImagemLayout = new javax.swing.GroupLayout(painelDaImagem);
        painelDaImagem.setLayout(painelDaImagemLayout);
        painelDaImagemLayout.setHorizontalGroup(
            painelDaImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelDaImagemLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelDaImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDaImagemLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        painelDaImagemLayout.setVerticalGroup(
            painelDaImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDaImagemLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(painelDaImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelDaImagemLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel3)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        painelPrincipal.add(painelDaImagem, "painelDaImagem");

        botaoGerarRelatorio.setText("Gerar Relatório");
        botaoGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarRelatorioActionPerformed(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        grupoDeBotoes.add(relacaoAlunos);
        relacaoAlunos.setFont(new java.awt.Font("sansserif", 1, 14));
        relacaoAlunos.setText("Relação de Alunos");
        relacaoAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relacaoAlunosMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosHorario);
        alunosHorario.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosHorario.setText("Alunos por Horário");
        alunosHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosHorarioMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosPlanosVencidos);
        alunosPlanosVencidos.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosPlanosVencidos.setText("Alunos com Planos Vencidos");
        alunosPlanosVencidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosPlanosVencidosMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosAniversariantes);
        alunosAniversariantes.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosAniversariantes.setText("Alunos Aniversariantes");
        alunosAniversariantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosAniversariantesMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosIdadeEntre);
        alunosIdadeEntre.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosIdadeEntre.setText("Alunos com idade entre");
        alunosIdadeEntre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosIdadeEntreMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosModalidade);
        alunosModalidade.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosModalidade.setText("Alunos por Modalidade");
        alunosModalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosModalidadeMouseClicked(evt);
            }
        });

        grupoDeBotoes.add(alunosBolsistas);
        alunosBolsistas.setFont(new java.awt.Font("sansserif", 1, 14));
        alunosBolsistas.setText("Alunos Bolsistas");
        alunosBolsistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunosBolsistasMouseClicked(evt);
            }
        });

        selecaoBolsistas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Todos", "Parcial", "Integral" }));

        selecaoRelacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Todos", "Masculino", "Feminino" }));

        try {
            campoHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        selecaoAniversariantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        campoIdadeInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel2.setText("e");

        selecaoModalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));

        campoIdadeFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(alunosAniversariantes)
                        .addGap(18, 18, 18)
                        .addComponent(selecaoAniversariantes, 0, 273, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(alunosIdadeEntre)
                        .addGap(18, 18, 18)
                        .addComponent(campoIdadeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIdadeFim, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(alunosBolsistas)
                        .addGap(18, 18, 18)
                        .addComponent(selecaoBolsistas, 0, 320, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relacaoAlunos)
                            .addComponent(alunosHorario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecaoRelacao, 0, 304, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(alunosModalidade)
                        .addGap(18, 18, 18)
                        .addComponent(selecaoModalidade, 0, 274, Short.MAX_VALUE))
                    .addComponent(alunosPlanosVencidos))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunosBolsistas)
                    .addComponent(selecaoBolsistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relacaoAlunos)
                    .addComponent(selecaoRelacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunosHorario)
                    .addComponent(campoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunosAniversariantes)
                    .addComponent(selecaoAniversariantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunosIdadeEntre)
                    .addComponent(campoIdadeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campoIdadeFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alunosModalidade)
                    .addComponent(selecaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunosPlanosVencidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Relatório de Alunos", jPanel9);

        javax.swing.GroupLayout painelRelatorioAlunosLayout = new javax.swing.GroupLayout(painelRelatorioAlunos);
        painelRelatorioAlunos.setLayout(painelRelatorioAlunosLayout);
        painelRelatorioAlunosLayout.setHorizontalGroup(
            painelRelatorioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRelatorioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addGroup(painelRelatorioAlunosLayout.createSequentialGroup()
                        .addComponent(botaoGerarRelatorio)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelRelatorioAlunosLayout.setVerticalGroup(
            painelRelatorioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRelatorioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoGerarRelatorio))
                .addContainerGap())
        );

        painelPrincipal.add(painelRelatorioAlunos, "painelAlunos");

        menuRelatorios.setText("Relatórios"); // NOI18N

        itemAlunos.setText("Alunos");
        itemAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunosActionPerformed(evt);
            }
        });
        menuRelatorios.add(itemAlunos);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setModalidade() {
        Vector<String> modalidades = fachada.getNomesModalidades();
        modalidades.add(0, "- Selecione -");
        selecaoModalidade.setModel(new DefaultComboBoxModel(modalidades));
    }

    public void visualizarRelatorio(JasperPrint relatorio) {

        try {
            JasperViewer jrv = new JasperViewer(relatorio, false);
            jrv.resize(850, 650);
            jrv.setLocationRelativeTo(null);
            jrv.setVisible(true);


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível visualizar o Relatório");
        }
    }

    public void atualizaCampos() {
        relacaoAlunos.setSelected(false);
        alunosHorario.setSelected(false);
        alunosPlanosVencidos.setSelected(true);
        alunosAniversariantes.setSelected(false);
        alunosIdadeEntre.setSelected(false);
        alunosModalidade.setSelected(false);
        alunosBolsistas.setSelected(false);
        selecaoBolsistas.setEnabled(true);
        selecaoAniversariantes.setEnabled(true);
        selecaoModalidade.setEnabled(true);
        selecaoRelacao.setEnabled(true);
        campoHorario.setEnabled(true);
        campoIdadeFim.setEnabled(true);
        campoIdadeInicio.setEnabled(true);
    }

    public void zeraCampos() {
        selecaoBolsistas.setSelectedIndex(0);
        selecaoAniversariantes.setSelectedIndex(0);
        selecaoModalidade.setSelectedIndex(0);
        selecaoRelacao.setSelectedIndex(0);
        campoHorario.setText("");
        campoIdadeFim.setText("");
        campoIdadeInicio.setText("");
    }

    private void itemAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunosActionPerformed
        setModalidade();
        ((java.awt.CardLayout) painelPrincipal.getLayout()).show(painelPrincipal, "painelAlunos");
    }//GEN-LAST:event_itemAlunosActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        atualizaCampos();
        ((java.awt.CardLayout) painelPrincipal.getLayout()).show(painelPrincipal, "painelDaImagem");
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void alunosBolsistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosBolsistasMouseClicked
        if (alunosBolsistas.isSelected()) {
            zeraCampos();
            selecaoBolsistas.setEnabled(true);
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_alunosBolsistasMouseClicked

    private void relacaoAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relacaoAlunosMouseClicked
        if (relacaoAlunos.isSelected()) {
            zeraCampos();
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoBolsistas.setEnabled(false);
            selecaoRelacao.setEnabled(true);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_relacaoAlunosMouseClicked

    private void alunosHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosHorarioMouseClicked
        if (alunosHorario.isSelected()) {
            zeraCampos();
            selecaoBolsistas.setEnabled(false);
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(true);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_alunosHorarioMouseClicked

    private void alunosAniversariantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosAniversariantesMouseClicked
        if (alunosAniversariantes.isSelected()) {
            zeraCampos();
            selecaoAniversariantes.setEnabled(true);
            selecaoModalidade.setEnabled(false);
            selecaoBolsistas.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_alunosAniversariantesMouseClicked

    private void alunosIdadeEntreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosIdadeEntreMouseClicked
        if (alunosIdadeEntre.isSelected()) {
            zeraCampos();
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoBolsistas.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(true);
            campoIdadeInicio.setEnabled(true);
        }
    }//GEN-LAST:event_alunosIdadeEntreMouseClicked

    private void alunosModalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosModalidadeMouseClicked
        if (alunosModalidade.isSelected()) {
            zeraCampos();
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(true);
            selecaoBolsistas.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_alunosModalidadeMouseClicked

    private void alunosPlanosVencidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosPlanosVencidosMouseClicked
        if (alunosPlanosVencidos.isSelected()) {
            zeraCampos();
            selecaoBolsistas.setEnabled(false);
            selecaoAniversariantes.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoRelacao.setEnabled(false);
            campoHorario.setEnabled(false);
            campoIdadeFim.setEnabled(false);
            campoIdadeInicio.setEnabled(false);
        }
    }//GEN-LAST:event_alunosPlanosVencidosMouseClicked

    private void botaoGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {
        //------------------------------------------------------------------
        // RELATORIO DE ALUNOS BOLSISTAS
        if (alunosBolsistas.isSelected()) {
            try {
                if (selecaoBolsistas.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida.");
                } else {
                    visualizarRelatorio(fachada.relatorioBolsista(selecaoBolsistas.getSelectedItem().toString()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS GERAL
        } else if (relacaoAlunos.isSelected()) {
            try {
                if (selecaoRelacao.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida.");
                } else {
                    visualizarRelatorio(fachada.relatorioTodosAlunos(selecaoRelacao.getSelectedItem().toString()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS ANIVERSARIANTES
        } else if (alunosAniversariantes.isSelected()) {
            try {
                if (selecaoAniversariantes.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida.");
                } else {
                    visualizarRelatorio(fachada.relatorioAniversariantes(selecaoAniversariantes.getSelectedIndex()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS POR MODALIDADE
        } else if (alunosModalidade.isSelected()) {
            try {
                if (selecaoModalidade.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida.");
                } else {
                    visualizarRelatorio(fachada.relatorioModalidade(selecaoModalidade.getSelectedItem().toString()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS COM PLANOS VENCIDOS
        } else if (alunosPlanosVencidos.isSelected()) {
            try {
                visualizarRelatorio(fachada.relatorioPlanosVencidos());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS POR HORÁRIO
        } else if (alunosHorario.isSelected()) {
            try {
                visualizarRelatorio(fachada.relatorioHorario(campoHorario.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
            //------------------------------------------------------------------
            // RELATORIO DE ALUNOS POR IDADE
        } else if (alunosIdadeEntre.isSelected()) {
            try {
                visualizarRelatorio(fachada.relatorioIdade(campoIdadeInicio.getText(), campoIdadeFim.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Relatório não pode ser carregado !!!", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        zeraCampos();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alunosAniversariantes;
    private javax.swing.JRadioButton alunosBolsistas;
    private javax.swing.JRadioButton alunosHorario;
    private javax.swing.JRadioButton alunosIdadeEntre;
    private javax.swing.JRadioButton alunosModalidade;
    private javax.swing.JRadioButton alunosPlanosVencidos;
    private javax.swing.JButton botaoGerarRelatorio;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JFormattedTextField campoHorario;
    private javax.swing.JTextField campoIdadeFim;
    private javax.swing.JTextField campoIdadeInicio;
    private javax.swing.ButtonGroup grupoDeBotoes;
    private javax.swing.JMenuItem itemAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JPanel painelDaImagem;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelRelatorioAlunos;
    private javax.swing.JRadioButton relacaoAlunos;
    private javax.swing.JComboBox selecaoAniversariantes;
    private javax.swing.JComboBox selecaoBolsistas;
    private javax.swing.JComboBox selecaoModalidade;
    private javax.swing.JComboBox selecaoRelacao;
    // End of variables declaration//GEN-END:variables
}
