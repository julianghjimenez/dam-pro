package es.dampro.unidad2.tarea7;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Calcula el tiempo efectivo trabajado en una jornada que empieza y termina
 * el mismo día, descontando el descanso.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Resta el descanso a la duración entre la entrada y la salida. La salida
     * debe ser estrictamente posterior a la entrada y el descanso no puede ser
     * negativo ni superar la duración de la jornada.
     *
     * @param entrada hora de entrada al trabajo
     * @param salida hora de salida del trabajo
     * @param descansoMinutos minutos de descanso a descontar
     * @return duración del tiempo trabajado
     * @throws IllegalArgumentException si las horas o el descanso son inconsistentes
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)) {
            throw new IllegalArgumentException("La salida debe ser posterior a la entrada");
        }
        if (descansoMinutos < 0) {
            throw new IllegalArgumentException("El descanso no puede ser negativo");
        }
        Duration jornada = Duration.between(entrada, salida);
        Duration descanso = Duration.ofMinutes(descansoMinutos);
        if (descanso.compareTo(jornada) > 0) {
            throw new IllegalArgumentException("El descanso no puede superar la duración de la jornada");
        }
        return jornada.minus(descanso);
    }
}