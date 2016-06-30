package simuladorderedes.modelo.equipamento;

import java.io.Serializable;
import simuladorderedes.modelo.*;
import simuladorderedes.modelo.Ip;


public class DesktopModelo extends EquipamentoModelo implements IIp, Serializable {

    private Ip ip;
    private Ip gateway;
    private boolean dhcp = false;
    private int CAPACIDADE = 10;
    private TuplaArp[] tabelaArp = new TuplaArp[CAPACIDADE];
    private int numerosNaArp = 0;
    private TuplaMac tuplaMacPorta;
    private int arpAdicionados = 0;

    public DesktopModelo() {
    }

    
    public Ip getGateway() {
        return gateway;
    }

    public void setGateway(Ip gateway) {
        this.gateway = gateway;
    }

    public int getCAPACIDADE() {
        return CAPACIDADE;
    }

    public void setCAPACIDADE(int CAPACIDADE) {
        this.CAPACIDADE = CAPACIDADE;
    }

    public TuplaArp[] getTabelaArp() {
        return tabelaArp;
    }

    public void setTabelaArp(TuplaArp[] tabelaArp) {
        this.tabelaArp = tabelaArp;
    }

    public int getNumerosNaArp() {
        return numerosNaArp;
    }

    public void setNumerosNaArp(int numerosNaArp) {
        this.numerosNaArp = numerosNaArp;
    }

    public TuplaMac getTuplaMacPorta() {
        return tuplaMacPorta;
    }

    public void setTuplaMacPorta(TuplaMac tuplaMacPorta) {
        this.tuplaMacPorta = tuplaMacPorta;
    }

    public int getArpAdicionados() {
        return arpAdicionados;
    }

    public void setArpAdicionados(int arpAdicionados) {
        this.arpAdicionados = arpAdicionados;
    }

    

    public DesktopModelo(String nome, Ip ip) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = ip;
        this.tuplaMacPorta = new TuplaMac(new EnderecoMac(0), 1);
    }
    public void conectaAparelho(EnderecoMac mac){
        this.tuplaMacPorta = new TuplaMac(mac, 1);
    }

    public DesktopModelo(String nome) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = new Ip();
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }      
    /**
     * Temporario
     * @param ipTexto 
     */
    public void setIp(String ipTexto){
        //Modificar depois
        this.ip = new Ip();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Dhcp(RoteadorModelo roterador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarEquipamento(Ip ip) {
        this.ip = ip;
    }

    public boolean temIp() {
        return true;
    }

    public Ip getIp() {
        return ip;
    }

    @Override
    public void adicionaMac(EnderecoMac mac) {
        tuplaMacPorta = new TuplaMac(mac, 1);
    }

    @Override
    public boolean getDhcp() {
        return dhcp;
    }

    @Override
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    public String getArp() {
       StringBuilder arp = new StringBuilder();
      
       for(int i = 0; i < arpAdicionados; i++){
           arp.append("\nIP: "+ tabelaArp[i].getIp() + "MAC: "+ tabelaArp[i].getMac());
       }
       
       return arp.toString();
    }
    public void adicionaTabelaArp( Ip ip, EnderecoMac mac ){
        if(arpAdicionados < CAPACIDADE){
            tabelaArp[arpAdicionados] = new TuplaArp(ip, mac);
            arpAdicionados++; 
        }
    }

    @Override
    public EnderecoMac getMacPorta() {
        return tuplaMacPorta.getMac();
    }

    @Override
    public boolean temMac(EnderecoMac mac) {
            return tuplaMacPorta.getMac().equals(mac);
    }

    @Override
    public boolean TemIpArmazenado(Ip ip) {    
        for(int i = 0; i < arpAdicionados; i++ ){
            if(tabelaArp[i].getIp().equals(ip)){
                return true;
            }
        }
        return false;
    } 
}
