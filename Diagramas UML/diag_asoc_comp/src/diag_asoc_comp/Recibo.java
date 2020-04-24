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
public class Recibo extends Comprobante {
    private Proveedor proveedor = new Proveedor();
    private float total;
    private String detalle;

    public Recibo() {
        
    }

    

    public Recibo(float total, String detalle, char tipo, int numero) {
        super(tipo, numero);
        
        this.total = total;
        this.detalle = detalle;
    }
    

   
    

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    
}
