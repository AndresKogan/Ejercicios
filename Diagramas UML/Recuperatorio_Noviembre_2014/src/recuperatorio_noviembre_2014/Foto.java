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
public class Foto {
    private String pathToFile;
    private String nombre;
    private float tamaño;

    public Foto() {
    }
    
    

    public Foto(String pathToFile, String nombre, float tamaño) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
