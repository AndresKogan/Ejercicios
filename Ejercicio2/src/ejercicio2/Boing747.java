/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Boing747 extends Vehiculo{
    private int viajes;

    public Boing747() {
        this.viajes = 0;
    }

    public Boing747(int viajes, double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
        this.viajes = viajes;
    }

   
    

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }

   public void despegar(){
       System.out.println("estoy despegando");
   }
   public void aterrizar(){
       System.out.println("llegamos!");
   }
   public void agregarViaje(){
       System.out.println("ahora salimos para otro lugar");
   }
}
