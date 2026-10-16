package ies.puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float dinerAhorrado = 0;

        Scanner scanner = new Scanner(System.in);

        // Pedir nombre y ahorro inicial.
        System.out.print("Intoduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuanto dinero tienes ahorrado?");
        do {
            dinerAhorrado = scanner.nextFloat();
        } while (dinerAhorrado < 0);

        System.out.println();

        // Preparar acumuladores y contador.
        // Repetir aportaciones mediante do-while.
        boolean parar = false;
            do {
                System.out.println("Hola, " + nombre);

                System.out.print("Introduce una cantidad para ahorrar");
                int ahorrar = scanner.nextInt();

                dinerAhorrado += ahorrar;

                System.out.println("Aportacion registrada. Ahorro actual: " + dinerAhorrado);
                System.out.println();

                System.out.println("¿Deseas realizar otra aportación? (S/N): ");
                String aport = scanner.nextLine();
                if (aport.equalsIgnoreCase("n")) {
                    parar = true;
                }

                scanner.nextLine();
                System.out.println();
            } while (!false);

        // Mostrar resumen.
        scanner.close();
    }
}

