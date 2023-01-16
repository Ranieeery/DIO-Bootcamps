package org.example.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExercicio {
    public static void main(String[] args) {
        List<Animais> animais = new ArrayList<>(){{
            add(new Animais("Cachorro", 5));
            add(new Animais("Gato", 3));
            add(new Animais("Papagaio", 2));
            add(new Animais("Pato", 1));
            add(new Animais("Galinha", 1));
            add(new Animais("Girafa", 2));
            add(new Animais("Elefante", 3));
            add(new Animais("Leão", 4));
            add(new Animais("Tigre", 5));
        }};
        System.out.println(animais);

        animais.sort((first, second) -> first.getNome().compareToIgnoreCase(second.getNome()));
        System.out.println(animais);

        animais.sort(Comparator.comparing(Animais::getNome));
        System.out.println(animais);
    }
}
