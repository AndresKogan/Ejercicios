/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Usuario
 */
public abstract class Auto extends Vehiculo{
    
     public final int N_RUEDAS=4;

    public Auto() {
        
    }
     
     
    public Auto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

   
    
    
}
