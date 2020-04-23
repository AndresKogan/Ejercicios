/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_noviembre_2014;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona implements Estado_Cuenta{
    private ArrayList<Tarjeta_de_Credito> credit_car = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        
    }
    
    
    

   

    public ArrayList<Tarjeta_de_Credito> getCredit_car() {
        return credit_car;
    }

    public void setCredit_car(ArrayList<Tarjeta_de_Credito> credit_car) {
        this.credit_car = credit_car;
    }
    public void setCredit_car(Tarjeta_de_Credito credit_car) {
        this.credit_car.add(credit_car);
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean problemaVerazCodeme() {
        return false; }
    
    
    
}
