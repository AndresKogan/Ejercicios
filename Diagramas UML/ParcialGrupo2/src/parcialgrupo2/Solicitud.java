/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupo2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Solicitud {
    
    private long nProducto;
    private long nivelCertificación;
    private long fechaSolicitud;
    private Candidato candidato;
    private EstadoSolic estadoSolic;
    private ArrayList <CambioEstadoPermitido> cambioEstadoPermitido = new ArrayList<>();

    public Solicitud() {
    }

    public Solicitud(long nProducto, long nivelCertificación, long fechaSolicitud, Candidato candidato, EstadoSolic estadoSolic, CambioEstadoPermitido cambioEstadoPermitido) {
        this.nProducto = nProducto;
        this.nivelCertificación = nivelCertificación;
        this.fechaSolicitud = fechaSolicitud;
        this.candidato = candidato;
        this.estadoSolic = estadoSolic;
        this.cambioEstadoPermitido.add(cambioEstadoPermitido);
    }
    
    


    public long getnProducto() {
        return nProducto;
    }

    public void setnProducto(long nProducto) {
        this.nProducto = nProducto;
    }

    public long getNivelCertificación() {
        return nivelCertificación;
    }

    public void setNivelCertificación(long nivelCertificación) {
        this.nivelCertificación = nivelCertificación;
    }

    public long getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(long fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public EstadoSolic getEstadoSolic() {
        return estadoSolic;
    }

    public void setEstadoSolic(EstadoSolic estadoSolic) {
        this.estadoSolic = estadoSolic;
    }

    public ArrayList<CambioEstadoPermitido> getCambioEstadoPermitido() {
        return cambioEstadoPermitido;
    }

    public void setCambioEstadoPermitido(ArrayList<CambioEstadoPermitido> cambioEstadoPermitido) {
        this.cambioEstadoPermitido = cambioEstadoPermitido;
    }
    
    public void setCambioEstadoPermitido(CambioEstadoPermitido cambioEstadoPermitido) {
        this.cambioEstadoPermitido.add(cambioEstadoPermitido);
    }

    
    public String infoSolicitud() {
        return "Solicitud{" + "nProducto=" + nProducto + ", nivelCertificaci\u00f3n=" + nivelCertificación + ", fechaSolicitud=" + fechaSolicitud + ", candidato=" + candidato + ", estadoSolic=" + estadoSolic + ", cambioEstadoPermitido=" + cambioEstadoPermitido + '}';
    }
    
    


    
    
    
}
