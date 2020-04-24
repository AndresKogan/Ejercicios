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
public class Contacto extends Persona {
    private int idContacto;
    private ContactoTipo tipo;
    private ArrayList<ContactoDomicilio> domicilios = new ArrayList<>();
    private ArrayList<ContactoTelefono> telefonos = new ArrayList<>();

    public Contacto(int idContacto, ContactoTipo tipo, String nombre, String apellido, int idPersona) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public ContactoTipo getTipo() {
        return tipo;
    }

    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(ArrayList<ContactoDomicilio> domicilios) {
        this.domicilios = domicilios;
    }
    
    public void setDomicilios(ContactoDomicilio domicilios) {
        this.domicilios.add(domicilios);
    }

    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<ContactoTelefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    public void setTelefonos(ContactoTelefono telefonos) {
        this.telefonos.add(telefonos);
    }
    
    
    
    
}
