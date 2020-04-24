/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diag_asoc_agreg;

import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Factura extends Comprobante {
    private float total;
    private Cliente cliente;
    private ArrayList<Producto> producto = new ArrayList<>();

    public Factura() {
        this.total = 0;
        this.cliente = cliente;
        this.producto= producto;
        
    }

       

    public Factura(float total, Cliente cliente, char tipo, int numero, Fecha fecha, Producto producto) {
        super(tipo, numero, fecha);
        this.total = total;
        this.cliente = cliente;
        this.producto.add(producto);
    }

    

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    public void setProducto(Producto producto) {
        this.producto.add(producto);
    }

  

    
   
    
    
}
