package ies.puerto.es;

/**
 * @author julianghjimenez
 * @version 1.0.0
 */
public class DatosPersonales {

    static void main() {

    }

    /**
     * Funcion que transforma la edad(String) --> edad(int)
     * @param sEdad String que almacena la edad
     * @return edad(int)
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return  0;
        }
        return Integer.parseInt(sEdad);
    }

    /**
     * Funcion que transforma la altura(String) --> altura(double)
     * @param sAltura String que almacena la altura
     * @return altura(double)
     */
    static double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura < 0) {
            return 0;
        }
        return Double.valueOff(sAltura);
    }

    static boolean convertirMatricula(String sMatricula){

    }

    static int esMayorDeEdad(int i){

    }

}
