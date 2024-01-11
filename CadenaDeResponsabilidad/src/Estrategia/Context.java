/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import Observador.Notificador;
import Observador.Observador;
import atm.Cajero;
import atm.DepositoYRetiro;
import atm.Manejador;
import java.util.ArrayList;

/**
 *
 * @author Elian
 */
public class Context implements Notificador {
    ArrayList<Observador> observadores;
    private OperacionEstrategia operacion;
    
    public Context(OperacionEstrategia operacion){
        observadores = new ArrayList<Observador>();
        this.operacion=operacion;
    }
    
    public void setEstrategia( OperacionEstrategia operacion){
        this.operacion= operacion;
        notificar();
    }
    
    public String realizarOperacion(Manejador manejador,DepositoYRetiro operacion,Cajero cajero){
        return this.operacion.ejecutarOperacion(manejador,operacion, cajero);
    }
    @Override
    public void notificar() {
        for (Observador o : observadores) {
            o.update();
        }
    }

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        observadores.remove(o);
    }

}
