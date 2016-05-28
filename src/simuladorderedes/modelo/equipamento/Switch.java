package simuladorderedes.modelo.equipamento;



import simuladorderedes.modelo.TabelaMac;

/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class Switch extends Equipamento {

    Integer [] porta;
    private TabelaMac tabelaComutacao;
 
    

    public Switch( String nome) {
        super(EnumTipoEquipamento.SWITCH, nome);
        this.tabelaComutacao = new TabelaMac();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
