package simuladorderedes.visao;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author Filipe
 */
public class TelaPrincipal extends JFrame {

    JInternalFrame []roteador = new JInternalFrame[10];
    JInternalFrame []desktop = new JInternalFrame[10];
    JInternalFrame []hub = new JInternalFrame[10];
    JInternalFrame []eswitch = new JInternalFrame[10];
    JInternalFrame []servidor = new JInternalFrame[10];
    
    
    
    int quantidadeDesktop;
    int quantidadeServidor;
    int quantidadeSwitch;
    int quantidadeHub;
    int quantidadeRoteador;
    
    public TelaPrincipal() {
        
        intanciaEquipamentos();
        
        initComponents();
    }

    private void intanciaEquipamentos() {
        for(int i = 0; i < roteador.length; i++){
           
            roteador[i] = new JInternalFrame("Roteador",false ,false, false, false);
            roteador[i].setBounds(50 *(i+1), 50*(i+1), 100, 100);
            JButton botao = new JButton();
            botao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoRoteador()));
            roteador[i].add(botao);
            
            desktop[i] = new JInternalFrame("Desktop",false ,false, false, false);
            desktop[i].setBounds(120 *(i+1), 20*(i+1), 100, 100);
            desktop[i].add(new JButton("Config"));
            JButton desktopBotao = new JButton();
            desktopBotao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getAminhoDesktop()));
            desktop[i].add(desktopBotao);
            
            desktopBotao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                        ConfigDesktop configDesktop = new ConfigDesktop();
                        configDesktop.setVisible(true);
                }
            }); 
            
            hub[i] = new JInternalFrame("Hub",false ,false, false, false);
            hub[i].setBounds(10 *(i+1), 110*(i+1), 100, 100);
            JButton hubBotao = new JButton();
            hubBotao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoHub()));
            hub[i].add(hubBotao);
            
            eswitch[i] = new JInternalFrame("Switch",false ,false, false, false);
            eswitch[i].setBounds(270 *(i+1), 70*(i+1), 100, 100);
            JButton switchBotao = new JButton();
            switchBotao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getAminhoSwitch()));
            eswitch[i].add(switchBotao);
            
            
            servidor[i] = new JInternalFrame("Servidor",false ,false, false, false);
            servidor[i].setBounds(180 *(i+1), 80*(i+1), 100, 100);
            servidor[i].add(new JButton("Config"));
            JButton servidorBotao = new JButton();
            servidorBotao.setIcon(new javax.swing.ImageIcon(CaminhoImagens.getCaminhoServidor()));
            servidor[i].add(servidorBotao);
            
            servidorBotao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                        ConfigServidor configServidor = new ConfigServidor();
                        configServidor.setVisible(true);
                }
            }); 
        }
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
        botaoServidor = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        LogInternalFrame = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jDesktopPane = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuNovo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuSalvar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        abaPlay = new javax.swing.JMenu();
        jMenuConectar = new javax.swing.JMenuItem();
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

        botaoServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servidor.png"))); // NOI18N
        botaoServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoServidorActionPerformed(evt);
            }
        });

        jButtonConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conexao.png"))); // NOI18N
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout equipamentosInternalFrameLayout = new javax.swing.GroupLayout(equipamentosInternalFrame.getContentPane());
        equipamentosInternalFrame.getContentPane().setLayout(equipamentosInternalFrameLayout);
        equipamentosInternalFrameLayout.setHorizontalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        equipamentosInternalFrameLayout.setVerticalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        LogInternalFrame.setBorder(null);
        LogInternalFrame.setTitle("Logs");
        LogInternalFrame.setVisible(true);

        TextArea1.setBackground(new java.awt.Color(0, 0, 0));
        TextArea1.setColumns(20);
        TextArea1.setForeground(new java.awt.Color(255, 255, 255));
        TextArea1.setRows(5);
        TextArea1.setToolTipText("");
        jScrollPane1.setViewportView(TextArea1);

        javax.swing.GroupLayout LogInternalFrameLayout = new javax.swing.GroupLayout(LogInternalFrame.getContentPane());
        LogInternalFrame.getContentPane().setLayout(LogInternalFrameLayout);
        LogInternalFrameLayout.setHorizontalGroup(
            LogInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
        LogInternalFrameLayout.setVerticalGroup(
            LogInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInternalFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jMenuArquivo.setText("Arquivo");

        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/new.png"))); // NOI18N
        jMenuNovo.setText("Novo");
        jMenuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuNovo);

        jMenuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/open.png"))); // NOI18N
        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuAbrir);

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/save.png"))); // NOI18N
        jMenuSalvar.setText("Salvar");
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuSalvar);
        jMenuArquivo.add(jSeparator1);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/exit.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuSair);

        MenuPrincipal.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        MenuPrincipal.add(jMenuEditar);

        abaPlay.setText("Executar");

        jMenuConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/link.png"))); // NOI18N
        jMenuConectar.setText("Conectar dispositivos");
        jMenuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConectarActionPerformed(evt);
            }
        });
        abaPlay.add(jMenuConectar);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktopPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equipamentosInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogInternalFrame)
                    .addComponent(equipamentosInternalFrame))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
  
    private void botaoDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesktopActionPerformed
        quantidadeDesktop++;
        desktop[quantidadeDesktop].setVisible(true);
        jDesktopPane.add(desktop[quantidadeDesktop]);
    }//GEN-LAST:event_botaoDesktopActionPerformed

    private void botaoRoteadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRoteadorActionPerformed
        quantidadeRoteador++;
        roteador[quantidadeRoteador].setVisible(true);
        jDesktopPane.add(roteador[quantidadeRoteador]);

    }//GEN-LAST:event_botaoRoteadorActionPerformed

    private void botaoSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSwitchActionPerformed
        quantidadeSwitch++;
        eswitch[quantidadeSwitch].setVisible(true);
        jDesktopPane.add(eswitch[quantidadeSwitch]);
    }//GEN-LAST:event_botaoSwitchActionPerformed

    private void botaoHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHubActionPerformed
        quantidadeHub++;
        hub[quantidadeHub].setVisible(true);
        jDesktopPane.add(hub[quantidadeHub]);
    }//GEN-LAST:event_botaoHubActionPerformed

    private void botaoServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoServidorActionPerformed
        quantidadeServidor++;
        servidor[quantidadeServidor].setVisible(true);
        jDesktopPane.add(servidor[quantidadeServidor]);
    }//GEN-LAST:event_botaoServidorActionPerformed

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

    private void jMenuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConectarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuConectarActionPerformed

    private void jMenuEnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEnviarMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEnviarMensagemActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
    }//GEN-LAST:event_jButtonConectarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ConfigIpPopupMenu2;
    private javax.swing.JInternalFrame LogInternalFrame;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JMenu abaPlay;
    private javax.swing.JButton botaoDesktop;
    private javax.swing.JButton botaoHub;
    private javax.swing.JButton botaoRoteador;
    private javax.swing.JButton botaoServidor;
    private javax.swing.JButton botaoSwitch;
    private javax.swing.JInternalFrame equipamentosInternalFrame;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuItem jMenuConectar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuEnviarMensagem;
    private javax.swing.JMenuItem jMenuNovo;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenuItem jMenuPreferencias;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuSalvar;
    private javax.swing.JMenuItem jMenuSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
