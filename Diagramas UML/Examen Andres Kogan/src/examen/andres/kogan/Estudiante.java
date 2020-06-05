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
public class Estudiante {
    private String nombre;
    private int aspiranteAGrado;
    private ProyectoDeGrado proyectoDeGrado;
    private ArrayList <Soluciones> soluciones = new ArrayList<>();
    private EjecucionDelProyecto ejecucionDelProyecto;
    private ArrayList <Universidad> universidad = new ArrayList<>();
    private ArrayList <PersonalDocente> personalDocente = new ArrayList <>();

    public Estudiante(String nombre, int aspiranteAGrado, ProyectoDeGrado proyectoDeGrado, EjecucionDelProyecto ejecucionDelProyecto, Soluciones soluciones, PersonalDocente personalDocente) {
       this.nombre = nombre;
        this.aspiranteAGrado = aspiranteAGrado;
        this.proyectoDeGrado = proyectoDeGrado;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
        this.soluciones.add(soluciones);
        this.personalDocente.add(personalDocente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public int getAspiranteAGrado() {
        return aspiranteAGrado;
    }

    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

    public ProyectoDeGrado getProyectoDeGrado() {
        return proyectoDeGrado;
    }

    public void setProyectoDeGrado(ProyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
    }

    public ArrayList <Soluciones> getSoluciones() {
        return soluciones;
    }

    public void setSoluciones(ArrayList <Soluciones> soluciones) {
        this.soluciones = soluciones;
    }
    public void setSoluciones(Soluciones soluciones) {
        this.soluciones.add(soluciones);
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public ArrayList <Universidad> getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ArrayList <Universidad> universidad) {
        this.universidad = universidad;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad.add(universidad);
    }

    public ArrayList <PersonalDocente> getPersonalDocente() {
        return personalDocente;
    }

    public void setPersonalDocente(ArrayList <PersonalDocente> personalDocente) {
        this.personalDocente = personalDocente;
    }
    
    
    public void setPersonalDocente(PersonalDocente personalDocente) {
        this.personalDocente.add(personalDocente);
    }
    
    public String estudiar(){
        return "Es responsabilidad del estudiante estudiar todos los días";
    }
    public String formarse (){
        return "Ayuda a la formación del estudiante su preocupación de la problematica de la materia";
    }
    public String irALaUniversidad(){
        return "La universidad cuenta con muchos colectivos para que los estudiantes puedan acceder a la misma";
    }
    
    
    
    
}
