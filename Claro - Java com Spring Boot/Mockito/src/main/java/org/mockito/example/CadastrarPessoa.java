package org.mockito.example;

import java.time.LocalDate;

public class CadastrarPessoa {
    private ApiCorreios apiCorreios;

    public CadastrarPessoa(final ApiCorreios apiCorreios) {
        this.apiCorreios = apiCorreios;
    }
    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiCorreios.consultarCep(cep);
        pessoa.adicionarEndereco(dadosLocalizacao);
        return pessoa;
    }
}
