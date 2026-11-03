package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * ContadorVocales
 */
public final class ContadorVocales {
    private ContadorVocales() {
    }

    /**
     * Funcion encargada de contar vocales en un texto 
     * @param iTexto String/texto a contar
     * @return Integer del numero de vocales.
     */
    public static int contarVocales(String iTexto) {
        if (iTexto == null) {
            throw new IllegalArgumentException();
        }
        if (iTexto.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        iTexto = iTexto.toLowerCase();
        for (int i = 0; i < iTexto.length(); i++) {
            char caracter = iTexto.charAt(i);
            if ((caracter == 'a' || caracter == 'ä' || (caracter == 'á') || caracter == 'ë' || (caracter == 'e') || caracter == 'ï' || (caracter == 'é') || (caracter == 'i')
                    || (caracter == 'í') || (caracter == 'o') || caracter == 'ö' || (caracter == 'ó') || caracter == 'ü' || (caracter == 'u')
                    || (caracter == 'ú'))) {
                resultado++;
            }
        }
        return resultado;
    }
}
