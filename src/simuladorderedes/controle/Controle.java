/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.controle;
import simuladorderedes.modelo.equipamento.Desktop;
/**
 *
 * @author Filipe
 */
public class Controle {
    public static void main(String args[]) {
        Desktop pc1  = new Desktop("Pc1");
        System.out.println(pc1.getNome());
        System.out.println(pc1.getTipo());
        System.out.println(pc1.getIp());
        System.out.println(pc1.getPacotes());
        System.out.println(pc1.getMac());
        
    }
    
}
