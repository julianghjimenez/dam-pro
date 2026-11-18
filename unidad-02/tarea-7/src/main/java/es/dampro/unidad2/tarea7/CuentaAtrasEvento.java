package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Calcula cuántos días naturales faltan (o han pasado) para un evento.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    /**
     * Cuenta los días naturales con signo desde hoy hasta el evento: positivo
     * si el evento todavía no ha ocurrido, cero si es hoy y negativo si ya
     * sucedió.
     *
     * @param hoy fecha de referencia
     * @param evento fecha en la que tiene lugar el evento
     * @return número de días con signo entre hoy y el evento
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}
