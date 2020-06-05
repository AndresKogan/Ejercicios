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
public class ProyectoDeGrado {
    private String alcance;
    private int costo;
    private String objetivo;
    private String planDeProyecto;
    private int tiempoDeRealizacion;
    private String titulo;
    private int viabilidad;
    private EjecucionDelProyecto ejecucionDelProyecto = new EjecucionDelProyecto();
    private Soluciones soluciones;
    private ArrayList <Estudiante> estudiante = new ArrayList<>();

    public ProyectoDeGrado() {
    }
    
    

    public ProyectoDeGrado(String alcance, int costo, String objetivo, String planDeProyecto, int tiempoDeRealizacion, String titulo, int viabilidad, Soluciones soluciones, Estudiante estudiante) {
        this.alcance = alcance;
        this.costo = costo;
        this.objetivo = objetivo;
        this.planDeProyecto = planDeProyecto;
        this.tiempoDeRealizacion = tiempoDeRealizacion;
        this.titulo = titulo;
        this.viabilidad = viabilidad;
        this.soluciones = soluciones;
        this.estudiante.add(estudiante);
    }

   

    
   
   
    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPlanDeProyecto() {
        return planDeProyecto;
    }

    public void setPlanDeProyecto(String planDeProyecto) {
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() {
        return tiempoDeRealizacion;
    }

    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViabilidad() {
        return viabilidad;
    }

    public void setViabilidad(int viabilidad) {
        this.viabilidad = viabilidad;
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public Soluciones getSoluciones() {
        return soluciones;
    }

    public void setSoluciones(Soluciones soluciones) {
        this.soluciones = soluciones;
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
    
    
     public String efectoPositivoEnRegion(){
    return "el efecto es positivo";}
    
    public String obtenerTituloProfesional(){
        return "ha obtenido el titulo esperado, felicitaciones!";
    }

    
}
