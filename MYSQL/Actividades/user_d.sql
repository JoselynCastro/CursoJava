-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Panel
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Panel
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Panel` DEFAULT CHARACTER SET utf8 ;
USE `Panel` ;

-- -----------------------------------------------------
-- Table `Panel`.`Nivel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Panel`.`Nivel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre_nivel` VARCHAR(45) NULL,
  `created_at` DATETIME NULL,
  `update_at` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Panel`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Panel`.`Usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(255) NOT NULL,
  `apellido` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `Nivel_id` INT NOT NULL,
  `nivel_usuario` VARCHAR(45) NULL,
  `descripcion` TEXT NULL,
  `created_at` DATETIME NULL,
  `update_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Usuarios_Nivel1_idx` (`Nivel_id` ASC) VISIBLE,
  CONSTRAINT `fk_Usuarios_Nivel1`
    FOREIGN KEY (`Nivel_id`)
    REFERENCES `Panel`.`Nivel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Panel`.`Mensajes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Panel`.`Mensajes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Usuario_id` INT NOT NULL,
  `to_usuario_id` INT NOT NULL,
  `contenido` TEXT NULL,
  `created_at` DATETIME NULL,
  `update_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Mensajes_Usuarios_idx` (`Usuario_id` ASC) VISIBLE,
  INDEX `fk_Mensajes_Usuarios1_idx` (`to_usuario_id` ASC) VISIBLE,
  CONSTRAINT `fk_Mensajes_Usuarios`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `Panel`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Mensajes_Usuarios1`
    FOREIGN KEY (`to_usuario_id`)
    REFERENCES `Panel`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Panel`.`Comentarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Panel`.`Comentarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Usuario_id` INT NOT NULL,
  `Mensaje_id` INT NOT NULL,
  `contenido` TEXT NULL,
  `created_at` DATETIME NULL,
  `update_at` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Comentarios_Usuarios1_idx` (`Usuario_id` ASC) VISIBLE,
  INDEX `fk_Comentarios_Mensajes1_idx` (`Mensaje_id` ASC) VISIBLE,
  CONSTRAINT `fk_Comentarios_Usuarios1`
    FOREIGN KEY (`Usuario_id`)
    REFERENCES `Panel`.`Usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comentarios_Mensajes1`
    FOREIGN KEY (`Mensaje_id`)
    REFERENCES `Panel`.`Mensajes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
