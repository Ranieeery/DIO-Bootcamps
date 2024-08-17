package org.mockito.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @InjectMocks
    public CadastrarPessoa cadastrarPessoa;

    @Mock
    private ApiCorreios apiCorreios;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Nova Lima", "Rua Cinco", "Casa", "Bairro 1");

        Mockito.when(apiCorreios.consultarCep(anyString())).thenReturn(dadosLocalizacao);
        Pessoa pessoa1 = cadastrarPessoa.cadastrarPessoa("João", "46524789920", LocalDate.of(1990, 1, 1), "21400965");

        assertEquals("João", pessoa1.getNome());
        assertEquals("46524789920", pessoa1.getDocumento());
        assertEquals(LocalDate.of(1990, 1, 1), pessoa1.getNascimento());
        assertEquals("MG", pessoa1.getEndereco().getUf());
        assertEquals("Nova Lima", pessoa1.getEndereco().getCidade());
        assertEquals("Rua Cinco", pessoa1.getEndereco().getLogradouro());
        assertEquals("Casa", pessoa1.getEndereco().getComplemento());
        assertEquals("Bairro 1", pessoa1.getEndereco().getBairro());
    }

    @Test
    void ThrowExceptionAPI() {
        Mockito.when(apiCorreios.consultarCep(anyString())).thenThrow(IllegalArgumentException.class);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cadastrarPessoa.cadastrarPessoa("Pedro", "81382977983", LocalDate.of(2002, 6, 10), "21400966");
        });
    }

    @Test
    void cadastrarPessoa() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Uberaba", "Rua Castro Alves", "Casa", "Nova Floresta");

        Mockito.when(apiCorreios.consultarCep(anyString())).thenReturn(dadosLocalizacao);

        Pessoa pessoa2 = cadastrarPessoa.cadastrarPessoa("José", "28578527976", LocalDate.of(1947, 1, 15), "69317300");

        DadosLocalizacao enderecoJose = pessoa2.getEndereco();
        assertEquals(dadosLocalizacao.getBairro(), enderecoJose.getBairro());
        assertEquals(dadosLocalizacao.getCidade(), enderecoJose.getCidade());
        assertEquals(dadosLocalizacao.getUf(), enderecoJose.getUf());
    }
}
