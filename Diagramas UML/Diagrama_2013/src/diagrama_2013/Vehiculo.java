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
public abstract class Vehiculo {

    protected int ruedas;
    protected String duenio;

    public Vehiculo() {

    }

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    public abstract double precio();

    public abstract double velocidad_Maxima();

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

}
