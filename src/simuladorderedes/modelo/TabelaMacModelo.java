package simuladorderedes.modelo;

import java.util.HashMap;

/**
 *Tabela que relaciona  Endereço Mac a porta
 * 
 */
public class TabelaMacModelo {
    
    /**
     * Limita o número de portas
     */
    private final int NUMERO_DE_PORTAS = 16;
    /**
     * Faz uma tabela com a relação do endereço mac e da porta fisica do Switch 
     */
    private HashMap<EnderecoMac, Integer> macs;

    public TabelaMacModelo() {
        this.macs = new HashMap<>();
    }
    
    public boolean adicionarEndereco(EnderecoMac endereco, Integer porta){
        if(macs.size() >= NUMERO_DE_PORTAS){
            return false;
        }else{
            macs.put(endereco,porta);
            return true;
        }
    }

    
}
