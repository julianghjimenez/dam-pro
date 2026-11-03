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
     * @param sTexto String/sTexto que confirma
     * @return true/false
     */
    public static boolean esPalindromo(String sTexto) {

        if (sTexto == null) {
            throw new IllegalArgumentException("No es palindromo");
        }
        sTexto =  sTexto.toLowerCase().trim().replace(" ","");
        if (sTexto.isEmpty()) {
            return false;
        }
              
       for (int i = 0; i < sTexto.length(); i++) {
         char letraIzquierda = sTexto.charAt(i);
            char letraDerecha = sTexto.charAt(sTexto.length()-1-i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
       }
        return true;
    }

}
