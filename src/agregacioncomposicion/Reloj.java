/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

public class Reloj {
    private String marca = "CASIO";

    public Reloj() {
    }
    
    public Reloj(String marca){
        this.marca = marca;
    }
   
    
    public void dimeHora(){
        System.out.println("La hora es...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
