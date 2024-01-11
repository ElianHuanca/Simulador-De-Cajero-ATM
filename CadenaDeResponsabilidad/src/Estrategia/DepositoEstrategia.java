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
public class DepositoEstrategia extends OperacionEstrategia{    
    @Override
    public String ejecutarOperacion(Manejador manejador,DepositoYRetiro operacion, Cajero cajero) {
        operacion.setTotalCuenta(operacion.getTotalCuenta()+operacion.getCantidadOperacion());
        String s="Deposito de " + operacion.getCantidadOperacion()+"Bs\n";
        return s+manejador.depositar(operacion, cajero);
    }
    
}
