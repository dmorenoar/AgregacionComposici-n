/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

/**
 *
 * @author Xavier Castejon
 */
public class Cerebro {
    private int IQ;

    public Cerebro(int IQ) {
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
    
    public void despierta(){
        System.out.println("Necesito café");
    }
    
}
