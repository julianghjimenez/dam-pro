package ies.puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float dinerAhorrado = 0;

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

        System.out.println();

        // Preparar acumuladores y contador.
        // Repetir aportaciones mediante do-while.
        int contador = 0;
        int aportado = 0;
        boolean parar = false;
            do {
                System.out.println("Hola, " + nombre);

                System.out.print("Introduce una cantidad para aportar: ");
                aportado = scanner.nextInt();

                dinerAhorrado += aportado;

                System.out.println("Aportacion registrada. Ahorro actual: " + dinerAhorrado);
                System.out.println();

                scanner.nextLine();

                System.out.println("¿Deseas realizar otra aportación? (S/N): ");
                String operacion = scanner.nextLine();
                if (operacion.equalsIgnoreCase("n")) {
                    parar = true;
                }

                System.out.println();

                aportado++;
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
        System.out.println("Total aportado: "+ aportado);
        System.out.println("Ahorro final: "+dinerAhorrado);

    }
}

