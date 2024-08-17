package org.mockito.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class PessoaTest {

    @Mock
    private Pessoa pessoa;

    @Test
    void escolheReturn() {
        Mockito.when(pessoa.getNome()).thenReturn("Pedro");
        assertEquals("Pedro", pessoa.getNome());
    }

    @Test
    void outroEscolheReturn() {
        Mockito.doReturn("Pedro").when(pessoa).getNome();
        assertEquals("Pedro", pessoa.getNome());
    }

    @Test
    void returnMaiorIdade() {
        Mockito.when(pessoa.maiorIdade()).thenReturn(true);
        assertTrue(pessoa.maiorIdade());
    }

    @Test
    void outroReturnMaiorIdade() {
        Mockito.doAnswer(invocation -> true).when(pessoa).maiorIdade();
        assertTrue(pessoa.maiorIdade());
    }
}