--liquibase formatted sql

-- changeset francocabreradev@gmail.com:mensajes/1
CREATE TABLE `mensajes` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `contacto` VARCHAR(255) NOT NULL,
    `contenido` VARCHAR(1000) NOT NULL,
    PRIMARY KEY (`id`)
);