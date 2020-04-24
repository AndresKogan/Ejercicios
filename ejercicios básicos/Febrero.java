/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febrero;

import java.util.Random;
import java.util.Scanner;

public class Febrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimension = tamanioMatriz();
        int[][] matriz = new int[dimension][dimension];
        Random rnd = new Random();
        int[] valoresCentrales = new int[9];

        for (int i = 0; i < matriz.length; i++) {
            matriz[0][i] = cargoDatos();

        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (rnd.nextDouble() * 90 + 10);

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");

            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");

            }

        }
        valoresCentrales = obtenerValoresCentrales(matriz);
        System.out.println("");
        System.out.print("los valores centrales son: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(valoresCentrales[i] + " ");

        }
        ordenarMatriz(valoresCentrales);

        System.out.println("");
        System.out.print("los valores centrales ordenados son: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(valoresCentrales[i] + " ");

        }
        int valorCentral = matriz[matriz.length / 2][matriz.length / 2];
        System.out.println("");
        System.out.println("El valor "+ valorCentral + " se encuentra en las posiciones de la matriz" );
        buscarValorCentralEnMatriz(matriz, valorCentral);

    }

    public static int tamanioMatriz() {
        System.out.println("ingrese el tamaño de la matriz, el mismo debe ser un número impar entre 3 y 15 ");
        int dimension = new Scanner(System.in).nextInt();

        if (dimension % 2 == 0) {
            System.out.println("el valor ingresado no es impar");
            return tamanioMatriz();

        } else if (dimension < 3) {
            System.out.println("el valor ingresado es menor a 3");
            return tamanioMatriz();
        } else if (dimension > 15) {
            System.out.println("El valor ingresado es mayor a 15");
            return tamanioMatriz();
        } else {
            return dimension;
        }

    }

    public static int cargoDatos() {
        System.out.println("ingrese un valor entre 10 y 99");
        int valor = new Scanner(System.in).nextInt();
        if (valor < 10) {
            System.out.println("el valor ingresado es menor a 10");
            return cargoDatos();
        } else if (valor > 99) {
            System.out.println("el valor ingresado es superior a 99");
            return cargoDatos();
        } else {
            return valor;
        }

    }

    public static int[] obtenerValoresCentrales(int[][] matriz) {

        int[] numeros = new int[9];
        int k = 0;

        for (int i = matriz.length / 2 - 1; i < (matriz.length / 2) + 2; i++) {
            for (int j = matriz.length / 2 - 1; j < (matriz.length / 2) + 2; j++) {

                numeros[k] = matriz[i][j];
                k++;
            }

        }
        return numeros;

    }

    public static int[] ordenarMatriz(int[] valoresCentrales) {

        for (int i = 1; i < 9; i++) {
            int valor = valoresCentrales[i];
            int j = i - 1;

            while (j >= 0 && valoresCentrales[j] > valor) {
                valoresCentrales[j + 1] = valoresCentrales[j];
                j--;
            }
            valoresCentrales[j + 1] = valor;
        }

        return valoresCentrales;

    }

    public static void buscarValorCentralEnMatriz(int[][] matriz, int valorCentral) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==matriz.length/2&&j==matriz.length/2) {
                    continue;
                    
                }
                if (valorCentral == matriz[i][j]) {
                    System.out.println("Fila Indice " + i + " Columna Indice " + j);

                }

            }

        }

    }}
