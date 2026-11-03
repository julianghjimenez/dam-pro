package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Palindromo
 */
public final class Palindromo {

    private Palindromo() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion encargada de confirmar si un palabra es palindrome
     * @param texto String/texto que confirma
     * @return true/false
     */
    public static boolean esPalindromo(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException();
        }
       texto =  texto.toLowerCase();
       texto = texto.replace("", "");
       for (int i = 0; i < texto.length(); i++) {
         char letraIzquierda = texto.charAt(i);
            char letraDerecha = texto.charAt(texto.length()-1-i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
       }
        return true;
    }

}
