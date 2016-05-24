package simuladorderedes.visao;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
/**
 *
 * @author Filipe
 */
public class TelaPrincipal extends javax.swing.JFrame {

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
            botao.setIcon(new javax.swing.ImageIcon("src/imagens/roteador.png"));
            roteador[i].add(botao);
            
            desktop[i] = new JInternalFrame("Desktop",false ,false, false, false);
            desktop[i].setBounds(120 *(i+1), 20*(i+1), 100, 100);
            desktop[i].add(new JButton("Config"));
            JButton desktopBotao = new JButton();
            desktopBotao.setIcon(new javax.swing.ImageIcon("src/imagens/desktop.png"));
            desktop[i].add(desktopBotao);
            
            hub[i] = new JInternalFrame("Hub",false ,false, false, false);
            hub[i].setBounds(10 *(i+1), 110*(i+1), 100, 100);
            JButton hubBotao = new JButton();
            hubBotao.setIcon(new javax.swing.ImageIcon("src/imagens/hub.png"));
            hub[i].add(hubBotao);
            
            eswitch[i] = new JInternalFrame("Switch",false ,false, false, false);
            eswitch[i].setBounds(270 *(i+1), 70*(i+1), 100, 100);
            JButton switchBotao = new JButton();
            switchBotao.setIcon(new javax.swing.ImageIcon("src/imagens/switch.png"));
            eswitch[i].add(switchBotao);
            
            
            servidor[i] = new JInternalFrame("Servidor",false ,false, false, false);
            servidor[i].setBounds(180 *(i+1), 80*(i+1), 100, 100);
            servidor[i].add(new JButton("Config"));
            JButton servidorBotao = new JButton();
            servidorBotao.setIcon(new javax.swing.ImageIcon("src/imagens/servidor.png"));
            servidor[i].add(servidorBotao);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfigIpPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        equipamentosInternalFrame = new javax.swing.JInternalFrame();
        botaoDesktop = new javax.swing.JButton();
        botaoRoteador = new javax.swing.JButton();
        botaoSwitch = new javax.swing.JButton();
        botaoHub = new javax.swing.JButton();
        botaoServidor = new javax.swing.JButton();
        LogInternalFrame = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        MenuPrincipal = new javax.swing.JMenuBar();
        abaArquivo = new javax.swing.JMenu();
        subMenuArquivo = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        abaEditar = new javax.swing.JMenu();
        abaopcoes = new javax.swing.JMenu();
        abaPlay = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout equipamentosInternalFrameLayout = new javax.swing.GroupLayout(equipamentosInternalFrame.getContentPane());
        equipamentosInternalFrame.getContentPane().setLayout(equipamentosInternalFrameLayout);
        equipamentosInternalFrameLayout.setHorizontalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        equipamentosInternalFrameLayout.setVerticalGroup(
            equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentosInternalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(equipamentosInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoHub, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LogInternalFrame.setBorder(null);
        LogInternalFrame.setVisible(true);

        TextArea1.setColumns(20);
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        abaArquivo.setText("Arquivos");

        subMenuArquivo.setText("Novo");
        subMenuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuArquivoActionPerformed(evt);
            }
        });
        abaArquivo.add(subMenuArquivo);

        jMenuItem4.setText("Abrir");
        abaArquivo.add(jMenuItem4);

        jMenuItem2.setText("Salvar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        abaArquivo.add(jMenuItem2);

        MenuPrincipal.add(abaArquivo);

        abaEditar.setText("Editar");
        MenuPrincipal.add(abaEditar);

        abaopcoes.setText("Opções");
        MenuPrincipal.add(abaopcoes);

        abaPlay.setText("Play");

        jMenuItem1.setText("Play");
        abaPlay.add(jMenuItem1);

        jMenuItem3.setText("Passo-a-Passo");
        abaPlay.add(jMenuItem3);

        MenuPrincipal.add(abaPlay);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDesktopPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equipamentosInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LogInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogInternalFrame)
                    .addComponent(equipamentosInternalFrame))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesktopActionPerformed
       quantidadeDesktop++;
       desktop[quantidadeDesktop].setVisible(true);
       jDesktopPane3.add(desktop[quantidadeDesktop]);
    }//GEN-LAST:event_botaoDesktopActionPerformed

    private void botaoRoteadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRoteadorActionPerformed
       quantidadeRoteador++;
       roteador[quantidadeRoteador].setVisible(true);
       jDesktopPane3.add(roteador[quantidadeRoteador]);
       
    }//GEN-LAST:event_botaoRoteadorActionPerformed

    private void botaoSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSwitchActionPerformed
       quantidadeSwitch++;
       eswitch[quantidadeSwitch].setVisible(true);
       jDesktopPane3.add(eswitch[quantidadeSwitch]);
    }//GEN-LAST:event_botaoSwitchActionPerformed

    private void botaoHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHubActionPerformed
        quantidadeHub++;
        hub[quantidadeHub].setVisible(true);
        jDesktopPane3.add(hub[quantidadeHub]);
    }//GEN-LAST:event_botaoHubActionPerformed

    private void botaoServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoServidorActionPerformed
        quantidadeServidor++;
        servidor[quantidadeServidor].setVisible(true);
        jDesktopPane3.add(servidor[quantidadeServidor]);
    }//GEN-LAST:event_botaoServidorActionPerformed

    private void subMenuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuArquivoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ConfigIpPopupMenu2;
    private javax.swing.JInternalFrame LogInternalFrame;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JMenu abaArquivo;
    private javax.swing.JMenu abaEditar;
    private javax.swing.JMenu abaPlay;
    private javax.swing.JMenu abaopcoes;
    private javax.swing.JButton botaoDesktop;
    private javax.swing.JButton botaoHub;
    private javax.swing.JButton botaoRoteador;
    private javax.swing.JButton botaoServidor;
    private javax.swing.JButton botaoSwitch;
    private javax.swing.JInternalFrame equipamentosInternalFrame;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem subMenuArquivo;
    // End of variables declaration//GEN-END:variables
}
