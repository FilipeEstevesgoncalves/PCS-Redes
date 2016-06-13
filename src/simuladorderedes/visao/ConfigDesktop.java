/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.visao;

import javax.accessibility.AccessibleContext;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import simuladorderedes.controle.EquipamentosControle;
import static simuladorderedes.controle.EquipamentosControle.adicionaEquipamento;
import simuladorderedes.modelo.equipamento.DesktopModelo;
import static simuladorderedes.controle.EquipamentosControle.botaoSalvarDesktop;
import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;

/**
 *
 * @author Filipe
 */
public class ConfigDesktop extends JFrame {

    /**
     * Creates new form Config
     */
    private DesktopModelo desktop;
    private JTextArea log;
  
    public ConfigDesktop(DesktopModelo d, JTextArea Textlog, int numeroDeEquipamentos) {
 
        log = Textlog;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.desktop = d;
        
        
        jTextFieldNomeDesktop.setText(desktop.getNome());
        if(desktop.getIp() != null){
            Ip ip = desktop.getIp();
            jTextFieldIpDesktop1.setText(ip.getOctetoNaPosicao(0));
            jTextFieldIpDesktop2.setText(ip.getOctetoNaPosicao(1));
            jTextFieldIpDesktop3.setText(ip.getOctetoNaPosicao(2));
            jTextFieldIpDesktop4.setText(ip.getOctetoNaPosicao(3));
        }
        
        InicialBotaoGrupo();
    }

