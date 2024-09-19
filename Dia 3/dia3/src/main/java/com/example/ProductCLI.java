// ProductCLI.java
package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductCLI {

    @Autowired
    private ProductService productService;

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Gestión de Productos ===");
            System.out.println("1. Ver todos los productos");
            System.out.println("2. Ver producto por ID");
            System.out.println("3. Añadir nuevo producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (option) {
                case 1:
                    showAllProducts();
                    break;
                case 2:
                    findProductById();
                    break;
                case 3:
                    addNewProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private void showAllProducts() {
        System.out.println("\n=== Lista de Productos ===");
        productService.getAllProducts().forEach(System.out::println);
    }

    private void findProductById() {
        System.out.print("Ingrese el ID del producto: ");
        Long id = scanner.nextLong();
        Product product = productService.getProductById(id);
        System.out.println(product != null ? product : "Producto no encontrado.");
    }

    private void addNewProduct() {
        try {
            System.out.print("Nombre del producto: ");
            String name = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double price = scanner.nextDouble();
            System.out.print("Cantidad: ");
            int quantity = scanner.nextInt();

            Product newProduct = new Product(name, price, quantity);

            productService.addProduct(newProduct);
            System.out.println("Producto añadido exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al añadir el producto: " + e.getMessage());
        }
    }

    private void deleteProduct() {
        System.out.print("Ingrese el ID del producto a eliminar: ");
        Long id = scanner.nextLong();
        productService.deleteProduct(id);
        System.out.println("Producto eliminado.");
    }
}