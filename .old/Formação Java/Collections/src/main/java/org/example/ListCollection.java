package org.example;

import java.util.*;

public class ListCollection {
    // List é uma classe que representa uma lista de inteiros, com métodos para
    // adicionar, remover, obter e verificar se um elemento está na lista.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Carlos");
        list.add("Pedro");
        list.add("Juliana");
        list.add("Weverton");
        list.add("Maria");
        list.add("Karla");

        // Imprime a lista
        System.out.println(list);

        // Percorrendo a lista com for
        for (String nome : list) {
            System.out.println(nome);
        }

        // Ordenando a lista (ordem alfabética)
        Collections.sort(list);
        System.out.println(list);

        // Trocando um elemento da lista
        list.set(3, "Rodrigo");
        System.out.println(list);

        // Obtem a posição de um elemento
        System.out.println(list.indexOf("Rodrigo"));
        System.out.println(list.indexOf("Thiago")); // Retorna -1 se não encontrar

        // Removendo um elemento da lista
        list.remove(1); // Remove o elemento na posição 1
        System.out.println(list);

        list.remove("Karla"); // Remove o elemento "Karla"
        System.out.println(list);

        // Obtendo um elemento da lista
        System.out.println(list.get(1));

        // Retorna o tamanho da lista
        System.out.println(list.size());

        // Verifica se um elemento está na lista
        System.out.println("Tem Carlos? " + list.contains("Carlos"));
        System.out.println("Tem Karla? " + list.contains("Karla"));

        // Verifica se a lista está vazia
        System.out.println("Vazio? " + list.isEmpty());

        List<String> list2 = new ArrayList<>(list);

        System.out.println("Sublista: " + list2.subList(1, 3)); // Retorna uma sublista
        list2.clear();
        System.out.println("Vazia? " + list2.isEmpty());

        // Percorrendo a lista com for
        System.out.println("Percorrendo a lista com for");
        for (String nome : list) {
            System.out.println(nome);
        }

        // Percorrendo a lista com Iterator
        System.out.println("Percorrendo a lista com Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Percorrendo a lista com iterator e lambda
        System.out.println("Percorrendo a lista com iterator e lambda");
        list.forEach(nome -> {
            System.out.println(nome); //Depreciado a partir do Java 9
        });

        // Percorrendo a lista com iterator e method reference
        System.out.println("Percorrendo a lista com iterator e method reference");
        list.forEach(System.out::println);

        // Percorrendo a lista com ListIterator
        System.out.println("Percorrendo a lista com ListIterator");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Percorrendo a lista com ListIterator (inverso)
        System.out.println("Percorrendo a lista com ListIterator (inverso)");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}