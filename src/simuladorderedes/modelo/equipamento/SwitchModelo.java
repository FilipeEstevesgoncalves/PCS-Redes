package simuladorderedes.modelo.equipamento;



import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;

/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class SwitchModelo extends EquipamentoModelo {

    Integer [] porta;
    

    public SwitchModelo( String nome) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
