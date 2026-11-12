package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Contar Aprovados
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    // Cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
    public static int contarAprobados(int[] notas) {
        if (notas.length == 0) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contador++;
            }
            return contador;
        }
        return 0;
    }

    public static int contarSuspenso(int[] notas) {
        int suspensos = 0;
        for (int nota:notas) {
            if (nota < 5) {
                suspensos += 1;
            }
        }
        return suspensos;
    }
    public static int contarSuspensoTop(int[] notas){
        return  -contarAprobados(notas)+notas.length;
    }
}
