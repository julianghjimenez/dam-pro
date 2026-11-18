package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Analiza una fecha del calendario y resume sus datos principales en una
 * sola cadena de texto.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class AnalizadorFecha {
    private AnalizadorFecha() { }

    /**
     * Devuelve la fecha en formato ISO, su día de la semana (enum en inglés),
     * su posición dentro del año, si el año es bisiesto y cuántos días tiene
     * su mes, todo separado por barras verticales.
     *
     * @param fecha fecha que se quiere analizar
     * @return cadena con el formato AAAA-MM-DD|DAY_OF_WEEK|DIA_DEL_ANIO|true/false|DIAS_MES
     */
    public static String analizarFecha(LocalDate fecha) {
        return fecha
                + "|" + fecha.getDayOfWeek()
                + "|" + fecha.getDayOfYear()
                + "|" + fecha.isLeapYear()
                + "|" + fecha.lengthOfMonth();
    }
}
