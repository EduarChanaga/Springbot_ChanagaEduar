package com.example.Dia2_tarea;

public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public Product(Long id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters y setters

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Precio: %.2f | Cantidad: %d", id, name, price, quantity);
    }
}
