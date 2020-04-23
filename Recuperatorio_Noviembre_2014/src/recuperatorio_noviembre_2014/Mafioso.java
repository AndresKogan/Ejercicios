/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio_noviembre_2014;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Mafioso extends Persona implements Investigable {
    private List<Lugar>lugaresFrecuentes = new ArrayList<>();

    
    public Mafioso(String nombre, String apellido, Foto foto) {
        super(nombre, apellido, foto);
    }

    public List<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(List<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    @Override
    public boolean investigar() {
       return true; }
    
   public void agregarLugar (Lugar lugar){
       this.lugaresFrecuentes.add(lugar);
   }
   public void quitarLugar(Lugar lugar){
       this.lugaresFrecuentes.remove(this);   }
    
    
}
