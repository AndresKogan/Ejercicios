/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgrupo2;

/**
 *
 * @author Usuario
 */
public class ParcialGrupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("contador", 456, "contaduría", "evasión fiscal", "jefe", 456, "Contaduria General", "el señor Aguirre", "1557899654", 1981, 456460, "Ramirez Gutierrez", "Jose", 'M' , "Rivadavia", "5501", "Mendoza", "Godoy Cruz");
        ClaseCurso clase = new ClaseCurso(456, 2020, 1470, "Aula número 5", empleado);
        Solicitud solicitud = new Solicitud();
        Examen examen = new Examen(3997, 4);
        SesionExamen sesion = new SesionExamen(5, "factultad de economía", 2019, examen);
        Candidato candidato = new Candidato("La mercantil andina", "5 años", "Ecogás", "Triunfo Seguros", "Andesmar", 45, "Ramirez", "Pedro", 'B', "Olascoaga", "5501", "Mendoza", "Godoy cruz", solicitud);
        InscripcionCurso inscripcion = new InscripcionCurso(2019, 2021, 2020, clase, candidato);
        Prueba prueba = new Prueba(1234,sesion, candidato);
        EstadoSolic estadoSolic = new EstadoSolic('a',"Inicial");
        solicitud.setCandidato(candidato);
        solicitud.setEstadoSolic(estadoSolic);
        solicitud.setFechaSolicitud(2019);
        solicitud.setNivelCertificación(4);
        solicitud.setnProducto(4568);
        System.out.println(solicitud.getCandidato().getApellidos());
        
        
        System.out.println("El nombre del empleado es "+inscripcion.getClaseCurso().getEmpleado().getNombres()+" "+inscripcion.getClaseCurso().getEmpleado().getApellidos());
        System.out.println("se inscribió en el curso nro: "+ inscripcion.getClaseCurso().getIdCurso());
        System.out.println("el número de teléfono del empleado es: "+inscripcion.getClaseCurso().getEmpleado().getnMovil()+" la provincia "+inscripcion.getClaseCurso().getEmpleado().getProvincia()+" y el código postal "+inscripcion.getClaseCurso().getEmpleado().getCP());
        System.out.println(inscripcion.InfoInscripcionCurso());
        System.out.println("El examen que tomó el candidato fué el: "+ prueba.getSesionExamen().getExamen().getIdExamen());
        System.out.println("El nivel de certificación solicitado fue: "+  prueba.getSesionExamen().getExamen().getNivelCertificacion());
        System.out.println( prueba.getSesionExamen().getExamen().infoExamen());
    }

    }
    

