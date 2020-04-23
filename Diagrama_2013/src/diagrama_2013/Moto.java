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
public class Moto extends Vehiculo implements Motor {

    public Moto() {
    }

    
    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double precio() {
      return 220000; }

    @Override
    public double velocidad_Maxima() {
     return 180; }

    @Override
    public String tipo() {
     return "Honda 150"; }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    
}
