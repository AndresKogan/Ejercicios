/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

/**
 *
 * @author Usuario
 */
public class DiagramaDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Usuario usuario = new Usuario(1456, "Mauricoma", "clavedificil", "Maricio", "Comali", 28847294);
       
       ContactoTipo contactoTipo = new ContactoTipo(4564, "Vendedor");
       Contacto contacto = new Contacto(4564, contactoTipo, "Ruben", "Darío", 4545);
       
       usuario.setContacto(contacto);
       usuario.getContacto().get(0).getTipo().setDescripcion("Vendedor y contratista");
       ContactoDomicilio domicilio = new ContactoDomicilio(456, "olascoaga");
       usuario.getContacto().get(0).setDomicilios(domicilio);
     
        System.out.println("El usuario "+ usuario.getNombre()+" "+usuario.getApellido()+ " llego a nosotros a travez de "+usuario.getContacto().get(0).getNombre()+" "+usuario.getContacto().get(0).getApellido()+" que es el "+usuario.getContacto().get(0).getTipo().getDescripcion()+" nro "+usuario.getContacto().get(0).getTipo().getIdContactoTipo());
        System.out.println("para contactarse con él se lo puede llamar a "+usuario.getContacto().get(0).getDomicilios().get(0).getDescripcion()+" "+usuario.getContacto().get(0).getDomicilios().get(0).getIdContactoDomicilio());
}}
