package com.spring.first.string;

import java.util.stream.IntStream;

public class Strings {
    public static void main() {
        var nome = "Raniery";
        var sobrenome = " Meireles Goulart";
        final var NOME_COMPLETO = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " + NOME_COMPLETO);

        var string = new String(" Minha String ");

        System.out.println("Char na posição: " + string.charAt(5)); // Retorna o char na posição 5
        System.out.println("Quantidade = " + string.length()); // Retorna a quantidade de caracteres
        System.out.println("Sem trim [" + string + "]"); // Retorna a string sem trim
        System.out.println("Com trim [" + string.trim() + "]"); // Remove os espaços em branco no começo e no fim
        System.out.println("Lower case: " + string.toLowerCase()); // Converte para minúsculo
        System.out.println("Upper case:" + string.toUpperCase()); // Converte para maiúsculo
        System.out.println("Contains M: " + string.contains("M")); // Verifica se a string contém M
        System.out.println("Contains X: " + string.contains("X")); // Verifica se a string contém X
        System.out.println("Replace: " + string.replace("n", "$")); // Substitui n por $
        System.out.println("Equals: " + string.equals(" Minha String ")); // Verifica se a string é igual a " Minha String "
        System.out.println("EqualsIgnoreCase: " + string.equalsIgnoreCase(" minha string "));
        System.out.println("Substring(1,6): " + string.substring(1, 6)); //Posição inicial e final
        System.out.println("Substring(1): " + string.substring(1)); //Posição inicial até o final
        System.out.println("Index of M: " + string.indexOf("M")); // Retorna a posição do M
        System.out.println("Last index of M: " + string.lastIndexOf("M")); // Retorna a última posição do M
        System.out.println("Empty: " + string.isEmpty()); // Verifica se a string está vazia
        System.out.println("Empty or blank: " + string.isBlank()); // Verifica se a string está vazia ou com espaços em branco


        IntStream.range(1, string.length()).forEach(System.out::println); // Retorna a quantidade de caracteres
        System.out.println();
        IntStream.of(1,2,3,4,5).forEach(n -> System.out.println(n)); // Retorna a quantidade de caracteres

    }
}
