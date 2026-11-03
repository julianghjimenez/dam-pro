package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * NumeroPrimo
 */
public final class NumeroPrimo {

    private NumeroPrimo() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion encargada de obtener numeros primos
     * @param numero String con el numero
     * @return true/false
     */
    public static boolean esPrimo(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Se requiere un número entero");
        }
        int valor = Integer.parseInt(numero.trim());
        if (valor < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= valor / divisor; divisor++) {
            if (valor % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
