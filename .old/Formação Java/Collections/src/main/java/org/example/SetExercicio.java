package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetExercicio {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(){{
            add(3);
            add(88);
            add(20);
            add(44);
            add(3); // Duplicado, não será adicionado
        }};

        numeros.forEach(System.out::println);

        numeros.remove(3);
        System.out.println("Sem o primeiro: " + numeros);

        numeros.add(23);
        System.out.println("Com o 23: " + numeros);

        System.out.println("Tamanho: " + numeros.size());

        System.out.println("Vazio? " + numeros.isEmpty());

    }
}
