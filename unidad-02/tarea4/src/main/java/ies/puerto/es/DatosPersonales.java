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
}
