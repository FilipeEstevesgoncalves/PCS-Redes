package simuladorderedes.modelo;

import java.util.HashMap;

/**
 * Tabela de relação Endereço Mac com IP
 * 
 */
public class TabelaArpModelo {
    
    private HashMap<EnderecoMac, Ip> arp;
    
    public void put(EnderecoMac mac, Ip ip){
        arp.put(mac, ip);
    }


    
    
}