    private void InicialBotaoGrupo() {
        if(desktop.getDhcp()){
            jRadioButtonDhcp.setSelected(true);
            
        }else{
            jRadioButtonEstatico.setSelected(true);
        }
        
        buttonGroupDHCP.add(jRadioButtonEstatico);
        buttonGroupDHCP.add(jRadioButtonDhcp);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        buttonGroupDHCP = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeDesktop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIpDesktop2 = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jRadioButtonDhcp = new javax.swing.JRadioButton();
        jRadioButtonEstatico = new javax.swing.JRadioButton();
        jButtonDHCP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIpDesktop1 = new javax.swing.JTextField();
        jTextFieldIpDesktop3 = new javax.swing.JTextField();
        jTextFieldIpDesktop4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldIpDesktop5 = new javax.swing.JTextField();
        jTextFieldIpDesktop6 = new javax.swing.JTextField();
        jTextFieldIpDesktop7 = new javax.swing.JTextField();
        jTextFieldIpDesktop8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonTabelaArp = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxEquipamentos = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurar desktop");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desktop.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jTextFieldNomeDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDesktopActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Configurações gerais");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Gateway");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Ip");

        jTextFieldIpDesktop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIpDesktop2ActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jRadioButtonDhcp.setText("DHCP");
        jRadioButtonDhcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDhcpActionPerformed(evt);
            }
        });

        jRadioButtonEstatico.setText("Estático");
        jRadioButtonEstatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstaticoActionPerformed(evt);
            }
        });

        jButtonDHCP.setText("DHCP");
        jButtonDHCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDHCPActionPerformed(evt);
            }
        });

        jLabel3.setText(".");

        jTextFieldIpDesktop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIpDesktop3ActionPerformed(evt);
            }
        });

        jLabel7.setText(".");

        jLabel8.setText(".");

        jTextFieldIpDesktop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIpDesktop6ActionPerformed(evt);
            }
        });

        jTextFieldIpDesktop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIpDesktop8ActionPerformed(evt);
            }
        });

        jLabel9.setText(".");

        jLabel10.setText(".");

        jLabel11.setText(".");

        jButtonTabelaArp.setText("Tabela Arp");
        jButtonTabelaArp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabelaArpActionPerformed(evt);
            }
        });

        jLabel12.setText("Conectar");

        jComboBoxEquipamentos.setModel(new javax.swing.DefaultComboBoxModel<>(EquipamentosControle.getNomes()));
        jComboBoxEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEquipamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButtonDhcp)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonEstatico))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5)
                                .addGap(191, 191, 191)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jComboBoxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNomeDesktop))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldIpDesktop1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIpDesktop2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIpDesktop3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldIpDesktop4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldIpDesktop5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIpDesktop8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIpDesktop6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIpDesktop7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDHCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jButtonTabelaArp)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(jTextFieldNomeDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTextFieldIpDesktop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIpDesktop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIpDesktop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jTextFieldIpDesktop4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonDhcp)
                                    .addComponent(jRadioButtonEstatico))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTabelaArp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDHCP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIpDesktop8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIpDesktop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIpDesktop6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldIpDesktop7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar)))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        String nome = jTextFieldNomeDesktop.getText();
        
        Ip ip = new Ip(jTextFieldIpDesktop1.getText(),jTextFieldIpDesktop2.getText(),
                jTextFieldIpDesktop3.getText(),jTextFieldIpDesktop4.getText());
        
        if(EquipamentosControle.botaoSalvarDesktop(desktop, nome, ip)){
            TelaPrincipal.escreveNoLog("\nAlterações salvas no "+ desktop.getTipo() +": "+desktop.getNome());
        }

        this.dispose();
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    
    private void jTextFieldNomeDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDesktopActionPerformed
        
    }//GEN-LAST:event_jTextFieldNomeDesktopActionPerformed

    private void jButtonDHCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDHCPActionPerformed
        if(desktop.getDhcp()){
            log.append("\nInciando busca por roteador ...");
        }else{
            log.append("\nDHCP desligado");
        }
    }//GEN-LAST:event_jButtonDHCPActionPerformed

    private void jRadioButtonEstaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstaticoActionPerformed
        if(desktop.getDhcp()){
            log.append("\nDHCP Estático");
            desktop.setDhcp(false);
        }
        
    }//GEN-LAST:event_jRadioButtonEstaticoActionPerformed

    private void jTextFieldIpDesktop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIpDesktop3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIpDesktop3ActionPerformed

    private void jTextFieldIpDesktop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIpDesktop2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIpDesktop2ActionPerformed

    private void jTextFieldIpDesktop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIpDesktop6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIpDesktop6ActionPerformed

    private void jTextFieldIpDesktop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIpDesktop8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIpDesktop8ActionPerformed

    private void jRadioButtonDhcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDhcpActionPerformed
        if(!desktop.getDhcp()){
            log.append("\nDHCP ligado");
            desktop.setDhcp(true);
        }
        
    }//GEN-LAST:event_jRadioButtonDhcpActionPerformed

    private void jButtonTabelaArpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabelaArpActionPerformed

        TelaPrincipal.escreveNoLog("\n"+desktop.getTipo()+": "+ desktop.getNome());
        TelaPrincipal.escreveNoLog(desktop.getArp());
    }//GEN-LAST:event_jButtonTabelaArpActionPerformed

    private void jComboBoxEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosActionPerformed
       String nomeEquipamento  =(String) jComboBoxEquipamentos.getSelectedItem();
       if(nomeEquipamento != desktop.getNome()){
           TelaPrincipal.escreveNoLog("\nConectado a "+ nomeEquipamento);
       }
        String resposta = adicionaEquipamento(desktop, nomeEquipamento);
        TelaPrincipal.escreveNoLog("\nMAC: "+desktop.getMacPorta());
       
    }//GEN-LAST:event_jComboBoxEquipamentosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDHCP;
    private javax.swing.JButton jButtonDHCP;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonTabelaArp;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBoxEquipamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButtonDhcp;
    private javax.swing.JRadioButton jRadioButtonEstatico;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JTextField jTextFieldIpDesktop1;
    private javax.swing.JTextField jTextFieldIpDesktop2;
    private javax.swing.JTextField jTextFieldIpDesktop3;
    private javax.swing.JTextField jTextFieldIpDesktop4;
    private javax.swing.JTextField jTextFieldIpDesktop5;
    private javax.swing.JTextField jTextFieldIpDesktop6;
    private javax.swing.JTextField jTextFieldIpDesktop7;
    private javax.swing.JTextField jTextFieldIpDesktop8;
    private javax.swing.JTextField jTextFieldNomeDesktop;
    // End of variables declaration//GEN-END:variables
}
