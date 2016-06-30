package simuladorderedes.modelo.equipamento;

import java.io.Serializable;
import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;
/**
 * Classe abstrata
 * @author Filipe
 */
public abstract class EquipamentoModelo implements Serializable{

    private EnumTipoEquipamento tipo;
    private String nome;
    private EnderecoMac mac;
    private int portaEthernet;
    private boolean ligado;

    public EquipamentoModelo() {
    }
    
    

    public EquipamentoModelo(EnumTipoEquipamento tipo, String nome) {
        this.mac = new EnderecoMac(1);
        this.tipo = tipo;
        this.nome = nome;
        this.ligado = true;
    }
    public abstract void broadcast();

    public EnderecoMac getMac() {
        return mac;
    }
    public void ligaDesliga(){
        ligado = !ligado;
        System.out.println(ligado);
    }
    public String getTipo(){
        return tipo.name();
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract boolean temIp();
    public abstract void adicionaMac(EnderecoMac mac);
    public abstract boolean temMac(EnderecoMac mac);
    public abstract Ip getIp();
    public abstract boolean TemIpArmazenado(Ip ip);
    public abstract void adicionaTabelaArp( Ip ip, EnderecoMac mac );
    public abstract EnderecoMac getMacPorta();

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getPortaEthernet() {
        return portaEthernet;
    }

    public void setPortaEthernet(int portaEthernet) {
        this.portaEthernet = portaEthernet;
    }

    public void setMac(EnderecoMac mac) {
        this.mac = mac;
    }

    public void setTipo(EnumTipoEquipamento tipo) {
        this.tipo = tipo;
    }

    public EnumTipoEquipamento getEnumTipoEquipamento(){
        return tipo;
    }
        
    
}
