package simuladorderedes.modelo;


enum EnumProtocoRede{
    TCP, UDP;
}
class CamadaRede {

    EnumProtocoRede protocolo;
    public CamadaRede(EnumProtocoRede rede) {
        protocolo = rede;
    }
    
    
    
}
