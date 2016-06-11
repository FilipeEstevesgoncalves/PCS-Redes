/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo;

/**
 *
 * @author Filipe
 */
public class TuplaArp {
    
    private Ip ip;
    private EnderecoMac mac;

    public TuplaArp(Ip ip, EnderecoMac mac) {
        this.ip = ip;
        this.mac = mac;
    }

    public Ip getIp() {
        return ip;
    }


    public EnderecoMac getMac() {
        return mac;
    }
    
    
    
            
}
