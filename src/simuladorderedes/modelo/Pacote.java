package simuladorderedes.modelo;
/**
 *
 * @author Filipe
 */
public class Pacote {
    
    /**
     * 4 camadas: Aplicacao, Transporte, Rede e Enlace
     */
    private int aplicacao;
    private CamadaRede transporte;
    private Ip ipEntrada;
    private Ip ipSaida;
    private EnderecoMac macEntrada;
    private EnderecoMac macSaida;

    
    
}
