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
public class Universidad {
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    private ArrayList <Estudiante> estudiante = new ArrayList<>();
    private ArrayList <PersonalDocente> personalDocente = new ArrayList<>();
    private ArrayList <Region> region = new ArrayList<>();
    private ArrayList <RecoleccionDeInformacion> recoleccionDeInformacion = new ArrayList<>();

    public Universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica, Estudiante estudiante, PersonalDocente personalDocente, RecoleccionDeInformacion recoleccionDeInformacion) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
        this.estudiante.add(estudiante);
        this.personalDocente.add(personalDocente);
        this.recoleccionDeInformacion.add(recoleccionDeInformacion);
    }

    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }

    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }

    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
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

    public ArrayList<Region> getRegion() {
        return region;
    }

    public void setRegion(ArrayList<Region> region) {
        this.region = region;
    }
    public void setRegion(Region region) {
        this.region.add(region);
    }

    public ArrayList<RecoleccionDeInformacion> getRecoleccionDeInformacion() {
        return recoleccionDeInformacion;
    }

    public void setRecoleccionDeInformacion(ArrayList<RecoleccionDeInformacion> recoleccionDeInformacion) {
        this.recoleccionDeInformacion = recoleccionDeInformacion;
    }
    
    public void setRecoleccionDeInformacion(RecoleccionDeInformacion recoleccionDeInformacion) {
        this.recoleccionDeInformacion.add(recoleccionDeInformacion);
    }
    
    public String ayudarSociedad(){
        return "la universidad ayuda a la comunidad";
    }
    public void capacitarEstudiantes(){
        System.out.println("los estudiantes están siendo capacitados");
    }
    public String desarrollo(){
        return "los estudiantes se desarrollan al estudiar";
    }
    public String investigacion(){
        return "los estudiantes de dedican a proyectos de investigación";
    }
    
    
    
    
}
