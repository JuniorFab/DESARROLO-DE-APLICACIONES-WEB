-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.35 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para nose
CREATE DATABASE IF NOT EXISTS `nose` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `nose`;

-- Volcando estructura para procedimiento nose.Ejercicio2
DELIMITER //
CREATE PROCEDURE `Ejercicio2`(
	IN `Cadena` VARCHAR(50)
)
BEGIN
SELECT REVERSE(Cadena);
END//
DELIMITER ;

-- Volcando estructura para procedimiento nose.Hello_Pirri
DELIMITER //
CREATE PROCEDURE `Hello_Pirri`()
BEGIN
	
Select 'Hola Pirri' as Mensanje1 ; 
Select 'Te estan buscando juan 'As Mensaje2;
END//
DELIMITER ;

-- Volcando estructura para procedimiento nose.MayorYMenor
DELIMITER //
CREATE PROCEDURE `MayorYMenor`(
	IN `Num1` INT,
	IN `Num2` INT,
	IN `Num3` INT
)
BEGIN
DECLARE mayoromenosoigual VARCHAR(40);
IF Num1<Num2 AND Num3<Num2 then
	SET mayoromenosoigual='El numero '+num2+' es mayor que '+num1+ 'y ' +num3;
ELSEIF Num2<Num1 AND Num3<Num1 then 
	SET mayoromenosoigual='El numero '+num1+' es mayor que '+num2+ 'y ' +num3;
ELSE  SET mayoromenosoigual='El numero '+num3+' es mayor que '+num2+ 'y ' +num1;
END IF;
SELECT  mayoromenosoigual;

END//
DELIMITER ;

-- Volcando estructura para procedimiento nose.Saludar
DELIMITER //
CREATE PROCEDURE `Saludar`(IN nombre Varchar(20))
BEGIN
select concat('hola', ' ', nombre);
END//
DELIMITER ;

-- Volcando estructura para función nose.Bucle
DELIMITER //
CREATE FUNCTION `Bucle`(
	`n` INT
) RETURNS int
BEGIN
		
 
  DECLARE total,num INT DEFAULT 0 ;
  WHILE num<= n DO
    SET total = total+num;
     SET num=num + 1;
  END WHILE;
RETURN (total);

END//
DELIMITER ;

-- Volcando estructura para función nose.Diase_mana
DELIMITER //
CREATE FUNCTION `Diase_mana`(
	`num` INT
) RETURNS varchar(15) CHARSET utf8mb4
    NO SQL
BEGIN
DECLARE dia varchar(15);
IF num = 1 THEN
set dia = 'Lunes';
ELSEIF num = 2 then
SET dia = 'Martes';
ELSEIF num =3 then
SET dia='Miercoles';
ELSEIF num=4 then
SET dia='Jueves'  ;
ELSEIF num = 5 then
SET dia='Viernes ' ;
ELSEIF num=6 then
SET dia='Sabado' ;
ELSE SET dia='Domingo ';
END IF;
RETURN (dia);
END//
DELIMITER ;

-- Volcando estructura para función nose.Fun_estado
DELIMITER //
CREATE FUNCTION `Fun_estado`(
	`in_estado` CHAR(1)
) RETURNS varchar(15) CHARSET utf8mb4
    NO SQL
BEGIN
DECLARE estado varchar(15);
IF in_estado = 'C' THEN
set estado = 'caducado';
ELSEIF in_estado = 'N' then
SET estado = 'nuevo';
ELSEIF In_estado ='A' then
SET estado='Activo';
END IF;
RETURN (estado);
END//
DELIMITER ;

-- Volcando estructura para función nose.ParoImpar
DELIMITER //
CREATE FUNCTION `ParoImpar`(
	`Num1` INT
) RETURNS varchar(15) CHARSET utf8mb4
    NO SQL
BEGIN
DECLARE ParOImpar varchar(15) ;
IF  MOD(num1,2)=0 THEN
set ParOImpar = 'Es par';
ELSE set ParOImpar = 'No es par';
END IF;
RETURN (ParOImpar);
END//
DELIMITER ;

-- Volcando estructura para función nose.YEAR_actual
DELIMITER //
CREATE FUNCTION `YEAR_actual`(
	`datea` DATE
) RETURNS int
    NO SQL
BEGIN

RETURN YEAR(datea);

END//
DELIMITER ;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
