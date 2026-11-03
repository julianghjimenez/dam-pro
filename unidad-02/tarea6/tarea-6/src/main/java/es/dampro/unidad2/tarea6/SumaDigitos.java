package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * SumaDigitos
 */
public final class SumaDigitos {

    private SumaDigitos() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que suma cada digito de una cadena
     * @param numero String con la cadena de numeros a sumar
     * @return Integer con la suma de digitos.
     */
    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Se requiere un entero positivo");
        }

        int resultado = 0;
        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (caracter < '0' || caracter > '9') {
                throw new IllegalArgumentException("La entrada debe contener solo dígitos");
            }
            resultado += caracter - '0';
        }
        return resultado;
    }
}
