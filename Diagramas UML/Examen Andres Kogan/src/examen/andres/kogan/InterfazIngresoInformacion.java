/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.andres.kogan;

/**
 *
 * @author Usuario
 */
public class InterfazIngresoInformacion {
    private String comentariosAbiertosEnLinea;
    private String formularioEnLinea;
    private byte plataFormaDeSoftware;

    public InterfazIngresoInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataFormaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formularioEnLinea = formularioEnLinea;
        this.plataFormaDeSoftware = plataFormaDeSoftware;
    }

    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }

    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormularioEnLinea() {
        return formularioEnLinea;
    }

    public void setFormularioEnLinea(String formularioEnLinea) {
        this.formularioEnLinea = formularioEnLinea;
    }

    public byte getPlataFormaDeSoftware() {
        return plataFormaDeSoftware;
    }

    public void setPlataFormaDeSoftware(byte plataFormaDeSoftware) {
        this.plataFormaDeSoftware = plataFormaDeSoftware;
    }
    
    public String registroDeFormulario(){
    return "se ha registrado con exito";
    }
}
