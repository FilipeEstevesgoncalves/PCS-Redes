/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo;

import java.util.HashMap;

/**
 *Tabela que relaciona  Endereço Mac a porta
 * @author Filipe
 */
public class TabelaMac {
    
    /**
     * Limita o número de portas
     */
    private final int NUMERO_DE_PORTAS = 24;
    /**
     * Faz uma tabela com a relação do endereço mac e da porta fisica do Switch 
     */
    private HashMap<EnderecoMac, Integer> macs;

    public TabelaMac() {
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
