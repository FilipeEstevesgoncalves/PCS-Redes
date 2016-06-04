/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo;

import java.util.HashMap;
import simuladorderedes.modelo.equipamento.Equipamento;

/**
 *  Tabela que relaciona  Endereço Mac a porta 
 *  
 * @author Filipe
 */
public class TabelaMac {
    
    /**
     * Limita o número o tamanho da tabela
     */
    private final int NUMERO_DE_PORTAS = 16;
    /**
     * Faz uma tabela com a relação do endereço mac e da porta fisica do Switch 
     */
    private HashMap<EnderecoMac, Integer> relacaoMacsPortas;

    public TabelaMac() {
        this.relacaoMacsPortas = new HashMap<>(NUMERO_DE_PORTAS);        
        EnderecoMac broadcast = new EnderecoMac(EnumBroadcast.BROADCAST);
        relacaoMacsPortas.put(broadcast, 0);
    }
    
    public boolean adicionarEndereco(EnderecoMac endereco, Integer porta){
        if(relacaoMacsPortas.size() >= NUMERO_DE_PORTAS){
            return false;
        }else{
            relacaoMacsPortas.put(endereco,porta);
            return true;
        }
    }
    public Integer removeEquipamento(Equipamento equipamento){
        
        Integer porta = relacaoMacsPortas.get(equipamento.getMac());
        relacaoMacsPortas.remove(equipamento.getMac());
        return porta;
    }
    
    public void Imprime(){
        System.out.println(relacaoMacsPortas);
    }
    

    
}
