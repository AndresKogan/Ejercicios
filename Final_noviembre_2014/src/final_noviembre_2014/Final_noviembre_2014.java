/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_noviembre_2014;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Final_noviembre_2014 {

    public static void main(String[] args) {

        Date fecha = new Date(2019, 05, 10);
        Date fechaTarjeta = new Date(2025, 04, 10);
        Factura factura = new Factura(5460, fecha, 4540);

        factura.getClie().setApellido("Fernandez");
        factura.getClie().setNombre("Ruben");
        Tarjeta_de_Credito tarjeta = new Tarjeta_de_Credito(fechaTarjeta, 15000);
        factura.getClie().setCredit_car(tarjeta);
        factura.getClie().setDni(28478975);
        factura.getClie().setCuit(2028478794);
        factura.getEmp().setApellido("Ramirez");
        factura.getEmp().setNombre("Fernando");
        factura.getEmp().setDni(546540);
        factura.getEmp().setCuit(464654440);
        
        System.out.println("La factura nro "+factura.getNro_Factura()+ " de monto "+factura.getMonto()+"$ fue realizada por " + factura.getEmp().getNombre()+" "+factura.getEmp().getApellido()+ " para el cliente " +factura.getClie().getNombre()+" "+factura.getClie().getApellido()+" el día "+ factura.getFecha()+" el cliente pagó con tarjeta cuyo limite es " + factura.getClie().getCredit_car().get(0).getLimite()+"$" );
    }

}
