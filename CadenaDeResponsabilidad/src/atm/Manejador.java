package atm;


public abstract class Manejador {
    protected Manejador sucessor;
    
    public void setSucessor(Manejador sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract String retirar(DepositoYRetiro retiro,Cajero cajero);     
    public abstract String depositar(DepositoYRetiro deposito,Cajero cajero);     
}
