/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorderedes.modelo.equipamento;

import simuladorderedes.modelo.IIp;

/**
 *
 * @author Filipe
 */
public class Switch extends Equipamento implements IIp{

    private int ip;
    private int [] tabelaComutacao;
    
    @Override
    public void receberIp() {
        // TODO 
    }
    
}