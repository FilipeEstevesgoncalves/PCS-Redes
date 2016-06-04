package simuladorderedes.modelo.equipamento;


/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class Hub extends Equipamento{


    
    public Hub( String nome) {
        super(EnumTipoEquipamento.HUB, nome);
    }

    @Override
    public EnumTipoEquipamento getTipo() {
        return super.getTipo();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void plugaEm(Equipamento equipamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
