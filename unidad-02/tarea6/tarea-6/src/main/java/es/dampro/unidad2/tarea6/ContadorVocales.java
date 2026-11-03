package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * ContadorVocales
 */
public final class ContadorVocales {
    private ContadorVocales() { }

    /**
     * Funcion encargada de contar vocales en un texto
     * @param texto String/texto a contar
     * @return Integer del numero de vocales.
     */
    public static int contarVocales(String iTexto) {
        if (iTexto == null || iTexto.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int resultado = 0;
        iTexto = iTexto.toLowerCase();
        for (int i = 0; i < iTexto.length(); i++) {
             char caracter = iTexto.charAt(i);
            if ((caracter == 'a' || (caracter == 'e') || (caracter == 'i')
                    || (caracter == 'o') || (caracter == 'u'))) {
                resultado++;
        }
    }
        return resultado;
    }
}
