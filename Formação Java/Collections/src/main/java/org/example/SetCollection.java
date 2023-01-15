package org.example;

import java.util.*;

public class SetCollection {
    public static void main(String[] args) {
        // Set é uma interface que não permite elementos duplicados
        // e não garante a ordem dos elementos.
        // A performance de um Set é melhor que a de uma List.

        // HashSet é uma classe que implementa a interface Set.
        // HashSet não garante a ordem dos elementos.
        // HashSet não permite elementos duplicados.
        // HashSet é a implementação mais rápida de Set.
        // Indicado para quando não é necessário manter a ordem dos elementos.

        // LinkedHashSet é uma classe que implementa a interface Set.
        // LinkedHashSet garante a ordem dos elementos.
        // LinkedHashSet não permite elementos duplicados.
        // LinkedHashSet é a implementação mais lenta de Set.
        // Indicado para quando é necessário manter a ordem dos elementos.

        // TreeSet é uma classe que implementa a interface Set.
        // TreeSet não garante a ordem dos elementos.
        // TreeSet não permite elementos duplicados.
        // TreeSet é a implementação mais lenta de Set.
        // Indicado para quando é necessária alguma ordenação dos elementos. (Ex: ordenação natural)

        // HashSet
        System.out.println("--------------HashSet----------------");
        Set<Double> notasAlunos = new HashSet<>() {{
            add(7.8);
            add(8.4);
            add(9.7);
            add(5.4);
            add(7.1);
            add(9.0);
        }};

        System.out.println(notasAlunos);

        // Adicionando um elemento
        notasAlunos.add(4.5);
        notasAlunos.add(7.1); // Não adiciona, pois já existe

        // Removendo um elemento
        notasAlunos.remove(5.4);
        System.out.println(notasAlunos);

        // Retorna a quantidade de elementos
        System.out.println(notasAlunos.size());

        // Verifica se um elemento está no Set
        System.out.println("Tem 7.8? " + notasAlunos.contains(7.8));

        // Percorrendo o Set com for
        for (Double nota : notasAlunos) {
            System.out.println("For: " + nota);
        }

        // Percorrendo o Set com forEach
        System.out.println("forEach:");
        notasAlunos.forEach(System.out::println);

        // Percorrendo o Set com iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // Percorrendo o Set com iterator e lambda
        System.out.println("Iterator com lambda:");
        Iterator<Double> iterator2 = notasAlunos.iterator();
        iterator2.forEachRemaining(System.out::println);

        // Limpando o Set
        notasAlunos.clear();
        System.out.println(notasAlunos.isEmpty());

        // LinkedHashSet
        System.out.println("--------------LinkedHashSet----------------");
        Set<Double> notasAlunos2 = new LinkedHashSet<>() {{
            add(7.8);
            add(8.4);
            add(9.7);
            add(5.2);
            add(7.1);
            add(9.0);
        }};
        System.out.println(notasAlunos2); // Mantém a ordem de inserção

        // TreeSet
        System.out.println("--------------TreeSet----------------");
        // Arvores binárias são estruturas de dados que armazenam dados de forma ordenada.
        TreeSet<String> carros = new TreeSet<>() {{
            add("Ferrari");
            add("BMW");
            add("Audi");
            add("Honda");
            add("Mercedes");
            add("Jaguar");
        }};
        System.out.println(carros);

        // Primeiro elemento
        System.out.println("Primeiro: " + carros.first());

        // Último elemento
        System.out.println("Último: " + carros.last());

        // Retorna o primeiro elemento abaixo do elemento passado como parâmetro
        System.out.println("Abaixo de Jaguar: " + carros.lower("Jaguar"));

        // Retorna o primeiro elemento acima do elemento passado como parâmetro
        System.out.println("Acima de Jaguar: " + carros.higher("Jaguar"));

        // Primeiro elemento e remove
        System.out.println("Primeiro e remove: " + carros.pollFirst());

        // Último elemento e remove
        System.out.println("Último e remove: " + carros.pollLast());

        // Navegação usando forEach
        System.out.println("Navegação usando forEach:");
        carros.forEach(System.out::println);

        System.out.println("----------------------------------");
    }
}
