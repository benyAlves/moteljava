/*
 * Testando.java
 *
 * Created on 14/08/2010, 17:54:59
 */
package br.sistcomp.sar.GUI;

import br.sistcomp.sar.dominio.Aluno;
import br.sistcomp.sar.dominio.CaixaAlta;
import br.sistcomp.sar.dominio.Mensalidade;
import br.sistcomp.sar.dominio.Utilitario;
import br.sistcomp.sar.fachada.Fachada;
import java.awt.Image;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jefferson Araújo
 */
public class TelaFinanceiro extends javax.swing.JFrame {

    Utilitario utilitario = new Utilitario();
    Fachada fachada = new Fachada();
    ImageIcon image;
    Image i;

    /** Creates new form Testando */
    public TelaFinanceiro() {
        initComponents();
        setLocationRelativeTo(null);
        campoNomePesquisar.setDocument(new CaixaAlta());
        utilitario.le_Data();
        utilitario.le_Hora();
        linkData.setText("Hoje é " + utilitario.dia + " de " + utilitario.mes + " de " + utilitario.ano);
        tabelaContasReceber.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoContasReceber = new javax.swing.JButton();
        botaoContasPagar = new javax.swing.JButton();
        botaoFinalizaCaixa = new javax.swing.JButton();
        botaoAbreCaixa = new javax.swing.JButton();
        botaoSairFinanceiro = new javax.swing.JButton();
        botaoMovimentacao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXTaskPane2 = new org.jdesktop.swingx.JXTaskPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        quadroCalendario = new javax.swing.JInternalFrame();
        calendario = new org.jdesktop.swingx.JXMonthView();
        linkData = new org.jdesktop.swingx.JXHyperlink();
        painelContasReceber = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        labelFoto = new javax.swing.JLabel();
        botaoPesquisa1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContasReceber = new javax.swing.JTable();
        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        botaoSair = new javax.swing.JButton();
        botaoReceber = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoNascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        campoCelular = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        campoDebito = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        painelPesquisar = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        campoNomePesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesquisar = new javax.swing.JTable();
        botaoConfirmar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        painelContasPagar = new javax.swing.JInternalFrame();
        jLabel11 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoVencimento = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        botaoLancar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaContasPagar = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        jXTitledSeparator2 = new org.jdesktop.swingx.JXTitledSeparator();
        botaoPagar = new javax.swing.JButton();
        painelConfirmaPagamento = new javax.swing.JInternalFrame();
        jLabel14 = new javax.swing.JLabel();
        campoAlunoConfirma = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoDescricaoConfirma = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoMesConfirma = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoVencimentoConfirma = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        campoValorConfirma = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoPagamentoConfirma = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        campoObservacaoRecebe = new javax.swing.JTextField();
        botaoConfirma = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        painelAbreCaixa = new javax.swing.JInternalFrame();
        jXTitledSeparator3 = new org.jdesktop.swingx.JXTitledSeparator();
        botaoSairAberturaCaixa = new javax.swing.JButton();
        botaoAbreCaixaAberturaDoCaixa = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jXTitledSeparator4 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelNomeDoFuncionario = new javax.swing.JLabel();
        selecaoFormaDeAbrir = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        campoValorInicialDoCaixa = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dialogoAbertura = new javax.swing.JInternalFrame();
        botaoNao = new javax.swing.JButton();
        botaoSim = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        painelMovimentacaoDoCaixa = new javax.swing.JInternalFrame();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        campoInicial = new javax.swing.JTextField();
        campoEntrada = new javax.swing.JTextField();
        campoSaida = new javax.swing.JTextField();
        campoSaldo = new javax.swing.JTextField();
        jXTaskPaneContainer2 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        linkSaldoDetalhado = new org.jdesktop.swingx.JXHyperlink();
        jSeparator4 = new javax.swing.JSeparator();
        linkRetirada = new org.jdesktop.swingx.JXHyperlink();
        linkSuprimentos = new org.jdesktop.swingx.JXHyperlink();
        linkDetalhes = new org.jdesktop.swingx.JXHyperlink();
        linkExcluir = new org.jdesktop.swingx.JXHyperlink();
        jSeparator5 = new javax.swing.JSeparator();
        linkFluxo = new org.jdesktop.swingx.JXHyperlink();
        linkRelatorio = new org.jdesktop.swingx.JXHyperlink();
        botaoSairMovimentacao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaMovimentacao = new javax.swing.JTable();
        labelAbertura = new javax.swing.JLabel();
        labelDataHora = new javax.swing.JLabel();
        selecaoFiltra = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        selecaoMostrar = new javax.swing.JComboBox();
        selecaoFuncionario = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        painelFecharCaixa = new javax.swing.JInternalFrame();
        jLabel33 = new javax.swing.JLabel();
        jXTitledSeparator5 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel37 = new javax.swing.JLabel();
        campoSaldoDoCaixa = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jXTitledSeparator6 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel39 = new javax.swing.JLabel();
        campoDinheiroInicial = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        campoDinheiroEntrada = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        campoDinheiroSaida = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        botaoFechamento = new javax.swing.JButton();
        jXTitledSeparator7 = new org.jdesktop.swingx.JXTitledSeparator();
        painelRetiradaCaixa = new javax.swing.JInternalFrame();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        campoValorRetirada = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        selecaoFormaRetirada = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        campoHistoricoRetirada = new javax.swing.JTextField();
        botaoSairRetirada = new javax.swing.JButton();
        botaoConfirmarRetirada = new javax.swing.JButton();
        painelSuprimentoCaixa = new javax.swing.JInternalFrame();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        campoValorSuprimento = new javax.swing.JTextField();
        selecaoFormaSuprimento = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        campoHistoricoSuprimento = new javax.swing.JTextField();
        botaoConfirmarSuprimento = new javax.swing.JButton();
        botaoSairSuprimento = new javax.swing.JButton();
        painelAnaliseFinanceira = new javax.swing.JInternalFrame();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        selecaoMes = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaAnaliseFinanceira = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        labelReceitas = new javax.swing.JLabel();
        labelDespezas = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        painelSaldoDetalhado = new javax.swing.JInternalFrame();
        jLabel58 = new javax.swing.JLabel();
        jXTitledSeparator8 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel59 = new javax.swing.JLabel();
        campoSaldoDoCaixaFluxo = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jXTitledSeparator9 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel61 = new javax.swing.JLabel();
        campoDinheiroInicialFluxo = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        campoDinheiroEntradaFluxo = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        campoDinheiroSaidaFluxo = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        painelFluxoCaixa = new javax.swing.JInternalFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoSairFluxoCaixa = new javax.swing.JButton();
        botaoGeraRelatorioFluxo = new javax.swing.JButton();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jLabel66 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento Financeiro");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        botaoContasReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/contasReceber.png"))); // NOI18N
        botaoContasReceber.setToolTipText("Contas a Receber");
        botaoContasReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoContasReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContasReceberActionPerformed(evt);
            }
        });

        botaoContasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/contasPagar.png"))); // NOI18N
        botaoContasPagar.setToolTipText("Contas a Pagar");
        botaoContasPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContasPagarActionPerformed(evt);
            }
        });

        botaoFinalizaCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fechaCaixa.png"))); // NOI18N
        botaoFinalizaCaixa.setToolTipText("Fechar o Caixa");
        botaoFinalizaCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFinalizaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizaCaixaActionPerformed(evt);
            }
        });

        botaoAbreCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/abreCaixa.png"))); // NOI18N
        botaoAbreCaixa.setToolTipText("Abrir o Caixa");
        botaoAbreCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAbreCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbreCaixaActionPerformed(evt);
            }
        });

        botaoSairFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/Home.png"))); // NOI18N
        botaoSairFinanceiro.setToolTipText("Voltar ao Menu Principal");
        botaoSairFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSairFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairFinanceiroActionPerformed(evt);
            }
        });

        botaoMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/movimentacao.png"))); // NOI18N
        botaoMovimentacao.setToolTipText("Movimentação do Caixa");
        botaoMovimentacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMovimentacaoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/analise.png"))); // NOI18N
        jButton1.setToolTipText("Análise Financeira");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAbreCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoFinalizaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(botaoSairFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoContasPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(botaoContasReceber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(botaoAbreCaixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(botaoFinalizaCaixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(botaoSairFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(botaoMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        jXTaskPaneContainer1.setOpaque(false);

        jXTaskPane2.setCollapsed(true);
        jXTaskPane2.setTitle("Utilidades");
        jXTaskPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/Calculadora.png"))); // NOI18N
        jLabel1.setText("Calculadora");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jXTaskPane2.getContentPane().add(jLabel1);

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 8));
        jXTaskPane2.getContentPane().add(jSeparator1);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/Calendario.png"))); // NOI18N
        jLabel2.setText("Calendário");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jXTaskPane2.getContentPane().add(jLabel2);

        jXTaskPaneContainer1.add(jXTaskPane2);

        quadroCalendario.setClosable(true);
        quadroCalendario.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        quadroCalendario.setTitle("Calendário");
        quadroCalendario.setAutoscrolls(true);
        quadroCalendario.setMaximumSize(new java.awt.Dimension(220, 183));
        quadroCalendario.setMinimumSize(new java.awt.Dimension(220, 183));

        calendario.setZoomable(true);

        linkData.setClickedColor(new java.awt.Color(0, 0, 153));
        linkData.setText("Data");
        linkData.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout quadroCalendarioLayout = new javax.swing.GroupLayout(quadroCalendario.getContentPane());
        quadroCalendario.getContentPane().setLayout(quadroCalendarioLayout);
        quadroCalendarioLayout.setHorizontalGroup(
            quadroCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadroCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quadroCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linkData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(calendario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        quadroCalendarioLayout.setVerticalGroup(
            quadroCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jXTaskPaneContainer1.add(quadroCalendario);

        jXTaskPaneContainer1.setBounds(530, 0, 270, 490);
        jDesktopPane1.add(jXTaskPaneContainer1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelContasReceber.setClosable(true);
        painelContasReceber.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelContasReceber.setIconifiable(true);
        painelContasReceber.setTitle("Contas a Receber");

        jLabel3.setText("Matrícula do Aluno");

        campoMatricula.setFont(new java.awt.Font("sansserif", 1, 12));
        campoMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMatriculaActionPerformed(evt);
            }
        });

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png"))); // NOI18N
        labelFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        botaoPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/lupaP.png"))); // NOI18N
        botaoPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisa1ActionPerformed(evt);
            }
        });

        tabelaContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mensalidade", "Data de Vencimento", "Valor da Mensalidade", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaContasReceberMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaContasReceber);

        jXTitledSeparator1.setFont(new java.awt.Font("sansserif", 1, 11));
        jXTitledSeparator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXTitledSeparator1.setTitle(" ® SAR - Gerenciador Fitness");

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoReceber.setText("Receber Pagamento");
        botaoReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReceberActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome");

        campoNome.setEditable(false);
        campoNome.setEnabled(false);

        jLabel6.setText("Data de Nasc.");

        campoNascimento.setEditable(false);
        campoNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNascimento.setEnabled(false);

        jLabel7.setText("Endereço");

        campoEndereco.setEditable(false);
        campoEndereco.setEnabled(false);

        jLabel8.setText("Telefone");

        campoTelefone.setEditable(false);
        campoTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTelefone.setEnabled(false);

        jLabel9.setText("Celular");

        campoCelular.setEditable(false);
        campoCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCelular.setEnabled(false);

        jLabel10.setText("Débito");

        campoDebito.setEditable(false);
        campoDebito.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDebito.setEnabled(false);
        campoDebito.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout painelContasReceberLayout = new javax.swing.GroupLayout(painelContasReceber.getContentPane());
        painelContasReceber.getContentPane().setLayout(painelContasReceberLayout);
        painelContasReceberLayout.setHorizontalGroup(
            painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContasReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContasReceberLayout.createSequentialGroup()
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addGroup(painelContasReceberLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelContasReceberLayout.createSequentialGroup()
                                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelContasReceberLayout.createSequentialGroup()
                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                            .addGroup(painelContasReceberLayout.createSequentialGroup()
                                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDebito, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContasReceberLayout.createSequentialGroup()
                        .addComponent(botaoReceber)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelContasReceberLayout.setVerticalGroup(
            painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContasReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContasReceberLayout.createSequentialGroup()
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(painelContasReceberLayout.createSequentialGroup()
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelContasReceberLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(jLabel3)))
                            .addComponent(botaoPesquisa1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair)
                    .addComponent(botaoReceber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelContasReceber.setBounds(130, 70, 540, 390);
        jDesktopPane1.add(painelContasReceber, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelPesquisar.setClosable(true);
        painelPesquisar.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelPesquisar.setIconifiable(true);
        painelPesquisar.setResizable(true);
        painelPesquisar.setTitle("Pesquisar Aluno");

        jLabel4.setText("Nome");

        campoNomePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomePesquisarKeyPressed(evt);
            }
        });

        tabelaPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaPesquisarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaPesquisar);

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar.getContentPane());
        painelPesquisar.getContentPane().setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                    .addGroup(painelPesquisarLayout.createSequentialGroup()
                        .addComponent(botaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoNomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoPesquisar))
                .addContainerGap())
        );

        painelPesquisar.setBounds(160, 60, 480, 270);
        jDesktopPane1.add(painelPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelContasPagar.setClosable(true);
        painelContasPagar.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelContasPagar.setIconifiable(true);
        painelContasPagar.setResizable(true);
        painelContasPagar.setTitle("Contas a Pagar");
        painelContasPagar.setToolTipText("");

        jLabel11.setText("Descrição");

        jLabel12.setText("Data de Vencimento");

        campoVencimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setText("Valor");

        campoValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botaoLancar.setText("Lançar");

        tabelaContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data de Vencimento", "Valor", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaContasPagar);

        botaoVoltar.setText("Sair");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jXTitledSeparator2.setFont(new java.awt.Font("sansserif", 1, 11));
        jXTitledSeparator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXTitledSeparator2.setTitle(" ® SAR - Gerenciador Fitness");

        botaoPagar.setText("Pagar Conta");

        javax.swing.GroupLayout painelContasPagarLayout = new javax.swing.GroupLayout(painelContasPagar.getContentPane());
        painelContasPagar.getContentPane().setLayout(painelContasPagarLayout);
        painelContasPagarLayout.setHorizontalGroup(
            painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContasPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(painelContasPagarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                    .addGroup(painelContasPagarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoLancar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContasPagarLayout.createSequentialGroup()
                        .addComponent(botaoPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXTitledSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelContasPagarLayout.setVerticalGroup(
            painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContasPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(campoVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLancar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelContasPagar.setBounds(130, 70, 540, 390);
        jDesktopPane1.add(painelContasPagar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelConfirmaPagamento.setClosable(true);
        painelConfirmaPagamento.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelConfirmaPagamento.setTitle("Receber Pagamento");

        jLabel14.setText("Aluno");

        jLabel15.setText("Descrição");

        jLabel16.setText("Mês");

        campoMesConfirma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setText("Vencimento");

        campoVencimentoConfirma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setText("Valor");

        campoValorConfirma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setText("Pagamento");

        campoPagamentoConfirma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setText("Observação");

        botaoConfirma.setText("Confirmar");
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConfirmaPagamentoLayout = new javax.swing.GroupLayout(painelConfirmaPagamento.getContentPane());
        painelConfirmaPagamento.getContentPane().setLayout(painelConfirmaPagamentoLayout);
        painelConfirmaPagamentoLayout.setHorizontalGroup(
            painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConfirmaPagamentoLayout.createSequentialGroup()
                        .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDescricaoConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campoAlunoConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoPagamentoConfirma, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoValorConfirma, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoVencimentoConfirma, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoMesConfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addComponent(campoObservacaoRecebe, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConfirmaPagamentoLayout.createSequentialGroup()
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelConfirmaPagamentoLayout.setVerticalGroup(
            painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConfirmaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlunoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campoDescricaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(campoMesConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(campoVencimentoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(campoValorConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(campoPagamentoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(campoObservacaoRecebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConfirmaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirma)
                    .addComponent(botaoCancelar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        painelConfirmaPagamento.setBounds(250, 80, 290, 310);
        jDesktopPane1.add(painelConfirmaPagamento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelAbreCaixa.setClosable(true);
        painelAbreCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelAbreCaixa.setIconifiable(true);
        painelAbreCaixa.setTitle("Abertura do Caixa");
        painelAbreCaixa.setPreferredSize(new java.awt.Dimension(540, 392));

        jXTitledSeparator3.setFont(new java.awt.Font("sansserif", 1, 11));
        jXTitledSeparator3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXTitledSeparator3.setTitle(" ® SAR - Gerenciador Fitness");

        botaoSairAberturaCaixa.setText("Sair");
        botaoSairAberturaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairAberturaCaixaActionPerformed(evt);
            }
        });

        botaoAbreCaixaAberturaDoCaixa.setText("Abrir o Caixa");
        botaoAbreCaixaAberturaDoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbreCaixaAberturaDoCaixaActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoCaixa.png"))); // NOI18N

        jXTitledSeparator4.setTitle("");

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Abertura do Caixa");

        jLabel23.setFont(new java.awt.Font("sansserif", 0, 14));
        jLabel23.setText("Funcionário: ");

        labelNomeDoFuncionario.setFont(new java.awt.Font("sansserif", 1, 14));
        labelNomeDoFuncionario.setText("Jefferson Araújo");

        selecaoFormaDeAbrir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ZERADO (R$ 0,00)", "COM O SALDO DO CAIXA ANTERIOR" }));

        jLabel24.setText("Abrir o Caixa da seguinte Forma:");

        campoValorInicialDoCaixa.setEditable(false);
        campoValorInicialDoCaixa.setFont(new java.awt.Font("sansserif", 1, 18));
        campoValorInicialDoCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValorInicialDoCaixa.setBackground(new java.awt.Color(51, 204, 0));

        jLabel25.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel25.setText("Valor Inicial do Caixa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selecaoFormaDeAbrir, 0, 500, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(jXTitledSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNomeDoFuncionario)
                                .addGap(83, 83, 83))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(327, 327, 327))))
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValorInicialDoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeDoFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTitledSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecaoFormaDeAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorInicialDoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Confirme os Dados", jPanel2);

        javax.swing.GroupLayout painelAbreCaixaLayout = new javax.swing.GroupLayout(painelAbreCaixa.getContentPane());
        painelAbreCaixa.getContentPane().setLayout(painelAbreCaixaLayout);
        painelAbreCaixaLayout.setHorizontalGroup(
            painelAbreCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbreCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAbreCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addComponent(jXTitledSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(painelAbreCaixaLayout.createSequentialGroup()
                        .addComponent(botaoAbreCaixaAberturaDoCaixa)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairAberturaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelAbreCaixaLayout.setVerticalGroup(
            painelAbreCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAbreCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAbreCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairAberturaCaixa)
                    .addComponent(botaoAbreCaixaAberturaDoCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelAbreCaixa.setBounds(130, 70, 540, 392);
        jDesktopPane1.add(painelAbreCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dialogoAbertura.setClosable(true);
        dialogoAbertura.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        dialogoAbertura.setTitle("Abrir o Caixa?");

        botaoNao.setText("Não");
        botaoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoActionPerformed(evt);
            }
        });

        botaoSim.setText("Sim");
        botaoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/question.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Confirma a abertura do Caixa?");

        javax.swing.GroupLayout dialogoAberturaLayout = new javax.swing.GroupLayout(dialogoAbertura.getContentPane());
        dialogoAbertura.getContentPane().setLayout(dialogoAberturaLayout);
        dialogoAberturaLayout.setHorizontalGroup(
            dialogoAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAberturaLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(dialogoAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAberturaLayout.createSequentialGroup()
                        .addComponent(botaoSim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAberturaLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        dialogoAberturaLayout.setVerticalGroup(
            dialogoAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAberturaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel27)
                .addGap(29, 29, 29)
                .addGroup(dialogoAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNao)
                    .addComponent(botaoSim))
                .addContainerGap())
            .addGroup(dialogoAberturaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        dialogoAbertura.setBounds(240, 170, 310, 150);
        jDesktopPane1.add(dialogoAbertura, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelMovimentacaoDoCaixa.setClosable(true);
        painelMovimentacaoDoCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelMovimentacaoDoCaixa.setIconifiable(true);
        painelMovimentacaoDoCaixa.setMaximizable(true);
        painelMovimentacaoDoCaixa.setTitle("Movimentação do Caixa");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/financas.png"))); // NOI18N

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel30.setText("Entrada");

        jLabel31.setText("Saída");

        jLabel32.setText("Saldo");

        jLabel29.setText("Inicial");

        campoInicial.setEditable(false);
        campoInicial.setFont(new java.awt.Font("sansserif", 1, 12));
        campoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoEntrada.setEditable(false);
        campoEntrada.setFont(new java.awt.Font("sansserif", 1, 12));
        campoEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoSaida.setEditable(false);
        campoSaida.setFont(new java.awt.Font("sansserif", 1, 12));
        campoSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoSaldo.setEditable(false);
        campoSaldo.setFont(new java.awt.Font("sansserif", 1, 12));
        campoSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jXTaskPane1.setTitle("Opções");

        linkSaldoDetalhado.setClickedColor(new java.awt.Color(0, 51, 255));
        linkSaldoDetalhado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/detalhado.png"))); // NOI18N
        linkSaldoDetalhado.setText("Saldo Detalhado");
        linkSaldoDetalhado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkSaldoDetalhadoActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkSaldoDetalhado);
        jXTaskPane1.getContentPane().add(jSeparator4);

        linkRetirada.setClickedColor(new java.awt.Color(0, 51, 255));
        linkRetirada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/naoLegal.png"))); // NOI18N
        linkRetirada.setText("Retirada");
        linkRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkRetiradaActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkRetirada);

        linkSuprimentos.setClickedColor(new java.awt.Color(0, 51, 255));
        linkSuprimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/legal.png"))); // NOI18N
        linkSuprimentos.setText("Suprimento");
        linkSuprimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkSuprimentosActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkSuprimentos);

        linkDetalhes.setClickedColor(new java.awt.Color(0, 51, 255));
        linkDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/detalhes.png"))); // NOI18N
        linkDetalhes.setText("Detalhes");
        jXTaskPane1.getContentPane().add(linkDetalhes);

        linkExcluir.setClickedColor(new java.awt.Color(0, 51, 255));
        linkExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/excluir.png"))); // NOI18N
        linkExcluir.setText("Excluir");
        jXTaskPane1.getContentPane().add(linkExcluir);
        jXTaskPane1.getContentPane().add(jSeparator5);

        linkFluxo.setClickedColor(new java.awt.Color(0, 51, 255));
        linkFluxo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fluxo.png"))); // NOI18N
        linkFluxo.setText("Fluxo");
        linkFluxo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkFluxoActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkFluxo);

        linkRelatorio.setClickedColor(new java.awt.Color(0, 51, 255));
        linkRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/relatorio.png"))); // NOI18N
        linkRelatorio.setText("Relatório");
        jXTaskPane1.getContentPane().add(linkRelatorio);

        jXTaskPaneContainer2.add(jXTaskPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(campoSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(campoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(campoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jXTaskPaneContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(campoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(campoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(campoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(campoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPaneContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoSairMovimentacao.setText("Sair");
        botaoSairMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairMovimentacaoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        tabelaMovimentacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recibo", "Histórico", "Data", "Hora", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaMovimentacao);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        labelAbertura.setText("Abertura:");

        labelDataHora.setFont(new java.awt.Font("sansserif", 1, 12));
        labelDataHora.setText("Data e Hora");

        selecaoFiltra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Caixa Atual", "Caixa Anterior" }));

        jLabel34.setText("Filtra por:");

        selecaoMostrar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Receitas", "Despezas" }));

        selecaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -" }));

        jLabel35.setText("Mostrar:");

        jLabel36.setText("Funcionário:");

        javax.swing.GroupLayout painelMovimentacaoDoCaixaLayout = new javax.swing.GroupLayout(painelMovimentacaoDoCaixa.getContentPane());
        painelMovimentacaoDoCaixa.getContentPane().setLayout(painelMovimentacaoDoCaixaLayout);
        painelMovimentacaoDoCaixaLayout.setHorizontalGroup(
            painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                        .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecaoFiltra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecaoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(selecaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                        .addComponent(labelAbertura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                        .addComponent(botaoSairMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelMovimentacaoDoCaixaLayout.setVerticalGroup(
            painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                        .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                            .addGroup(painelMovimentacaoDoCaixaLayout.createSequentialGroup()
                                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selecaoFiltra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selecaoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selecaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMovimentacaoDoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairMovimentacao)
                    .addComponent(labelAbertura)
                    .addComponent(labelDataHora))
                .addContainerGap())
        );

        painelMovimentacaoDoCaixa.setBounds(20, 40, 760, 440);
        jDesktopPane1.add(painelMovimentacaoDoCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelFecharCaixa.setClosable(true);
        painelFecharCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelFecharCaixa.setIconifiable(true);
        painelFecharCaixa.setTitle("Caixa Atual");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fechaCaixaP.png"))); // NOI18N

        jXTitledSeparator5.setTitle("");

        jLabel37.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel37.setText("Saldo do Caixa");

        campoSaldoDoCaixa.setEditable(false);
        campoSaldoDoCaixa.setFont(new java.awt.Font("sansserif", 1, 24));
        campoSaldoDoCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSaldoDoCaixa.setText("0.00");
        campoSaldoDoCaixa.setBackground(new java.awt.Color(0, 153, 0));

        jLabel38.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel38.setForeground(new java.awt.Color(0, 0, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Inicial");

        jXTitledSeparator6.setTitle("");

        jLabel39.setText("Dinheiro:");

        campoDinheiroInicial.setEditable(false);
        campoDinheiroInicial.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel40.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel40.setForeground(new java.awt.Color(0, 153, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Entrada");
        jLabel40.setToolTipText("");

        campoDinheiroEntrada.setEditable(false);
        campoDinheiroEntrada.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Dinheiro:");

        campoDinheiroSaida.setEditable(false);
        campoDinheiroSaida.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Dinheiro:");

        jLabel43.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel43.setForeground(new java.awt.Color(204, 51, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Saída");

        botaoFechamento.setText("Confirmar o Fechamento do Caixa");
        botaoFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFechamentoActionPerformed(evt);
            }
        });

        jXTitledSeparator7.setTitle("");

        javax.swing.GroupLayout painelFecharCaixaLayout = new javax.swing.GroupLayout(painelFecharCaixa.getContentPane());
        painelFecharCaixa.getContentPane().setLayout(painelFecharCaixaLayout);
        painelFecharCaixaLayout.setHorizontalGroup(
            painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXTitledSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFecharCaixaLayout.createSequentialGroup()
                        .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jXTitledSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                            .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoSaldoDoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33))
                    .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFecharCaixaLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel38)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel43))
                    .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXTitledSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFecharCaixaLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(botaoFechamento)
                .addGap(152, 152, 152))
        );
        painelFecharCaixaLayout.setVerticalGroup(
            painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFecharCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFecharCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(campoSaldoDoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jXTitledSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXTitledSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFecharCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(campoDinheiroInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(campoDinheiroSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(campoDinheiroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelFecharCaixa.setBounds(130, 100, 540, 310);
        jDesktopPane1.add(painelFecharCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelRetiradaCaixa.setClosable(true);
        painelRetiradaCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelRetiradaCaixa.setIconifiable(true);
        painelRetiradaCaixa.setTitle("Retirada do Caixa");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/dinheiro.png"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Retirada do Caixa");

        jLabel46.setText("Valor");

        campoValorRetirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel47.setText("Forma");

        selecaoFormaRetirada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Dinheiro", "Cheque" }));

        jLabel48.setText("Histórico");

        botaoSairRetirada.setText("Sair");
        botaoSairRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairRetiradaActionPerformed(evt);
            }
        });

        botaoConfirmarRetirada.setText("Confirmar");
        botaoConfirmarRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarRetiradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRetiradaCaixaLayout = new javax.swing.GroupLayout(painelRetiradaCaixa.getContentPane());
        painelRetiradaCaixa.getContentPane().setLayout(painelRetiradaCaixaLayout);
        painelRetiradaCaixaLayout.setHorizontalGroup(
            painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetiradaCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRetiradaCaixaLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRetiradaCaixaLayout.createSequentialGroup()
                        .addComponent(botaoConfirmarRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelRetiradaCaixaLayout.createSequentialGroup()
                        .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRetiradaCaixaLayout.createSequentialGroup()
                                .addComponent(campoValorRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoFormaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoHistoricoRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelRetiradaCaixaLayout.setVerticalGroup(
            painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetiradaCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(selecaoFormaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(campoHistoricoRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelRetiradaCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairRetirada)
                    .addComponent(botaoConfirmarRetirada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelRetiradaCaixa.setBounds(190, 140, 390, 220);
        jDesktopPane1.add(painelRetiradaCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelSuprimentoCaixa.setClosable(true);
        painelSuprimentoCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelSuprimentoCaixa.setIconifiable(true);
        painelSuprimentoCaixa.setTitle("Suprimento do Caixa");
        painelSuprimentoCaixa.setPreferredSize(new java.awt.Dimension(390, 222));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/suprimento.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Suprimento de Caixa");

        jLabel51.setText("Valor");

        campoValorSuprimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        selecaoFormaSuprimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Dinheiro", "Cheque" }));

        jLabel52.setText("Forma");

        jLabel53.setText("Histórico");

        botaoConfirmarSuprimento.setText("Confirmar");
        botaoConfirmarSuprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarSuprimentoActionPerformed(evt);
            }
        });

        botaoSairSuprimento.setText("Sair");
        botaoSairSuprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairSuprimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuprimentoCaixaLayout = new javax.swing.GroupLayout(painelSuprimentoCaixa.getContentPane());
        painelSuprimentoCaixa.getContentPane().setLayout(painelSuprimentoCaixaLayout);
        painelSuprimentoCaixaLayout.setHorizontalGroup(
            painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuprimentoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSuprimentoCaixaLayout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuprimentoCaixaLayout.createSequentialGroup()
                        .addComponent(botaoConfirmarSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSuprimentoCaixaLayout.createSequentialGroup()
                        .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuprimentoCaixaLayout.createSequentialGroup()
                                .addComponent(campoValorSuprimento, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoFormaSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoHistoricoSuprimento, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelSuprimentoCaixaLayout.setVerticalGroup(
            painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuprimentoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValorSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(selecaoFormaSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(campoHistoricoSuprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSuprimentoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairSuprimento)
                    .addComponent(botaoConfirmarSuprimento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuprimentoCaixa.setBounds(190, 130, 390, 222);
        jDesktopPane1.add(painelSuprimentoCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelAnaliseFinanceira.setClosable(true);
        painelAnaliseFinanceira.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelAnaliseFinanceira.setIconifiable(true);
        painelAnaliseFinanceira.setMaximizable(true);
        painelAnaliseFinanceira.setTitle("Análise Financeira");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoAnalise.png"))); // NOI18N

        jLabel55.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel55.setText("Análise Financeira");

        jLabel56.setText("Mês");

        selecaoMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Selecione -", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        tabelaAnaliseFinanceira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Saldo Inicial", "Receitas", "Despezas", "Saldo do Dia", "Saldo Acumulado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelaAnaliseFinanceira);
        tabelaAnaliseFinanceira.getColumnModel().getColumn(1).setResizable(false);
        tabelaAnaliseFinanceira.getColumnModel().getColumn(2).setResizable(false);
        tabelaAnaliseFinanceira.getColumnModel().getColumn(5).setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel57.setFont(new java.awt.Font("sansserif", 1, 14));
        jLabel57.setForeground(new java.awt.Color(0, 0, 102));
        jLabel57.setText("Resultado do Mês:");

        labelReceitas.setFont(new java.awt.Font("sansserif", 1, 14));
        labelReceitas.setForeground(new java.awt.Color(0, 153, 0));
        labelReceitas.setText("R$ 0,00");

        labelDespezas.setFont(new java.awt.Font("sansserif", 1, 14));
        labelDespezas.setForeground(new java.awt.Color(204, 0, 0));
        labelDespezas.setText("R$ 0,00");

        labelSaldo.setFont(new java.awt.Font("sansserif", 1, 14));
        labelSaldo.setForeground(new java.awt.Color(0, 0, 102));
        labelSaldo.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addGap(135, 135, 135)
                .addComponent(labelReceitas)
                .addGap(81, 81, 81)
                .addComponent(labelDespezas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(labelSaldo)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel57)
                .addComponent(labelReceitas)
                .addComponent(labelDespezas)
                .addComponent(labelSaldo))
        );

        javax.swing.GroupLayout painelAnaliseFinanceiraLayout = new javax.swing.GroupLayout(painelAnaliseFinanceira.getContentPane());
        painelAnaliseFinanceira.getContentPane().setLayout(painelAnaliseFinanceiraLayout);
        painelAnaliseFinanceiraLayout.setHorizontalGroup(
            painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAnaliseFinanceiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelAnaliseFinanceiraLayout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55)
                            .addGroup(painelAnaliseFinanceiraLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        painelAnaliseFinanceiraLayout.setVerticalGroup(
            painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAnaliseFinanceiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAnaliseFinanceiraLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelAnaliseFinanceiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(selecaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelAnaliseFinanceira.setBounds(10, 40, 780, 440);
        jDesktopPane1.add(painelAnaliseFinanceira, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelSaldoDetalhado.setClosable(true);
        painelSaldoDetalhado.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelSaldoDetalhado.setIconifiable(true);
        painelSaldoDetalhado.setTitle("Saldo Detalhado");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/fechaCaixaP.png"))); // NOI18N

        jXTitledSeparator8.setTitle("");

        jLabel59.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel59.setText("Saldo do Caixa");

        campoSaldoDoCaixaFluxo.setEditable(false);
        campoSaldoDoCaixaFluxo.setFont(new java.awt.Font("sansserif", 1, 24));
        campoSaldoDoCaixaFluxo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSaldoDoCaixaFluxo.setText("0.00");
        campoSaldoDoCaixaFluxo.setBackground(new java.awt.Color(0, 153, 0));

        jLabel60.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel60.setForeground(new java.awt.Color(0, 0, 102));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Inicial");

        jXTitledSeparator9.setTitle("");

        jLabel61.setText("Dinheiro:");

        campoDinheiroInicialFluxo.setEditable(false);
        campoDinheiroInicialFluxo.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroInicialFluxo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel62.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel62.setForeground(new java.awt.Color(0, 153, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Entrada");
        jLabel62.setToolTipText("");

        campoDinheiroEntradaFluxo.setEditable(false);
        campoDinheiroEntradaFluxo.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroEntradaFluxo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Dinheiro:");

        campoDinheiroSaidaFluxo.setEditable(false);
        campoDinheiroSaidaFluxo.setFont(new java.awt.Font("sansserif", 1, 14));
        campoDinheiroSaidaFluxo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Dinheiro:");

        jLabel65.setFont(new java.awt.Font("sansserif", 1, 18));
        jLabel65.setForeground(new java.awt.Color(204, 51, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Saída");

        javax.swing.GroupLayout painelSaldoDetalhadoLayout = new javax.swing.GroupLayout(painelSaldoDetalhado.getContentPane());
        painelSaldoDetalhado.getContentPane().setLayout(painelSaldoDetalhadoLayout);
        painelSaldoDetalhadoLayout.setHorizontalGroup(
            painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXTitledSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jXTitledSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                            .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoSaldoDoCaixaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58))
                    .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroInicialFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroEntradaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDinheiroSaidaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel60)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel65)))
                .addContainerGap())
        );
        painelSaldoDetalhadoLayout.setVerticalGroup(
            painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSaldoDetalhadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(campoSaldoDoCaixaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jXTitledSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXTitledSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSaldoDetalhadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(campoDinheiroInicialFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(campoDinheiroSaidaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(campoDinheiroEntradaFluxo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSaldoDetalhado.setBounds(130, 120, 540, 240);
        jDesktopPane1.add(painelSaldoDetalhado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painelFluxoCaixa.setClosable(true);
        painelFluxoCaixa.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        painelFluxoCaixa.setIconifiable(true);
        painelFluxoCaixa.setTitle("Fluxo do Caixa");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);

        botaoSairFluxoCaixa.setText("Sair");
        botaoSairFluxoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairFluxoCaixaActionPerformed(evt);
            }
        });

        botaoGeraRelatorioFluxo.setText("Gerar Relatório");

        javax.swing.GroupLayout painelFluxoCaixaLayout = new javax.swing.GroupLayout(painelFluxoCaixa.getContentPane());
        painelFluxoCaixa.getContentPane().setLayout(painelFluxoCaixaLayout);
        painelFluxoCaixaLayout.setHorizontalGroup(
            painelFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFluxoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                    .addGroup(painelFluxoCaixaLayout.createSequentialGroup()
                        .addComponent(botaoGeraRelatorioFluxo)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairFluxoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelFluxoCaixaLayout.setVerticalGroup(
            painelFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFluxoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSairFluxoCaixa)
                    .addComponent(botaoGeraRelatorioFluxo))
                .addContainerGap())
        );

        painelFluxoCaixa.setBounds(40, 70, 720, 380);
        jDesktopPane1.add(painelFluxoCaixa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jXPanel1.setAlpha(0.5F);

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/logoAcademiaPequeno.png"))); // NOI18N

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jXPanel1.setBounds(200, 170, 410, 160);
        jDesktopPane1.add(jXPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botaoContasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContasReceberActionPerformed
        zerarCampo();
        painelContasReceber.setVisible(true);
    }//GEN-LAST:event_botaoContasReceberActionPerformed

    private void botaoContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContasPagarActionPerformed
        painelContasPagar.setVisible(true);
    }//GEN-LAST:event_botaoContasPagarActionPerformed

    private void botaoAbreCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbreCaixaActionPerformed
        painelAbreCaixa.setVisible(true);
    }//GEN-LAST:event_botaoAbreCaixaActionPerformed

    private void botaoSairFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairFinanceiroActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botaoSairFinanceiroActionPerformed

    private void botaoMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMovimentacaoActionPerformed
        labelAbertura.setText("");
        labelDataHora.setText("");
        painelMovimentacaoDoCaixa.setVisible(true);

    }//GEN-LAST:event_botaoMovimentacaoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            //Runtime.getRuntime().exec("calc"); //assim
            Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe"); //e assim
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir a Calculadora");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        quadroCalendario.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void botaoPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisa1ActionPerformed
        zerarCampo();
        painelPesquisar.setVisible(true);
    }//GEN-LAST:event_botaoPesquisa1ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        painelContasReceber.setVisible(false);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReceberActionPerformed
        String mes = null;
        if (tabelaContasReceber.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um mensalidade a ser paga.");
        } else {

            if (tabelaContasReceber.getValueAt(tabelaContasReceber.getSelectedRow(), 3) == "PAGO") {
                JOptionPane.showMessageDialog(null, "Essa mensalidade já está PAGA");
            } else {
                painelConfirmaPagamento.setVisible(true);
                campoAlunoConfirma.setText(campoNome.getText());
                campoDescricaoConfirma.setText((String) tabelaContasReceber.getValueAt(tabelaContasReceber.getSelectedRow(), 0));
                String vencimento = (String) tabelaContasReceber.getValueAt(tabelaContasReceber.getSelectedRow(), 1);
                if (vencimento.substring(3, 5).equals("01")) {
                    mes = "Janeiro";
                } else if (vencimento.substring(3, 5).equals("02")) {
                    mes = "Fevereiro";
                } else if (vencimento.substring(3, 5).equals("03")) {
                    mes = "Março";
                } else if (vencimento.substring(3, 5).equals("04")) {
                    mes = "Abril";
                } else if (vencimento.substring(3, 5).equals("05")) {
                    mes = "Maio";
                } else if (vencimento.substring(3, 5).equals("06")) {
                    mes = "Junho";
                } else if (vencimento.substring(3, 5).equals("07")) {
                    mes = "Julho";
                } else if (vencimento.substring(3, 5).equals("08")) {
                    mes = "Agosto";
                } else if (vencimento.substring(3, 5).equals("09")) {
                    mes = "Setembro";
                } else if (vencimento.substring(3, 5).equals("10")) {
                    mes = "Outubro";
                } else if (vencimento.substring(3, 5).equals("11")) {
                    mes = "Novembro";
                } else if (vencimento.substring(3, 5).equals("12")) {
                    mes = "Dezembro";
                }
                campoMesConfirma.setText(mes);
                campoVencimentoConfirma.setText(vencimento);
                campoValorConfirma.setText(Double.toString((Double) tabelaContasReceber.getValueAt(tabelaContasReceber.getSelectedRow(), 2)));
                campoPagamentoConfirma.setText(Utilitario.dataDoSistema());
            }
        }
    }//GEN-LAST:event_botaoReceberActionPerformed

    private void campoNomePesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomePesquisarKeyPressed
        if (evt.getKeyCode() == 10) {
            botaoPesquisar.doClick();
        }
    }//GEN-LAST:event_campoNomePesquisarKeyPressed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        painelContasPagar.setVisible(false);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        painelConfirmaPagamento.setVisible(false);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSairAberturaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairAberturaCaixaActionPerformed
        painelAbreCaixa.setVisible(false);
    }//GEN-LAST:event_botaoSairAberturaCaixaActionPerformed

    private void botaoAbreCaixaAberturaDoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbreCaixaAberturaDoCaixaActionPerformed
        dialogoAbertura.setVisible(true);
    }//GEN-LAST:event_botaoAbreCaixaAberturaDoCaixaActionPerformed

    private void botaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoActionPerformed
        dialogoAbertura.setVisible(false);
    }//GEN-LAST:event_botaoNaoActionPerformed

    private void botaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimActionPerformed
        dialogoAbertura.setVisible(false);
        JOptionPane.showMessageDialog(null, "Caixa aberto com Sucesso", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        painelAbreCaixa.setVisible(false);
        utilitario.le_Data();
        utilitario.le_Hora();
        labelDataHora.setText(utilitario.dia + " de " + utilitario.mes + " de " + utilitario.ano + "   " + utilitario.hora);
        painelMovimentacaoDoCaixa.setVisible(true);
    }//GEN-LAST:event_botaoSimActionPerformed

    private void botaoSairMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairMovimentacaoActionPerformed
        painelMovimentacaoDoCaixa.setVisible(false);
    }//GEN-LAST:event_botaoSairMovimentacaoActionPerformed

    private void botaoFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFechamentoActionPerformed
        JOptionPane.showMessageDialog(null, "Caixa Fechado com Sucesso !!!");
        painelFecharCaixa.setVisible(false);
    }//GEN-LAST:event_botaoFechamentoActionPerformed

    private void botaoFinalizaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizaCaixaActionPerformed
        painelFecharCaixa.setVisible(true);
    }//GEN-LAST:event_botaoFinalizaCaixaActionPerformed

    public void zerarCampo() {
        campoMatricula.setText("");
        campoNomePesquisar.setText("");
        campoNome.setText("");
        campoTelefone.setText("");
        campoDebito.setText("");
        campoEndereco.setText("");
        campoCelular.setText("");
        campoNascimento.setText("");
        labelFoto.setIcon(new ImageIcon(getClass().getResource("/br/sistcomp/sar/imagens/semFoto.png")));
        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisar.getModel();
        modelo.setNumRows(0);
        DefaultTableModel tabela = (DefaultTableModel) tabelaContasReceber.getModel();
        tabela.setNumRows(0);
    }

    private void campoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMatriculaActionPerformed
        double valor = 0, debito = 0;
        String status;
        int matricula = Integer.parseInt(campoMatricula.getText());
        Aluno aluno = fachada.pesquisarAluno(matricula);
        if (aluno != null) {
            tabelaContasReceber.getColumnModel().getColumn(0);
            tabelaContasReceber.getColumnModel().getColumn(1);
            tabelaContasReceber.getColumnModel().getColumn(2);
            tabelaContasReceber.getColumnModel().getColumn(3);
            DefaultTableModel modelo = (DefaultTableModel) tabelaContasReceber.getModel();
            modelo.setNumRows(0);

            Vector<Mensalidade> mensalidades = fachada.pesquisaTodosAsMensalidadesDoAluno(matricula);
            if (mensalidades != null) {
                for (int i = 0; i < mensalidades.size(); i++) {
                    String parcela = (i + 1) + "ª    Mensalidade";
                    String vencimento = mensalidades.get(i).getVencimento();
                    valor = mensalidades.get(i).getValor();
                    String Pagamento = mensalidades.get(i).getPagamento();
                    if (Pagamento != null) {
                        status = "PAGO";
                    } else {
                        status = "a pagar";
                        debito = debito + valor;
                    }

                    modelo.addRow(new Object[]{parcela, vencimento, valor, status});

                }


                campoNome.setEnabled(true);
                campoTelefone.setEnabled(true);
                campoDebito.setEnabled(true);
                campoEndereco.setEnabled(true);
                campoCelular.setEnabled(true);
                campoNascimento.setEnabled(true);

                String nome = aluno.getNome();
                String[] nomeESobreNome = nome.split(" ");
                campoNome.setText(nomeESobreNome[0] + " " + nomeESobreNome[1]);
                campoTelefone.setText(aluno.getTelefone());
                campoDebito.setText(Double.toString(debito));
                campoEndereco.setText(aluno.getEndereco());
                campoCelular.setText(aluno.getCelular());
                campoNascimento.setText(aluno.getNascimento());

                image = fachada.pesquisarFoto(matricula);
                i = image.getImage();
                labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));
                painelPesquisar.setVisible(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe aluno com essa matricula");
            campoMatricula.setText("");
        }
    }//GEN-LAST:event_campoMatriculaActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        tabelaPesquisar.getColumnModel().getColumn(0);
        tabelaPesquisar.getColumnModel().getColumn(1);
        tabelaPesquisar.getColumnModel().getColumn(2);
        tabelaPesquisar.getColumnModel().getColumn(3);
        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisar.getModel();
        modelo.setNumRows(0);

        Vector<Aluno> alunos = fachada.pesquisarAlunoPorNome(campoNomePesquisar.getText());
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                int matricula = aluno.getIdPessoa();
                String nome = aluno.getNome();
                String[] novoNome = nome.split(" ");
                String telefone = aluno.getTelefone();
                String celular = aluno.getCelular();

                modelo.addRow(new Object[]{matricula, novoNome[0] + " " + novoNome[1], telefone, celular});

            }
        } else {
            JOptionPane.showMessageDialog(null, "Nao existe aluno cadastrado com esse nome!");
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        double valor = 0, debito = 0;
        String status;
        int matricula = (Integer) tabelaPesquisar.getValueAt(tabelaPesquisar.getSelectedRow(), 0);
        tabelaContasReceber.getColumnModel().getColumn(0);
        tabelaContasReceber.getColumnModel().getColumn(1);
        tabelaContasReceber.getColumnModel().getColumn(2);
        tabelaContasReceber.getColumnModel().getColumn(3);
        DefaultTableModel modelo = (DefaultTableModel) tabelaContasReceber.getModel();
        modelo.setNumRows(0);
        campoMatricula.setText(Integer.toString(matricula));

        Vector<Mensalidade> mensalidades = fachada.pesquisaTodosAsMensalidadesDoAluno(matricula);
        if (mensalidades != null) {
            for (int i = 0; i < mensalidades.size(); i++) {
                //String primeiroNome[] = pessoa.getNome().split(" ");
                String parcela = (i + 1) + "ª  Mensalidade";
                String vencimento = mensalidades.get(i).getVencimento();
                valor = mensalidades.get(i).getValor();
                String Pagamento = mensalidades.get(i).getPagamento();
                if (Pagamento != null) {
                    status = "PAGO";
                } else {
                    status = "a pagar";
                    debito = debito + valor;
                }

                modelo.addRow(new Object[]{parcela, vencimento, valor, status});

            }

            Aluno aluno = fachada.pesquisarAluno(matricula);
            campoNome.setEnabled(true);
            campoTelefone.setEnabled(true);
            campoDebito.setEnabled(true);
            campoEndereco.setEnabled(true);
            campoCelular.setEnabled(true);
            campoNascimento.setEnabled(true);

            String nome = aluno.getNome();
            String[] nomeESobreNome = nome.split(" ");
            campoNome.setText(nomeESobreNome[0] + " " + nomeESobreNome[1]);
            campoTelefone.setText(aluno.getTelefone());
            campoDebito.setText(Double.toString(debito));
            campoEndereco.setText(aluno.getEndereco());
            campoCelular.setText(aluno.getCelular());
            campoNascimento.setText(aluno.getNascimento());

            image = fachada.pesquisarFoto(matricula);
            i = image.getImage();
            labelFoto.setIcon(new ImageIcon(i.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), i.SCALE_DEFAULT)));


        }
        painelPesquisar.setVisible(false);
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void tabelaPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisarMousePressed
        if (evt.getClickCount() == 2) {
            botaoConfirmar.doClick();
        }
    }//GEN-LAST:event_tabelaPesquisarMousePressed

    private void tabelaContasReceberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContasReceberMousePressed
        if (evt.getClickCount() == 2) {
            botaoReceber.doClick();
        }
    }//GEN-LAST:event_tabelaContasReceberMousePressed


    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
        double valor = 0, debito = 0;
        String status;
        DefaultTableModel modelo = (DefaultTableModel) tabelaContasReceber.getModel();
        modelo.setNumRows(0);
        //fachada.alterarMensalidadeAposPagamento(tabelaContasReceber.getSelectedRow()+1);
        Vector<Mensalidade> mensalidades = fachada.pesquisaTodosAsMensalidadesDoAluno(Integer.parseInt(campoMatricula.getText()));
        if (mensalidades != null) {
            for (int i = 0; i < mensalidades.size(); i++) {
                //String primeiroNome[] = pessoa.getNome().split(" ");
                String parcela = (i + 1) + "ª  Mensalidade";
                String vencimento = mensalidades.get(i).getVencimento();
                valor = mensalidades.get(i).getValor();
                String Pagamento = mensalidades.get(i).getPagamento();
                if (Pagamento != null) {
                    status = "PAGO";
                } else {
                    status = "a pagar";
                    debito = debito + valor;
                }

                modelo.addRow(new Object[]{parcela, vencimento, valor, status});

            }
        }
        painelConfirmaPagamento.setVisible(false);
    }//GEN-LAST:event_botaoConfirmaActionPerformed

    private void botaoSairRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairRetiradaActionPerformed
        painelRetiradaCaixa.setVisible(false);
    }//GEN-LAST:event_botaoSairRetiradaActionPerformed

    private void botaoConfirmarRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarRetiradaActionPerformed
        JOptionPane.showMessageDialog(null, "Retirada efetuada com Sucesso !!!", "Retirada do Caixa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoConfirmarRetiradaActionPerformed

    private void linkRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkRetiradaActionPerformed
        painelRetiradaCaixa.setVisible(true);
    }//GEN-LAST:event_linkRetiradaActionPerformed

    private void linkSuprimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkSuprimentosActionPerformed
        painelSuprimentoCaixa.setVisible(true);
    }//GEN-LAST:event_linkSuprimentosActionPerformed

    private void botaoConfirmarSuprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarSuprimentoActionPerformed
        JOptionPane.showMessageDialog(null, "Suprimento efetuado com Sucesso !!!", "Suprimento de Caixa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoConfirmarSuprimentoActionPerformed

    private void botaoSairSuprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairSuprimentoActionPerformed
        painelSuprimentoCaixa.setVisible(false);
    }//GEN-LAST:event_botaoSairSuprimentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        painelAnaliseFinanceira.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void linkFluxoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkFluxoActionPerformed
        painelFluxoCaixa.setVisible(true);
    }//GEN-LAST:event_linkFluxoActionPerformed

    private void linkSaldoDetalhadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkSaldoDetalhadoActionPerformed
        painelSaldoDetalhado.setVisible(true);
    }//GEN-LAST:event_linkSaldoDetalhadoActionPerformed

    private void botaoSairFluxoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairFluxoCaixaActionPerformed
        painelFluxoCaixa.setVisible(false);
    }//GEN-LAST:event_botaoSairFluxoCaixaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbreCaixa;
    private javax.swing.JButton botaoAbreCaixaAberturaDoCaixa;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoConfirmarRetirada;
    private javax.swing.JButton botaoConfirmarSuprimento;
    private javax.swing.JButton botaoContasPagar;
    private javax.swing.JButton botaoContasReceber;
    private javax.swing.JButton botaoFechamento;
    private javax.swing.JButton botaoFinalizaCaixa;
    private javax.swing.JButton botaoGeraRelatorioFluxo;
    private javax.swing.JButton botaoLancar;
    private javax.swing.JButton botaoMovimentacao;
    private javax.swing.JButton botaoNao;
    private javax.swing.JButton botaoPagar;
    private javax.swing.JButton botaoPesquisa1;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoReceber;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSairAberturaCaixa;
    private javax.swing.JButton botaoSairFinanceiro;
    private javax.swing.JButton botaoSairFluxoCaixa;
    private javax.swing.JButton botaoSairMovimentacao;
    private javax.swing.JButton botaoSairRetirada;
    private javax.swing.JButton botaoSairSuprimento;
    private javax.swing.JButton botaoSim;
    private javax.swing.JButton botaoVoltar;
    private org.jdesktop.swingx.JXMonthView calendario;
    private javax.swing.JTextField campoAlunoConfirma;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JTextField campoDebito;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDescricaoConfirma;
    private javax.swing.JTextField campoDinheiroEntrada;
    private javax.swing.JTextField campoDinheiroEntradaFluxo;
    private javax.swing.JTextField campoDinheiroInicial;
    private javax.swing.JTextField campoDinheiroInicialFluxo;
    private javax.swing.JTextField campoDinheiroSaida;
    private javax.swing.JTextField campoDinheiroSaidaFluxo;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoEntrada;
    private javax.swing.JTextField campoHistoricoRetirada;
    private javax.swing.JTextField campoHistoricoSuprimento;
    private javax.swing.JTextField campoInicial;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoMesConfirma;
    private javax.swing.JFormattedTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomePesquisar;
    private javax.swing.JTextField campoObservacaoRecebe;
    private javax.swing.JFormattedTextField campoPagamentoConfirma;
    private javax.swing.JTextField campoSaida;
    private javax.swing.JTextField campoSaldo;
    private javax.swing.JTextField campoSaldoDoCaixa;
    private javax.swing.JTextField campoSaldoDoCaixaFluxo;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JTextField campoValor;
    private javax.swing.JTextField campoValorConfirma;
    private javax.swing.JTextField campoValorInicialDoCaixa;
    private javax.swing.JTextField campoValorRetirada;
    private javax.swing.JTextField campoValorSuprimento;
    private javax.swing.JFormattedTextField campoVencimento;
    private javax.swing.JFormattedTextField campoVencimentoConfirma;
    private javax.swing.JInternalFrame dialogoAbertura;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane2;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer2;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator2;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator3;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator4;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator5;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator6;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator7;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator8;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator9;
    private javax.swing.JLabel labelAbertura;
    private javax.swing.JLabel labelDataHora;
    private javax.swing.JLabel labelDespezas;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNomeDoFuncionario;
    private javax.swing.JLabel labelReceitas;
    private javax.swing.JLabel labelSaldo;
    private org.jdesktop.swingx.JXHyperlink linkData;
    private org.jdesktop.swingx.JXHyperlink linkDetalhes;
    private org.jdesktop.swingx.JXHyperlink linkExcluir;
    private org.jdesktop.swingx.JXHyperlink linkFluxo;
    private org.jdesktop.swingx.JXHyperlink linkRelatorio;
    private org.jdesktop.swingx.JXHyperlink linkRetirada;
    private org.jdesktop.swingx.JXHyperlink linkSaldoDetalhado;
    private org.jdesktop.swingx.JXHyperlink linkSuprimentos;
    private javax.swing.JInternalFrame painelAbreCaixa;
    private javax.swing.JInternalFrame painelAnaliseFinanceira;
    private javax.swing.JInternalFrame painelConfirmaPagamento;
    private javax.swing.JInternalFrame painelContasPagar;
    private javax.swing.JInternalFrame painelContasReceber;
    private javax.swing.JInternalFrame painelFecharCaixa;
    private javax.swing.JInternalFrame painelFluxoCaixa;
    private javax.swing.JInternalFrame painelMovimentacaoDoCaixa;
    private javax.swing.JInternalFrame painelPesquisar;
    private javax.swing.JInternalFrame painelRetiradaCaixa;
    private javax.swing.JInternalFrame painelSaldoDetalhado;
    private javax.swing.JInternalFrame painelSuprimentoCaixa;
    private javax.swing.JInternalFrame quadroCalendario;
    private javax.swing.JComboBox selecaoFiltra;
    private javax.swing.JComboBox selecaoFormaDeAbrir;
    private javax.swing.JComboBox selecaoFormaRetirada;
    private javax.swing.JComboBox selecaoFormaSuprimento;
    private javax.swing.JComboBox selecaoFuncionario;
    private javax.swing.JComboBox selecaoMes;
    private javax.swing.JComboBox selecaoMostrar;
    private javax.swing.JTable tabelaAnaliseFinanceira;
    private javax.swing.JTable tabelaContasPagar;
    public static javax.swing.JTable tabelaContasReceber;
    private javax.swing.JTable tabelaMovimentacao;
    private javax.swing.JTable tabelaPesquisar;
    // End of variables declaration//GEN-END:variables
}
