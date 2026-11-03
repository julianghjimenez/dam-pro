package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * MayorNumero
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

        int mayor = 0;
        int inicioNumero = 0;
        for (int i = 0; i <= sNumeros.length(); i++) {
            if (i == sNumeros.length() || sNumeros.charAt(i) == ',') {
                String numeroTexto = sNumeros.substring(inicioNumero, i).trim();
                if (numeroTexto.isEmpty()) {
                    throw new IllegalArgumentException("La lista contiene un elemento vacío");
                }
                int numero = Integer.parseInt(numeroTexto);
                if (inicioNumero == 0 || numero > mayor) {
                    mayor = numero;
                }
                inicioNumero = i + 1;
            }
        }

        return mayor;
    }
}
