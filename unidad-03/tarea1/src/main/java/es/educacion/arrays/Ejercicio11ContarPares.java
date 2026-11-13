package es.educacion.arrays;
/**
 * @author julianghjimenez
 * @version 1.0.0
 * Contar Pares
 */
public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }

    /**
     * Funcion encargada de contar numeros pares de un Array
     * @param numeros Array con lista de numeros
     * @return Integer de numeros pares
     */
    public static int contarPares(int[] numeros) {
       // Error al ingresar el numeros.length == 0 en el if
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int cantidad = 0;
        boolean par;
        for (int numero: numeros) {
            if (numero % 2 == 0) {
                par = true;
                cantidad++;
            }
        }
        return cantidad;
    }
}
