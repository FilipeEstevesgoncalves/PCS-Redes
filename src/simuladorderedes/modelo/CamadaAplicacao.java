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
enum EnumProtocoloAplicao{
    HTTP, DNS,  DHCP; //POP3, IMAP, BITTORRENT,
}
public class CamadaAplicacao {
    
    private EnumProtocoloAplicao aplicacao;
    private String conteudo; 

    public CamadaAplicacao(EnumProtocoloAplicao aplicacao) {
       this.aplicacao = aplicacao;
    }

    public EnumProtocoloAplicao getAplicacao() {
        return aplicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
    
    
}
