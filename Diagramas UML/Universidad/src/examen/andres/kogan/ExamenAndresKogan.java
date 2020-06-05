/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.andres.kogan;

/**
 *
 * @author Usuario
 */
public class ExamenAndresKogan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Soluciones soluciones = new Soluciones();
        ProyectoDeGrado proyectoDeGrado = new ProyectoDeGrado();
        EjecucionDelProyecto ejecucionDelProyecto = new EjecucionDelProyecto();
        PersonalDocente personalDocente = new PersonalDocente();
        RecoleccionDeInformacion recoleccionDeInformacion = new RecoleccionDeInformacion("lo que comenta la getne en internet", "formularios a ser llenados", (byte) (45));
        Estudiante estudiante = new Estudiante("Jose Romero", 5, proyectoDeGrado, ejecucionDelProyecto, soluciones, personalDocente);
        Universidad universidad = new Universidad("El lugar del estudio", "Ingenieria en programación", "Mendoza", "UTN", estudiante, personalDocente, recoleccionDeInformacion);
        Region region = new Region("clase media", "intermedio", "alto", "godoy cruz");
        Necesidades necesidades = new Necesidades("menos horas de cursado", recoleccionDeInformacion);

        estudiante.setUniversidad(universidad);
        estudiante.getUniversidad().get(0).setDiferentesCarreras("Ingenieria");
        System.out.println("el estudiante estudia en la universdiad de: " + estudiante.getUniversidad().get(0).getDiferentesCarreras());

        estudiante.getUniversidad().get(0).setRegion(region);
        estudiante.getUniversidad().get(0).getRegion().get(0).setNecesidades(necesidades);
        System.out.println("Los estudiantes expresaron necesidades del tipo: " + estudiante.getUniversidad().get(0).getRegion().get(0).getNecesidades().get(0).insatisfaccion());
        estudiante.getProyectoDeGrado().setAlcance("jovenes de Godoy Cruz");
        estudiante.getProyectoDeGrado().setCosto(10000);
        estudiante.getProyectoDeGrado().setObjetivo("Conocer mejor la elección educativa de los jovenes de Godoyu Cruz");
        estudiante.getProyectoDeGrado().setTitulo("La elecciónes educativas de los jovenes en Godoy Cruz");

        System.out.println("El titulo de el proyecto es: " + estudiante.getProyectoDeGrado().getTitulo());
        System.out.println("Los efectos logrados fueron " + estudiante.getProyectoDeGrado().getEjecucionDelProyecto().getResultados().efectosPositivosyNegativos() + " estudiantes inscriptos");
        estudiante.getUniversidad().get(0).getRecoleccionDeInformacion().get(0).setDatosDeLosAfectados("1580");
        estudiante.getUniversidad().get(0).getRecoleccionDeInformacion().get(0).setDatosDeLosDirectamenteInterezados("3005");
        System.out.println("Los joveneres afectados fueron: " + estudiante.getUniversidad().get(0).getRecoleccionDeInformacion().get(0).getDatosDeLosAfectados());
        System.out.println("Los jovenes interesados fueron: " + estudiante.getUniversidad().get(0).getRecoleccionDeInformacion().get(0).getDatosDeLosDirectamenteInterezados());
        PersonalDocente profesor1 = new PersonalDocente("Roberto Boniano", "experto en estadísticas", "5 años de experiencia", 5, estudiante, ejecucionDelProyecto);
        PersonalDocente profesor2 = new PersonalDocente("Matias Albertario", "experto en epistemología", "3 años de experiencia", 2, estudiante, ejecucionDelProyecto);

        estudiante.setPersonalDocente(profesor1);
        estudiante.setPersonalDocente(profesor2);
        System.out.println("el primer docente asignado al estudiante es " + estudiante.getPersonalDocente().get(1).getNombre() + " que es " + estudiante.getPersonalDocente().get(1).getConocimiento() + " y cuenta con " + estudiante.getPersonalDocente().get(1).getExperiencia());
        System.out.println("el segundo docente asignado al estudiante es " + estudiante.getPersonalDocente().get(2).getNombre() + " que es " + estudiante.getPersonalDocente().get(2).getConocimiento() + " y cuenta con " + estudiante.getPersonalDocente().get(2).getExperiencia());

    }

}
