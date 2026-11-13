package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Rotar Derecha
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    /**
     * Funcion encargada de rotar array hacia la derecha
     * @param numeros Array de numeros
     * @param posiciones INteger con las posiciones
     * @return Array reordenado a la derecha
     */
    // Contrato: Devuelve una copia rotada a la derecha el número no negativo de posiciones. Vacío devuelve vacío. No modifica el original. Null o posiciones negativas: IllegalArgumentException.
    public static int[] rotar(int[] numeros, int posiciones) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int[] copia = new int[numeros.length]; //nuevo array copiado con igual longitud
        for (int i = 0; i < numeros.length; i++) {

        }
    }
}
