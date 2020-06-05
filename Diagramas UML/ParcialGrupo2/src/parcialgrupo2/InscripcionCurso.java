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
public class InscripcionCurso {
     private long fechaInscripcionCurso;
    private long marcaFinalizacion;
    private long fechaConfirmada;
    private ClaseCurso claseCurso;
    private Candidato candidato;

    public InscripcionCurso() {
    }
    
    
    public InscripcionCurso(long fechaInscripcionCurso, long marcaFinalizacion, long fechaConfirmada, ClaseCurso claseCurso, Candidato candidato) {
        this.fechaInscripcionCurso = fechaInscripcionCurso;
        this.marcaFinalizacion = marcaFinalizacion;
        this.fechaConfirmada = fechaConfirmada;
        this.claseCurso = claseCurso;
        this.candidato = candidato;
    }

    public long getFechaInscripcionCurso() {
        return fechaInscripcionCurso;
    }

    public void setFechaInscripcionCurso(long fechaInscripcionCurso) {
        this.fechaInscripcionCurso = fechaInscripcionCurso;
    }

    public long getMarcaFinalizacion() {
        return marcaFinalizacion;
    }

    public void setMarcaFinalizacion(long marcaFinalizacion) {
        this.marcaFinalizacion = marcaFinalizacion;
    }

    public long getFechaConfirmada() {
        return fechaConfirmada;
    }

    public void setFechaConfirmada(long fechaConfirmada) {
        this.fechaConfirmada = fechaConfirmada;
    }

    public ClaseCurso getClaseCurso() {
        return claseCurso;
    }

    public void setClaseCurso(ClaseCurso claseCurso) {
        this.claseCurso = claseCurso;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String InfoInscripcionCurso() {
        return "Inscripci\u00f3nCurso{" + "fechaInscripcionCurso=" + fechaInscripcionCurso + ", marcaFinalizacion=" + marcaFinalizacion + ", fechaConfirmada=" + fechaConfirmada + ", \n claseCurso=" + claseCurso.infoSesionCurso() + ", \n candidato=" + candidato.infoCandidato()+ '}';
    }
    
    
    
    
    
}

