-- Hacemos la tabla
CREATE TABLE FABRICANTES (
    Cod_Fab INT PRIMARY KEY,
    Nom_Fab VARCHAR(50)
);

CREATE TABLE PRODUCTOS (
    Cod_Prod INT PRIMARY KEY,
    Nom_Prod VARCHAR(50),
    Precio INT,
    Cod_Fab INT,
    FOREIGN KEY (Cod_Fab) REFERENCES FABRICANTES(Cod_Fab)
);

INSERT INTO FABRICANTES (Cod_Fab, Nom_Fab) VALUES
(1, 'INVES'),
(2, 'IBM'),
(3, 'TOSHIBA'),
(4, 'HP'),
(5, 'COMPAQ');

INSERT INTO PRODUCTOS (Cod_Prod, Nom_Prod, Precio, Cod_Fab) VALUES
(1, 'Portátil', 1000, 1),
(2, 'Ratón', 25, 4),
(3, 'Teclado', 60, 4),
(4, 'Monitor', 150, 1),
(5, 'Disquetera', 65, 3),
(6, 'Lector DVD', 30, 3),
(7, 'Grabadora DVD', 65, 3),
(8, 'Combo', 120, 1),
(9, 'Impresora', 280, 4),
(10, 'Escáner', 170, 4);


-- Ejercicio1
Select productos.Nom_Prod,productos.Precio,fabricantes.Nom_Fab
From productos Natural Join fabricantes;

-- Ejercicio2
Select Cod_Fab, round(AVG(Precio ),2) AS 'Precio medio '
from productos
group by Cod_Fab;

-- Ejercicio3
 Select fabricantes.Nom_Fab,fabricantes.Cod_Fab, round(AVG(precio),2) AS 'Precio Medio '
 from productos  inner join fabricantes
 on productos.Cod_Fab=fabricantes.Cod_Fab
 group by Cod_Fab;
-- Ejercicio 4
Select fabricantes.Nom_Fab
from productos inner join fabricantes
on productos.Cod_Fab=fabricantes.Cod_Fab
group by fabricantes.Cod_Fab
HAVING AVG(precio) > 150 ;

-- Ejercicio 5
INSERT into productos
VALUES(11,"Altavoces", 70, 2);

-- Ejercicio 6
Update productos
set nom_prod='Impresora Laser'
where cod_prod=8;

-- Ejercicio 7
UPDATE productos
set precio = precio - (precio * 0.1)
where cod_fab=4;
-- Ejercicio 8
UPDATE productos
set precio = precio - 15
WHERE precio >= 120;

-- Ejercicio 9
	-- A 
 SET AUTOCOMMIT=OFF;
 START TRANSACTION;
	-- B
DELETE FROM fabricantes
WHERE cod_fab NOT IN(SELECT cod_fab FROM productos GROUP BY cod_fab);
	-- C 
    Select *
    from fabricantes;
	-- D
     ROLLBACK  ;
  -- E
 SELECT *
 from fabricantes;
 
-- Ejercicio 10
	-- A 
	SET AUTOCOMMIT = OFF;
	START TRANSACTION;
	-- B
DELETE FROM fabricantes
WHERE Cod_Fab IN (SELECT Cod_Fab FROM productos GROUP BY cod_fab HAVING MAX(precio) >= 150);
    
    -- C
    Select *
    from fabricantes;
    -- D 
    ROLLBACK;
    -- E
	Select *
    from fabricantes;
    
    
    
 



