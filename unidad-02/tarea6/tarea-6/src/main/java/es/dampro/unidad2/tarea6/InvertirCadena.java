package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * InvertirCadena
 */
public final class InvertirCadena {

    private InvertirCadena() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion encargada de invertir palabra
     * @param texto String de la palabra
     * @return Cadena invertida, conservando espacios y mayúsculas.
     */
    public static String invertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        StringBuilder resultado = new StringBuilder(texto.length());
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }
}
