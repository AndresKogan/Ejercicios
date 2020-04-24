/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diag_asoc_agreg;

/**
 *
 * @author Usuario
 */
public class Diag_asoc_agreg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Fecha hoy = new Fecha(14, 04, 1981);
      Cliente cliente = new Cliente(95, "la casa del tornillo");
      Producto producto = new Producto(358, "tornillos largos", 40);
      Factura factura = new Factura(1600, cliente, 'B', 456, hoy, producto);
      
        System.out.println("estamos vendiendo " + factura.getProducto().get(0).getDescripcion()+ " a el cliente "+ factura.getCliente().getRazonSocial());
        System.out.println("la fecha de la factura es "+ factura.getFecha().getDia()+"/"+factura.getFecha().getMes()+"/"+factura.getFecha().getAnio()+" el nro "+ factura.getNumero()+" es de tipo "+factura.getTipo()+" y el total es de "+factura.getTotal()+"$");
   
      
        
        
        
        
    }
    
}
