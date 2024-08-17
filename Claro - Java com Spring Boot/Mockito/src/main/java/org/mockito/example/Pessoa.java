package org.mockito.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String documento;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(String nome, String documento, LocalDate nascimento) {
        this.nome = nome;
        this.documento = documento;
        this.nascimento = nascimento;
    }

    public void adicionarEndereco(DadosLocalizacao endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }

    public boolean maiorIdade() {
        return ChronoUnit.YEARS.between(this.nascimento, LocalDate.now()) > 18L;
    }
}
