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
    public static int[] rotar(int[] numeros, int posiciones) {
            if (numeros == null || posiciones < 0) {
                throw new IllegalArgumentException();
            }
            if (numeros.length == 0) {
                return new int[0];
            }
            int[] resultado = new int[numeros.length];
            for (int i = 0; i < numeros.length; i++) {
                resultado[(i + posiciones) % numeros.length] = numeros[i];
            }
            return resultado;
        }
    }
