package ies.puerto.es;

import java.util.Scanner;

public class Factorial {

    /**
     * Calcula el factorial de un numero
     * @param numero int para el calculo de un factorial
     * @return int con el resultado
     */
    static int calcular(int numero){
        if (numero <= 1){
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int iNumero = scanner.nextInt();
        int resultado = calcular(iNumero);
        System.out.println("Factorial: " + resultado);
    }
}
