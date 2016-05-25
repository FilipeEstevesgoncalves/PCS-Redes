package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.EnderecoMac;

public abstract class Equipamento {

    private EnumTipoEquipamento tipo;
    private String nome;
    private final EnderecoMac mac;
    private int portaEthernet;
    private boolean ligado;

    public Equipamento(EnumTipoEquipamento tipo, String nome) {
        this.mac = new EnderecoMac();
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
}
