package atm;

public class Billete10Manejador extends Manejador {

    @Override
    public String retirar(DepositoYRetiro retiro, Cajero cajero) {
        String imp = "";
        int cantidadRequerida = retiro.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 10;

        int billetes10 = cajero.getBilletes10();
        
        if (cantBilletes > 0 ){//&& (billetes10-cantBilletes)>=0) {
            imp = "\n" + cantBilletes + " billetes de 10 bs";
            cajero.setBilletes10(billetes10 - cantBilletes);
        }      

        return imp;
    }

    @Override
    public String depositar(DepositoYRetiro deposito, Cajero cajero) {
        String imp = "";
        int cantRequerida = deposito.getCantidadRestante();
        int cantBilletes = cantRequerida / 10;

        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 10 bs";
            cajero.setBilletes10(cajero.getBilletes10()+cantBilletes);
        }                

        return imp;
    }

}
