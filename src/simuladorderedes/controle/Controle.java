package simuladorderedes.controle;

import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.equipamento.Desktop;
import simuladorderedes.modelo.equipamento.Roteador;
import simuladorderedes.modelo.equipamento.Servidor;
import simuladorderedes.modelo.equipamento.Switch;
/**
 *
 * @author Filipe
 */
public class Controle {

    public static void main(String args[]) {
        Desktop pc1 = new Desktop("Pc1");
        System.out.println(pc1.getNome());
        System.out.println(pc1.getTipo());
        System.out.println(pc1.getIp());
        System.out.println(pc1.getMac());

        Desktop pc2 = new Desktop("Pc2");
        System.out.println(pc2.getNome());
        System.out.println(pc2.getTipo());
        System.out.println(pc2.getIp());
        System.out.println(pc2.getMac());

        Roteador rt1 = new Roteador("rt1");
        rt1.setIpPublico(new Ip());
        System.out.println("Ip roteador: " + rt1.getIpPublico());
        System.out.println("Mac roteador: " + rt1.getMac());
        System.out.println("Tabela Arp: " + rt1.getTabelaArp());

        Servidor sv1 = new Servidor("\nsv1", new Ip());
        System.out.println("Mac servidor: " + sv1.getIp());
        System.out.println("Mac servidor: " + sv1.getMac());

        Switch sw1 = new Switch("sw1");

        sw1.adicionaEquipamento(pc1);
        sw1.adicionaEquipamento(pc2);
        
        sw1.removeEquipamento(pc1);
        sw1.adicionaEquipamento(rt1);
        sw1.imprimeTabela();
        
        

    }

}
