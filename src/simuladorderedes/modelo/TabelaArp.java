/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo;

import java.util.HashMap;
import java.util.*;


/**
 * Tabela de relação IP com Endereço Mac
 * @author Filipe
 */
public class TabelaArp {
    
    private HashMap< Ip, EnderecoMac> arp;

    public TabelaArp() {
        arp = new HashMap<>();
    }

    
    public void insere(Ip ip, EnderecoMac endereco){
        arp.put(ip, endereco);
    }
    public EnderecoMac VerificaExistencia(Ip ip){
        return arp.get(ip);
    }
    public ArrayList<EnderecoMac> broadcast(){
        return (ArrayList<EnderecoMac>) arp.values();
    }
    public void Arp(){
        //Requisita quem tem o ip x    Adress resolution protocol
    }

    
    
    
}
