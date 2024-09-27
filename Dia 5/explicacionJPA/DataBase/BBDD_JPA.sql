CREATE DATABASE explicacionJPA_P1;

USE explicacionJPA_P1;

-- API CRUD de Persona basada en Spring Data
CREATE TABLE person(
	id int primary key auto_increment,
    name varchar(255) null,
    age int not null
);

SELECT * FROM person;