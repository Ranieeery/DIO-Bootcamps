package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Period;

class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Fábio", LocalDate.of(2002, 9, 23));
        Assertions.assertEquals(Period.between(pessoa.getDataDeNascimento(),LocalDate.now()).getYears(), pessoa.getIdade());
    }
}
