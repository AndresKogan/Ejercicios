/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio_noviembre_2014;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private List <MedioDeComunicacion> comunicaciones = new ArrayList<>();
    private List <Perfil> perfiles = new ArrayList<>();

    public Persona() {
    }
    
    

    public Persona(String nombre, String apellido, Foto foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public List<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(List<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
    
    public void setComunicaciones(MedioDeComunicacion comunicaciones) {
        this.comunicaciones.add(comunicaciones);
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    public void agregarPerfil(Perfil perfiles) {
        this.perfiles.add(perfiles);
    }
    
}
