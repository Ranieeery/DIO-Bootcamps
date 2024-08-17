package org.mockito.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class ApiCorreiosTest {

    @Mock
    private ApiCorreios apiCorreios;

    @Test
    void retornaObjetoQuandoEspecificoValorEhPassado() {
        Mockito.when(apiCorreios.consultarCep(anyString())).thenReturn(null);

        DadosLocalizacao dadosLocalizacao = apiCorreios.consultarCep("161761");

        assertNull(dadosLocalizacao);
    }

    @Test
    void retornaObjetoQuandoEspecificoValorEhPassado2() {
        Mockito.when(apiCorreios.consultarCep("78787878")).thenReturn(new DadosLocalizacao("AM", "Manaus", "Rua Grajaúna", "casa", "Lago Azul"));

        DadosLocalizacao dadosLocalizacao = apiCorreios.consultarCep("78787878");

        assertEquals("AM", dadosLocalizacao.getUf());
    }
}
