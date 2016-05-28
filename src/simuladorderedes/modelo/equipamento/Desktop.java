package simuladorderedes.modelo.equipamento;

import java.util.HashSet;
import java.util.Set;
import simuladorderedes.modelo.*;

public class Desktop extends Equipamento implements IIp {

    /**
     * Ip da máquina
     */
    private Ip ip;
    /**
     * Conjunto de pacotes da máquina
     */
    private Set<Pacote> pacotes = new HashSet<>();
    private TabelaArp tabelaArp;

    public Desktop(String nome, Ip ip) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = ip;
    }

    public Desktop(String nome) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = new Ip();
    }

    public void setIp(Ip ip) {
        this.ip = ip;
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
    public void Dhcp(Roteador roterador) {
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
    

}
