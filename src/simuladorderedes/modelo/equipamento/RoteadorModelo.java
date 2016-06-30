package simuladorderedes.modelo.equipamento;


import java.io.Serializable;
import simuladorderedes.modelo.TuplaMac;
import simuladorderedes.modelo.*;

public class RoteadorModelo extends EquipamentoModelo implements IIp, Serializable{

    private Ip ipPrivado;
    private Ip[] interfaces;
    private int marcaraDeRede;
    private boolean dhcp = false;
    private int porta = 0;
    private int CAPACIDADE_ARP = 10;
    private TuplaArp[] tabelaArp = new TuplaArp[CAPACIDADE_ARP];
    private final int NUMERO_TOTAL_PORTAS = 12;
    private int numeroPortas = 0;
    private TuplaMac[] tuplasMac = new TuplaMac[NUMERO_TOTAL_PORTAS];
    
    private int arpAdicionados = 0;

    public RoteadorModelo() {
    }

    public Ip[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(Ip[] interfaces) {
        this.interfaces = interfaces;
    }

    public int getMarcaraDeRede() {
        return marcaraDeRede;
    }

    public void setMarcaraDeRede(int marcaraDeRede) {
        this.marcaraDeRede = marcaraDeRede;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getCAPACIDADE_ARP() {
        return CAPACIDADE_ARP;
    }

    public void setCAPACIDADE_ARP(int CAPACIDADE_ARP) {
        this.CAPACIDADE_ARP = CAPACIDADE_ARP;
    }

    public TuplaArp[] getTabelaArp() {
        return tabelaArp;
    }

    public void setTabelaArp(TuplaArp[] tabelaArp) {
        this.tabelaArp = tabelaArp;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public TuplaMac[] getTuplasMac() {
        return tuplasMac;
    }

    public void setTuplasMac(TuplaMac[] tuplasMac) {
        this.tuplasMac = tuplasMac;
    }

    public int getArpAdicionados() {
        return arpAdicionados;
    }

    public void setArpAdicionados(int arpAdicionados) {
        this.arpAdicionados = arpAdicionados;
    }

    
    public RoteadorModelo(String nome) {
        super(EnumTipoEquipamento.ROTEADOR, nome);
        this.ipPrivado = new Ip();
    }

    public void nat() {
    }


    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarEquipamento(Ip ip){
        //TODO    
    }

    @Override
    public void Dhcp(RoteadorModelo roterador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIpPrivado(Ip ip) {
        this.ipPrivado = ip;
    }

    @Override
    public boolean getDhcp() {
        return dhcp;
    }
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    @Override
    public boolean temIp() {
        return true;
    }

    public Ip getIp() {
        return ipPrivado;
        
    }

    @Override
    public void adicionaMac(EnderecoMac mac) {
        if(numeroPortas < NUMERO_TOTAL_PORTAS){
            tuplasMac[numeroPortas] = new TuplaMac(mac, numeroPortas);
        }
    }
    
    public String getArp() {
       StringBuilder arp = new StringBuilder();
      
       for(int i = 0; i < arpAdicionados; i++){
           arp.append("\n"+ tabelaArp[i].getIp() + ": "+ tabelaArp[i].getMac());
       }
       return arp.toString();
    }
    public void adicionaTabelaArp( Ip ip, EnderecoMac mac ){
        
        if(arpAdicionados < CAPACIDADE_ARP){
            TuplaArp a = new TuplaArp(ip, mac);
            tabelaArp[arpAdicionados] = a;
            arpAdicionados++; 
        }
    }
        @Override
        public boolean temMac(EnderecoMac mac) {
        for(int i = 0; i < tuplasMac.length; i++){
            if(tuplasMac[i].getMac().toString() == mac.toString() ){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean TemIpArmazenado(Ip ip) {
        for(int i = 0; i < tabelaArp.length; i++ ){
            if(tabelaArp[i].getIp().toString() == ip.toString() ){
                return true;
            }
        }
        return false;
    }

    @Override
    public EnderecoMac getMacPorta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Ip getIpPrivado() {
        return ipPrivado;
    }

    public boolean isDhcp() {
        return dhcp;
    }

    public int getNUMERO_TOTAL_PORTAS() {
        return NUMERO_TOTAL_PORTAS;
    }
    
    

}
