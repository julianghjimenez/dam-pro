package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Maximo
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    /**
     * Funcion encargada de obtener el maximo de una lista de numeros
     * @param numeros lista de numeros
     * @return Integer del numero mayor
     */
    public static int maximo(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException();
        }
        int maximo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo ){
                maximo = numeros[i];
            }
        }
        return maximo;
    }
}
