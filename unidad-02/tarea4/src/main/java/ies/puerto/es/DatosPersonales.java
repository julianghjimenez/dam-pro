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
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion encargada de validar mayoria de edad
     * @param mayorEdad int que almacena la edad
     * @return True/False
     */
    static boolean esMayorDeEdad(int mayorEdad){
        return mayorEdad > 18;
    }

    /**
     *
     * @param iEdad
     * @return
     */
    static int convertirEdadAEnvolvente(int iEdad) {
        return Integer.parseInt(String.valueOf(iEdad));
    }

    /**
     *
     * @param iEdadP
     * @return
     */
    static int recuperarEdadPrimitiva(Integer iEdadP) {
        if (iEdadP == null) {
            return 0;
        }
        int iPrimitiva;
        return iPrimitiva = iEdadP;

    }

    /**
     *
     * @return
     */
    static String formatearFicha(String edad) {

        /*
        * Nombre: Ana
Edad: 21
Altura: 1.68 m
Matriculada: true
Mayor de edad: true
Edad como Integer: 21
Edad como int: 21
        * */


        return "";
    }

}
