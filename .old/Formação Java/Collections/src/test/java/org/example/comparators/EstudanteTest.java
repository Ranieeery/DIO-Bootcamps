// Path: src\test\java\org\example\comparators\Estudante.java
package org.example.comparators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstudanteTest {
    @Test
    void testEstudante() {
        Estudante estudante1 = new Estudante("João", 19);
        Estudante estudante2 = new Estudante("Maria", 23);
        Estudante estudante3 = new Estudante("Pedro", 21);
        Estudante estudante4 = new Estudante("Carlos", 18);
        Estudante estudante5 = new Estudante("Juliana", 16);
        Estudante estudante6 = new Estudante("Thiago", 20);
        Estudante estudante7 = new Estudante("George", 22);
        Estudante estudante8 = new Estudante("Larissa", 21);

        Estudante[] estudantes = new Estudante[]{estudante1, estudante2, estudante3, estudante4, estudante5, estudante6, estudante7, estudante8};

        for (Estudante estudante : estudantes) {
            for (Estudante value : estudantes) {
                assertEquals(Integer.compare(estudante.getIdade(), value.getIdade()), estudante.compareTo(value));
            }
        }
    }
}

