package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.IIp;
import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.TabelaArp;

public class Servidor extends Equipamento implements IIp {

    private Ip ip;
    private TabelaArp tabelaArp;

    /**
     * O servidor tem um ip obrigatóriamente
     * @param nome
     * @param ip 
     */
    public Servidor(String nome, Ip ip) {
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
    public void Dhcp(Roteador roterador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
