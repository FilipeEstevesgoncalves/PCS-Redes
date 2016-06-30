package simuladorderedes.modelo;

import java.io.Serializable;


public class TuplaMac implements Serializable{
    
    private EnderecoMac mac;
    private int porta;

    /**
     * Relaciona um endereço mac a uma porta
     * @param mac
     * @param porta 
     */
    public TuplaMac(EnderecoMac mac, int porta) {
        this.mac = mac;
        this.porta = porta;
    }

    public EnderecoMac getMac() {
        return mac;
    }

    public TuplaMac() {
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public void setMac(EnderecoMac mac) {
        this.mac = mac;
    }
    
    
    
}
