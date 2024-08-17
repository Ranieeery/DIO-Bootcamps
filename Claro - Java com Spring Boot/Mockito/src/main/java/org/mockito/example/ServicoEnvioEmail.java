package org.mockito.example;

public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataforma;

    void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = formatoHtml ? new Email(enderecoEmail, mensagem, Formato.HTML) : new Email(enderecoEmail, mensagem, Formato.TEXTO);

        plataforma.enviaEmail(email);
    }
}
