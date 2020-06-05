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
public class Candidato extends Persona {

    private String trabajaParaCompania;
    private String experiencia;
    private String referencia1;
    private String referencia2;
    private String referencia3;
    private ArrayList <Solicitud> solicitud = new ArrayList <>();

    public Candidato() {
    }

    public Candidato(String trabajaParaCompania, String experiencia, String referencia1, String referencia2, String referencia3, long idPersona, String apellidos, String nombres, char inicialMedia, String calle, String CP, String provincia, String direccionElect, Solicitud solicitud) {
        super(idPersona, apellidos, nombres, inicialMedia, calle, CP, provincia, direccionElect);
        this.trabajaParaCompania = trabajaParaCompania;
        this.experiencia = experiencia;
        this.referencia1 = referencia1;
        this.referencia2 = referencia2;
        this.referencia3 = referencia3;
        this.solicitud.add(solicitud);
    }

   

    public String getTrabajaParaCompania() {
        return trabajaParaCompania;
    }

    public void setTrabajaParaCompania(String trabajaParaCompania) {
        this.trabajaParaCompania = trabajaParaCompania;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
    }

    public String getReferencia3() {
        return referencia3;
    }

    public void setReferencia3(String referencia3) {
        this.referencia3 = referencia3;
    }

    public ArrayList<Solicitud> getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(ArrayList<Solicitud> solicitud) {
        this.solicitud = solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud.add(solicitud);
    }
    
    public String infoCandidato() {
        return "Candidato{" + "trabajaParaCompania=" + trabajaParaCompania + ", experiencia=" + experiencia + ", referencia1=" + referencia1 + ", referencia2=" + referencia2 + ", referencia3=" + referencia3 + ",\n solicitud=" + solicitud + '}';
    }
    
    
    
    public void realizarSolicitud () {
        System.out.println("nos interesa este candidato");
    }

}
