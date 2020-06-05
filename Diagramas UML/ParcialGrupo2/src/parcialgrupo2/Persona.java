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
public class Persona {

    private long idPersona;
    private String apellidos;
    private String nombres;
    private char inicialMedia;
    private String calle;
    private String CP;
    private String provincia;
    private String direccionElect;

    public Persona() {
    }
    
    

    public Persona(long idPersona, String apellidos, String nombres, char inicialMedia, String calle, String CP, String provincia, String direccionElect) {
        this.idPersona = idPersona;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.inicialMedia = inicialMedia;
        this.calle = calle;
        this.CP = CP;
        this.provincia = provincia;
        this.direccionElect = direccionElect;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getInicialMedia() {
        return inicialMedia;
    }

    public void setInicialMedia(char inicialMedia) {
        this.inicialMedia = inicialMedia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccionElect() {
        return direccionElect;
    }

    public void setDireccionElect(String direccionElect) {
        this.direccionElect = direccionElect;
    }

    
    public String infoPersona() {
        return "Persona{" + "idPersona=" + idPersona + ", apellidos=" + apellidos + ", nombres=" + nombres + ", inicialMedia=" + inicialMedia + ", calle=" + calle + ", CP=" + CP + ", provincia=" + provincia + ", direccionElect=" + direccionElect + '}';
    }

    
}
