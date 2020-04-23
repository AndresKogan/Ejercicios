/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama_2013;

/**
 *
 * @author Usuario
 */
public class Diagrama_2013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Moto moto = new Moto(2, "El puma Rodriguez");
       Bicicleta bicicleta = new Bicicleta(2, "El puma  Rodriguez");
        System.out.println(moto.duenio+" compro la moto de motor "+moto.tipo()+" y puede andar a una velocidad de "+moto.velocidad_Maxima()+"km por hora");
        System.out.println("Mientras que en su bicicleta solo llegaba a "+bicicleta.velocidad_Maxima()+ "km por hora");
        System.out.println("la diferencia es que la moto costó "+moto.precio()+" mientras que la bicicleta "+ bicicleta.precio());
       
        Bicicleta bici = new Bicicleta(2, "Pedro");
        System.out.println("El dueño de la bicicleta nr2 es: "+bici.duenio);
        bici.setDuenio("Andrés");
        System.out.println("pero ahora se la vendio a : "+bici.duenio);
        Auto auto = new Auto();
        auto.setDuenio("Roberto");
        System.out.println("El dueño de el auto es: "+auto.duenio);
        
    }
    
}
