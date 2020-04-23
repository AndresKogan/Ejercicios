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
public class Auto extends Vehiculo implements Motor{
    private int puertas;

    public Auto() {
      
    }
    
    

    public Auto(int puertas, int ruedas, String duenio) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    @Override
    public double precio() {
      return 1000000;}

    @Override
    public double velocidad_Maxima() {
     return 250; }

    @Override
    public String tipo() {
        return "Mercedes Benz"; }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


   
}
