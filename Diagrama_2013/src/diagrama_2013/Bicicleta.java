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
public class Bicicleta extends Vehiculo {

    public Bicicleta() {
    }

  
    
    

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double precio() {
        return 5000;
        }

    @Override
    public double velocidad_Maxima() {
     return 80.0;}

    
    @Override
    public void setRuedas(int ruedas) {
        super.setRuedas(ruedas); 
    }

    @Override
    public int getRuedas() {
        return super.getRuedas(); 
    }

   
    
    
}
