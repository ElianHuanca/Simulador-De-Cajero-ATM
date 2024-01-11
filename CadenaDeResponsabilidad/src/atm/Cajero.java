/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author ELIAN
 */
public class Cajero {
    
    int Billetes200;
    int Billetes100;
    int Billetes50;
    int Billetes20;
    int Billetes10;

    public Cajero(){
        this.Billetes200=0;
        this.Billetes100=0;
        this.Billetes50=0;
        this.Billetes20=0;
        this.Billetes10=0;
    }
    
    public Cajero(int Billetes200, int Billetes100, int Billetes50, int Billetes20, int Billetes10) {
        this.Billetes200 = Billetes200;
        this.Billetes100 = Billetes100;
        this.Billetes50 = Billetes50;
        this.Billetes20 = Billetes20;
        this.Billetes10 = Billetes10;
    }
    
    public int getBilletes200() {
        return Billetes200;
    }

    public void setBilletes200(int Billetes200) {
        this.Billetes200 = Billetes200;
    }

    public int getBilletes100() {
        return Billetes100;
    }

    public void setBilletes100(int Billetes100) {
        this.Billetes100 = Billetes100;
    }

    public int getBilletes50() {
        return Billetes50;
    }

    public void setBilletes50(int Billetes50) {
        this.Billetes50 = Billetes50;
    }

    public int getBilletes20() {
        return Billetes20;
    }

    public void setBilletes20(int Billetes20) {
        this.Billetes20 = Billetes20;
    }

    public int getBilletes10() {
        return Billetes10;
    }

    public void setBilletes10(int Billetes10) {
        this.Billetes10 = Billetes10;
    }
    public int getTotal(){
        return Billetes10*10+Billetes20*20+Billetes50*50+Billetes100*100+Billetes200*200;
    }
}
