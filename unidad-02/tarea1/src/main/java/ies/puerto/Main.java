package ies.puerto;

import java.util.Scanner;

/**
 * tarea-01
 * @author Julian Gabriel Hernandez Jimenez
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // 1. Pedir el nombre del cliente.
        System.out.println("Indique su nombre: ");
        String nombreCliente = scanner.nextLine();

        // 2. Preguntar la cantidad de productos.
        System.out.println("Indique la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        // 3. Inicializar el acumulador total.
        float total = 0;

        // 4. Usar un bucle for para pedir los productos.
        for (int i = 0; i < cantidad ; i++) {

            System.out.println("nombre del producto: ");
            String nombreProduct = scanner.nextLine();

            System.out.println("precio del producto: ");
            float precioProducto = scanner.nextFloat();

        }
        // 5. Mostrar el número de productos y el total.
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("importe: "+total);
        System.out.println("Gracias por su compra");

        scanner.close();
    }
}