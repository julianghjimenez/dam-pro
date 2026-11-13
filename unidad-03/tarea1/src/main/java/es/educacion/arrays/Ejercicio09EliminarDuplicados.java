package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Eliminar Duplicados
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    // Elimina los elementos repetidos preservando el orden de primera aparición. Devuelve array nuevo. Null: IllegalArgumentException.
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] copia =  new int[numeros.length];
        int cantidad = 0;
        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < cantidad; j++) {
                if (numeros[j] == numeros[i]) {
                    repetido = true;
                }

            }
            if (!repetido ) {
               copia[cantidad] = numeros[i];
               cantidad++;
            }

        }

        return Arrays.copyOf(copia, cantidad);
    }
}
