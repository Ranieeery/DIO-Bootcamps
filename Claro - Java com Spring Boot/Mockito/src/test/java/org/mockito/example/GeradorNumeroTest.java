package org.mockito.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class GeradorNumeroTest {

    @Test
    void validaGeracaoNumeros() {
        MockedStatic<GeradorNumero> gerador = Mockito.mockStatic(GeradorNumero.class);

        List<Integer> integers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        gerador.when(() -> GeradorNumero.geraNumerosAleatorios(anyInt()))
            .thenReturn(integers1);

        Assertions.assertEquals(integers1, GeradorNumero.geraNumerosAleatorios(8));
    }

    @Test
    void validaGeracaoNumerosSemTamanho() {

        MockedStatic<GeradorNumero> gerador = Mockito.mockStatic(GeradorNumero.class);

        List<Integer> integers2 = List.of(10, 9, 8, 6);

        gerador.when(GeradorNumero::geraNumerosAleatorios).thenReturn(integers2);

        Assertions.assertEquals(integers2, GeradorNumero.geraNumerosAleatorios());
    }
}
