package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Ordenar
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    /**
     * Funcion encargada de ordenar de menor a mayor
     * @param numeros Integer de una lista de numeros desordenados
     * @return Integer con la lista ordenada
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] arrayOrdenado = Arrays.copyOf(numeros, numeros.length);
       Arrays.sort(arrayOrdenado);
       return arrayOrdenado;
    }
}
