package org.example.comparators;

public class Animais implements Comparable<Animais>{
    private String nome;
    private Integer quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Animais(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", Quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Animais o) {
        return 0;
    }
}
