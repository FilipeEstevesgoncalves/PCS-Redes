/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo;

import java.io.Serializable;

/**
 *
 * @author Filipe
 */
public class TuplaArp implements Serializable{
    
    private Ip ip;
    private EnderecoMac mac;

    public TuplaArp() {
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public void setMac(EnderecoMac mac) {
        this.mac = mac;
    }
    
    
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
