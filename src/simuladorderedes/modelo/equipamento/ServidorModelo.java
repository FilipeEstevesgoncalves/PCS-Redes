package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.IIp;
import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.TabelaArp;

public class ServidorModelo extends EquipamentoModelo implements IIp {

    private Ip ip;
    private TabelaArp tabelaArp;
    private boolean dhcp = false;
    /**
     * O servidor tem um ip obrigatóriamente
     * @param nome
     * @param ip 
     */
    public ServidorModelo(String nome, Ip ip) {
        super(EnumTipoEquipamento.SERVIDOR, nome);
        this.ip = new Ip();
    }

    @Override
    public void adicionarEquipamento(Ip ip){
        this.ip = ip;    
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
    public boolean getDhcp() {
        
        return dhcp;
    }
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }

}
