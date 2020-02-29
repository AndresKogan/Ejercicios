package retomando;

import java.util.ArrayList;
import java.util.List;
class DDJJStockAgroquimico{
    
    
  private int anioDeclaracion;
  private int mesDeclaracion;
  private String empresa;
  private long cuit;
  private double total;
  private String [][]  agroquimicos = {{"1000","2EC JEBAGRO", "A"} , {"1001"," D 60 GREEN CROPS" , "V"} , {"1002"," ESTER 97", "A"} , {"1003"," AMINA ICONA SL", "A"} , {"1004"," ABAMECTINA AGRO", "A"},{"1005"," FURACARB 31 TS", "R"} , {"1006"," FURAFARM 48 F", "R"} , {"1007"," ACETOCLOR ASSA", "A"} , {"1008"," ACTIVE SIL", "V"} , {"1009"," ABRIGO PLUS", "V"}}; 
  
  private List<Long> parcelasAplicacion = new ArrayList<>();   

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String[][] getAgroquimicos() {
        return agroquimicos;
    }

    public void setAgroquimicos(String[][] agroquimicos) {
        this.agroquimicos = agroquimicos;
    }

    public List<Long> getParcelasAplicacion() {
        return parcelasAplicacion;
    }

    public void setParcelasAplicacion(List<Long> parcelasAplicacion) {
        this.parcelasAplicacion = parcelasAplicacion;
    }
    
    




}