package simuladorderedes.modelo;


public class TuplaMac {
    
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

    public int getPorta() {
        return porta;
    }
    
    
    
    
}
