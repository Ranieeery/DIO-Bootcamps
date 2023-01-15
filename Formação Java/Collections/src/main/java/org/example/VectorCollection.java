package org.example;

import java.util.List;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        sports.add("Futebol");
        sports.add("Basquete");
        sports.add("Tênis");
        sports.add("Vôlei");
        sports.add("Handebol");
        System.out.println(sports);

        // Trocando um elemento da lista
        sports.set(2, "Ping Pong");
        System.out.println(sports);

        // Removendo um elemento da lista
        sports.remove(4); // Remove o elemento na posição 4
        System.out.println(sports);

        sports.remove("Basquete"); // Remove o elemento "Basquete"
        System.out.println(sports);

        // Obtendo um elemento da lista
        System.out.println(sports.get(1));

        // Retorna o tamanho da lista
        System.out.println(sports.size());

        // Verifica se um elemento está na lista
        System.out.println("Tem Futebol? " + sports.contains("Futebol"));

        // Verifica se a lista está vazia
        System.out.println("Vazio? " + sports.isEmpty());

        // Percorrendo a lista com for
        for (String sport : sports) {
            System.out.println(sport);
        }
    }
}
