package atm;

public class Billete200Manejador extends Manejador {

    @Override
    public String retirar(DepositoYRetiro retiro, Cajero cajero) {
        String imp = "";
        int cantidadRequerida = retiro.getCantidadOperacion();//650

        int cantBilletes = cantidadRequerida / 200;//650/200=3
        int retorno = cantBilletes;//3
        int billetes200 = cajero.getBilletes200();//2
        if (cantBilletes > 0 && billetes200 > 0) {
            if (billetes200 > cantBilletes) {//2>3
                retorno = 0;
                cajero.setBilletes200(billetes200 - cantBilletes);
            } else {
                retorno = cantBilletes - billetes200;//3-2=1
                cajero.setBilletes200(0);//0
            }
            imp += (cantBilletes - retorno) + " billetes de 200 bs";     //3-1=2     
        }
        int cantidadPendiente = (cantidadRequerida % 200) + (retorno * 200);//50+1*200=250

        if (cantidadPendiente > 0) {//250>0
            retiro.setCantidadRestante(cantidadPendiente);//250
            imp += sucessor.retirar(retiro, cajero);
        }
        return imp;
    }

    @Override
    public String depositar(DepositoYRetiro deposito, Cajero cajero) {
        String imp = "";
        int cantRequerida = deposito.getCantidadOperacion();
        int cantBilletes = cantRequerida / 200;

        if (cantBilletes > 0) {
            imp += cantBilletes + " billetes de 200 bs";
            cajero.setBilletes200(cajero.getBilletes200()+cantBilletes);
        }
        
        int cantPendiente = cantRequerida % 200;
        
        if (cantPendiente > 0) {
            deposito.setCantidadRestante(cantPendiente);
            imp += sucessor.depositar(deposito,cajero);
        }
        
        return imp;
    }
}
