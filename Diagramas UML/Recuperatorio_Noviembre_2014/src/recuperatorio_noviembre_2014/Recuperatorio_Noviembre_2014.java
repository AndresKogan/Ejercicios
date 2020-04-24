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
public class Recuperatorio_Noviembre_2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foto fotoMafia = new Foto("poraca", "Vito", 1080);
        Mafioso mafioso = new Mafioso("Corleone", "Vito", fotoMafia);
        Foto fotoDetective = new Foto("ees", "Elliot", 1080);

        Detective detective = new Detective("4516", "Elliot", "Ness", fotoDetective);
        Lugar lugar = new Lugar("Chicago");
        lugar.getDireccion().setCalle("direccionfalsa");
        lugar.getDireccion().setNumero(465);
        mafioso.agregarLugar(lugar);
        MedioDeComunicacion tele = new MedioDeComunicacion("Radio");
        tele.getTipoMedio().setTipo("Motorola");
        tele.getTipoMedio().setNombre("WalkieTalkie");
        mafioso.setComunicaciones(tele);
        Perfil perfil = new Perfil(454, "incorruptible");
        detective.agregarPerfil(perfil);
        
        System.out.println("El detective "+detective.getNombre()+" "+detective.getApellido()+" investiga a "+mafioso.getNombre()+" "+mafioso.getApellido()+" en lugares como "+mafioso.getLugaresFrecuentes().get(0).getNombre()+" en la dirección"+ mafioso.getLugaresFrecuentes().get(0).getDireccion().getCalle()+" "+mafioso.getLugaresFrecuentes().get(0).getDireccion().getNumero());
        System.out.println("Para investigarlo va a intervenir el "+ mafioso.getComunicaciones().get(0).getTipoMedio().getNombre()+ " que es de marca "+ mafioso.getComunicaciones().get(0).getTipoMedio().getTipo() );
        
        

        
    }

}
