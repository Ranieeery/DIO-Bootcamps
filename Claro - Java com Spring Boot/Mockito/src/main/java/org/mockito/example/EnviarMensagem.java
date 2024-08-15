package org.mockito.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EnviarMensagem {
    private List<Mensagem> mensagens = new ArrayList<>();

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> getMensagens() {
        return Collections.unmodifiableList(this.mensagens);
    }
}
