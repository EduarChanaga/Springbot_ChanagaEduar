-- Crear la base de datos
CREATE DATABASE restaurant_management;

-- Usar la base de datos
USE restaurant_management;

-- Crear la tabla para los platos del menú
CREATE TABLE Plato (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    disponibilidad BOOLEAN NOT NULL
);

-- Crear la tabla para registrar el estado de las mesas
CREATE TABLE Mesa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_mesa INT NOT NULL UNIQUE,
    ocupada BOOLEAN NOT NULL
);