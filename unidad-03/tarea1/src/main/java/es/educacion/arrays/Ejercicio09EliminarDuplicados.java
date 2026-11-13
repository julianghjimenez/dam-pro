package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Eliminar Duplicados
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    /**
     *
     * @param numeros
     * @return
     */
    public static int[] sinDuplicados(int[] numeros) {
        //Deberia de implementar el numeros.lenght = 0, pero da error
        if (numeros == null ) {
            throw new IllegalArgumentException();
        }
        int[] copia =  new int[numeros.length];
        int cantidad = 0;
        boolean repetido;
        for (int i = 0; i < numeros.length; i++) {
            repetido = false;

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
