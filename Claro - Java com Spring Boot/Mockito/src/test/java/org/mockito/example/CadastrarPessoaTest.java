package org.mockito.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @InjectMocks
    public CadastrarPessoa cadastrarPessoa;

    @Mock
    private ApiCorreios apiCorreios;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Nova Lima", "Rua Cinco", "Casa", "Bairro 1");
        Mockito.when(apiCorreios.consultarCep("21400965")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("João", "46524789920", LocalDate.of(1990, 1, 1), "21400965");

        assertEquals("João", pessoa.getNome());
        assertEquals("46524789920", pessoa.getDocumento());
        assertEquals(LocalDate.of(1990, 1, 1), pessoa.getNascimento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Nova Lima", pessoa.getEndereco().getCidade());
        assertEquals("Rua Cinco", pessoa.getEndereco().getLogradouro());
        assertEquals("Casa", pessoa.getEndereco().getComplemento());
        assertEquals("Bairro 1", pessoa.getEndereco().getBairro());
    }
}
