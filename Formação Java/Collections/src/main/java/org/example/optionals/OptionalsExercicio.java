package org.example.optionals;

import java.util.Optional;

public class OptionalsExercicio {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Estado presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        Optional<String> optionalEmpty = Optional.empty();

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        //System.out.println(optionalEmpty.orElseThrow(IllegalStateException::new));

        if (!optionalEmpty.isPresent()) {
            System.out.println("Optional vazio");
        }

        optionalString.map((valor) -> valor.concat(" MG")).ifPresent(System.out::println);

        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.filter((valor) -> valor.contains("Estado")).ifPresent(System.out::println);
    }
}
