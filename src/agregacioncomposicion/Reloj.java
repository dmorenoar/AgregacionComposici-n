/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

public class Reloj {
    //private String marca = "CASIO";
    private MarcaReloj marca = MarcaReloj.POLAR;

    public Reloj() {
    }
    
    public Reloj(MarcaReloj marca){
        this.marca = marca;
    }
   
    
    public void dimeHora(){
        System.out.println("La hora es...");
    }

    public MarcaReloj getMarca() {
        return marca;
    }

    public void setMarca(MarcaReloj marca) {
        this.marca = marca;
    }

   
    
    
}
