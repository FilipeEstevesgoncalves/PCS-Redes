package simuladorderedes.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.*;
import java.util.ArrayList;
import simuladorderedes.controle.EquipamentosControle;
import simuladorderedes.controle.LogControle;
import simuladorderedes.modelo.equipamento.DesktopModelo;
import simuladorderedes.modelo.equipamento.HubModelo;
import simuladorderedes.modelo.equipamento.RoteadorModelo;
import simuladorderedes.modelo.equipamento.SwitchModelo;

/**
 *
 * @author Filipe
 */
public class TelaPrincipal extends JFrame {

    
    private int numeroDeEquipamentos = 0;
    private ArrayList<JInternalFrame> roteadoresInternalFrame;
    private ArrayList<JInternalFrame> desktopsInternalFrame;
    private ArrayList<JInternalFrame> hubsInternalFrame;
    private ArrayList<JInternalFrame> switchsInternalFrame;
    private EquipamentosControle controle = new EquipamentosControle();
    
    public TelaPrincipal() {
        
        intanciaEquipamentos();
        initComponents();
        textAreaLog.setEnabled(false);
    }
    public static void escreveNoLog(String str){
        textAreaLog.append(str);
    }

    private void intanciaEquipamentos() {
        roteadoresInternalFrame = new ArrayList<>();
        hubsInternalFrame = new ArrayList<>();
        desktopsInternalFrame = new ArrayList<>();
        switchsInternalFrame = new ArrayList<>();
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfigIpPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        equipamentosInternalFrame = new javax.swing.JInternalFrame();
        botaoDesktop = new javax.swing.JButton();
        botaoRoteador = new javax.swing.JButton();
        botaoSwitch = new javax.swing.JButton();
        botaoHub = new javax.swing.JButton();
        LogInternalFrame = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        jDesktopPane = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMenuCarregar = new javax.swing.JMenu();
        jMenuNovo = new javax.swing.JMenuItem();
        jMenuNovo1 = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuSalvar = new javax.swing.JMenuItem();
        jMenuSalvar1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        abaPlay = new javax.swing.JMenu();
        jMenuEnviarMensagem = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuPreferencias = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");
        ConfigIpPopupMenu2.add(jMenu1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Rede");

        equipamentosInternalFrame.setBackground(new java.awt.Color(204, 204, 204));
        equipamentosInternalFrame.setTitle("Dispositivos");
        equipamentosInternalFrame.setToolTipText("");
        equipamentosInternalFrame.setVisible(true);

        botaoDesktop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desktop.png"))); // NOI18N
        botaoDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesktopActionPerformed(evt);
            }
        });

        botaoRoteador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/roteador.png"))); // NOI18N
        botaoRoteador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRoteadorActionPerformed(evt);
            }
        });

        botaoSwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/switch.png"))); // NOI18N
        botaoSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSwitchActionPerformed(evt);
            }
        });

        botaoHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hub.png"))); // NOI18N
        botaoHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout equipamentosInternalFrameLayout = new javax.swing.GroupLayout(equipamentosInternalFrame.getContentPane());
        equipamentosInternalFrame.getContentPane().setLayout(equipamentosInternalFrameLayout);
        equipamentosInternalFrameLayout.setHorizontalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        equipamentosInternalFrameLayout.setVerticalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LogInternalFrame.setBorder(null);
        LogInternalFrame.setTitle("Logs");
        LogInternalFrame.setVisible(true);

        textAreaLog.setBackground(new java.awt.Color(0, 0, 0));
        textAreaLog.setColumns(20);
        textAreaLog.setForeground(new java.awt.Color(255, 255, 255));
        textAreaLog.setRows(5);
        textAreaLog.setToolTipText("");
        jScrollPane1.setViewportView(textAreaLog);

        javax.swing.GroupLayout LogInternalFrameLayout = new javax.swing.GroupLayout(LogInternalFrame.getContentPane());
        LogInternalFrame.getContentPane().setLayout(LogInternalFrameLayout);
        LogInternalFrameLayout.setHorizontalGroup(
            LogInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );
        LogInternalFrameLayout.setVerticalGroup(
            LogInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInternalFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jMenuCarregar.setText("Arquivo");

        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/new.png"))); // NOI18N
        jMenuNovo.setText("Novo");
        jMenuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuNovo);

        jMenuNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/new.png"))); // NOI18N
        jMenuNovo1.setText("Carregar Rede Pronta");
        jMenuNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovo1ActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuNovo1);

        jMenuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/open.png"))); // NOI18N
        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuAbrir);

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/save.png"))); // NOI18N
        jMenuSalvar.setText("Salvar");
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuSalvar);

        jMenuSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/save.png"))); // NOI18N
        jMenuSalvar1.setText("Salvar log");
        jMenuSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvar1ActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuSalvar1);
        jMenuCarregar.add(jSeparator1);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/exit.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuCarregar.add(jMenuSair);

        MenuPrincipal.add(jMenuCarregar);

        jMenuEditar.setText("Editar");
        MenuPrincipal.add(jMenuEditar);

        abaPlay.setText("Executar");

        jMenuEnviarMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/email.png"))); // NOI18N
        jMenuEnviarMensagem.setText("Enviar mensagem");
        jMenuEnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEnviarMensagemActionPerformed(evt);
            }
        });
        abaPlay.add(jMenuEnviarMensagem);

        MenuPrincipal.add(abaPlay);

        jMenuOpcoes.setText("Opções");

        jMenuPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/config.png"))); // NOI18N
        jMenuPreferencias.setText("Preferências");
        jMenuOpcoes.add(jMenuPreferencias);

        MenuPrincipal.add(jMenuOpcoes);

        jMenuAjuda.setText("Ajuda");

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/info.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuAjuda.add(jMenuSobre);

        MenuPrincipal.add(jMenuAjuda);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(equipamentosInternalFrame)
                    .addComponent(jDesktopPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogInternalFrame)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(equipamentosInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botaoDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesktopActionPerformed
        DesktopModelo desktop = controle.criarDesktop();
        
        JInternalFrame desktopInternalFrame = new JInternalFrame(desktop.getNome(), false, false, false, false);
        desktopInternalFrame.setBounds(50, 50, 100, 100);
        JButton botao = new JButton();
        botao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoDesktop()));
        desktopInternalFrame.add(botao);
        textAreaLog.append("\nCriando...\n Desktop "+ desktop.getNome() + "\n ip: "+ desktop.getIp());
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ConfigDesktop configDesktop = new ConfigDesktop(desktop, textAreaLog, numeroDeEquipamentos);
                configDesktop.setVisible(true);
            }
        });

        desktopInternalFrame.setVisible(true);
        desktopsInternalFrame.add(desktopInternalFrame);
        int i = desktopsInternalFrame.indexOf(desktopInternalFrame);
        jDesktopPane.add(desktopsInternalFrame.get(i));
    }//GEN-LAST:event_botaoDesktopActionPerformed

    private void botaoRoteadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRoteadorActionPerformed

        RoteadorModelo roteador = controle.criarRoteador();
        JInternalFrame roteadorInternalFrame = new JInternalFrame("Roteador", false, false, false, false);
        roteadorInternalFrame.setBounds(200, 200, 100, 100);
        JButton botao = new JButton();
        botao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoRoteador()));
        roteadorInternalFrame.add(botao);
        textAreaLog.append("\nCriando...\n Roteador "+ roteador.getNome() + "\n ip:"+ roteador.temIp());
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ConfigRoteador configRoteador = new ConfigRoteador(roteador, textAreaLog);
                
                configRoteador.setVisible(true);
            }
        });
        roteadorInternalFrame.setVisible(true);
        roteadorInternalFrame.setTitle(roteador.getNome());
        roteadoresInternalFrame.add(roteadorInternalFrame);
        int i = roteadoresInternalFrame.indexOf(roteadorInternalFrame);
        jDesktopPane.add(roteadoresInternalFrame.get(i));
        
    }//GEN-LAST:event_botaoRoteadorActionPerformed

    private void botaoSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSwitchActionPerformed
        
        SwitchModelo sw = controle.criarSwitch();
        JInternalFrame switchInternalFrame = new JInternalFrame(sw.getNome(), false, false, false, false);
        switchInternalFrame.setBounds(150, 150, 100, 100);
        JButton botao = new JButton();
        botao.setIcon(new ImageIcon(CaminhoImagens.getCaminhoSwitch()));
        switchInternalFrame.add(botao);
        textAreaLog.append("\nCriando...\n Switch "+ sw.getNome());
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TabelaComutacaoVisao tabela = new TabelaComutacaoVisao();
                tabela.setVisible(true);
            }
        });
        
        
        switchInternalFrame.setVisible(true);
        switchsInternalFrame.add(switchInternalFrame);
        int i = switchsInternalFrame.indexOf(switchInternalFrame);
        jDesktopPane.add(switchsInternalFrame.get(i));
    }//GEN-LAST:event_botaoSwitchActionPerformed

    
    private void botaoHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHubActionPerformed
        HubModelo hub = controle.criarHub();
        JInternalFrame hubInternalFrame = new JInternalFrame("Hub", false, false, false, false);
        hubInternalFrame.setBounds(350, 350, 100, 100);
        JButton botao = new JButton();
        botao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoHub()));
        hubInternalFrame.add(botao);
        textAreaLog.append("\nCriando...\n Hub "+ hub.getNome());
        hubInternalFrame.setVisible(true);
        hubsInternalFrame.add(hubInternalFrame);
        int i = hubsInternalFrame.indexOf(hubInternalFrame);
        jDesktopPane.add(hubsInternalFrame.get(i));
    }//GEN-LAST:event_botaoHubActionPerformed

    private void jMenuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuNovoActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSalvarActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDesfazerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuDesfazerActionPerformed

    private void jMenuEnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEnviarMensagemActionPerformed
        EnviarRedeVisao crv = new EnviarRedeVisao();
        crv.setVisible(true);
    }//GEN-LAST:event_jMenuEnviarMensagemActionPerformed

    private void jMenuSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvar1ActionPerformed
        LogControle log = new LogControle();
        log.salvarLog(textAreaLog.getText());
    }//GEN-LAST:event_jMenuSalvar1ActionPerformed

    private void jMenuNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovo1ActionPerformed
        
    }//GEN-LAST:event_jMenuNovo1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ConfigIpPopupMenu2;
    private javax.swing.JInternalFrame LogInternalFrame;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu abaPlay;
    private javax.swing.JButton botaoDesktop;
    private javax.swing.JButton botaoHub;
    private javax.swing.JButton botaoRoteador;
    private javax.swing.JButton botaoSwitch;
    private javax.swing.JInternalFrame equipamentosInternalFrame;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuCarregar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuEnviarMensagem;
    private javax.swing.JMenuItem jMenuNovo;
    private javax.swing.JMenuItem jMenuNovo1;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenuItem jMenuPreferencias;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuSalvar;
    private javax.swing.JMenuItem jMenuSalvar1;
    private javax.swing.JMenuItem jMenuSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private static javax.swing.JTextArea textAreaLog;
    // End of variables declaration//GEN-END:variables
}
