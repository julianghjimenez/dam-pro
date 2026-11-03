package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 *          SumaDigitos
 */
public final class SumaDigitos {

    private SumaDigitos() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que suma cada digito de una cadena
     * 
     * @param numero String con la cadena de numeros a sumar
     * @return Integer con la suma de digitos.
     */
    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int resultado = 0;
        for (int i = 0; i < numero.length(); i++) {
            Character caracter = numero.charAt(i);
            int valor = Integer.parseInt(String.valueOf(caracter));

            resultado += valor;

        }
        if (resultado <= 0) {
            throw new IllegalArgumentException();
        }

        return resultado;
    }
}
