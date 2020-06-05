/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VistaCalculadora;
import Modelo.Modelo;

/**
 *
 * @author Usuario
 */
public class CalculadoraMVC {


    public static void main(String[] args) {
        
     VistaCalculadora vista = new VistaCalculadora();
     Modelo modelo = new Modelo();
     Controlador controlador = new Controlador(vista, modelo);
     
     
     
     
    }
    
}
