package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Calcula fechas de vencimiento sumando o restando años, meses y días a una
 * fecha de partida.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    /**
     * Aplica primero los años, luego los meses y finalmente los días a la
     * fecha indicada. Admite valores negativos y deja que LocalDate ajuste
     * los finales de mes, por ejemplo 31 de enero más un mes da 28 de febrero.
     *
     * @param fecha fecha de partida
     * @param dias días a sumar (o restar si es negativo)
     * @param meses meses a sumar (o restar si es negativo)
     * @param anios años a sumar (o restar si es negativo)
     * @return fecha de vencimiento resultante
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}