package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.Professor;
import br.sistcomp.sar.dominio.Turma;
import br.sistcomp.sar.fachada.Fachada;
import br.sistcomp.sar.servico.FuncionarioDAO;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroTurma extends javax.swing.JFrame {

    Fachada fachada = new Fachada();
    private Boolean liberar = true, editar = false;

    /** Creates new form CadastroDeTurma */
    public TelaCadastroTurma() {
        initComponents();
        setModalidade();
        campoCodigo.setText(Integer.toString(fachada.proximoCodigoTurma()));
        setLocationRelativeTo(null);
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        selecaoModalidade = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selecaoProfessor = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCadastroDeTurma = new javax.swing.JTable();
        opcaoSemanaSegunda = new javax.swing.JCheckBox();
        opcaoSemanaTerca = new javax.swing.JCheckBox();
        opcaoSemanaQuarta = new javax.swing.JCheckBox();
        opcaoSemanaQuinta = new javax.swing.JCheckBox();
        opcaoSemanaSexta = new javax.swing.JCheckBox();
        opcaoSemanaSabado = new javax.swing.JCheckBox();
        opcaoSemanaDomingo = new javax.swing.JCheckBox();
        campoHoraInicio = new javax.swing.JFormattedTextField();
        campoHoraFim = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        botaoVoltarTurma = new javax.swing.JButton();
        botaoRemoverTurma = new javax.swing.JButton();
        botaoEditarTurma = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botaoCadastrar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        jLabel4.setText("jLabel4");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Turma");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel2.setText(" Código");

        campoCodigo.setEditable(false);
        campoCodigo.setFont(new java.awt.Font("sansserif", 1, 12));
        campoCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText(" Modalidade");

        selecaoModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoModalidadeActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Dia da Semana");

        jLabel9.setText(" Hora Inicio");

        jLabel10.setText(" Hora Fim");

        selecaoProfessor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));

        jLabel11.setText(" Professor");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        tabelaCadastroDeTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modalidade", "Dia da Semana", "Professor", "Hora Inicio", "Hora Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCadastroDeTurma.getTableHeader().setReorderingAllowed(false);
        tabelaCadastroDeTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaCadastroDeTurmaMousePressed(evt);
            }
        });
        tabelaCadastroDeTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaCadastroDeTurmaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCadastroDeTurma);
        tabelaCadastroDeTurma.getColumnModel().getColumn(0).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaCadastroDeTurma.getColumnModel().getColumn(1).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaCadastroDeTurma.getColumnModel().getColumn(2).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabelaCadastroDeTurma.getColumnModel().getColumn(3).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelaCadastroDeTurma.getColumnModel().getColumn(4).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(4).setPreferredWidth(25);
        tabelaCadastroDeTurma.getColumnModel().getColumn(5).setResizable(false);
        tabelaCadastroDeTurma.getColumnModel().getColumn(5).setPreferredWidth(25);

        opcaoSemanaSegunda.setText("S");
        opcaoSemanaSegunda.setToolTipText("Segunda");
        opcaoSemanaSegunda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcaoSemanaSegunda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opcaoSemanaSegunda.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        opcaoSemanaTerca.setText("T");
        opcaoSemanaTerca.setToolTipText("Terça");
        opcaoSemanaTerca.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        opcaoSemanaQuarta.setText("Q");
        opcaoSemanaQuarta.setToolTipText("Quarta");
        opcaoSemanaQuarta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        opcaoSemanaQuinta.setText("Q");
        opcaoSemanaQuinta.setToolTipText("Quinta");
        opcaoSemanaQuinta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        opcaoSemanaSexta.setText("S");
        opcaoSemanaSexta.setToolTipText("Sexta");
        opcaoSemanaSexta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        opcaoSemanaSabado.setText("S");
        opcaoSemanaSabado.setToolTipText("Sábado");
        opcaoSemanaSabado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        opcaoSemanaDomingo.setText("D");
        opcaoSemanaDomingo.setToolTipText("Domingo");
        opcaoSemanaDomingo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        try {
            campoHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHoraInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHoraFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(selecaoProfessor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(selecaoModalidade, 0, 144, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(campoHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(campoHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcaoSemanaSegunda, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcaoSemanaTerca, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcaoSemanaQuarta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcaoSemanaQuinta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opcaoSemanaSexta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcaoSemanaSabado, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcaoSemanaDomingo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecaoModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcaoSemanaSegunda)
                            .addComponent(opcaoSemanaTerca)
                            .addComponent(opcaoSemanaQuarta)
                            .addComponent(opcaoSemanaQuinta)
                            .addComponent(opcaoSemanaSexta)
                            .addComponent(opcaoSemanaSabado)
                            .addComponent(opcaoSemanaDomingo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" ® SAR - Gerenciador Fitness");

        botaoVoltarTurma.setText("Voltar");
        botaoVoltarTurma.setMaximumSize(new java.awt.Dimension(83, 28));
        botaoVoltarTurma.setMinimumSize(new java.awt.Dimension(83, 28));
        botaoVoltarTurma.setPreferredSize(new java.awt.Dimension(83, 28));
        botaoVoltarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarTurmaActionPerformed(evt);
            }
        });

        botaoRemoverTurma.setText("Remover");
        botaoRemoverTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverTurmaActionPerformed(evt);
            }
        });

        botaoEditarTurma.setText("Editar");
        botaoEditarTurma.setPreferredSize(new java.awt.Dimension(83, 28));
        botaoEditarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarTurmaActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoRemoverTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoRemoverTurma)
                    .addComponent(botaoEditarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Map<String, Boolean> checaDiasDaSemana() {
        Map<String, Boolean> dias = new Hashtable<String, Boolean>();
        dias.put("Domingo", opcaoSemanaDomingo.isSelected());
        dias.put("Segunda", opcaoSemanaSegunda.isSelected());
        dias.put("Terca", opcaoSemanaTerca.isSelected());
        dias.put("Quarta", opcaoSemanaQuarta.isSelected());
        dias.put("Quinta", opcaoSemanaQuinta.isSelected());
        dias.put("Sexta", opcaoSemanaSexta.isSelected());
        dias.put("Sabado", opcaoSemanaSabado.isSelected());
        return dias;
    }

    public Boolean diasEmBranco() {
        if (opcaoSemanaDomingo.isSelected() || opcaoSemanaSegunda.isSelected() || opcaoSemanaTerca.isSelected() || opcaoSemanaQuarta.isSelected() || opcaoSemanaQuinta.isSelected() || opcaoSemanaSexta.isSelected() || opcaoSemanaSabado.isSelected()) {
            return false;
        }
        return true;
    }

    // Método que inseri todos as modalidades no combobox
    public void setModalidade() {
        Vector<String> modalidades = fachada.getNomesModalidades();
        modalidades.add(0, "- Selecione -");
        selecaoModalidade.setModel(new DefaultComboBoxModel(modalidades));
    }

    public void preencheTabela() {
        int codigo = 0;
        String nomeModalidade = "", nomeProfessor = "", horaInicio = "", horaFinal = "";

        tabelaCadastroDeTurma.getColumnModel().getColumn(0);
        tabelaCadastroDeTurma.getColumnModel().getColumn(1);
        tabelaCadastroDeTurma.getColumnModel().getColumn(2);
        tabelaCadastroDeTurma.getColumnModel().getColumn(3);
        tabelaCadastroDeTurma.getColumnModel().getColumn(4);
        tabelaCadastroDeTurma.getColumnModel().getColumn(5);
        DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDeTurma.getModel();
        modelo.setNumRows(0);
        Vector<Turma> turmas = fachada.todasTumas();

        for (Turma turma : turmas) {
            List<String> diasDaSemana = new ArrayList<String>();
            codigo = turma.getCodigo();
            nomeModalidade = turma.getProfessor().getModalidade().getNome();
            nomeProfessor = turma.getProfessor().getNome();
            horaInicio = turma.getHoraInicio();
            horaFinal = turma.getHoraFinal();
            for (String key : turma.getDias().keySet()) {
                if (turma.getDias().get(key) == true) {
                    diasDaSemana.add(key);
                }
            }
            modelo.addRow(new Object[]{codigo, nomeModalidade, diasDaSemana, nomeProfessor, horaInicio, horaFinal});


        }
    }

    // Método que inseri todos os professores de uma modalidade no combobox
    public void setProfessores(String modalidade) {
        Vector<String> professores = fachada.getProfessorPorModalidade(modalidade);
        professores.add(0, "- Selecione -");
        selecaoProfessor.setModel(new DefaultComboBoxModel(professores));
    }

    public void zeraProfessores() {
        Vector<String> professores = new Vector<String>();
        professores.add(0, "- Selecione -");
        selecaoProfessor.setModel(new DefaultComboBoxModel(professores));
    }

    public void ativaCampos() {
        campoCodigo.setEnabled(true);
        selecaoModalidade.setEnabled(true);
        selecaoProfessor.setEnabled(true);
        campoHoraFim.setEnabled(true);
        campoHoraInicio.setEnabled(true);
        opcaoSemanaDomingo.setEnabled(true);
        opcaoSemanaQuarta.setEnabled(true);
        opcaoSemanaQuinta.setEnabled(true);
        opcaoSemanaSegunda.setEnabled(true);
        opcaoSemanaSabado.setEnabled(true);
        opcaoSemanaSexta.setEnabled(true);
        opcaoSemanaTerca.setEnabled(true);
    }

    public void zerarCampos() {
        campoCodigo.setText(Integer.toString(fachada.proximoCodigoTurma()));
        campoHoraFim.setText("");
        campoHoraInicio.setText("");
        setModalidade();
        zeraProfessores();
        if (opcaoSemanaDomingo.isSelected()) {
            opcaoSemanaDomingo.doClick();
        }
        if (opcaoSemanaSegunda.isSelected()) {
            opcaoSemanaSegunda.doClick();
        }
        if (opcaoSemanaTerca.isSelected()) {
            opcaoSemanaTerca.doClick();
        }
        if (opcaoSemanaQuarta.isSelected()) {
            opcaoSemanaQuarta.doClick();
        }
        if (opcaoSemanaQuinta.isSelected()) {
            opcaoSemanaQuinta.doClick();
        }
        if (opcaoSemanaSexta.isSelected()) {
            opcaoSemanaSexta.doClick();
        }
        if (opcaoSemanaSabado.isSelected()) {
            opcaoSemanaSabado.doClick();
        }
    }
    private void botaoVoltarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarTurmaActionPerformed
        setVisible(false);
        new TelaAcessoModuloCadastro().setVisible(true);
    }//GEN-LAST:event_botaoVoltarTurmaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        if (editar) {
            JOptionPane.showMessageDialog(null, "Salve as alterações antes de cadastrar uma nova Turma!");
        } else {
            if (liberar == false) {
                JOptionPane.showMessageDialog(null, "Preencha os campos da nova Turma!");
                ativaCampos();
                zerarCampos();
                liberar = true;
            } else {
                if (selecaoModalidade.getSelectedItem().equals("- Selecione -")) {
                    JOptionPane.showMessageDialog(rootPane, "Selecione uma Modalidade!", "Erro!", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (selecaoProfessor.getSelectedItem().equals("- Selecione -")) {
                        JOptionPane.showMessageDialog(rootPane, "Selecione um Professor!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (diasEmBranco()) {
                            JOptionPane.showMessageDialog(rootPane, "Selecione um(ns) dia(s) para a Turma!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        } else {
                            List<String> diasDaSemana = new ArrayList<String>();
                            int codTurma = Integer.parseInt(campoCodigo.getText());
                            String horaInicio = campoHoraInicio.getText();
                            String horaFim = campoHoraFim.getText();
                            Map<String, Boolean> dias = checaDiasDaSemana();
                            Professor professor = fachada.pesquisarProfessorPorNome(selecaoProfessor.getSelectedItem().toString());
                            Turma turma = new Turma(codTurma, professor, horaInicio, horaFim, dias);
                            fachada.cadastrarTurma(turma);

                            //Inserindo na tabela
                            for (String key : turma.getDias().keySet()) {
                                if (turma.getDias().get(key) == true) {
                                    diasDaSemana.add(key);
                                }
                            }
                            tabelaCadastroDeTurma.getColumnModel().getColumn(0);
                            tabelaCadastroDeTurma.getColumnModel().getColumn(1);
                            tabelaCadastroDeTurma.getColumnModel().getColumn(2);
                            tabelaCadastroDeTurma.getColumnModel().getColumn(3);
                            tabelaCadastroDeTurma.getColumnModel().getColumn(4);
                            tabelaCadastroDeTurma.getColumnModel().getColumn(5);
                            DefaultTableModel modelo = (DefaultTableModel) tabelaCadastroDeTurma.getModel();
                            modelo.addRow(new Object[]{codTurma, turma.getProfessor().getModalidade().getNome(), diasDaSemana, turma.getProfessor().getNome(), horaInicio, horaFim});
                            zerarCampos();
                            JOptionPane.showMessageDialog(rootPane, "Turma Cadastrada com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void selecaoModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoModalidadeActionPerformed
        selecaoProfessor.setModel(new DefaultComboBoxModel());
        String modalidade = selecaoModalidade.getSelectedItem().toString();
        setProfessores(modalidade);
    }//GEN-LAST:event_selecaoModalidadeActionPerformed

    public void selecinaTurma() {
        if (tabelaCadastroDeTurma.getModel().getRowCount() > 0) {
            liberar = false;
            campoCodigo.setEditable(true);
            campoCodigo.setText(Integer.toString((Integer) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 0)));
            campoCodigo.setEditable(false);
            selecaoModalidade.setSelectedItem((String) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 1));
            List<String> dias = (List<String>) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 2);


            if (dias.contains("Segunda")) {
                opcaoSemanaSegunda.setSelected(true);
            } else {
                opcaoSemanaSegunda.setSelected(false);
            }

            if (dias.contains("Terca")) {
                opcaoSemanaTerca.setSelected(true);
            } else {
                opcaoSemanaTerca.setSelected(false);
            }

            if (dias.contains("Quarta")) {
                opcaoSemanaQuarta.setSelected(true);
            } else {
                opcaoSemanaQuarta.setSelected(false);
            }


            if (dias.contains("Quinta")) {
                opcaoSemanaQuinta.setSelected(true);
            } else {
                opcaoSemanaQuinta.setSelected(false);
            }

            if (dias.contains("Sexta")) {
                opcaoSemanaSexta.setSelected(true);
            } else {
                opcaoSemanaSexta.setSelected(false);
            }

            if (dias.contains("Sabado")) {
                opcaoSemanaSabado.setSelected(true);
            } else {
                opcaoSemanaSabado.setSelected(false);
            }

            if (dias.contains("Domingo")) {
                opcaoSemanaDomingo.setSelected(true);
            } else {
                opcaoSemanaDomingo.setSelected(false);
            }

            selecaoProfessor.setSelectedItem((String) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 3));
            campoHoraInicio.setText(((String) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 4)));
            campoHoraFim.setText(((String) tabelaCadastroDeTurma.getValueAt(tabelaCadastroDeTurma.getSelectedRow(), 5)));
            campoCodigo.setEnabled(false);
            selecaoModalidade.setEnabled(false);
            selecaoProfessor.setEnabled(false);
            campoHoraFim.setEnabled(false);
            campoHoraInicio.setEnabled(false);
            opcaoSemanaDomingo.setEnabled(false);
            opcaoSemanaQuarta.setEnabled(false);
            opcaoSemanaQuinta.setEnabled(false);
            opcaoSemanaSegunda.setEnabled(false);
            opcaoSemanaSabado.setEnabled(false);
            opcaoSemanaSexta.setEnabled(false);
            opcaoSemanaTerca.setEnabled(false);
        }
    }
    private void botaoEditarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarTurmaActionPerformed
        if (tabelaCadastroDeTurma.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma Turma!", "Impossivel Editar Turma!", JOptionPane.ERROR_MESSAGE);
        } else {
            liberar = false;
            editar = true;
            campoCodigo.setEnabled(true);
            selecaoModalidade.setEnabled(true);
            selecaoProfessor.setEnabled(true);
            campoHoraFim.setEnabled(true);
            campoHoraInicio.setEnabled(true);
            opcaoSemanaDomingo.setEnabled(true);
            opcaoSemanaQuarta.setEnabled(true);
            opcaoSemanaQuinta.setEnabled(true);
            opcaoSemanaSegunda.setEnabled(true);
            opcaoSemanaSabado.setEnabled(true);
            opcaoSemanaSexta.setEnabled(true);
            opcaoSemanaTerca.setEnabled(true);
        }
    }//GEN-LAST:event_botaoEditarTurmaActionPerformed

    private void tabelaCadastroDeTurmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCadastroDeTurmaKeyReleased
        selecinaTurma();
    }//GEN-LAST:event_tabelaCadastroDeTurmaKeyReleased

    private void tabelaCadastroDeTurmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCadastroDeTurmaMousePressed
        selecinaTurma();
    }//GEN-LAST:event_tabelaCadastroDeTurmaMousePressed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (editar) {
            liberar = true;
            editar = false;
            List<String> diasDaSemana = new ArrayList<String>();
            int codTurma = Integer.parseInt(campoCodigo.getText());
            String horaInicio = campoHoraInicio.getText();
            String horaFim = campoHoraFim.getText();
            Map<String, Boolean> dias = checaDiasDaSemana();
            Professor professor = fachada.pesquisarProfessorPorNome(selecaoProfessor.getSelectedItem().toString());
            Turma turmaEditada = new Turma(codTurma, professor, horaInicio, horaFim, dias);

            fachada.editarTurma(turmaEditada);

            for (String key : turmaEditada.getDias().keySet()) {
                if (turmaEditada.getDias().get(key) == true) {
                    diasDaSemana.add(key);
                }
            }
            tabelaCadastroDeTurma.setValueAt(codTurma, tabelaCadastroDeTurma.getSelectedRow(), 0);
            tabelaCadastroDeTurma.setValueAt(professor.getModalidade().getNome(), tabelaCadastroDeTurma.getSelectedRow(), 1);
            tabelaCadastroDeTurma.setValueAt(diasDaSemana, tabelaCadastroDeTurma.getSelectedRow(), 2);
            tabelaCadastroDeTurma.setValueAt(professor.getNome(), tabelaCadastroDeTurma.getSelectedRow(), 3);
            tabelaCadastroDeTurma.setValueAt(horaInicio, tabelaCadastroDeTurma.getSelectedRow(), 4);
            tabelaCadastroDeTurma.setValueAt(horaFim, tabelaCadastroDeTurma.getSelectedRow(), 5);

            zerarCampos();
            JOptionPane.showMessageDialog(rootPane, "Turma Salva com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não há Turma em Edição!", "Impossivel Salvar Turma!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoRemoverTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverTurmaActionPerformed
        if (tabelaCadastroDeTurma.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione Uma Turma", "Turma Não Selecionada!", JOptionPane.ERROR_MESSAGE);
        } else {
            int codTurma = Integer.parseInt(campoCodigo.getText());
            if (fachada.liberarExclusaoTurma(codTurma)) {
                String horaInicio = campoHoraInicio.getText();
                String horaFim = campoHoraFim.getText();
                Map<String, Boolean> dias = checaDiasDaSemana();
                Professor professor = fachada.pesquisarProfessorPorNome(selecaoProfessor.getSelectedItem().toString());
                Turma turma = new Turma(codTurma, professor, horaInicio, horaFim, dias);
                ((DefaultTableModel) tabelaCadastroDeTurma.getModel()).removeRow(tabelaCadastroDeTurma.getSelectedRow());
                fachada.removerTurma(turma);
                JOptionPane.showMessageDialog(rootPane, "Turma Excluída com Sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Há Alunos alocados nesta Turma!", "Impossivel Remover Turma!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoRemoverTurmaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEditarTurma;
    private javax.swing.JButton botaoRemoverTurma;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltarTurma;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JFormattedTextField campoHoraFim;
    private javax.swing.JFormattedTextField campoHoraInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox opcaoSemanaDomingo;
    private javax.swing.JCheckBox opcaoSemanaQuarta;
    private javax.swing.JCheckBox opcaoSemanaQuinta;
    private javax.swing.JCheckBox opcaoSemanaSabado;
    private javax.swing.JCheckBox opcaoSemanaSegunda;
    private javax.swing.JCheckBox opcaoSemanaSexta;
    private javax.swing.JCheckBox opcaoSemanaTerca;
    private javax.swing.JComboBox selecaoModalidade;
    private javax.swing.JComboBox selecaoProfessor;
    private javax.swing.JTable tabelaCadastroDeTurma;
    // End of variables declaration//GEN-END:variables
}
