package simuladorderedes.controle;

import java.util.ArrayList;
import simuladorderedes.modelo.*;
import simuladorderedes.modelo.equipamento.DesktopModelo;
import simuladorderedes.modelo.equipamento.EquipamentoModelo;
import simuladorderedes.modelo.equipamento.HubModelo;
import simuladorderedes.modelo.equipamento.RoteadorModelo;
import simuladorderedes.modelo.equipamento.SwitchModelo;
import simuladorderedes.visao.TelaPrincipal;

public class EquipamentosControle {
       
    private static ArrayList<EquipamentoModelo> equipamentos = new ArrayList<>();
    private static int TAMANHO_TOTAL_EQUIPAMENTOS = 20;
    private static String[] nomes = new String[TAMANHO_TOTAL_EQUIPAMENTOS];
    private int numeroEquipamentosTotal = 0;
    private static int numeroDesktops = 0;
    private static int numeroHubs = 0;
    private static int numeroRoteadores = 0;
    private static int numeroSwithcs = 0;
    
    
    public DesktopModelo criarDesktop(){
        StringBuilder sb = new StringBuilder("Desktop "); 
        numeroDesktops++;
        sb.append(numeroDesktops);  
        DesktopModelo desktop = new DesktopModelo(sb.toString());
        equipamentos.add(desktop);
        nomes[numeroEquipamentosTotal] = desktop.getNome();
        numeroEquipamentosTotal++;
        return desktop;
    }
    public SwitchModelo criarSwitch(){
        StringBuilder sb = new StringBuilder("Switch "); 
        numeroSwithcs++;
        sb.append(numeroSwithcs);
        SwitchModelo sw = new SwitchModelo(sb.toString());
        equipamentos.add(sw);
        nomes[numeroEquipamentosTotal] = sw.getNome();
        numeroEquipamentosTotal++;
        return sw;
    }
    public HubModelo criarHub(){
        StringBuilder sb = new StringBuilder("Hub "); 
        numeroHubs++;
        sb.append(numeroHubs);
        HubModelo hub = new HubModelo(sb.toString());
        equipamentos.add(hub);
        nomes[numeroEquipamentosTotal] = hub.getNome();
        numeroEquipamentosTotal++;
        return hub;
    }
    public  RoteadorModelo criarRoteador(){
        StringBuilder sb = new StringBuilder("Roteador "); 
        numeroRoteadores++;
        sb.append(numeroRoteadores);
        RoteadorModelo roteador = new RoteadorModelo(sb.toString());
        equipamentos.add(roteador);
        nomes[numeroEquipamentosTotal] = roteador.getNome();
        numeroEquipamentosTotal++;
        return roteador;
    }
    
    public  void editaDesktop(DesktopModelo desktop, Ip ip ){
        desktop.setIp(ip);
        TelaPrincipal.escreveNoLog(desktop.getNome() + "alterado");
        
    }
    public  void editaRoteador(RoteadorModelo roteador, Ip ip ){
        roteador.setIpPrivado(ip);
        
    }
    
    public static boolean botaoSalvarDesktop(DesktopModelo desktop, String nome, Ip ip){
        String nomeAntigo = desktop.getNome();
        if(desktop.getNome() == nome && desktop.getIp() == ip){
            return false;
        }else{
            for(int i = 0; i < nomes.length; i++){
                if(nomes[i] == nomeAntigo){
                    nomes[i] = nome;
                }
            }
            desktop.setNome(nome);
            desktop.setIp(ip);
            return true;
        }
    }
    
    public static boolean botaoSalvarRoteador(RoteadorModelo roteador, String nome, Ip ip){
        String nomeAntigo = roteador.getNome();
        if(roteador.getNome() == nome && roteador.getIp() == ip){
            return false;
        }else{
            for(int i = 0; i < nomes.length; i++){
                if(nomes[i] == nomeAntigo){
                    nomes[i] = nome;
                }
            }
            roteador.setNome(nome);
            roteador.setIpPrivado(ip);
            return true;
        }
    }

    public String[] getEquipamentos() {
        String []copia = new String[equipamentos.size()];
        for(int i = 0; i < equipamentos.size(); i++){
            copia[i] = equipamentos.get(i).getNome();
        }
        
        return copia;
    }

    public static void setNomes(String[] nomes) {
        EquipamentosControle.nomes = nomes;
    }

    public static String[] getNomes() {
        return nomes;
    }
    
    public void transmissãoPacote(String equipamentoEmissor, String equipamentoReceptor){
        for(int i = 0; i< equipamentos.size(); i++){
            if(equipamentos.get(i).getNome() == equipamentoEmissor ){
                EquipamentoModelo emissor = equipamentos.get(i);
            }else if(equipamentos.get(i).getNome() == equipamentoReceptor){
                EquipamentoModelo receptor =  equipamentos.get(i);
            }
        }
        
        
    }
    
    public static String adicionaEquipamento(EquipamentoModelo equipamentoEmissor, String equipamentoString){
        for (EquipamentoModelo equipamento : equipamentos) {
            if(equipamento.getNome() == equipamentoString){
                equipamentoEmissor.adicionaMac(equipamento.getMac());
                return equipamento.getMac().toString();
            }
        }
        return "Não encontrado";
                
    }
    public static void enviarMensagem(String emissor,String receptor){
        EquipamentoModelo equipamentoEmissor = null;
        EquipamentoModelo equipamentoReceptor = null;
        for (EquipamentoModelo equipamento : equipamentos) {
            if(equipamento.getNome() == emissor){
                equipamentoEmissor= equipamento;
            }else if(equipamento.getNome() == receptor){
               equipamentoReceptor= equipamento;
            }
        }
        if(equipamentoEmissor.temIp()  && equipamentoReceptor.temIp() ){
            TelaPrincipal.escreveNoLog("\nEntrou ");
            
            
        }        
        
    }
}
