/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

import java.util.ArrayList;

/**
 *
 * @author dmorenoar
 */
public class AgregacionComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Cerebro> listaCerebro = new ArrayList();
        Cerebro c2 = new Cerebro(155);
        Cerebro c1 = new Cerebro(2);
        Cerebro c3 = new Cerebro(12);
        listaCerebro.add(c1); 
        listaCerebro.add(c2);
        listaCerebro.add(c3);
        Persona pepe = new Persona("Pepe", "4110759P");
        Reloj casio = new Reloj();
        
        pepe.setReloj(casio);
        System.out.println(pepe.getReloj().getMarca());
        
        pepe.getReloj().setMarca(MarcaReloj.valueOf("CASIO"));
        System.out.println(pepe.getReloj().getMarca());
        
        System.out.println("Tu IQ eS:" + pepe.getCerebro().getIQ());
        
        Persona juan = new Persona("Juan", "4110759P",listaCerebro.get(0));
        
        System.out.println("Tu IQ eS:" + juan.getCerebro().getIQ());
    }
    
}
