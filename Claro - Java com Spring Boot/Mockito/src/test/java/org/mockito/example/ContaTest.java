package org.mockito.example;

import org.mockito.Spy;
import org.mockito.Mockito;
import org.mockito.InOrder;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrdemChamada() {

        conta.pagaBoleto(300);

        InOrder inOrder = inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);

        inOrder.verifyNoMoreInteractions();
    }

    @Test
    void validarQuantidadeChamadas() {

        conta.validaSaldo(400);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }

}
