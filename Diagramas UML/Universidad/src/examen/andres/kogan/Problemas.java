/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.andres.kogan;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Problemas {
     private String definir;
     private ArrayList <InterfazIngresoInformacion> interfazIngresoInformacion= new ArrayList<>();
    
     
     
     

    public Problemas(String definir, InterfazIngresoInformacion interfazIngresoInformacion) {
        this.definir = definir;
        this.interfazIngresoInformacion.add(interfazIngresoInformacion);
    }

    public String getDefinir() {
        return definir;
    }

    public void setDefinir(String definir) {
        this.definir = definir;
    }

    public ArrayList<InterfazIngresoInformacion> getInterfazIngresoInformacion() {
        return interfazIngresoInformacion;
    }

    public void setInterfazIngresoInformacion(ArrayList<InterfazIngresoInformacion> interfazIngresoInformacion) {
        this.interfazIngresoInformacion = interfazIngresoInformacion;
    }
        public void setInterfazIngresoInformacion(InterfazIngresoInformacion interfazIngresoInformacion) {
        this.interfazIngresoInformacion.add(interfazIngresoInformacion);
    }

       
    public String efectosIndeseables(){
        return "los probemas son estos";}
    
     
     
     
     
    }
    

