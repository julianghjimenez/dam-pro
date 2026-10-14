package ies.puerto;

import java.util.Scanner;

/**
 * @author Julian Gabriel Hernandez Jimenez
 *tarea-02
 */
public class conversor {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("         CONVERSOR DAM-PRO          ");
        System.out.println("====================================");

        System.out.println();

        // 1. Solicitar el nombre del usuario.

        System.out.print("Introduce tu nombre: ");
        String nombreUsusario = scanner.nextLine();

        System.out.println();

        System.out.println("Bienvenido/a, " + nombreUsusario);

        // 2. Declarar opción y contador de conversiones.
        int opcion = 0;
        float contador = 0;

        // 3. Crear el bucle while del menú.
        boolean parar = false;
        while (!parar) {

            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");

            System.out.println();

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Introduce los kilómetros: ");
                    float kilometros = scanner.nextFloat();

                    while (kilometros < 0) {
                        System.out.println("La distancia no puede ser negativa. Inténtalo de nuevo:");
                        kilometros = scanner.nextFloat();
                    }

                    float metros = kilometros * 1000;
                    System.out.println("Resultado: " + metros + " metros");

                    contador++;
                    System.out.println("Conversión realizada correctamente");
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Introduce los metros: ");
                    float metros = scanner.nextFloat();

                    while (metros < 0) {
                        System.out.println("La distancia no puede ser negativa. Inténtalo de nuevo:");
                        metros = scanner.nextFloat();
                    }
                    float centimetros = metros * 100;
                    System.out.println("Resultado: " + centimetros + " centímetros");

                    contador++;
                    System.out.println("Conversión realizada correctamente");
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("Introduce los kilómetros: ");
                    float kilometros = scanner.nextFloat();

                    while (kilometros < 0) {
                        System.out.println("La distancia no puede ser negativa. Inténtalo de nuevo:");
                        kilometros = scanner.nextFloat();
                    }
                    float millas = kilometros * 0.621371f;
                    System.out.println("Resultado: " + millas + " millas");

                    contador++;
                    System.out.println("Conversión realizada correctamente");
                    System.out.println();
                    break;
                }
                case 4:
                    parar = true;
                    break;

                default:
                    System.out.println();
                    System.out.println("Opción no válida");
                    System.out.println();
            }

        }
        // 6. Mostrar el resumen al salir.
        System.out.println();
        System.out.println("====================================");
        System.out.println("Usuario: "+nombreUsusario);
        System.out.println("conversiones realizadas: "+ contador);
        System.out.println("Graacias por ultilizar DAM-PRO");
        System.out.println("====================================");
        scanner.close();

    }
    

    
}
