package simuladorderedes.controle;
 
import simuladorderedes.visao.TelaPrincipal;

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
