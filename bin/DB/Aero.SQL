-- MySQL Workbench Synchronization
-- Generated: 2022-11-30 19:38
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: joao.franco
-- João Ignacio Castro Franco

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `mydb`.`voo` (
  `idvoo` INT(11) NOT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `data` VARCHAR(8) NULL DEFAULT NULL,
  `hora` VARCHAR(4) NULL DEFAULT NULL,
  `origem` VARCHAR(3) NULL DEFAULT NULL,
  `destino` VARCHAR(3) NULL DEFAULT NULL,
  `piloto` VARCHAR(255) NULL DEFAULT NULL,
  `observacao` VARCHAR(255) NULL DEFAULT NULL,
  `id_pista` INT(11) NOT NULL,
  `id_jato` INT(11) NOT NULL,
  `id_aviao` INT(11) NOT NULL,
  `id_helicoptero` INT(11) NOT NULL,
  PRIMARY KEY (`idvoo`),
  INDEX `fk_voo_pista_idx` (`id_pista` ASC) VISIBLE,
  INDEX `fk_voo_jato1_idx` (`id_jato` ASC) VISIBLE,
  INDEX `fk_voo_aviao1_idx` (`id_aviao` ASC) VISIBLE,
  INDEX `fk_voo_helicoptero1_idx` (`id_helicoptero` ASC) VISIBLE,
  CONSTRAINT `fk_voo_pista`
    FOREIGN KEY (`id_pista`)
    REFERENCES `mydb`.`pista` (`idpista`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_jato1`
    FOREIGN KEY (`id_jato`)
    REFERENCES `mydb`.`jato` (`idjato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_aviao1`
    FOREIGN KEY (`id_aviao`)
    REFERENCES `mydb`.`aviao` (`idaviao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_helicoptero1`
    FOREIGN KEY (`id_helicoptero`)
    REFERENCES `mydb`.`helicoptero` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`pista` (
  `idpista` INT(11) NOT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`idpista`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`helicoptero` (
  `id` INT(11) NOT NULL,
  `marca` VARCHAR(255) NULL DEFAULT NULL,
  `cor` VARCHAR(255) NULL DEFAULT NULL,
  `capacidade` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`aviao` (
  `idaviao` INT(11) NOT NULL,
  `marca` VARCHAR(255) NULL DEFAULT NULL,
  `modelo` VARCHAR(255) NULL DEFAULT NULL,
  `prefixo` VARCHAR(3) NULL DEFAULT NULL,
  `capacidade` INT(11) NULL DEFAULT NULL,
  `id_companhia` INT(11) NOT NULL,
  PRIMARY KEY (`idaviao`),
  INDEX `fk_aviao_companhia1_idx` (`id_companhia` ASC) VISIBLE,
  CONSTRAINT `fk_aviao_companhia1`
    FOREIGN KEY (`id_companhia`)
    REFERENCES `mydb`.`companhia` (`idcompanhia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`companhia` (
  `idcompanhia` INT(11) NOT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `cnpj` VARCHAR(14) NULL DEFAULT NULL,
  PRIMARY KEY (`idcompanhia`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`hangar` (
  `idhangar` INT(11) NOT NULL,
  `local` VARCHAR(255) NULL DEFAULT NULL,
  `id_aviao` INT(11) NOT NULL,
  PRIMARY KEY (`idhangar`),
  INDEX `fk_hangar_aviao1_idx` (`id_aviao` ASC) VISIBLE,
  CONSTRAINT `fk_hangar_aviao1`
    FOREIGN KEY (`id_aviao`)
    REFERENCES `mydb`.`aviao` (`idaviao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `mydb`.`jato` (
  `idjato` INT(11) NOT NULL,
  `marca` VARCHAR(255) NULL DEFAULT NULL,
  `modelo` VARCHAR(255) NULL DEFAULT NULL,
  `cor` VARCHAR(255) NULL DEFAULT NULL,
  `velocidade` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idjato`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
