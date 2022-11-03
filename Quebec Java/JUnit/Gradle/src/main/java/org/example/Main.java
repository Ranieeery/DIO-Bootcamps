package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pessoa {
    private String nomePessoa;
    private LocalDate dataDeNascimento;

    public Pessoa (String nomePessoa, LocalDate dataDeNascimento){
        this.nomePessoa = nomePessoa;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(this.dataDeNascimento, LocalDate.now());}

}