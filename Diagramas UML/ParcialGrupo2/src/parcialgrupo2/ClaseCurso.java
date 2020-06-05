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
public class ClaseCurso {
    private long idSesionCruso;
    private long fechaCurso;
    private long idCurso;
    private String ubicacionCurso;
    private Empleado Empleado;

    public ClaseCurso(long idSesionCruso, long fechaCurso, long idCurso, String ubicacionCurso, Empleado Empleado) {
        this.idSesionCruso = idSesionCruso;
        this.fechaCurso = fechaCurso;
        this.idCurso = idCurso;
        this.ubicacionCurso = ubicacionCurso;
        this.Empleado = Empleado;
    }

    public long getIdSesionCruso() {
        return idSesionCruso;
    }

    public void setIdSesionCruso(long idSesionCruso) {
        this.idSesionCruso = idSesionCruso;
    }

    public long getFechaCurso() {
        return fechaCurso;
    }

    public void setFechaCurso(long fechaCurso) {
        this.fechaCurso = fechaCurso;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getUbicacionCurso() {
        return ubicacionCurso;
    }

    public void setUbicacionCurso(String ubicacionCurso) {
        this.ubicacionCurso = ubicacionCurso;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    
    public String infoSesionCurso() {
        return "ClaseCurso{" + "idSesionCruso=" + idSesionCruso + ", fechaCurso=" + fechaCurso + ", idCurso=" + idCurso + ", ubicacionCurso=" + ubicacionCurso + ",\n Empleado=" + Empleado + '}';
    }
    
    public void sesionCurso(){
        System.out.println("es la sesion del curso");}
    
}
