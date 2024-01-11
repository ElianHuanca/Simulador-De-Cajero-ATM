/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import atm.Cajero;
import atm.DepositoYRetiro;
import atm.Manejador;

/**
 *
 * @author Elian
 */
public class RetiroEstrategia extends OperacionEstrategia{    
    
    @Override
    public String ejecutarOperacion(Manejador manejador,DepositoYRetiro operacion, Cajero cajero) {
        if(operacion.getCantidadOperacion()>operacion.getTotalCuenta()){
            return "Su retiro supera al saldo de su cuenta";
        }
        if(operacion.getCantidadOperacion()>cajero.getTotal()){
            return "El Cajero no dispone de esa cantidad a retirar";
        }        
        operacion.setTotalCuenta(operacion.getTotalCuenta()-operacion.getCantidadOperacion());
        String s ="Retiro de "+operacion.getCantidadOperacion()+"Bs\n";
        return s+manejador.retirar(operacion, cajero);        
    }
    
}
