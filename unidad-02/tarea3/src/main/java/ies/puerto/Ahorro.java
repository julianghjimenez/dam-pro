package ies.puerto;

import java.util.Scanner;

/**
 * @JulianGabrielHernandezJimenez
 * tarea-03
 */
public class Ahorro {
    public static void main(String[] args) {

        float dinerAhorrado = 0;
        float dinerAhorradoFinal = 0;
        Scanner scanner = new Scanner(System.in);

        // Pedir nombre y ahorro inicial.
        System.out.println("====================================");
        System.out.println("       SIMULADOR DE AHORRO          ");
        System.out.println("====================================");
        System.out.println();

        System.out.print("Intoduce tu nombre: ");
        String nombre = scanner.nextLine();


        do {
            System.out.println("¿Cuanto dinero tienes ahorrado?");
            dinerAhorrado = scanner.nextFloat();
        } while (dinerAhorrado < 0);
        
        
        dinerAhorradoFinal = dinerAhorrado;

        System.out.println();

        // Preparar acumuladores y contador.
        // Repetir aportaciones mediante do-while.
        int contador = 0;
        float totalAportado = 0;
        
        boolean parar = false;
            do {
                System.out.println("Hola, " + nombre);
                float aportado;
                do {
                System.out.print("Introduce una cantidad para aportar: ");
                 aportado = scanner.nextFloat();
                } while (aportado < 0);
                dinerAhorradoFinal += aportado;
                totalAportado += aportado;

                System.out.println("Aportacion registrada. Ahorro actual: " + dinerAhorradoFinal);
                System.out.println();

                scanner.nextLine();


                System.out.println("¿Deseas realizar otra aportación? (S/N): ");
                String operacion = scanner.nextLine();      
                while (!operacion.equalsIgnoreCase("s") && !operacion.equalsIgnoreCase("n")) {  
                System.out.println("¿Deseas realizar otra aportación? (S/N): ");
                operacion = scanner.nextLine();     
                }
                parar = operacion.equalsIgnoreCase("n");
              
            System.out.println();

            
                contador++;

            } while (!parar);

        scanner.close();

        // Mostrar resumen.
        System.out.println("====================================");
        System.out.println("        RESUMEN DEL AHORRO          ");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Usuario: "+nombre);
        System.out.println("Ahorro inicial: " + dinerAhorrado);
        System.out.println("Aportaciones realizadas: " + contador);
        System.out.println("Total aportado: "+ totalAportado);
        System.out.println("Ahorro final: "+ dinerAhorradoFinal);

    }
}
