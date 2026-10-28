package ies.puerto.es;

import java.util.Scanner;

public class AlgoritmoEuclides {

    /**
     * Funcion que realiza el calculo del maximo com un divisor
     * @param numero1
     * @param numero2
     * @return
     */
    static int calcularMCD(int numero1, int numero2){
       int resultado = 0;

       numero1 = Math.abs(numero1);
       numero2 = Math.abs(numero2);

       while(numero2 != 0 && numero2 < numero1){
           int resto = numero1 % numero2;
           numero1 = numero2;
           numero2 = resto;
       }
        return numero1;
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
         int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero");
        int numero2 = scanner.nextInt();

        int resultado = calcularMCD(numero1, numero2);

        System.out.println("Maximo como un divisor: " + resultado);
    }
}
