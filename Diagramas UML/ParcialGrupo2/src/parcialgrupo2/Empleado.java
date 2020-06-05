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
public class Empleado extends Persona{
     private String tipoTrabajo;
     private long nOficina;
     private String departamento;
     private String division;
     private String cargo;
     private long informaA;
     private String jefeDpto;
     private String jefeDivision;
     private String nMovil;
     private long fechaNacimiento;

    public Empleado() {
    }

    public Empleado(String tipoTrabajo, long nOficina, String departamento, String division, String cargo, long informaA, String jefeDpto, String jefeDivision, String nMovil, long fechaNacimiento, long idPersona, String apellidos, String nombres, char inicialMedia, String calle, String CP, String provincia, String direccionElect) {
        super(idPersona, apellidos, nombres, inicialMedia, calle, CP, provincia, direccionElect);
        this.tipoTrabajo = tipoTrabajo;
        this.nOficina = nOficina;
        this.departamento = departamento;
        this.division = division;
        this.cargo = cargo;
        this.informaA = informaA;
        this.jefeDpto = jefeDpto;
        this.jefeDivision = jefeDivision;
        this.nMovil = nMovil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public long getnOficina() {
        return nOficina;
    }

    public void setnOficina(long nOficina) {
        this.nOficina = nOficina;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public long getInformaA() {
        return informaA;
    }

    public void setInformaA(long informaA) {
        this.informaA = informaA;
    }

    public String getJefeDpto() {
        return jefeDpto;
    }

    public void setJefeDpto(String jefeDpto) {
        this.jefeDpto = jefeDpto;
    }

    public String getJefeDivision() {
        return jefeDivision;
    }

    public void setJefeDivision(String jefeDivision) {
        this.jefeDivision = jefeDivision;
    }

    public String getnMovil() {
        return nMovil;
    }

    public void setnMovil(String nMovil) {
        this.nMovil = nMovil;
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(long fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public String infoEmpleado() {
        return "Empleado{" + "tipoTrabajo=" + tipoTrabajo + ", nOficina=" + nOficina + ", departamento=" + departamento + ", division=" + division + ", cargo=" + cargo + ", informaA=" + informaA + ", jefeDpto=" + jefeDpto + ", jefeDivision=" + jefeDivision + ", nMovil=" + nMovil + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
     
     public void obtenerEdad(){
         System.out.println("la edad del empleado es adecuada" );
         
     }
     
    
    
}
