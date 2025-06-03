--liquibase formatted sql
--changeset raniery:v5
--comment: remove order column from cards and rename block/unblock columns in blocks

ALTER TABLE CARDS
    DROP COLUMN `order`;

ALTER TABLE BLOCKS
    CHANGE COLUMN block_at blocked_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE BLOCKS
    CHANGE COLUMN block_reason blocked_reason VARCHAR(255) NOT NULL;

ALTER TABLE BLOCKS
    CHANGE COLUMN unblock_at unblocked_at TIMESTAMP NULL;

ALTER TABLE BLOCKS
    CHANGE COLUMN unblock_reason unblocked_reason VARCHAR(255) NOT NULL;

--rollback ALTER TABLE CARDS ADD COLUMN `order` INT NOT NULL DEFAULT 0;
--rollback ALTER TABLE BLOCKS CHANGE COLUMN blocked_at block_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
--rollback ALTER TABLE BLOCKS CHANGE COLUMN blocked_reason block_reason VARCHAR(255) NOT NULL;
--rollback ALTER TABLE BLOCKS CHANGE COLUMN unblocked_at unblock_at TIMESTAMP NULL;
--rollback ALTER TABLE BLOCKS CHANGE COLUMN unblocked_reason unblock_reason VARCHAR(255) NOT NULL;
