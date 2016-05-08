package simuladorderedes.controle;
 

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.RepaintManager;
import simuladorderedes.visao.TelaPrincipal;

import simuladorderedes.visao.*;

/**
 *
 * @author Filipe
 */
public class SimuladorControle {
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        System.out.println("Página Inicial");     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }
}
