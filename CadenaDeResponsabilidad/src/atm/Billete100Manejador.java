package atm;

public class Billete100Manejador extends Manejador{

    @Override
    public String retirar(DepositoYRetiro retiro,Cajero cajero) {
        String imp = "";
        int cantidadRequerida = retiro.getCantidadRestante();

        int cantBilletes = cantidadRequerida / 100;
        
        int retorno=cantBilletes;
        int billetes100=cajero.getBilletes100();
        if (cantBilletes > 0 && billetes100> 0) {
            if(billetes100 > cantBilletes){
                retorno=0;
                cajero.setBilletes100(billetes100-cantBilletes);
            }else{
                retorno=cantBilletes-billetes100;
                cajero.setBilletes100(0);
            }
            imp = "\n" + (cantBilletes-retorno) + " billetes de 100 bs";          
        }
        int cantidadPendiente = (cantidadRequerida % 100) + (retorno*100);

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
        int cantBilletes = cantRequerida / 100;

        if (cantBilletes > 0) {
            imp = "\n" + cantBilletes + " billetes de 100 bs";
            cajero.setBilletes100(cajero.getBilletes100()+cantBilletes);
        }
        
        int cantPendiente = cantRequerida % 100;
        
        if (cantPendiente > 0) {
            deposito.setCantidadRestante(cantPendiente);
            imp += sucessor.depositar(deposito,cajero);
        }
        
        return imp;
    }
    
}
