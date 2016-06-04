package simuladorderedes.modelo;
/**
 *
 * @author Filipe
 */
public class Pacote {
    
    /**
     * 4 camadas: Aplicacao, Transporte, Rede e Enlace
     */
    private CamadaAplicacao aplicacao;
    private CamadaTransporte transporte;
    private int socketEntrada;
    private int SoketSaida;
    private Ip ipEntrada;
    private Ip ipSaida;
    private EnderecoMac macDestino;
    private EnderecoMac macOrigem;

    
    //Socket udp totalmente identificado pela tupla de Ip de destino e porta de destino
    //Socket tcp é definido por 4 elementos (Ip fonte, porta fonte, Ip destino, porta destino)
    
    //processo no servidor é identificado pelos 4 elementos do tcp

    public Pacote() {
        
    }
}
