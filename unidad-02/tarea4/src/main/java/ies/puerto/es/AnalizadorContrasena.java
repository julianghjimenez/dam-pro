package ies.puerto.es;

import java.util.Scanner;

/**
 * @author julianghjimenez
 * @version 1.0.0
 */
public class AnalizadorContrasena {

    /**
     * Funcion que cuenta minusculas en contrasenia
     * @param sContra String que almacena la contrasenia
     * @return Integer numero de mayusculas
     */
    static int contarMayusculas(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
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

    /**
     * Funcion que cuenta minusculas en contrasenia
     * @param sContra String que almacena la contrasenia
     * @return Integer numero de minusculas
     */
    static int contarMinusculas(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < sContra.length(); i++) {
            if (Character.isLowerCase(sContra.charAt(i))) {
                contador++;
            }
            /*
            if ( Character.isAlphabetic(caracter) && !Character.isUpperCase(sContra.charAt(i))) {
                contador++;
            }
            */
        }
        return contador;
    }

    /**
     * Funcion que cuenta digitos en contrasenia
     * @param sContra String que almacena la contrasenia
     * @return Integer numero de digitos
     */
    static int contarDigitos(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
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

    /**
     * Funcion que cueanta los simbolos en contrasenia
     * @param sContra String que almacena la contresenia
     * @return Integer numero de simbolos
     */
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

    /**
     * Funcion que defina la longitud minima de la contrasenia
     * @param sContra String que almacena la contresenia
     * @return true/false
     */
    static boolean tieneLongitudMinima(String sContra) {
        if (sContra == null || sContra.isEmpty()) {
            return false;
        }

        if (sContra.length() >= 8) {
            return true;
        }

        /*
        return sContra.length() >= 8
        */
        return false;

    }

    /**
     * Funcion que valida la contraenia
     * @param sContra String que almacena la contresenia
     * @return true/false
     */
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

    /**
     * Funcion encatgada de almacenar y generar un informe
     * @param iMayusculas Integer de mayusculas
     * @param iMinusculas Integer de minusculas
     * @param iDigitos Integer de digitos
     * @param iSimbolos Integer de simbolos
     * @param bLongitudM true/false
     * @param bContraV true/false
     * @return generarInforme()
     */
    static String generarInforme(int iMayusculas, int iMinusculas, int iDigitos, int iSimbolos, boolean bLongitudM,
            boolean bContraV) {

        return "Mayusculas: " + iMayusculas + ", Minusculas: " + iMinusculas + ", Digitos: " + iDigitos + ", Simbolos: "
                + iSimbolos +
                ", Longitud: " + bLongitudM + ", Resultado: " + bContraV;
    }
    /*
    static String generarInforme(String sContra){
    String resultado = "Mayusculas: " + contarMayusculas(sContra)+ ", Minusculas: " + contarMinusculas(sContra) +
     ", Digitos: " + contarDigitos(sContra) + ", Simbolos: " + contarSimbolos(sContra) +
     ", longitud: " + tieneLongitudMinima(sContra) + ", resultado: " + esContrasenaValida(sContra)
    }
    * */

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
