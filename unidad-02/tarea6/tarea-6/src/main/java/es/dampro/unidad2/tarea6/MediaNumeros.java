package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * MediaNumeros
 */
public final class MediaNumeros {
    private MediaNumeros() { }

    /**
     * Calcula la media de una lista de enteros separados por comas.
     * @param numeros Lista de números que se va a promediar.
     * @return La media aritmética sin redondear.
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isBlank()) {
            throw new IllegalArgumentException("Se requiere una lista de números");
        }

        double suma = 0;
        int cantidad = 0;
        String numeroTexto = "";
        for (int i = 0; i <= numeros.length(); i++) {
            if (i == numeros.length() || numeros.charAt(i) == ',') {
                if (numeroTexto.trim().isEmpty()) {
                    throw new IllegalArgumentException("La lista contiene un elemento vacío");
                }
                suma += Integer.parseInt(numeroTexto.trim());
                cantidad++;
                numeroTexto = "";
            } else {
                numeroTexto += numeros.charAt(i);
            }
        }
        return suma / cantidad;
    }
}
