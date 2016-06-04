package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.TabelaMac;

/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class Switch extends Equipamento {

    private final int NUMERO_DE_PORTAS = 24; 
    private boolean [] portas;
    private TabelaMac tabelaComutacao;
 
    
    public Switch( String nome) {
        super(EnumTipoEquipamento.SWITCH, nome);
        this.tabelaComutacao = new TabelaMac();
        portas = new boolean[NUMERO_DE_PORTAS];
        portasTrue();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean adicionaEquipamento(Equipamento equipamento){
        for(int i = 1; i < NUMERO_DE_PORTAS-1; i++){
            if(portas[i]== true){
                portas[i] = false;
                return tabelaComutacao.adicionarEndereco(equipamento.getMac(), i);                 
            }
        }
        return false;
    }
    public void removeEquipamento(Equipamento equipamento){
        int porta = tabelaComutacao.removeEquipamento(equipamento);
        portas[porta] = true;
    }

    public TabelaMac getTabelaComutacao() {
        //Trocar por um que não passe como referência
        return tabelaComutacao;
    }
    public void imprimeTabela(){
        tabelaComutacao.Imprime();
        
    }
    
    
    
    
    
    
    
    
    private void portasTrue() {
        for(int i = 0; i < NUMERO_DE_PORTAS; i++){
            portas[i] = true;
        }
    }

    @Override
    public void plugaEm(Equipamento equipamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

    
}
