package simuladorderedes.modelo;
/**
 *
 * @author Filipe
 */
enum EnumProtocoRede{
    TCP, UDP;
}
class CamadaRede {

    EnumProtocoRede protocolo;
    public CamadaRede(EnumProtocoRede rede) {
        protocolo = rede;
    }
    
    
    
}
