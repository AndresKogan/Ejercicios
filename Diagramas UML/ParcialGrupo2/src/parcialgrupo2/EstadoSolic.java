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
public class EstadoSolic {
    private char codigoEstado;
    private String nombreEstado;

    public EstadoSolic() {
    }
    
    

    public EstadoSolic(char codigoEstado, String nombreEstado) {
        this.codigoEstado = codigoEstado;
        this.nombreEstado = nombreEstado;
    }

    public char getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(char codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    
    public String infoEstadoSolic() {
        return "EstadoSolic{" + "codigoEstado=" + codigoEstado + ", nombreEstado=" + nombreEstado + '}';
    }
    
    
}
