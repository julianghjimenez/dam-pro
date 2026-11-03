package es.dampro.unidad2.tarea6;

/**
 * @author julianghjimenez
 * @version 1.0.0
 * Main
 */
public final class Main {
    private Main() { }
    
    /**
     * Funcion encargada de presentar todos los programas
     * @param argumentos
     */
    public static void main(String[] argumentos) {
        System.out.println("InvertirCadena: " + InvertirCadena.invertir("Hola Java"));
        System.out.println("Palindromo: " + Palindromo.esPalindromo("Anita lava la tina"));
        System.out.println("ContadorVocales: " + ContadorVocales.contarVocales("Murciélago"));
        System.out.println("SumaDigitos: " + SumaDigitos.sumarDigitos("5832"));
        System.out.println("MayorNumero: " + MayorNumero.obtenerMayor("12,-5,89"));
        System.out.println("BinarioDecimal: " + BinarioDecimal.convertirBinario("1011"));
        System.out.println("Factorial: " + Factorial.calcularFactorial("5"));
        System.out.println("NumeroPrimo: " + NumeroPrimo.esPrimo("17"));
        System.out.println("EcuacionCuadratica: "
                + EcuacionCuadratica.calcularDiscriminante("1", "-5", "6"));
        System.out.println("MediaNumeros: " + MediaNumeros.calcularMedia("10,20,30,40"));
    }
}
