CREATE KEYSPACE alunos_sala WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
USE alunos_sala;

CREATE COLUMNFAMILY alunos (
    id UUID PRIMARY KEY,
    name TEXT,
    age INT
);
SELECT * FROM alunos;

INSERT INTO alunos (id, name, age) VALUES (uuid(), 'Alice', 20);
INSERT INTO ALUNOS JSON '
{
    "id": "f47ac10b-58cc-4372-a567-0e02b2c3d479",
    "name": "Albedo"
}';

SELECT age, WRITETIME(age) FROM alunos;

SELECT * FROM alunos WHERE name = 'Alice';
SELECT JSON * FROM alunos WHERE name = 'Albedo';

UPDATE alunos SET age = 21 WHERE name = 'Albedo';

ALTER COLUMNFAMILY alunos ADD hobby TEXT;
UPDATE alunos SET hobby = 'Reading' WHERE name = 'Alice';

DELETE FROM alunos WHERE name = 'Albedo';