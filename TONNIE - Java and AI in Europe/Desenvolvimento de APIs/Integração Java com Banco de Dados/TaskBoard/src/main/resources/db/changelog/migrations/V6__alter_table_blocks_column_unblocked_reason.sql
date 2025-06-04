--liquibase formatted sql
--changeset raniery:v6
--comment: alter table blocks column unblocked reason

ALTER TABLE BLOCKS MODIFY COLUMN unblocked_reason VARCHAR(255) NULL;

--rollback ALTER TABLE BLOCKS MODIFY COLUMN unblocked_reason VARCHAR(255) NOT NULL;