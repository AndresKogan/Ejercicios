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
public class Prueba {
    private long testScore;
    private SesionExamen sesionExamen;
    private Candidato candidato;

    public Prueba() {
    }

    public Prueba(long testScore, SesionExamen sesionExamen, Candidato candidato) {
        this.testScore = testScore;
        this.sesionExamen = sesionExamen;
        this.candidato = candidato;
    }

    public long getTestScore() {
        return testScore;
    }

    public void setTestScore(long testScore) {
        this.testScore = testScore;
    }

    public SesionExamen getSesionExamen() {
        return sesionExamen;
    }

    public void setSesionExamen(SesionExamen sesionExamen) {
        this.sesionExamen = sesionExamen;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    
    public String infoPrueba() {
        return "Prueba{" + "testScore=" + testScore + ", sesionExamen=" + sesionExamen + ", candidato=" + candidato + '}';
    }
    
    
    
}
