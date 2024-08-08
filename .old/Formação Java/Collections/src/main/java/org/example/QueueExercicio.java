package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExercicio {
    public static void main(String[] args) {
        Queue<String> lista = new LinkedList<>(
                List.of("Juliana", "Pedro", "Carlos", "Larissa", "João")
        );

        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("Primeiro elemento: " + lista.peek());
        System.out.println("Primeiro elemento: " + lista.poll());

        lista.add("Daniel");
        LinkedList<String> lista2 = new LinkedList<>(lista);
        System.out.println("Posição de Daniel: " + lista2.indexOf("Daniel"));

        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("Está vazia? " + lista.isEmpty());

        System.out.println("Tem Carlos? " + lista.contains("Carlos"));
    }
}
