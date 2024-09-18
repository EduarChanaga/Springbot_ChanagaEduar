package com.example.Dia2_tarea.model;

public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public Product(Long id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        setPrice(price); // Uso del setter para validación
        setQuantity(quantity); // Uso del setter para validación
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Precio: %.2f | Cantidad: %d", id, name, price, quantity);
    }
}
