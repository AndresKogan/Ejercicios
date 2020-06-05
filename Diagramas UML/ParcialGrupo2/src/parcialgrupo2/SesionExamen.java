/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupo2;

/**
 *
 * @author Usuario
 */
public class SesionExamen {
    private long sesionExamen;
    private String ubicacionExamen;
    private long fecha;
    private Examen examen;

    public SesionExamen() {
    }

    public SesionExamen(long sesionExamen, String ubicacionExamen, long fecha, Examen examen) {
        this.sesionExamen = sesionExamen;
        this.ubicacionExamen = ubicacionExamen;
        this.fecha = fecha;
        this.examen = examen;
    }

    public long getSesionExamen() {
        return sesionExamen;
    }

    public void setSesionExamen(long sesionExamen) {
        this.sesionExamen = sesionExamen;
    }

    public String getUbicacionExamen() {
        return ubicacionExamen;
    }

    public void setUbicacionExamen(String ubicacionExamen) {
        this.ubicacionExamen = ubicacionExamen;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    
    public String infoSesionExamen() {
        return "SesionExamen{" + "sesionExamen=" + sesionExamen + ", ubicacionExamen=" + ubicacionExamen + ", fecha=" + fecha + ", examen=" + examen + '}';
    }
    
    
    
}
