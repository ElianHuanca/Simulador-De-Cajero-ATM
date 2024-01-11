package atm;

public class Billete50Manejador extends Manejador {

    @Override
    public String retirar(DepositoYRetiro retiro, Cajero cajero) {
        String imp = "";
        int cantidadRequerida = retiro.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 50;

        int retorno = cantBilletes;
        int billetes50 = cajero.getBilletes50();
        if (cantBilletes > 0 && billetes50 > 0) {
            if (billetes50 > cantBilletes) {
                retorno = 0;
                cajero.setBilletes50(billetes50 - cantBilletes);
            } else {
                retorno = cantBilletes - billetes50;
                cajero.setBilletes50(0);
            }
            imp = "\n" + (cantBilletes - retorno) + " billetes de 50 bs";
        }
        int cantidadPendiente = (cantidadRequerida % 50) + (retorno * 50);

        if (cantidadPendiente > 0) {
            retiro.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(retiro, cajero);
        }

        return imp;
    }

    @Override
    public String depositar(DepositoYRetiro deposito, Cajero cajero) {
        String imp = "";
        int cantRequerida = deposito.getCantidadRestante();
        int cantBilletes = cantRequerida / 50;

        if (cantBilletes > 0) {
            imp = "\n"+ cantBilletes + " billetes de 50 bs";
            cajero.setBilletes50(cajero.getBilletes50()+cantBilletes);
        }

        int cantPendiente = cantRequerida % 50;

        if (cantPendiente > 0) {
            deposito.setCantidadRestante(cantPendiente);
            imp += sucessor.depositar(deposito, cajero);
        }

        return imp;
    }

}
