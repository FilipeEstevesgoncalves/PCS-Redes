package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.TuplaMac;
import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;

/**
 * Transparente(hosts e roteadores não sabem da sua presença) Plug and Play
 *
 * @author Filipe
 */
public class SwitchModelo extends EquipamentoModelo {

    private final int NUMERO_TOTAL_PORTAS = 12;
    private int numeroPortas = 0;
    private TuplaMac[] tuplaMac = new TuplaMac[NUMERO_TOTAL_PORTAS];

    public SwitchModelo(String nome) {
        super(EnumTipoEquipamento.SWITCH, nome);
    }

    @Override
    public boolean temIp() {
        return false;
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionaMac(EnderecoMac mac) {
        if (numeroPortas < NUMERO_TOTAL_PORTAS) {
            tuplaMac[numeroPortas] = new TuplaMac(mac, numeroPortas);
            numeroPortas++;
        }

    }

    @Override
    public boolean temMac(EnderecoMac mac) {
        for (int i = 0; i < numeroPortas; i++) {
            if (tuplaMac[i].getMac().toString() == mac.toString()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Ip getIp() {
        return null;
    }
    
    @Override
    public boolean TemIpArmazenado(Ip ip) {
        return false;
    }
    @Override
    public void adicionaTabelaArp(Ip ip, EnderecoMac mac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoMac getMacPorta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
