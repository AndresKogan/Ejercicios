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
public class RecoleccionDeInformacion extends InterfazIngresoInformacion{
    private String datosDeLosAfectados;
    private String datosDeLosDirectamenteInterezados;

    public RecoleccionDeInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataFormaDeSoftware) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataFormaDeSoftware);
    }
    
    
  

    public RecoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosDirectamenteInterezados, String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataFormaDeSoftware) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataFormaDeSoftware);
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosDirectamenteInterezados = datosDeLosDirectamenteInterezados;
    }

    public String getDatosDeLosAfectados() {
        return datosDeLosAfectados;
    }

    public void setDatosDeLosAfectados(String datosDeLosAfectados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
    }

    public String getDatosDeLosDirectamenteInterezados() {
        return datosDeLosDirectamenteInterezados;
    }

    public void setDatosDeLosDirectamenteInterezados(String datosDeLosDirectamenteInterezados) {
        this.datosDeLosDirectamenteInterezados = datosDeLosDirectamenteInterezados;
    }

  
    
    public String conocer(){
    return "Información de la recolección";}
}
