package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Copiar Rango
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    /**
     * Funcion encargada de copiar rangos en un Array
     * @param numeros Array con la lista de rangos
     * @param inicio Integer que inicia el rango
     * @param fin Integer que finaliza el rango
     * @return Rangos validos
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
     //0 ≤ inicio ≤ fin ≤ longitud

        if (inicio > fin) {
         return numeros;
     }
     if (inicio < 0 || fin < 0 || fin > numeros.length ) {
         throw new IllegalArgumentException();
     }

     int[] copiarRango = Arrays.copyOfRange(numeros, inicio, fin);

     return copiarRango;
    }
}
