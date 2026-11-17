package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Diagonal
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }


    public static int sumarDiagonal(int[][] matriz) {
        if (matriz == null ) {
            throw new IllegalArgumentException();
        }
        //Primeros obtenemos el numeros de filas para
        // comparar despues con las columnas
        int filas = matriz.length;
        // 0 | 1 |
        // 1 | 2
        // 2 | 4
        // 2 | 3

        int resultado = 0;
        for (int i = 0; i < filas ; i++) {
            //int[] fila = matriz[i];
            if (matriz[i] == null || matriz[i].length != filas) { //Si esto no se cumple entonces es cuadrada
                throw new IllegalArgumentException();
            }
            resultado += matriz[i][i];
            /*
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    resultado += matriz[i][j];
                    break;
                }
            }*/
        }
        return  resultado;
    }
}
