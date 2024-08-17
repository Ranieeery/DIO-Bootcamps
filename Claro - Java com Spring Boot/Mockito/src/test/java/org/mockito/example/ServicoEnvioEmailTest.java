package org.mockito.example;

import org.mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    void validarDadosPlataformaDeEnvio() {

        String enderecoEmail = "usuario@teste.com";
        String mensagem = "Hello World!";
        boolean formatoHTML = true;

        servicoEnvioEmail.enviaEmail(enderecoEmail, mensagem, formatoHTML);

        Mockito.verify(plataformaDeEnvio).enviaEmail(emailCaptor.capture());

        Email emailCaptorTeste = emailCaptor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCaptorTeste.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCaptorTeste.getMensagem());
        Assertions.assertEquals(Formato.HTML, emailCaptorTeste.getFormato());
    }
}
