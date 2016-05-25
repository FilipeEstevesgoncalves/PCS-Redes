package simuladorderedes.modelo;

import simuladorderedes.modelo.equipamento.Roteador;

public interface IIp {

    public void adicionarIp(Ip ip);
    public void Dhcp(Roteador roterador);
}
