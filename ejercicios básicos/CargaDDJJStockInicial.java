/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retomando;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CargaDDJJStockInicial {

    public static void main(String[] args) {

        DDJJStockAgroquimico producto = new DDJJStockAgroquimico();
        cargoDatos(producto);

        String[][] detalleDDJJ = new String[10][6];
        int linea = 0;
        boolean encuentroCodigo = false;
        boolean cargoAgroquimico = false;
        boolean cargoParcela = false;
        double sumatoria = 0;

        while (true) {

            System.out.println("Ingrese el código del agroquímico o ingrese 000 para finalizar");
            String codigo = new Scanner(System.in).nextLine();

            if (codigo.equals("000") && linea != 0) {
                break;
            } else if (codigo.equals("000") && linea == 0) {
                System.out.println("Debe ingresar al menos un agroquímico");
                continue;
            }
            if (linea > 9) {
                System.out.println("El límite de 10 agroquímicos ha sido alcanzado. Ingrese 000 para terminar el proceso");
                continue;
            }
            if (linea > 9) {
                System.out.println("El límite de 10 agroquímicos ha sido alcanzado. Ingrese 000 para terminar el proceso");
                continue;
            }
            for (int i = 0; i < producto.getAgroquimicos().length; i++) {

                if (codigo.equals(producto.getAgroquimicos()[i][0])) {
                    encuentroCodigo = true;
                    detalleDDJJ[linea][0] = producto.getAgroquimicos()[i][0];
                    detalleDDJJ[linea][1] = producto.getAgroquimicos()[i][2];
                    detalleDDJJ[linea][2] = String.valueOf(valorDoble(producto));

                    detalleDDJJ[linea][3] = String.valueOf(cantidad(producto));

                    detalleDDJJ[linea][4] = String.valueOf(Double.parseDouble(detalleDDJJ[linea][2]) * Double.parseDouble(detalleDDJJ[linea][3]));
                    System.out.println("Ingrese el número de lote del agroquímico");

                    detalleDDJJ[linea][5] = String.valueOf(new Scanner(System.in).nextInt());

                    if (producto.getAgroquimicos()[i][2].equals("R")) {
                        while (true) {
                            System.out.println("Ingrese el número de la parcela donde se aplicara el Agroquímico.Ingrese X para terminar");
                            String parcela = new Scanner(System.in).nextLine();
                            if (parcela.equalsIgnoreCase("x") && cargoParcela == false) {
                                System.out.println("Debe ingresar al menos 1 parcela");
                                continue;
                            } else if (parcela.equalsIgnoreCase("x") && cargoParcela == true) {

                                break;

                            } else if (parcela.length() != 6) {
                                System.out.println("El número de parcela debe constar de 6 dígitos");
                                continue;
                            } else {
                                producto.getParcelasAplicacion().add(Long.parseLong(parcela));
                                cargoParcela = true;
                            }

                        }

                    }
                    cargoParcela = false;
                    linea++;
                    break;

                }

            }
            if (encuentroCodigo == false) {
                System.out.println("El código ingresado es incorrecto");
            }
            encuentroCodigo = false;

        }

        for (int i = 0; i < linea; i++) {
            sumatoria += Double.parseDouble(detalleDDJJ[i][4]);

        }

        producto.setTotal(sumatoria);

        System.out.println("La DDJJ de Agroquímicos realizada es:");
        System.out.println("Empresa:\t" + producto.getEmpresa());
        System.out.println("CUIT:\t" + producto.getCuit());
        System.out.println("Mes:\t" + producto.getMesDeclaracion());
        System.out.println("Año:\t" + producto.getAnioDeclaracion());
        System.out.println("\t\t\t\tAgroquímicos declarados");
        System.out.println("\tCódigo\t Denominación\tCapacidad\tcantidad\tSubTotal\tNúmero de Lote");
        
        for (int i = 0; i <detalleDDJJ.length; i++) {
            System.out.println("");
            for (int j = 0; j <detalleDDJJ[0].length; j++) {
                if (detalleDDJJ[i][j] == null) {
                    String celda = String.format("%15s", "-");
                    System.out.print(celda);
                   
                } else {
                    String celda = String.format("%15s", detalleDDJJ[i][j]);
                    System.out.print(celda);

                }
            }
        }
        System.out.println("");
        System.out.println("\t\t\t\tTOTAL:\t"+ String.format("%.2f",producto.getTotal()));
        
        System.out.println("Parcelas Aplicadas: " + producto.getParcelasAplicacion());
    }

    public static void cargoDatos(DDJJStockAgroquimico producto) {

        producto.setEmpresa(cargoEmpresa());
        producto.setCuit(cargoCuit());
        producto.setAnioDeclaracion(cargoAnio());
        producto.setMesDeclaracion(cargoMes(producto));

    }

    public static String cargoEmpresa() {
        System.out.println("Ingrese nombre de Empresa");
        String empresa = new Scanner(System.in).nextLine();
        return empresa;

    }

    public static long cargoCuit() {
        System.out.println("Ingrese el CUIT");
        String cuit = new Scanner(System.in).nextLine();

        if (cuit.length() != 11) {
            System.out.println("debe ingresar un número de 11 dígitos");
            return cargoCuit();
        } else {
            return Long.parseLong(cuit);

        }
    }

    public static int cargoAnio() {
        System.out.println("Ingrese el año");
        int anio = new Scanner(System.in).nextInt();

        if (anio > 2020 || anio < 2019) {
            System.out.println("la declaración jurada no puede ser posterior a la fecha actual o anterior a 6 meses ");
            return cargoAnio();
        } else {
            return anio;
        }

    }

    public static int cargoMes(DDJJStockAgroquimico producto) {
        System.out.println("Ingrese el mes");
        int mes = new Scanner(System.in).nextInt();

        if (mes > 12 || mes <= 0) {

            System.out.println("debe ingresar un valor entre 1 y 12");
            return cargoMes(producto);
        } else if (mes >= 9 && producto.getAnioDeclaracion() == 2019) {
            return mes;
        } else if (mes <= 3 && producto.getAnioDeclaracion() == 2020) {
            return mes;
        } else {
            System.out.println("la declaración jurada no puede ser anterior a los 6 meses o posterior a la fecha actual");
            return cargoMes(producto);
        }

    }

    public static Double valorDoble(DDJJStockAgroquimico producto) {

        System.out.println("Ingrese la capacidad del envase en Kg/Lt para el agroquímico");
        double valor = new Scanner(System.in).nextDouble();
        if (valor < 0) {
            System.out.println("debe ingresar un valor positivo");
            return valorDoble(producto);
        } else {
            return valor;
        }

    }

    public static int cantidad(DDJJStockAgroquimico producto) {
        System.out.println("Ingrese la cantidad de envases");
        int valor = new Scanner(System.in).nextInt();
        if (valor < 0) {
            System.out.println("debe ingresar un valor positivo");
            return cantidad(producto);
        } else {
            return valor;
        }
    }
}
