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
public class Persona {
   
    private String nombre;
    private String DNI;
    private Reloj reloj = null;
    
    private Cerebro cerebro = new Cerebro(155);
    
    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    
    public Persona(String nombre, String DNI, Cerebro c) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.cerebro = c;
    }
 
    
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public void setCerebro(Cerebro cerebro) {
        if(cerebro.getIQ() > 10 ){
            this.cerebro = cerebro;
        }else{
            System.out.println("EROOOOOOOR");
        }
    }
   
}
