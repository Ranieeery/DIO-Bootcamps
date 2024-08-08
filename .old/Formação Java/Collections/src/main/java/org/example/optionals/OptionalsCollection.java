package org.example.optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalsCollection {
    public static void main(String[] args) {
        // Optionals são usados para evitar NullPointerExceptions
        // em coleções. Eles são usados para representar um valor
        // que pode ser nulo ou não. Se o valor for nulo, o Optional
        // não conterá nenhum valor. Se o valor não for nulo, o
        // Optional conterá o valor.

        // Optional.of — lança NullPointerException se o valor for nulo
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); // Valor presente

        // Optional.ofNullable — não lança NullPointerException se o valor for nulo
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente")); // null = não está presente

        // Optional.empty — cria um Optional vazio
        Optional<String> optionalEmpty = Optional.empty();
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente")); // empty = não está presente

        // NullPointerException
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

        System.out.println("\n-------------------------Números-------------------------\n");
        System.out.println("Valor inteiro opcional que está presente");
        Optional<Integer> optionalInteger = Optional.of(12);
        optionalInteger.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); // 12
        // ou
        OptionalInt.of(12).ifPresent(System.out::println); // 12

        System.out.println("Valor decimal opcional que está presente");
        Optional<Double> optionalDouble = Optional.of(55.2);
        optionalDouble.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); // 55.2
        // ou
        OptionalDouble.of(55.2).ifPresent(System.out::println); // 55.2

        System.out.println("Valor longo opcional que está presente");
        Optional<Long> optionalLong = Optional.of(23L);
        optionalLong.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente")); // 23
        // ou
        OptionalLong.of(23L).ifPresent(System.out::println); // 23

        System.out.println("\n-------------------------Operações-------------------------\n");
        // isPresent — retorna true se o valor estiver presente
        System.out.println(optionalString.isPresent()); // true

        //isEmpty — retorna true se o valor não estiver presente
        System.out.println(optionalString.isEmpty()); // false

        // ifPresent — executa uma ação se o valor estiver presente
        optionalString.ifPresent(System.out::println); // Valor presente

        // ifPresentOrElse — executa uma ação se o valor estiver presente, ou executa outra ação se o valor não estiver presente
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente")); // Valor presente

        // Get — retorna o valor se estiver presente, ou lança uma exceção se não estiver presente
        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        // Concatenando Optionals
        optionalString.map((valor) -> valor.concat(" cachorro quente")).ifPresent(System.out::println);
        // Ou
        optionalString.flatMap((valor) -> Optional.of(valor.concat(" cachorro quente"))).ifPresent(System.out::println);

        // Filter — retorna um Optional vazio se o valor não corresponder ao predicado
        Optional<String> optionalString2 = Optional.of("Valor presente");
        optionalString2.filter((valor) -> valor.contains("Valor")).ifPresent(System.out::println); // Valor presente
        optionalString2.filter((valor) -> valor.contains("abc")).ifPresent(System.out::println); // não imprime nada

        //orElseThrow — retorna o valor se estiver presente, ou lança uma exceção se não estiver presente
        System.out.println(optionalString.orElseThrow(IllegalStateException::new)); // Valor presente
        optionalString.of(null);
        System.out.println(optionalString.orElseThrow(IllegalStateException::new)); // lança exceção
    }
}
