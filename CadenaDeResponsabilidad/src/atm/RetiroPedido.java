package atm;

public class RetiroPedido {

    private int cantidadRequerida;
    private int totalCuenta;
    private int cantidadRestante;

    public RetiroPedido(int totalC ,int cantidadReq) {
        totalCuenta = totalC;
        cantidadRequerida = cantidadReq;
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
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
}
