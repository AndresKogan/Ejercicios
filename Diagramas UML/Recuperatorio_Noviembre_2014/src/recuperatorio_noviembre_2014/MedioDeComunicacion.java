/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio_noviembre_2014;

/**
 *
 * @author Usuario
 */
public class MedioDeComunicacion {
    private String descripcion;
    private TipoMedio tipoMedio= new TipoMedio();

    public MedioDeComunicacion() {
    }
    
    

    public MedioDeComunicacion(String descripcion) {
        this.descripcion = descripcion;
        
        
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    
    
}
