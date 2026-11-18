package es.dampro.unidad2.tarea7;

import java.time.LocalDateTime;

/**
 * Comprueba si dos reservas con intervalo [inicio, fin) se solapan en el
 * tiempo.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class ComprobadorReservas {
    private ComprobadorReservas() { }

    /**
     * Indica si dos reservas se cruzan. Cada fin debe ser posterior a su
     * inicio. Dos reservas que solo coinciden en un extremo, como una que
     * termina a las 11:30 y otra que empieza a las 11:30, no se solapan.
     *
     * @param inicio1 inicio de la primera reserva
     * @param fin1 fin de la primera reserva
     * @param inicio2 inicio de la segunda reserva
     * @param fin2 fin de la segunda reserva
     * @return true si las reservas se solapan, false en caso contrario
     * @throws IllegalArgumentException si algún fin no es posterior a su inicio
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1,
                                          LocalDateTime inicio2, LocalDateTime fin2) {
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("El fin de una reserva debe ser posterior a su inicio");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}