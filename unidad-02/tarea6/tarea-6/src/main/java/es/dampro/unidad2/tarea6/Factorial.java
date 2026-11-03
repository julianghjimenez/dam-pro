package es.dampro.unidad2.tarea6;

/** Calcula factoriales de enteros dentro del rango admitido por el ejercicio. */
public final class Factorial {

    private Factorial() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion encargada de calcular el factorial
     * @param numero String con el numero
     * @return Integer con el factorial
     */
    public static int calcularFactorial(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Se requiere un entero entre 0 y 12");
        }
        int valor = Integer.parseInt(numero.trim());
        if (valor < 0 || valor > 12) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 12");
        }

        int factorial = 1;
        for (int multiplicador = 2; multiplicador <= valor; multiplicador++) {
            factorial *= multiplicador;
        }
        return factorial;
    }
}
