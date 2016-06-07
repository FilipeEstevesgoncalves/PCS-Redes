package simuladorderedes.modelo.equipamento;

import simuladorderedes.visao.TabelaArp;
import simuladorderedes.modelo.*;

public class Roteador extends Equipamento implements IIp{

    private Ip ipPrivado;
    private Ip[] interfaces;
    private int marcaraDeRede;
    private TabelaArp tabelaArp;

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
    public void adicionarEquipamento(Ip ip){
        //TODO    
    }

    @Override
    public void Dhcp(Roteador roterador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIpPublico(Ip ipPublico) {
        this.ipPrivado = ipPublico;
    }

    public Ip getIpPrivado() {
        return ipPrivado;
    }

    
   
    
    
    

}
