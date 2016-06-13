package simuladorderedes.modelo.equipamento;


import simuladorderedes.modelo.*;
import simuladorderedes.modelo.Ip;

public class DesktopModelo extends EquipamentoModelo implements IIp {

    private Ip ip;
    private Ip gateway;
    private boolean dhcp = false;
    private EnderecoMac porta;
    private int CAPACIDADE = 10;
    private TuplaArp[] tabelaArp = new TuplaArp[CAPACIDADE];
    private TuplaMac tuplaMac;
    
    private int arpAdicionados = 0;


    public DesktopModelo(String nome, Ip ip) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = ip;
        

    }
    public void conectaAparelho(EnderecoMac mac){
        this.tuplaMac = new TuplaMac(mac, 1);
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
        porta = mac;
    }

    public EnderecoMac getPorta() {
        return porta;
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
           arp.append("\n"+ tabelaArp[i].getIp() + ": "+ tabelaArp[i].getMac());
       }
       
       return arp.toString();
    }
    public void adicionaTabelaArp( Ip ip, EnderecoMac mac ){
        if(arpAdicionados < CAPACIDADE){
            tabelaArp[arpAdicionados] = new TuplaArp(ip, mac);
            arpAdicionados++; 
        }
    }

    public EnderecoMac getMacPorta() {
        return tuplaMac.getMac();
    }

    @Override
    public boolean temMac(EnderecoMac mac) {
        if(tuplaMac.getMac().toString() == mac.toString()){
            return true;
        }
        return false;
    }

    @Override
    public boolean TemIpArmazenado(Ip ip) {
        for(int i = 0; i < tabelaArp.length; i++ ){
            if(tabelaArp[i].getIp() == ip ){
                return true;
            }
        }
        return false;
    } 
}
