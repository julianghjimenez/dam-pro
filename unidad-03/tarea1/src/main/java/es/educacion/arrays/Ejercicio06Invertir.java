package es.educacion.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Invertir
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    /**
     * Funcion encargada de invertir lista de numeros
     * @param numeros Integer de la lista
     * @return Integer de la lista invertida
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] copia = new int[numeros.length];

        // Empieza desde la posicion 0; acaba cuando i pase por un numero mayor a la
        // longitud del array == 3; pasa a la siguiente posicion
        for (int i = 0; i < numeros.length; i++) {

            // copia.length == 3 || copia.length -1 == 2 --> largo - 1 - posicion actual
           int posicion = copia.length-1-i;
           copia[posicion] = numeros[i];
        }
        return copia;
    }
}
