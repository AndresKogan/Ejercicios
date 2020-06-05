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
public class Recopilacion extends RecoleccionDeInformacion{
    
    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosDirectamenteInterezados, String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataFormaDeSoftware) {
        super(datosDeLosAfectados, datosDeLosDirectamenteInterezados, comentariosAbiertosEnLinea, formularioEnLinea, plataFormaDeSoftware);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public String getDatosMayorFavorabilidad() {
        return datosMayorFavorabilidad;
    }

    public void setDatosMayorFavorabilidad(String datosMayorFavorabilidad) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
    }

    public String getDatosMayorUrgencia() {
        return datosMayorUrgencia;
    }

    public void setDatosMayorUrgencia(String datosMayorUrgencia) {
        this.datosMayorUrgencia = datosMayorUrgencia;
    }
    
    public String filtrar (){
        return "se han recopilado todos los proyectos y filtrado los mejores";
    }
    public String priorizar(){
        return "se le dará prioridad a los alumnos del último año";
    }
    
    
}
