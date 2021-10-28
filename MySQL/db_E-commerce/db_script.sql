-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_E-commerce
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_E-commerce
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_E-commerce` ;
USE `db_E-commerce` ;

-- -----------------------------------------------------
-- Table `db_E-commerce`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_E-commerce`.`categoria` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `artesanal` ENUM("decoração", "alimentação", "cosmetico") NOT NULL,
  `forma_pagamento` ENUM("a vista", "cartão", "pix") NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_E-commerce`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_E-commerce`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(255) NOT NULL,
  `email_usuario` VARCHAR(255) NOT NULL,
  `senha_usuario` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_E-commerce`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_E-commerce`.`produto` (
  `id_produto` BIGINT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `codigo` VARCHAR(45) NOT NULL,
  `quantidade` INT NOT NULL,
  `preco` DOUBLE NOT NULL,
  `fk _categoria_id` INT NOT NULL,
  `fk_usuario` INT NOT NULL,
  PRIMARY KEY (`id_produto`, `fk _categoria_id`, `fk_usuario`),
  INDEX `fk_categoria_has_usuario_usuario1_idx` (`fk_usuario` ASC) VISIBLE,
  INDEX `fk_categoria_has_usuario_categoria_idx` (`fk _categoria_id` ASC) VISIBLE,
  CONSTRAINT `fk_categoria_has_usuario_categoria`
    FOREIGN KEY (`fk _categoria_id`)
    REFERENCES `db_E-commerce`.`categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_categoria_has_usuario_usuario1`
    FOREIGN KEY (`fk_usuario`)
    REFERENCES `db_E-commerce`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
