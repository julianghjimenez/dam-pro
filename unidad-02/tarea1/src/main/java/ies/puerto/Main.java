package ies.puerto;

import java.util.Scanner;

/**
 * tarea-01
 * @author Julian Gabriel Hernandez Jimenez
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        System.out.println("===============================");
        System.out.println("        TIENDA DAM-PRO         ");
        System.out.println("===============================");

        // 1. Pedir el nombre del cliente.
        System.out.print("Indique su nombre: ");
        String nombreCliente = scanner.nextLine();


        // 2. Preguntar la cantidad de productos.
        System.out.println("¿Cuántos productos vas a comprar? ");
        int cantidad = scanner.nextInt();
        if (cantidad <= 0) {
            System.out.println("Numero inválido");
        }

        System.out.println();
        scanner.nextLine();

        // 3. Inicializar el acumulador total.
        float total = 0;

        // 4. Usar un bucle for para pedir los productos.
        for (int i = 1; i < cantidad+1; i++) {

            System.out.println("Producto "+i);
            System.out.print("nombre: ");
            String nombreProduct = scanner.nextLine();

            System.out.print("precio: ");
            float precioProducto = scanner.nextFloat();

            scanner.nextLine();

            System.out.println(nombreProduct +" - "+ precioProducto + " euros");

            System.out.println();
            total += precioProducto;
        }

        // 5. Mostrar el número de productos y el total.
        System.out.println();
        System.out.println("===============================");
        System.out.println("        TOTAL DEL TICKET       ");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Productos comprados: " + cantidad);
        System.out.println("TOTAL: "+total);
        System.out.println("Gracias por su compra, "+nombreCliente);
    
        scanner.close();
    
    }
}