package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.Pacote;
/**
 * Classe abstrata
 * @author Filipe
 */
public abstract class Equipamento {

    private EnumTipoEquipamento tipo;
    private String nome;
    private final EnderecoMac mac;
    private boolean ligado = true;
    private Pacote pacote;
    

    public Equipamento(EnumTipoEquipamento tipo, String nome) {
        this.mac = new EnderecoMac();
        this.tipo = tipo;
        this.nome = nome;
        this.ligado = true;
    }
    public abstract void broadcast();

    public EnderecoMac getMac() {
        if(ligado){
        return mac;
        }
        return null;
    }
    public void ligaDesliga(){
        ligado = !ligado;
        System.out.println(ligado);
    }
    public EnumTipoEquipamento getTipo(){
        return tipo;
    }
    public String getNome(){
        return this.nome;
    }
    public abstract void plugaEm(Equipamento equipamento);
    
    public Ip getIp(){
        return  null;
    }
    
    public void criarPacote(){
        pacote = new Pacote();
        
    }
}
