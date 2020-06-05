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
public class Examen {
    private long idExamen;
    private long nivelCertificacion;

    public Examen() {
    }

    
    
    public Examen(long idExamen, long nivelCertificacion) {
        this.idExamen = idExamen;
        this.nivelCertificacion = nivelCertificacion;
    }

    public long getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(long idExamen) {
        this.idExamen = idExamen;
    }

    public long getNivelCertificacion() {
        return nivelCertificacion;
    }

    public void setNivelCertificacion(long nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }

    
    public String infoExamen() {
        return "Examen{" + "idExamen=" + idExamen + ", nivelCertificacion=" + nivelCertificacion + '}';
    }
    
    
    
}
