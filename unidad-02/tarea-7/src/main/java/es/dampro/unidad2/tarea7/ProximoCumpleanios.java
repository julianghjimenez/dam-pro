package es.dampro.unidad2.tarea7;

import java.time.LocalDate;

/**
 * Calcula la fecha del próximo cumpleaños de una persona.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Devuelve la fecha del próximo cumpleaños, contando también el día de
     * hoy. Para quienes nacieron un 29 de febrero se usa el 28 de febrero en
     * los años que no son bisiestos.
     *
     * @param nacimiento fecha de nacimiento de la persona
     * @param hoy fecha de referencia
     * @return fecha del próximo cumpleaños, que puede ser hoy mismo
     * @throws IllegalArgumentException si el nacimiento es posterior a hoy
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento no puede ser posterior a hoy");
        }
        LocalDate cumpleEsteAnio = nacimiento.withYear(hoy.getYear());
        if (cumpleEsteAnio.isBefore(hoy)) {
            return nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumpleEsteAnio;
    }
}