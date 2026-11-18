package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.Period;

/**
 * Calcula la edad exacta de una persona en años, meses y días respecto a una
 * fecha de referencia.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class CalculadoraEdad {
    private CalculadoraEdad() { }

    /**
     * Calcula el periodo transcurrido entre el nacimiento y la fecha de
     * referencia. Si el nacimiento es posterior a esa fecha, la entrada es
     * inconsistente y se lanza una excepción.
     *
     * @param nacimiento fecha de nacimiento de la persona
     * @param fechaActual fecha de referencia con la que se calcula la edad
     * @return periodo en años, meses y días entre ambas fechas
     * @throws IllegalArgumentException si el nacimiento es posterior a la fecha de referencia
     */
    public static Period calcularEdad(LocalDate nacimiento, LocalDate fechaActual) {
        if (nacimiento.isAfter(fechaActual)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a la fecha actual");
        }
        return Period.between(nacimiento, fechaActual);
    }
}
