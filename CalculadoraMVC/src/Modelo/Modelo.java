/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
    
    
    
    public String operaciones(String numero1,String numero2, String operacion) {
        try {
            

            if (numero1.length() == 0 || numero1.isEmpty() || numero1 == null) {
               return "Datos ingresados incorrectamente en el campo número 1";
            } 
            
            else if (numero2.length() == 0 || numero2.isEmpty() || numero2 == null) {
               return "Datos ingresados incorrectamente en el campo número 2";
            }
            
            else {
                
                String error = "";

                float a = Float.valueOf(numero1);
                float b = Float.valueOf(numero2);
                float resultado=0;

                switch (operacion) {
                    case "+":
                        resultado = a + b;
                        break;
                    case "-":
                        resultado = a - b;
                        break;
                    case "*":
                        resultado = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            error = "no se puede realizar división en 0";
                        } else {
                            resultado = a / b;
                        }
                        break;
                    default:
                    { error = "debe ingresar un signo valido: \"+\", \"-\", \"*\" o \"/ \"";
                    }   
                    

                }
                if (error.equals("")){
                    return String.valueOf(resultado);
                }
                else {return error;}

            }}
                catch (Exception e){
                        return "Debe solo ingresar números";
                       
                        }}

}
