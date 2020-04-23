/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_noviembre_2014;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Factura {
    private Empleado emp = new Empleado() ;
    private Cliente clie = new Cliente(); 
    private int nro_Factura;
    private Date fecha;
    private double monto;

    public Factura() {
       
    }

    public Factura(int nro_Factura, Date fecha, double monto) {
      
        this.nro_Factura = nro_Factura;
        this.fecha = fecha;
        this.monto = monto;
    }

    
    

      

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
