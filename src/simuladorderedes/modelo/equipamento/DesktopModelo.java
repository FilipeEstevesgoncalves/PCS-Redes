package simuladorderedes.modelo.equipamento;

import simuladorderedes.visao.TabelaArp;
import java.util.HashSet;
import java.util.Set;
import simuladorderedes.modelo.*;

public class DesktopModelo extends EquipamentoModelo implements IIp {

    /**
     * Ip da máquina
     */
    private Ip ip;
    private Ip gateway;
    private boolean dhcp = false; 
    /**
     * Conjunto de pacotes da máquina
     */
    private Set<Pacote> pacotes = new HashSet<>();
    private TabelaArp tabelaArp;

    public DesktopModelo(String nome, Ip ip) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = ip;
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

    public Ip getIp() {
        return ip;
    }

    public Set<Pacote> getPacotes() {
        return pacotes;
    }

    public void setGateway(Ip gateway) {
        this.gateway = gateway;
    }

    /**
     * Provisorio
     * @param gateway 
     */
    public void setGateway(String gateway) {
        this.gateway = new Ip();
    }


    @Override
    public boolean getDhcp() {
        return dhcp;
    }

    @Override
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }
    
    

}