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

    // Devuelve un array nuevo con los elementos en orden inverso. No modifica el original. Null: IllegalArgumentException.
    public static int[] invertir(int[] numeros) {
        if (numeros.length == 0 || numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        for (int i = 0; i < numeros.length; i--) {
            int numero = numeros[i];

        }
    }
}
