package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Buscar
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    /**
     * Funcion encargada de devolver el numero objetivo en una lista;
     * @param numeros Integer de la lista de numeros
     * @param objetivo Integer del numero objetivo
     * @return Integer del numero encontrado
     */
    public static int buscar(int[] numeros, int objetivo) {
       if (numeros == null || numeros.length== 0) {
          return -1;
       }

        for (int i = 0; i < numeros.length; i++) {
           int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }
        return -1;
    }
}
