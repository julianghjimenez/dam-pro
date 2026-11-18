package es.dampro.unidad2.tarea7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
 * Convierte textos con formato dd/MM/uuuu en fechas, rechazando de forma
 * estricta cualquier cadena incorrecta o fecha imposible.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class ValidadorFechas {
    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    private ValidadorFechas() { }

    /**
     * Interpreta el texto con dos dígitos para el día, dos para el mes y
     * cuatro para el año. Usa el modo estricto, de modo que 29/02/2025 o
     * 31/04/2026 se consideran inválidas.
     *
     * @param texto cadena con la fecha en formato dd/MM/uuuu
     * @return la fecha interpretada
     * @throws DateTimeParseException si el texto no tiene el formato o la fecha no existe
     */
    public static LocalDate validarFecha(String texto) {
        return LocalDate.parse(texto, FORMATO);
    }
}