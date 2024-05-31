CREATE TABLE Fabricantes(
cod_Fabricante TINYINT(3) auto_increment NOT NULL,
nombre  varchar(15),
pais varchar(15) default 'España',
constraint  pk_Fabricante primary key(cod_Fabricante),
constraint comprobar_nombre check(nombre = Upper(nombre)),
constraint comprobar_pais check(pais = Upper(pais))
);

CREATE TABLE ARTICULOS(
articulo varchar(20) not null,
cod_fabricante TINYINT(3) not null,
peso TINYINT(3) not null,
categoria VARCHAR(10) not null,
precio_venta FLOAT(6,2),
precio_costo FLOAT(6,2),
existencias INT, 
constraint PK_primaria Primary key(ARTICULO,COD_FABRICANTE,PESO,CATEGORIA),
CONSTRAINT Comprobar CHECK (precio_venta > 0 AND precio_costo > 0 AND peso > 0),
constraint Categoria check (categoria in('Primera','Segunda','Tercera'))

);

-- Ejercicio 3
ALTER TABLE Fabricantes
ADD clase_fabricante varchar(10),
ADD CONSTRAINT uq_nombre unique (nombre);
-- Ejercicio 4
AlTER TABLE ARTICULOS
CHANGE COLUMN PRECIO_VENTA precio_venta FLOAT(7,2),
CHANGE COLUMN PRECIO_COSTO precio_costo FLOAT(7,2);


-- Ejercicio 5
ALTER TABLE ARTICULOS
ADD CONSTRAINT FK_COD_FABRICANTE
FOREIGN KEY (cod_Fabricante)
references fabricantes(cod_Fabricante)
on delete cascade;



