package src.main.java.es.dampro.unidad2.tarea6;

import java.util.Scanner;

/**
 * @author Julianghjimenez
 * @version 1.0.0
 * BinarioDecimal
 */
public final class BinarioDecimal {

    private BinarioDecimal() {
        // Clase de algoritmos estáticos.
    }

    /**
     * TODO: explica el algoritmo y su comportamiento con datos límite.
     * @param sBinario Dato de entrada que debe cumplir el contrato del enunciado.
     * @return Número decimal correspondiente.
     */
    public static int convertirBinario(String sBinario) {
       if (sBinario == null){
           throw new IllegalArgumentException();
       }
       if (sBinario.isEmpty()){
           return 0;
       }
       int resultado = 0;
        for (int i = 0; i <= sBinario.length(); i++) {
            int convertir = (int) Math.pow(2, i);
            Character caracter = sBinario.charAt(i);

        }
       return resultado;
    }

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intoduce un binario: ");
        String sBinario = teclado.nextLine();

        int resultado = convertirBinario(sBinario);
        System.out.println("resultado: "+resultado);
    }
}
