package src.main.java.es.dampro.unidad2.tarea6;

import java.util.Scanner;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * MediaNumeros
 */
public final class MediaNumeros {
    private MediaNumeros() { }

    //Para la media necesitamos multiplicar las operaciones y dividir por el numero de operaciones
    //numeros = 2,3,4,6 => 2+3+4+6 => 15/nª operaciones => 4 ===> 15/4
    /**
     * Funcion que calcula la media de numeros
     * @param numeros String de numeros a calcular
     * @return Double del resultado suma
     */
    public static double calcularMedia(String numeros) {
       if (numeros == null) {
           throw new IllegalArgumentException();
       }
       if (numeros.isEmpty()) {
           return 0.0;
       }
       int suma= 0;
        for (int i = 0; i < numeros.length(); i++) {
            char cNumero = numeros.charAt(i);
            String sNumero = String.valueOf(cNumero);
            int numero = Integer.parseInt(sNumero);
            suma += numero;
        }
        int i;
        i = suma / numeros.length();
        return i;
    }

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("iNTRODUCE UN NUMERO: ");
        String sNumero = teclado.nextLine();
        
        double resultado = calcularMedia(sNumero);
        System.out.println("resultado: "+resultado);
    }
}
