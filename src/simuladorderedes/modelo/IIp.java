package simuladorderedes.modelo;

import simuladorderedes.modelo.equipamento.Equipamento;

/**
 * Diferencia os equipamentos que tem ip dos que não tem
 * 
 * @author Filipe
 */
public interface IIp {

    public void adicionarEquipamento(Ip ip);
    public void Dhcp(); 
    
}
