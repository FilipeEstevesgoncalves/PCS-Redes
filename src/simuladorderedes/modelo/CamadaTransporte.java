package simuladorderedes.modelo;
/**
 *
 * @author Filipe
 */
enum EnumProtocoTransporte{
    TCP, UDP;
}
class CamadaTransporte {

    EnumProtocoTransporte protocolo;
    
    public CamadaTransporte(EnumProtocoTransporte transporte) {
        protocolo = transporte;
    }
    
    
    
}
