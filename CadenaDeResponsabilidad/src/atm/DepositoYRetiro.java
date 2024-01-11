/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Elian
 */
public class DepositoYRetiro {
    private int cantidadOperacion;
    private int totalCuenta;
    private int cantidadRestante;

    public DepositoYRetiro(int totalC ,int cantidadReq) {
        totalCuenta = totalC;
        cantidadOperacion = cantidadReq;
    }

    public int getCantidadOperacion() {
        return cantidadOperacion;
    }

    public int getTotalCuenta() {
        return totalCuenta;
    }

    public int getCantidadRestante() {
        return cantidadRestante;
    }

    public void setCantidadRestante(int nuevaCantidadRestante) {
        cantidadRestante = nuevaCantidadRestante;
    }
    
    public void setTotalCuenta(int totalCuenta){
        this.totalCuenta=totalCuenta;
    }
}
