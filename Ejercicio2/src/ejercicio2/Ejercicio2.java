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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rueda ruedaCarrera = new Rueda("ruedas de carrera");
      HondaXR25 honda = new HondaXR25(90, 150);
   
     Rueda ruedaDeAterrizaje = new Rueda("rueda para aterrizar");
     Rueda ruedaDeGuia = new Rueda ("rueda para guiar al avión");
        System.out.println("Tengo una moto que tiene una velocidad máxima de "+ honda.getVelocidadMaxima());
      honda.setVelocidadMaxima(350);
      honda.setRueda(ruedaCarrera);
        System.out.println("le voy a poner unas nuevas ruedas " +honda.getRueda().get(0).getTipo() +" y ahora la velocidad máxima es de "+honda.getVelocidadMaxima());
        System.out.println("la verdad que va muy rápido para ser algo se solo tiene "+ honda.N_RUEDAS+ " ruedas");
        honda.esquivarObstaculo(4);
        
        Boing747 boing = new Boing747(5, 1000, 2000);
        boing.setRueda(ruedaDeAterrizaje);
        boing.setRueda(ruedaDeGuia);
        
       
        System.out.println("para atterizar usamos la "+boing.getRueda().get(0).getTipo()+" una vez en el suelo utilizamos la "+boing.getRueda().get(1).getTipo());
        honda.esquivarObstaculo(45);
         honda.romperInercia();
        
        
       
    } 
    
}
