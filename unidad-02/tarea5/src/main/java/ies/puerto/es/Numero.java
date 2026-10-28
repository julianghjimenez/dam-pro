package ies.puerto.es;

import java.util.Scanner;

public class Numero {

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    static int mayor( int numero1,int numero2){
        if (numero1 > numero2){
            return numero1;
        }
        return numero2;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    static int menor( int numero1, int numero2) {
        if (numero1 < numero2){
            return numero1;
        }
        return numero2;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return
     */
    static boolean igual(int numero1, int numero2){
        if (numero1 == numero2) {
            return true;
        }
        return false;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Indique numero 2: ");
        int numero2 = scanner.nextInt();

        int resultado = mayor(numero1, numero2);
        System.out.println("El mayor es: "+resultado);

        int resultado2 = menor(numero1, numero2);
        System.out.println("el menor es: "+resultado2);

        boolean resultado3 = igual(numero1, numero2);
        System.out.println("Son iguales: "+resultado3);

    }
}
