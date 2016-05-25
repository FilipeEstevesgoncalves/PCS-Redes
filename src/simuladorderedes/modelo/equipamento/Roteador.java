package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.*;

public class Roteador extends Equipamento implements IIp{

    private Ip[] ips;
    private int[] portas;

    public Roteador(String nome) {
        super(EnumTipoEquipamento.ROTEADOR, nome);
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
    public void adicionarIp(Ip ip){
        //TODO    
    }

    @Override
    public void Dhcp(Roteador roterador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
