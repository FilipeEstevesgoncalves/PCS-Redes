package simuladorderedes.controle;

import simuladorderedes.modelo.*;
import simuladorderedes.modelo.equipamento.DesktopModelo;
import simuladorderedes.modelo.equipamento.HubModelo;
import simuladorderedes.modelo.equipamento.RoteadorModelo;
import simuladorderedes.modelo.equipamento.SwitchModelo;

public class EquipamentosControle {
    
    private static int numeroDesktops = 0;
    private static int numeroHubs = 0;
    private static int numeroRoteadores = 0;
    private static int numeroSwithcs = 0;
    
    
    public static DesktopModelo criarDesktop(){
        StringBuilder sb = new StringBuilder("Desktop "); 
        numeroDesktops++;
        sb.append(numeroDesktops);
        DesktopModelo desktop = new DesktopModelo(sb.toString());
        
        return desktop;
    }
    public static SwitchModelo criarSwitch(){
        StringBuilder sb = new StringBuilder("Switch "); 
        numeroSwithcs++;
        sb.append(numeroSwithcs);
        SwitchModelo sw = new SwitchModelo(sb.toString());
        return sw;
    }
    public static HubModelo criarHub(){
        StringBuilder sb = new StringBuilder("Hub "); 
        numeroHubs++;
        sb.append(numeroHubs);
        HubModelo hub = new HubModelo(sb.toString());
        return hub;
    }
    public static RoteadorModelo criarRoteador(){
        StringBuilder sb = new StringBuilder("Roteador "); 
        numeroRoteadores++;
        sb.append(numeroRoteadores);
        RoteadorModelo roteador = new RoteadorModelo(sb.toString());
        return roteador;
    }
    
    public static void editaDesktop(DesktopModelo desktop, Ip ip ){
        desktop.setIp(ip);
        
    }
    public static void editaRoteador(RoteadorModelo roteador, Ip ip ){
        roteador.setIpPublico(ip);
        
    }
    
    public static DesktopModelo botaoSalvarDesktop(String nome, String ip, String gateway){
        DesktopModelo desktop = new DesktopModelo(nome);
        desktop.setIp(ip);
        desktop.setGateway(gateway);
        
        return desktop;
        
    }
    
    public void redeControle(){
        
    }
}
