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
public class PersonalDocente {
private String nombre;
    private String conocimiento;
    private String experiencia;
    private int trayectoria;
    private ArrayList<Universidad> universidad = new ArrayList<>();
    private Estudiante estudiante;
    private EjecucionDelProyecto ejecucionDelProyecto;
    private ArrayList<Recopilacion> recopilacion = new ArrayList<>();

    public PersonalDocente() {
    }
    
    

    public PersonalDocente(String  nombre, String conocimiento, String experiencia, int trayectoria, Estudiante estudiante, EjecucionDelProyecto ejecucionDelProyecto) {
        this.nombre = nombre;
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
        this.estudiante = estudiante;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
    }

    public ArrayList<Universidad> getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ArrayList<Universidad> universidad) {
        this.universidad = universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad.add(universidad);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public ArrayList<Recopilacion> getRecopilacion() {
        return recopilacion;
    }

    public void setRecopilacion(ArrayList<Recopilacion> recopilacion) {
        this.recopilacion = recopilacion;
    }

    public void setRecopilacion(Recopilacion recopilacion) {
        if (this.recopilacion.isEmpty()) {
            this.recopilacion.add(recopilacion);}
        else {System.out.println("La recopilación ya tiene un elemento");
        
        }}
    public String evaluar (){
        return "evaluando al alumnado";
    }
    
    public String funcionDeSeguimiento(){
        return "el docente hará un seguimiento de los alumnos con dificultades";
    }
    public String gestion(){
        return "la gestión del docente se evaluara en su capacidad de trasmitir conocimientos";
    }
    public String orientar(){
        return "es obligación del docente orientar a los alumnos en la materia";
    }
        }

    
