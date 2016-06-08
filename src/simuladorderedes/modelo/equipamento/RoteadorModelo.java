package simuladorderedes.modelo.equipamento;

import simuladorderedes.visao.TabelaArp;
import simuladorderedes.modelo.*;

public class RoteadorModelo extends EquipamentoModelo implements IIp{

    private Ip ipPrivado;
    private Ip[] interfaces;
    private int marcaraDeRede;
    private TabelaArp tabelaArp;
    private boolean dhcp = false;

    public RoteadorModelo(String nome) {
        super(EnumTipoEquipamento.ROTEADOR, nome);
        this.ipPrivado = new Ip();
    }

    public void nat() {
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void setIpPublico(Ip ipPublico) {
        this.ipPrivado = ipPublico;
    }

    public Ip getIp() {
       
        return ipPrivado;
    }

    @Override
    public boolean getDhcp() {
        return dhcp;
    }
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

    
   
    
    
    

}
