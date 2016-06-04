package simuladorderedes.modelo;
/**
 *
 * @author Filipe
 */
enum EnumInterafaceDeRede{
    EthernetPort;
}
class PlacaDeInterfaceDeRede {

    private EnumInterafaceDeRede nic;
    
    public PlacaDeInterfaceDeRede() {
        nic = EnumInterafaceDeRede.EthernetPort;
    }
    
}
