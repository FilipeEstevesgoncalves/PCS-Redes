package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.EnderecoMac;

/**
 *
 * @author Filipe
 */
class TuplaMac {
    
    private EnderecoMac mac;
    private int porta;

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
