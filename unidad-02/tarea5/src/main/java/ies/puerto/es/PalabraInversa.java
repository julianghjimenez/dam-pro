package ies.puerto.es;

import java.util.Scanner;

/**
 * @author julianghjimenez
 * @version 1.0.0
 */
public class PalabraInversa {


    /**
     * Crea una palabra a texto invertida a la original
      * @param palabra String Palabra/texto original
     * @return String cadena invertida
     */
    static String reverse(String palabra){
        StringBuilder resultado = new StringBuilder();
        if (palabra == null || palabra.isEmpty()){
            return "";
        }
        // size / lenght |0| -> 8-1 = 7
        //palabra = |a|l|m|e|n|d|r|a| -> a|r|d|n|e|m|l|a|

        for (int i = palabra.length() - 1; i >= 0; i--) {
            char caracter = palabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String sPalabra = scanner.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida: " + sInvertida);
    }

}
