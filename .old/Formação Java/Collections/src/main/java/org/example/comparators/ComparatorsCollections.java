package org.example.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsCollections {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>() {{
            add(new Estudante("João", 19));
            add(new Estudante("Maria", 27));
            add(new Estudante("Pedro", 21));
            add(new Estudante("Carlos", 20));
            add(new Estudante("Juliana", 17));
            add(new Estudante("Hugo", 25));
            add(new Estudante("Hugo", 18));
            add(new Estudante("Bruno", 25));
        }};
        // Ordem de inserção
        System.out.println("Ordem de inserção");
        System.out.println(estudantes);

        // Ordem de idade — crescente
        System.out.println("Ordem de idade — crescente");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        // Ordem de idade — decrescente
        System.out.println("Ordem de idade — decrescente");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        // Ordem de nome — crescente
        System.out.println("Ordem de nome — crescente");
        estudantes.sort((first, second) -> first.getNome().compareToIgnoreCase(second.getNome()));
        System.out.println(estudantes);

        // Ordem de nome — decrescente
        System.out.println("Ordem de nome — decrescente");
        estudantes.sort((first, second) -> second.getNome().compareToIgnoreCase(first.getNome()));
        System.out.println(estudantes);

        // Ordem de nome — crescente, idade — decrescente
        System.out.println("Ordem de nome — crescente, idade — decrescente");
        estudantes.sort((first, second) -> {
            int nome = first.getNome().compareToIgnoreCase(second.getNome());
            if (nome != 0) return nome;
            return second.getIdade() - first.getIdade();
        });
        System.out.println(estudantes);

        // Ordem de nome — decrescente, idade — crescente
        System.out.println("Ordem de nome — decrescente, idade — crescente");
        estudantes.sort((first, second) -> {
            int nome = second.getNome().compareToIgnoreCase(first.getNome());
            if (nome != 0) return nome;
            return first.getIdade() - second.getIdade();
        });
        System.out.println(estudantes);

        System.out.println("\n----------------------------------a partir daqui, usando Comparator----------------------------------\n");

        // Ordem de idade — crescente
        System.out.println("Ordem de idade — crescente");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        // Ordem de idade — decrescente
        System.out.println("Ordem de idade — decrescente");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("\n----------------------------------a partir daqui, usando Collections----------------------------------\n");

        // Ordem de idade — crescente
        Collections.sort(estudantes);
        System.out.println("Ordem de idade — crescente");
        System.out.println(estudantes);

        // Ordem de idade — decrescente
        System.out.println("Ordem de idade — decrescente");
        estudantes.sort(new EstudanteReverse()); // Collections.sort(estudantes, new EstudanteReverse());
        System.out.println(estudantes);

    }
}
