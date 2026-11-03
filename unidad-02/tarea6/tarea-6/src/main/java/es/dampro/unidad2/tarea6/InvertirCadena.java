package src.main.java.es.dampro.unidad2.tarea6;

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
        StringBuilder resultado = new  StringBuilder();
     if (texto == null || texto.isEmpty()) {
       throw new IllegalArgumentException("Dato inválido");
     }

     for (int i = texto.length() - 1; i >= 0; i--) {
        Character caracter = texto.charAt(i);
        resultado.append(caracter);
     }

        return resultado.toString();
    }
}
