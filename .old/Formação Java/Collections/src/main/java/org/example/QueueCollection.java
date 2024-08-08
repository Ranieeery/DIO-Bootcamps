package org.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        // Queue é uma interface que representa uma fila de inteiros, com métodos para
        // adicionar, remover, obter e verificar se um elemento está na fila.
        // A interface Queue é uma interface genérica, ou seja, ela recebe um tipo de
        // dado como parâmetro. A ordem de inserção dos elementos na fila é mantida.

        Queue<String> fila = new LinkedList<>();

        fila.add("Carlos");
        fila.add("Pedro");
        fila.add("Juliana");
        fila.add("Weverton");
        fila.add("Maria");
        fila.add("Karla");
        System.out.println(fila);

        // Retorna o primeiro elemento da fila, sem removê-lo
        System.out.println(fila.peek()); // Se vazia, retorna null
        System.out.println(fila.element()); // Se vazia, retorna uma exceção

        // Retorna o primeiro elemento da fila, removendo-o
        System.out.println(fila.poll()); // Se vazia, retorna null
        System.out.println(fila.remove()); // Se vazia, retorna uma exceção

        String cliente = fila.poll();
        System.out.println("Cliente da vez: " + cliente);
        System.out.println("Próximo: " + fila.peek());
        System.out.println("Fila: " + fila);

        // Retorna o tamanho da fila
        System.out.println("Tamanho: " + fila.size());

        // Verifica se a fila está vazia
        System.out.println("Vazia? " + fila.isEmpty());

        // Verifica se um elemento está na fila
        System.out.println("Tem Carlos? " + fila.contains("Carlos"));
        System.out.println("Tem Karla? " + fila.contains("Karla"));

        // Percorrendo a fila com for
        for (String nome : fila) {
            System.out.println("ForEach: " + nome);
        }

        // Percorrendo a fila com while
        while (!fila.isEmpty()) {
            System.out.println("While: " + fila.poll());
        }

        fila.add("Ronaldo");
        fila.add("Rivaldo");
        fila.add("Cafu");
        fila.add("Roberto Carlos");
        fila.add("Ronaldiho");

        // Percorrendo a fila com iterator
        Iterator<String> iterator = fila.iterator();
        while (iterator.hasNext()) { //Depreciado
            System.out.println("Iterator: " + iterator.next());
        }
        System.out.println("Fila: " + fila);

        // Limpando a fila
        fila.clear();
    }
}
