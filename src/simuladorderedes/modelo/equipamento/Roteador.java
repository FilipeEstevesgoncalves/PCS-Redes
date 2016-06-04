package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.*;

public class Roteador extends Equipamento implements IIp{

    private Ip ipPublico;
    private Ip ipPrivado;
    private Ip[] interfaces;
    private int marcaraDeRede;
    private TabelaArp tabelaArp;
    private Switch ESwitch;

    /**
     *
     * @param nome
     */
    public Roteador(String nome) {
        super(EnumTipoEquipamento.ROTEADOR, nome);
        StringBuilder swtch= new StringBuilder("Switch do Roteador ");
        swtch.append(nome);

        ESwitch = new Switch(swtch.toString());
    }

    public void nat() {
    }

    @Override
    public EnumTipoEquipamento getTipo() {
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
    public void Dhcp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIpPublico(Ip ipPublico) {
        this.ipPublico = ipPublico;
    }

    public void setIpPrivado(Ip ipPrivado) {
        this.ipPrivado = ipPrivado;
    }
    

    public Ip getIpPublico() {
        return ipPublico;
    }

    public TabelaArp getTabelaArp() {
        return tabelaArp;
    }

    @Override
    public void plugaEm(Equipamento equipamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ip getIp() {
        return ipPrivado;
    }
        
}
