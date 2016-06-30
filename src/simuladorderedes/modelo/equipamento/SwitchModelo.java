package simuladorderedes.modelo.equipamento;


import java.util.HashSet;
import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.RedeModelo;
import simuladorderedes.visao.TelaPrincipal;

/**
 * Transparente(hosts e roteadores não sabem da sua presença) Plug and Play
 *
 */
public class SwitchModelo extends EquipamentoModelo {

    private final int NUMERO_TOTAL_PORTAS = 12;
    private int numeroPortas = 0;
    private HashSet<EnderecoMac> Macs = new HashSet<>(NUMERO_TOTAL_PORTAS);

    public SwitchModelo() {
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public HashSet<EnderecoMac> getMacs() {
        return Macs;
    }

    public void setMacs(HashSet<EnderecoMac> Macs) {
        this.Macs = Macs;
    }
    
    
    
    public SwitchModelo(String nome) {
        super(EnumTipoEquipamento.SWITCH, nome);
    }
    
    public void imprimeTabelaComutacao(){
        for(EnderecoMac Mac : Macs) {
            TelaPrincipal.escreveNoLog("\n"+ Mac.toString());
        }
    }

    @Override
    public boolean temIp() {
        return false;
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionaMac(EnderecoMac mac) {
        Macs.add(mac);

    }
    @Override
    public  void adicionaTabelaArp( Ip ip, EnderecoMac mac ){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean temMac(EnderecoMac mac) {
        return Macs.contains(mac);
    }

    @Override
    public Ip getIp() {
        return null;
    }
    
    @Override
    public boolean TemIpArmazenado(Ip ip) {
        return false;
    }
    
    public void removeMac(String nome){

        EquipamentoModelo equipamento =  RedeModelo.getEquipamentoUnico(nome);
        Macs.remove(equipamento.getMac());

    }
  
  

    
    @Override
    public EnderecoMac getMacPorta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void adicionaMac(String nome) {
       EquipamentoModelo equipamento =  RedeModelo.getEquipamentoUnico(nome);
       Macs.add(equipamento.getMac());
    }

    public int getNUMERO_TOTAL_PORTAS() {
        return NUMERO_TOTAL_PORTAS;
    }
    
    

}
