package es.dampro.unidad2.tarea7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Convierte una fecha y hora con zona horaria a otra zona distinta,
 * conservando el mismo instante en el tiempo.
 *
 * @author julianghjimenez
 * @version 1.0
 */
public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Expresa el mismo instante de la reunión en la zona de destino. Se usa
     * withZoneSameInstant para que Java tenga en cuenta las diferencias
     * horarias y los cambios de hora de verano e invierno.
     *
     * @param fechaOrigen fecha y hora con la zona horaria de origen
     * @param zonaDestino zona horaria a la que se quiere convertir
     * @return fecha y hora equivalentes en la zona de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}
