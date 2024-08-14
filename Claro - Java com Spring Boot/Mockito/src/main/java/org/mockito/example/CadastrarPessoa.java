package org.mockito.example;

import java.time.LocalDate;

public class CadastrarPessoa {
    private ApiCorreios apiCorreios;

    public CadastrarPessoa(ApiCorreios apiCorreios) {
        this.apiCorreios = apiCorreios;
    }

    public Pessoa CadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiCorreios.consultarCep(cep);
        pessoa.adicionarEndereco(dadosLocalizacao);
        return pessoa;
    }
}
