--liquibase formatted sql
--changeset raniery:v1
--comment: task board create table

CREATE TABLE BOARDS (
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

--rollback DROP TABLE BOARDS