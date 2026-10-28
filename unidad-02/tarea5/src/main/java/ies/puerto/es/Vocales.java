package ies.puerto.es;


import java.util.Scanner;

/**
 * @author julianghjimenez
 * @version 1.0.0
 */
public class Vocales {



    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");

        String cadena = scanner.nextLine();
        int resultado = contarVocales(cadena);

        System.out.println("Vocales: "+ resultado);
    }

    static int contarVocales(String sCadena){
       if (sCadena == null  || sCadena.isEmpty()) {
           return 0;
       }
        int resultado = 0;
       sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if ((caracter == 'a' || (caracter == 'e') || (caracter == 'i')
                    || (caracter == 'o') || (caracter == 'u'))) {
                resultado++;
            }
        }
        return resultado;
    }

    static int contarVocales2(String sCadena){
        if (sCadena == null  || sCadena.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        sCadena = sCadena.toLowerCase();
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            resultado = switch (caracter) {
                case 'á', 'a', 'é', 'e', 'í', 'i', 'ó', 'o', 'ú', 'u' -> resultado + 1;
                default -> resultado;
            };


            if ((caracter == 'a' || (caracter == 'e') || (caracter == 'i')
                    || (caracter == 'o') || (caracter == 'u'))) {
                resultado++;
            }
        }
        return resultado;
    }
}
