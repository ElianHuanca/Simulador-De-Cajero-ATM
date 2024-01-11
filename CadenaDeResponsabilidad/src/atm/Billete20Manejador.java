package atm;

public class Billete20Manejador extends Manejador{

    @Override
    public String retirar(DepositoYRetiro retiro,Cajero cajero) {
        String imp = "";
        int cantidadRequerida = retiro.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 20;
        
        int retorno=cantBilletes;
        int billetes20=cajero.getBilletes20();
        if (cantBilletes > 0 && billetes20> 0) {
            if(billetes20 > cantBilletes){
                retorno=0;
                cajero.setBilletes20(billetes20-cantBilletes);
            }else{
                retorno=cantBilletes-billetes20;
                cajero.setBilletes20(0);
            }
            imp = "\n" + (cantBilletes-retorno) + " billetes de 20 bs";          
        }
        int cantidadPendiente = (cantidadRequerida % 20) + (retorno*20);

        if (cantidadPendiente > 0) {
            retiro.setCantidadRestante(cantidadPendiente);
            imp += sucessor.retirar(retiro,cajero);
        }
        
        return imp;
    }

    @Override
    public String depositar(DepositoYRetiro deposito, Cajero cajero) {
        String imp = "";
        int cantRequerida = deposito.getCantidadRestante();
        int cantBilletes = cantRequerida / 20;

        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 20 bs";
            cajero.setBilletes20(cajero.getBilletes20()+cantBilletes);
        }

        int cantPendiente = cantRequerida % 20;

        if (cantPendiente > 0) {
            deposito.setCantidadRestante(cantPendiente);
            imp += sucessor.depositar(deposito, cajero);
        }

        return imp;
    }
    
}
