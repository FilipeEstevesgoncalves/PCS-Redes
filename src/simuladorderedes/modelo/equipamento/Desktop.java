package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.*;

/**
 * Para dois computadores se comunicarem eles precisam estar com o ip setado e com a mesma mascara
 * @author Filipe
 */
public class Desktop extends Equipamento implements IIp {

    /**
     * Ip da máquina
     */
    private Ip ip;
    private Ip marcaraDerede;

    /**
     * Conjunto de pacotes da máquina
     */
    private TabelaArp tabelaArp;

    public Desktop(String nome, Ip ip) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        this.ip = ip;
        tabelaArp = new TabelaArp();
    }

    public Desktop(String nome) {
        super(EnumTipoEquipamento.DESKTOP, nome);
        tabelaArp = new TabelaArp();
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void broadcast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Dhcp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarEquipamento(Ip ip) {
        this.ip = ip;
    }

    @Override
    public Ip getIp() {
        return ip;
    }


    public String enviaMensagem(Desktop desktop) {
        
       if(desktop.getIp() != null){
           if(desktop.getMac() == tabelaArp.VerificaExistencia(desktop.getIp())){
               return "Mensagem recebida";
           }
           
           return "Broadcast";
       }
       return "Mensagem não recebida";
    }
    
    public void enviaMensagem(Ip ipDispositivoRecptor) {
        
        if(ip == null){
            System.out.println("Configure seu ip local para estabelecer uma rede");
        }else{
            if(tabelaArp.VerificaExistencia(ip) != null){
                System.out.println("Recpetor conhecido dentro da tabelaArp");
            }else{
                System.out.println(tabelaArp.broadcast());
                
            }
        }
        
    }
    public void AdicionaTuplaTabelaArp(Ip ip, EnderecoMac endereco){
        tabelaArp.insere(ip, endereco);
    }
    public String mensagemRecebida(){
        return "Mensagem Recebida";
    }

    public String mensagemRecebida(Desktop receptor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void plugaEm(Equipamento equipamento) {
        if(equipamento.getTipo() == EnumTipoEquipamento.DESKTOP || equipamento.getTipo() == EnumTipoEquipamento.ROTEADOR 
                || equipamento.getTipo() == EnumTipoEquipamento.SERVIDOR ){
            tabelaArp.insere(equipamento.getIp(), equipamento.getMac());
        }else{
            
        }
    }
}
