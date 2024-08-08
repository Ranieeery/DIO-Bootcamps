package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Fábio", LocalDate.of(2002, 9, 23));
        Assertions.assertEquals(20, pessoa.getIdade());
    }
}