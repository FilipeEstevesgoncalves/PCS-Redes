import org.junit.Assert;
import org.junit.Test;
import simuladorderedes.modelo.EnderecoMac;
import simuladorderedes.modelo.Ip;
import simuladorderedes.modelo.equipamento.*;

/**
 *
 * @author Filipe
 */
public class TesteModelo {

    
        @Test
    public void TesteIp() {

                
        
        Desktop d1 = new Desktop("d1");
        Servidor s1 = new Servidor("s1", new Ip());
        Switch sw1 = new Switch("sw1");
        Roteador r1 = new Roteador("r1");
        Hub h1 = new Hub("h1");

        Assert.assertNull("Ip nao inicializado, deveria retornar null ", d1.getIp());
        d1.setIp(new Ip());
        Assert.assertNotNull("Ip configurado não retorna null", d1.getIp());
       
        Assert.assertNotNull("Ip configurado não retorna null", s1.getIp());
        
        Assert.assertNull("Ip nao inicializado, deveria retornar null ", r1.getIp());
        r1.setIpPrivado(new Ip());
        Assert.assertNotNull("Ip configurado retorna null", r1.getIp());
        
        Assert.assertNull("Switch não tem Ip", sw1.getIp());
        
        Assert.assertNull("Hub não tem Ip", h1.getIp());
        
    }
    @Test
    public void DesktopDesktop() {
        Desktop d1 = new Desktop("d1");
        Desktop d2 = new Desktop("d2", new Ip());

        Assert.assertNull("Ip nao inicializado, deveria retornar null ", d1.getIp());
        Assert.assertNotNull("Ip configurado retorna null", d2.getIp());
        d1.AdicionaTuplaTabelaArp(new Ip(), new EnderecoMac());
        Assert.assertEquals("Broadcast", d1.enviaMensagem(d2));
        d1.AdicionaTuplaTabelaArp(new Ip(), new EnderecoMac());
        d1.AdicionaTuplaTabelaArp(d2.getIp(), d2.getMac());
        Assert.assertEquals("Mensagem recebida", d1.enviaMensagem(d2));
        

    }

    
    @Test
    public void DesktopSwitchDesktop() {
        Desktop d1 = new Desktop("d1");
        Desktop d2 = new Desktop("d2", new Ip());
        Switch s1 = new Switch("s1");
        Assert.assertTrue(s1.adicionaEquipamento(d1));
        Assert.assertTrue(s1.adicionaEquipamento(d2));
        
        
         
        
    }
    
    @Test
    public void DesktopRoteadorDesktop() {
        Desktop d1 = new Desktop("d1");
        Desktop d2 = new Desktop("d2", new Ip());
        Roteador r1 = new Roteador("r1");
        
        

    }
        
}
