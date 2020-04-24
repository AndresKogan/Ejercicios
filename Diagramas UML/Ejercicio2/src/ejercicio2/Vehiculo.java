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
public abstract class Vehiculo implements Desplazable {

    private double velocidadPromedio;
    private int velocidadMaxima;
    ArrayList<Rueda> rueda = new ArrayList<>();

    public Vehiculo() {

    }

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;

    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ArrayList<Rueda> getRueda() {
        return rueda;
    }

    public void setRueda(ArrayList<Rueda> rueda) {
        this.rueda = rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda.add(rueda);
    }

    public void romperInercia() {

        System.out.println("frenó");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("correte che!");
    }
}
