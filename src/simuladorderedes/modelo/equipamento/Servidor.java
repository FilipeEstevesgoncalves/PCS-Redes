package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.IIp;
import simuladorderedes.modelo.Ip;

public class Servidor extends Equipamento implements IIp {

    private Ip ip;

    public Servidor(String nome, int ip) {
        super(EnumTipoEquipamento.SERVIDOR, nome);
        this.ip = new Ip();
    }

        @Override
    public void adicionarIp(Ip ip){
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
