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
public class Diag_asoc_comp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        Recibo recibo = new Recibo(454, "tornillos", 'C', 450);
                Recibo recibo2 = new Recibo();
        
        recibo.getFecha().setAnio(2020);
         recibo.getFecha().setMes(3);
          recibo.getFecha().setDia(4);
          recibo.setTipo('B');
          recibo.setNumero(546);
          recibo.getProveedor().setCodigo(456);
          recibo.getProveedor().setRazonSocial("La casa del pantalón");
          recibo.setTotal(45655);
          recibo.setDetalle("150 pantalones");
          recibo2.getProveedor().setRazonSocial("Pantalón City");
          
          
        System.out.println("Factura por el Recibo nro "+recibo.getNumero()+" proveedor "+recibo.getProveedor().getRazonSocial());  
        
        System.out.println("por un total de "+ recibo.getTotal()+" pesos de moneda nacional a cambio de "+ recibo.getDetalle()+ " de primera marca");
        System.out.println("la fecha de el recibo es "+ recibo.getFecha().getDia()+"/"+recibo.getFecha().getMes()+"/"+recibo.getFecha().getAnio());
        
        System.out.println("la otra compra fue hecha a: " +recibo2.getProveedor().getRazonSocial());
    }
    
}
