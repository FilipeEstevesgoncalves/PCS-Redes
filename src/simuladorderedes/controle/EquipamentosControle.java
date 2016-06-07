package simuladorderedes.controle;

import simuladorderedes.modelo.*;
import simuladorderedes.modelo.equipamento.Desktop;
import simuladorderedes.modelo.equipamento.Hub;
import simuladorderedes.modelo.equipamento.Roteador;
import simuladorderedes.modelo.equipamento.Switch;

public class EquipamentosControle {
    
    private static int numeroDesktops = 0;
    private static int numeroHubs = 0;
    private static int numeroRoteadores = 0;
    private static int numeroSwithcs = 0;
    
    
    public static Desktop criarDesktop(){
        StringBuilder sb = new StringBuilder("Desktop "); 
        numeroDesktops++;
        sb.append(numeroDesktops);
        Desktop desktop = new Desktop(sb.toString());
        
        return desktop;
    }
    public static Switch criarSwitch(){
        StringBuilder sb = new StringBuilder("Switch "); 
        numeroSwithcs++;
        sb.append(numeroSwithcs);
        Switch sw = new Switch(sb.toString());
        return sw;
    }
    public static Hub criarHub(){
        StringBuilder sb = new StringBuilder("Hub "); 
        numeroHubs++;
        sb.append(numeroHubs);
        Hub hub = new Hub(sb.toString());
        return hub;
    }
    public static Roteador criarRoteador(){
        StringBuilder sb = new StringBuilder("Roteador "); 
        numeroRoteadores++;
        sb.append(numeroRoteadores);
        Roteador roteador = new Roteador(sb.toString());
        return roteador;
    }
    
    public static void editaDesktop(Desktop desktop, Ip ip ){
        desktop.setIp(ip);
        
    }
    public static void editaRoteador(Roteador roteador, Ip ip ){
        roteador.setIpPublico(ip);
        
    }
    
    public static Desktop botaoSalvarDesktop(String nome, String ip, String gateway){
        Desktop desktop = new Desktop(nome);
        desktop.setIp(ip);
        desktop.setGateway(gateway);
        
        return desktop;
        
    }
}
