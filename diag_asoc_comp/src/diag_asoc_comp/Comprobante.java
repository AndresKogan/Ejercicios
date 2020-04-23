/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diag_asoc_comp;

/**
 *
 * @author Usuario
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha =new Fecha();

    public Comprobante() {
       
    }

    
    public Comprobante(char tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
        
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
}
