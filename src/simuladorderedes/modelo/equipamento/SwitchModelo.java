package simuladorderedes.modelo.equipamento;



import simuladorderedes.modelo.TabelaMacModelo;

/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class SwitchModelo extends EquipamentoModelo {

    Integer [] porta;
    private TabelaMacModelo tabelaComutacao;
 
    

    public SwitchModelo( String nome) {
        super(EnumTipoEquipamento.SWITCH, nome);
        this.tabelaComutacao = new TabelaMacModelo();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
