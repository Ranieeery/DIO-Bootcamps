package org.example.comparators;

public class Estudante implements Comparable<Estudante> {
    // Comparators são usados para comparar dois objetos
    // e retornar um valor inteiro que indica se o primeiro
    // objeto é maior, menor ou igual ao segundo objeto.

    // Comparable é uma interface que fornece um único método
    // de comparação, chamado compareTo(), que retorna um valor
    // inteiro que indica se o objeto é maior, menor ou igual ao
    // objeto passado como parâmetro.
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", idade=" + idade + '}';
    }

    @Override
    public int compareTo(Estudante o) {
        return Integer.compare(this.idade, o.idade);
    }

}
