package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;

/**
 * Transparente(hosts e roteadores não sabem da sua presença)
 * Plug and Play
 * @author Filipe
 */
public class HubModelo extends EquipamentoModelo{

    private int NUMERO_TOTAL_PORTAS = 16;
    private EnderecoMac[] portas = new EnderecoMac[NUMERO_TOTAL_PORTAS];
    private int numeroPortas = 0;
    
    public HubModelo( String nome) {
        super(EnumTipoEquipamento.HUB, nome);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean temIp() {
        return false;
    }

    @Override
    public void adicionaMac(EnderecoMac mac) {
        if(numeroPortas < NUMERO_TOTAL_PORTAS){
            portas[numeroPortas] = mac;
            numeroPortas++;
        }
    }

    @Override
    public boolean temMac(EnderecoMac mac) {
        for(int i = 0; i < numeroPortas; i++){
            if(portas[i].toString() == mac.toString() ){
                return true;
            }
        }
        return false;
    }

    @Override
    public Ip getIp() {
        return null;
    }

    @Override
    public boolean TemIpArmazenado(Ip ip) {
        return false;
    }

    @Override
    public void adicionaTabelaArp(Ip ip, EnderecoMac mac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoMac getMacPorta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
