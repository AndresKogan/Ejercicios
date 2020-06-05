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
public class CambioEstadoPermitido {
    private char deEstado;
    private char aEstado;

    public CambioEstadoPermitido() {
    }

    public CambioEstadoPermitido(char deEstado, char aEstado) {
        this.deEstado = deEstado;
        this.aEstado = aEstado;
    }

    public char getDeEstado() {
        return deEstado;
    }

    public void setDeEstado(char deEstado) {
        this.deEstado = deEstado;
    }

    public char getaEstado() {
        return aEstado;
    }

    public void setaEstado(char aEstado) {
        this.aEstado = aEstado;
    }

    
    public String infoCambioEstado() {
        return "CambioEstadoPermitido{" + "deEstado=" + deEstado + ", aEstado=" + aEstado + '}';
    }
    
}
