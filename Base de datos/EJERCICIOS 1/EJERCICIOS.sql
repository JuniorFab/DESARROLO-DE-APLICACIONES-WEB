/*---Dos formas de hace tablas---*/
/*
create table provincias (
codigo tinyint PRIMARY KEY,
nombre varchar(25) NOT NULL);*/

create table provincias (
codigo tinyint ,
nombre varchar(25) NOT NULL,
CONSTRAINT PK_provincias PRIMARY KEY (codigo));
/*-----Borrar tabla-----*/
drop table provincias;
/*----Insertar una fila-----*/
insert into provincias values(10,'Murcia');
insert into provincias values(20,'Madrid');

/*----Crear otra table---*/
CREATE TABLE ciudades(
nombre varchar(25),
habitantes int UNSIGNED NOT NULL,
pais varchar(25) default "ESPAÑA");
/*---Insertar---*/
INSERT INTO ciudades(nombre,habitantes)
values('Mula',55000);


-- Ejercicio3

CREATE TABLE BLOQUEPISOS(
Calle VARCHAR(30) NOT NULL,
numero TINYINT NOT NULL,
piso TINYINT NOT NULL,
puerta CHAR(1) NOT NULL,
codigo_Postal TINYINT NOT NULL,
metros TINYINT ,
comentarios VARCHAR(60),
cod_zona TINYINT ,
dni VARCHAR(10),
CONSTRAINT PK_VIV PRIMARY KEY(calle,numero,piso,puerta,codigo_postal));
-- Ejercicio 4
CREATE TABLE animales(
id TINYINT auto_increment ,
Nombre VARCHAR(30) NOT NULL UNIQUE ,
CONSTRAINT PK_ID PRIMARY KEY(id));

INSERT INTO animales (nombre) VALUES ("GATO");
INSERT INTO animales (nombre) VALUES ("PERRO");

-- Ejercicio 5 ---
Create table edades(
nombre varchar(25) primary key,
edad tinyint,
cod_provincia tinyint,
constraint fk_Codprov foreign key(cod_provincia) references provincias(codigo)
);
-- Ejercicio 6--




