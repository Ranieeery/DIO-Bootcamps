--liquibase formatted sql
--changeset raniery:v4
--comment: create blocks table

CREATE TABLE BLOCKS (
    id             BIGINT AUTO_INCREMENT PRIMARY KEY,
    block_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    block_reason   VARCHAR(255) NOT NULL,
    unblock_at     TIMESTAMP NULL,
    unblock_reason VARCHAR(255) NOT NULL,
    card_id        BIGINT       NOT NULL,
    CONSTRAINT cards__blocks_fk FOREIGN KEY (card_id) REFERENCES CARDS (id) ON DELETE CASCADE
) ENGINE=InnoDB;

--rollback DROP TABLE BLOCKS