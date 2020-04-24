/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona{
   
    
    private int idUsuario;
    private String usuario;
    private String password;
    private ArrayList<Contacto> contacto = new ArrayList<Contacto>();

    public Usuario(int idUsuario, String usuario, String password, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contacto> getContacto() {
        return contacto;
    }

    public void setContacto(ArrayList<Contacto> contacto) {
        this.contacto = contacto;
        
    }
    public void setContacto(Contacto contacto) {
        this.contacto.add(contacto);
        
    }
    
    
    
}
