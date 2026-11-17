package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Suma de filas
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    /**
     *
     * @param matriz
     * @return
     */
    public static int[] sumarFilas(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {

            int sumaFila = 0;
            int[] fila = matriz[i];
            if (fila == null) {
                throw new IllegalArgumentException();
            }
            for (int columna:fila) {
                sumaFila += columna;
            }
            resultado[i] = sumaFila;
        }
        return resultado;
    }
}
