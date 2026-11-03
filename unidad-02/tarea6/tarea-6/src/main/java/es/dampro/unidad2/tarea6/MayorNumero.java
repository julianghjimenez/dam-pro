package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Busca el número mayor de una lista de números.
 */
public final class MayorNumero {

    private MayorNumero() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion encargada de buscar numero mayor
     * @param sNumeros String de lista de numeros
     * @return Integer numero mayor
     */
    public static int obtenerMayor(String sNumeros) {
        if (sNumeros == null || sNumeros.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        String[] numeros = sNumeros.split(",", -1);
        int mayor = Integer.parseInt(numeros[0].trim());

        for (int i = 1; i < numeros.length; i++) {
            int numero = Integer.parseInt(numeros[i].trim());
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }
}
