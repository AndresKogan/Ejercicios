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
public class HondaXR25 extends Moto{

    public HondaXR25() {
    }

    public HondaXR25(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

   
    
    public void esquivarObstaculo(int metros) {
         System.out.println("cuidado, hay un obstaculo a  "+ metros + " metros");
    }
   
}
