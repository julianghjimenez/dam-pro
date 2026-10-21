package ies.puerto.es;


import java.util.Scanner;

/**
 * @author julianghjimenez
 * @version 1.0.0
 */
public class DatosPersonales {


    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String sNombre = scanner.nextLine();

        System.out.println("Introduce tu edad: ");
        String sEdad = scanner.nextLine();

        System.out.println("Introduce tu altura: ");
        String sAltura = scanner.nextLine();

        System.out.println("Introduce tu matricula: ");
        String sMatricula = scanner.nextLine();

        double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(iEdad);
        String ficha = formatearFicha(sNombre, iEdad, dAltura , bMatricula, bMayorEdad);
    }

    /**
     * Funcion que transforma la edad(String) --> edad(int)
     * @param sEdad String que almacena la edad
     * @return edad(int)
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null || sEdad.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(sEdad);
    }

    /**
     * Funcion que transforma la altura(String) --> altura(double)
     * @param sAltura String que almacena la altura
     * @return altura(double)
     */
    static double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(sAltura);
    }

    /**
     * Funcion que transforma la matricula(String) ---> matricula(Boolean)
     * @param sMatricula String que almacena la matricula
     * @return True/False
     */
    static boolean convertirMatricula(String sMatricula){
       if (sMatricula == null || sMatricula.isEmpty()) {
           return false;
       }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion encargada de validar mayoria de edad
     * @param iEdad int que almacena la edad
     * @return True/False
     */
    static boolean esMayorDeEdad(int iEdad){

        return iEdad >= 18 ;
    }

    /**
     * Funcion que transforma la edad en un Integer envolvente
     * @param iEdad Integer que almacena la edad
     * @return edad(Integer)
     */
    static Integer convertirEdadAEnvolvente(int iEdad) {
        return Integer.valueOf(iEdad);
    }

    /**
     * Funcion que recupera el valor en int
     * @param iEdad
     * @return
     */
    static int recuperarEdadPrimitiva(Integer iEdad) {
        if (iEdad == null ) {
            return 0;
        }
        return iEdad.intValue();

    }

    /**
     * Funcion formatea la ficha
     * @param sNombre String nombre de la ficha
     * @param iEdad INteger edad de la ficha
     * @param dAltura double de altura de la ficha
     * @param bMatricula boolean matricula de la ficha
     * @param bMayorEdad boolean mayor de edad de la ficha
     * @return String con valores
     */
    static String formatearFicha(String sNombre, int iEdad, double dAltura, boolean bMatricula, boolean bMayorEdad) {

        return "Ficha: "+ sNombre+ ", Edad: "+iEdad+", Altura: "+ dAltura+
                ", Matricula: " + bMatricula + ", Mayor de edad: " + bMayorEdad;
    }

}
