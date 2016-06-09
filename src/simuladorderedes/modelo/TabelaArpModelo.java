package simuladorderedes.modelo;

import java.util.HashMap;

public class TabelaArpModelo {
    
    private HashMap<EnderecoMac, Ip> arp;
    
    public void put(EnderecoMac mac, Ip ip){
        arp.put(mac, ip);
    }
    
    public Ip get(EnderecoMac mac){
        return arp.get(mac);
    }
}
