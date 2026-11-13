package es.educacion.arrays;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Fusionar Ordenados
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    /**
     *
     * @param primero
     * @param segundo
     * @return
     */
    public static int[] fusionar(int[] primero, int[] segundo) {
        if (primero == null || segundo == null) {
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[primero.length + segundo.length];
      int posicion1 = 0;
      int posicion2 = 0;
      int posicion3 = 0;

      while (posicion1 < primero.length && posicion2 < segundo.length) {
          if (primero[posicion1] <= segundo[posicion2]) {
              resultado[posicion3] = primero[posicion1];
              posicion1++;
              posicion3++;
          } else {
              resultado[posicion3] = segundo[posicion2];
              posicion2++;
              posicion3++;
          }
      }
      while (posicion1 < primero.length) {
          resultado[posicion3] = primero[posicion1];
          posicion1++;
          posicion3++;
      }

      while (posicion2 < segundo.length) {
          resultado[posicion3] = segundo[posicion2];
          posicion2++;
          posicion3++;

      }

        return resultado;
    }
}
