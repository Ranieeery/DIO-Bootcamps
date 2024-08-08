package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {
        // Map é uma interface que representa um conjunto de pares chave-valor
        // e não garante a ordem dos elementos.
        // A performance de um Map é melhor que a de uma List e pior que a de um Set.
        // A chave de um Map não pode ser duplicada.
        // O valor de um Map pode ser duplicado.
        // Map NÃO extende Collection, portanto não possui métodos como add, remove, size, etc.

        System.out.println("--------------HashMap----------------");
        Map<String, Integer> worldCup = new HashMap<>() {{
            put("Brasil", 5);
            put("Alemanha", 4);
            put("Itália", 4);
            put("Argentina", 2);
            put("Uruguai", 2);
            put("França", 2);
            put("Inglaterra", 1);
            put("Espanha", 1);
        }};

        System.out.println(worldCup);

        // Adicionando um elemento
        worldCup.put("Portugal",0); // KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
        System.out.println(worldCup);

        // Atualizando um elemento
        worldCup.put("Argentina", 3); // Dor.

        // Retorna a quantidade de elementos
        System.out.println("Tamanho: " + worldCup.size());

        // Retorna o Brasil
        System.out.println("Brasil: " + worldCup.get("Brasil"));

        // Retorna se existe ou não um campeão França
        System.out.println("Tem França? " + worldCup.containsKey("França"));

        // Retorna se existe ou não um hexacampeão
        System.out.println("Tem hexa? " + worldCup.containsValue(6));

        // Percorrendo o Map com for
        System.out.println("Percorrendo o Map com for");
        for (Map.Entry<String, Integer> entry : worldCup.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Percorrendo o Map com forEach
        System.out.println("Percorrendo com forEach");
        for (String key : worldCup.keySet()) {
            System.out.println(key + " - " + worldCup.get(key));
        }

        // Limpa o Map
        worldCup.clear();
        System.out.println(worldCup);
        System.out.println(worldCup.isEmpty());

        // TreeMap
        System.out.println("--------------TreeMap----------------");
        TreeMap<String, String> treeCountries = new TreeMap<>() {{
            put("BR", "Brasil");
            put("RU", "Rússia");
            put("IN", "India");
            put("CN", "China");
            put("SA", "Arábia Saudita");
        }};
        System.out.println(treeCountries);

        // Retorna o primeiro elemento do topo da árvore
        System.out.println("Primeiro elemento:");
        System.out.println(treeCountries.firstEntry().getKey() + " - " + treeCountries.firstEntry().getValue());

        // Retorna o último elemento do final da árvore
        System.out.println("Último elemento:");
        System.out.println(treeCountries.lastEntry().getKey() + " - " + treeCountries.lastEntry().getValue());

        // Retorna o primeiro elemento abaixo na árvore do parâmetro
        System.out.println("Primeiro elemento abaixo da China:");
        System.out.println(treeCountries.lowerEntry("CN").getKey() + " - " + treeCountries.lowerEntry("CN").getValue());

        // Retorna o primeiro elemento acima na árvore do parâmetro
        System.out.println("Primeiro elemento acima da China:");
        System.out.println(treeCountries.higherEntry("CN").getKey() + " - " + treeCountries.higherEntry("CN").getValue());

        // Retorna o primeiro elemento do topo da árvore, removendo do map
        System.out.println("Primeiro elemento (removendo):");
        System.out.println(treeCountries.pollFirstEntry().getValue());

        // Retorna o primeiro elemento do final da árvore, removendo do map
        System.out.println("Último elemento (removendo):");
        System.out.println(treeCountries.pollLastEntry().getValue());

        System.out.println(treeCountries);



    }
}
