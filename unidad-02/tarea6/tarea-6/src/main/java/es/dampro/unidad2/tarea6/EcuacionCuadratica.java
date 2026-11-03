package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * EcuacionCuadratica
 */
public final class EcuacionCuadratica {

    private EcuacionCuadratica() {
    }

    /**
     * Funcion encargada de calcular el discriminante de una ecuacion cuadratica
     * @param coeficienteA String del coeficiente A de la ecuacion
     * @param coeficienteB String del coeficiente B de la ecuacion
     * @param coeficienteC String del coeficiente C de la ecuacion
     * @return Double con el valor del discriminante
     */
    public static double calcularDiscriminante(String coeficienteA, String coeficienteB, String coeficienteC) {

        if (coeficienteA == null || coeficienteB == null || coeficienteC == null) {
            throw new IllegalArgumentException("Error");
        }

        if (coeficienteA.equals("") || coeficienteB.equals("") || coeficienteC.equals("")) {
            throw new IllegalArgumentException("Error");
        }

        double valorA = Double.parseDouble(coeficienteA);
        double valorB = Double.parseDouble(coeficienteB);
        double valorC = Double.parseDouble(coeficienteC);

        if (Double.isNaN(valorA) || Double.isNaN(valorB) || Double.isNaN(valorC)) {
            throw new IllegalArgumentException("Error");
        }

        if (Double.isInfinite(valorA) || Double.isInfinite(valorB) || Double.isInfinite(valorC)) {
            throw new IllegalArgumentException("Error");
        }

        if (valorA == 0) {
            throw new IllegalArgumentException("Error");
        }

        double discriminante = (valorB * valorB) - (4 * valorA * valorC);

        return discriminante;
    }
}