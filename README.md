# trabajadores
Scripts necesarios en la base de datos
CREATE SCHEMA `cap` ;

CREATE TABLE `cap`.`trabajadores` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `apellido` VARCHAR(100) NULL,
  `telefono` VARCHAR(25) NULL,
  `email` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);

INSERT INTO `cap`.`trabajadores` (`nombre`, `apellido`, `telefono`, `email`) VALUES ('Cristian', 'Acosta', '3219018558', 'cacosta@gmail.com');
