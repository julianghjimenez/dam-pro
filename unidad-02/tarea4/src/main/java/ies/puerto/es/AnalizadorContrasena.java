package ies.puerto.es;

import java.util.Scanner;

public class AnalizadorContrasena {

    static int contarMayusculas(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isUpperCase(sContra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    static int contarMinusculas(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isLowerCase(sContra.charAt(i))) {
                contador++;
            }

        }
        return contador;
    }

    static int contarDigitos(String sContra) {
        if (sContra == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isDigit(sContra.charAt(i))) {
                contador++;
            }

        }
        return contador;
    }

    static int contarSimbolos(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (!Character.isLetterOrDigit(sContra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    static boolean tieneLongitudMinima(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return false;
        }

        if (sContra.length() > 8) {
            return true;
        }
        return false;

    }

    static boolean esContrasenaValida(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return false;
        }

        if ((!tieneLongitudMinima(sContra)) || contarMayusculas(sContra) == 0 ||
                contarMinusculas(sContra) == 0 || contarDigitos(sContra) == 0) {
            return false;
        }

        return true;

    }

    static String generarInforme(int iMayusculas, int iMinusculas, int iDigitos, int iSimbolos, boolean bLongitudM,
            boolean bContraV) {

        return "Mayusculas: " + iMayusculas + ", Minusculas: " + iMinusculas + ", Digitos: " + iDigitos + ", Simbolos: "
                + iSimbolos +
                ", Longitud: " + bLongitudM + ", Resultado: " + bContraV;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Introduce una contraseña: ");
        String sContra = scanner.nextLine();

        int iMayusculas = contarMayusculas(sContra);
        int iMinusculas = contarMayusculas(sContra);
        int iDigitos = contarDigitos(sContra);
        int iSimbolos = contarSimbolos(sContra);
        boolean bLongitudM = tieneLongitudMinima(sContra);
        boolean bContraV = esContrasenaValida(sContra);
        String informe = generarInforme(iMayusculas, iMinusculas, iDigitos, iSimbolos, bLongitudM, bContraV);

        System.out.println(informe);
        scanner.close();
    }

}
