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
public class EjecucionDelProyecto {

    private String proyectoDeGradoTerminado;
    private int recursosDisponibles;
    private Resultados resultados = new Resultados();
    private ArrayList<Estudiante> estudiante = new ArrayList<>();
    private ArrayList<PersonalDocente> personalDocente = new ArrayList<>();
    
    public EjecucionDelProyecto() {
    }
    
    public EjecucionDelProyecto(String proyectoDeGradoTerminado, int recursosDisponibles, Estudiante estudiante, PersonalDocente personalDocente) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
        this.recursosDisponibles = recursosDisponibles;
        this.estudiante.add(estudiante);
        this.personalDocente.add(personalDocente);
    }
    
    public String getProyectoDeGradoTerminado() {
        return proyectoDeGradoTerminado;
    }
    
    public void setProyectoDeGradoTerminado(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }
    
    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }
    
    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }
    
    public Resultados getResultados() {
        return resultados;
    }
    
    public void setResultados(Resultados resultados) {
        this.resultados = resultados;
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
    
    public ArrayList<PersonalDocente> getPersonalDocente() {
        return personalDocente;
    }
    
    public void setPersonalDocente(ArrayList<PersonalDocente> personalDocente) {
        this.personalDocente = personalDocente;
    }

    public void setPersonalDocente(PersonalDocente personalDocente) {
        this.personalDocente.add(personalDocente);
    }    
    
    public String comenzarDesarrolloDelProyecto() {
        
        return "comienze el proyecto";
    }
    
    public String finalizarDesarrolloDelProyecto() {
        
        return "finalize el proyecto";
    }
    
}
