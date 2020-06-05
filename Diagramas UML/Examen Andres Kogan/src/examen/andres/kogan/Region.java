/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.andres.kogan;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Region {

    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList <Universidad> universidad = new ArrayList<>();
    private ArrayList <Problemas> problemas = new ArrayList<>();
    private ArrayList <Necesidades> necesidades = new ArrayList<>();

    public Region(String aspectosSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public String getAspectosSocioCulturales() {
        return aspectosSocioCulturales;
    }

    public void setAspectosSocioCulturales(String aspectosSocioCulturales) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }

    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }

    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }

    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public ArrayList<Universidad> getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ArrayList<Universidad> universidad) {
        this.universidad = universidad;
    }
    
      public void setUniversidad( Universidad universidad) {
        this.universidad.add(universidad);
    }

    public ArrayList<Problemas> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<Problemas> problemas) {
        this.problemas = problemas;
    }
    public void setProblemas(Problemas problemas) {
        this.problemas.add(problemas);
    }
    
    
  

    public ArrayList <Necesidades> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(ArrayList <Necesidades> necesidades) {
        this.necesidades = necesidades;
    }
    
    public void setNecesidades(Necesidades necesidades) {
        this.necesidades.add(necesidades);
    }
    
    
  public String cotidianidad (){
    return "la vida diaria se desarrolla con normalidad";}
}
