package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Calcula la fecha y hora de llegada de un viaje a partir de su salida y de
 * su duración.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Suma una duración, expresada en horas y minutos no negativos, a la fecha
     * y hora de salida. Puede cambiar de día, de mes o de año.
     *
     * @param salida fecha y hora de salida
     * @param horas horas de duración del viaje, no negativas
     * @param minutos minutos de duración del viaje, no negativos
     * @return fecha y hora de llegada
     * @throws IllegalArgumentException si las horas o los minutos son negativos
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}