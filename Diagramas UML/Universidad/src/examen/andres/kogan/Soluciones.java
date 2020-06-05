/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.andres.kogan;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Soluciones {
    private String alternativas;
    private ArrayList <Estudiante> estudiante = new ArrayList<>();

    public Soluciones() {
    }
    
    

    public Soluciones(String alternativas, Estudiante estudiante) {
        this.alternativas = alternativas;
        this.estudiante.add(estudiante);
    }

    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
     public void setEstudiante(Estudiante estudiante) {
        this.estudiante.add(estudiante);
     }
    
    

    
    
    public String escoger(){
        
        return "eliga su solución";
    }
    
    
    
}
