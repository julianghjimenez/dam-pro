package es.educacion.arrays;

// Cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    // Cuenta las notas >= 5. Array vacío: 0. Null: IllegalArgumentException.
    public static int contarAprobados(int[] notas) {
        throw new UnsupportedOperationException();
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
