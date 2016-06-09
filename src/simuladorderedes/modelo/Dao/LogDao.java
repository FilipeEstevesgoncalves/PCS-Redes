package simuladorderedes.modelo.Dao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LogDao extends JFrame{
  JTextArea log;
  JButton jbuttonSalvarLog;

  public LogDao(String lgoString) {
    super("Salvando log");
    Container c = getContentPane();
    FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
    c.setLayout(layout);
    
    log = new JTextArea();
    log.setEnabled(false);
    log.setBackground(Color.black);
    log.setText(lgoString);
    log.setLineWrap(true);
    
    jbuttonSalvarLog = new JButton("Salvar log");
    jbuttonSalvarLog.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
             JFileChooser fc = new JFileChooser();
      
             if(fc.showSaveDialog(LogDao.this) != JFileChooser.APPROVE_OPTION){
                 return;
             }
                
            
             File arquivo = fc.getSelectedFile();
             if(arquivo == null){
                 return;
             }
                 

             FileWriter writer = null;
             try {
                 writer = new FileWriter(arquivo);
                 writer.write(log.getText());
             } 
             catch(IOException ex){
                 // Possiveis erros aqui
             } 
             finally {
                if(writer != null){
                   try{
                       writer.close();
                   } 
                   catch (IOException x){
                       System.out.println(x);  
                }
             }
            }
          }
          
       });
       
    c.add(log);
    c.add(jbuttonSalvarLog);
    
    setSize(350, 250);
    setVisible(true);
  }
}
