package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * BinarioDecimal
 */
public final class BinarioDecimal {

    private BinarioDecimal() {
    }

    /**
     * Funcion encargada de convertir un numero binario a decimal
     * @param binario String del numero binario
     * @return Integer del numero decimal
     */
    public static int convertirBinario(String binario) {

        int resultado = 0;
        int posicion = 0;

        if (binario == null) {
            throw new IllegalArgumentException();
        }

        if (binario.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (int i = binario.length() - 1; i >= 0; i--) {

            String digito = String.valueOf(binario.charAt(i));

            if (!digito.equals("0") && !digito.equals("1")) {
                throw new IllegalArgumentException();
            }

            if (digito.equals("1")) {
                resultado = resultado + (int) Math.pow(2, posicion);
            }

            posicion++;
        }

        return resultado;
    }
}