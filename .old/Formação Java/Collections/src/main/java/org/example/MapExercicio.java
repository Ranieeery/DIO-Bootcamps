package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExercicio {
    public static void main(String[] args) {
        Map <String, String> estadosBrasil = new HashMap<>(){{
            put("AC", "Acre");
            put("AL", "Alagoas");
            put("AP", "Amapá");
            put("AM", "Amazonas");
            put("BA", "Bahia");
            put("CE", "Ceará");
            put("ES", "Espírito Santo");
            put("GO", "Goiás");
            put("MA", "Maranhão");
            put("MT", "Mato Grosso");
            put("MS", "Mato Grosso do Sul");
            put("MG", "Minas Gerais");
            put("PA", "Pará");
            put("PB", "Paraíba");
            put("PR", "Paraná");
            put("PE", "Pernambuco");
            put("PI", "Piauí");
            put("RJ", "Rio de Janeiro");
            put("RN", "Rio Grande do Norte");
            put("RS", "Rio Grande do Sul");
            put("RO", "Rondônia");
            put("RR", "Roraima");
            put("SC", "Santa Catarina");
            put("SP", "São Paulo");
            put("SE", "Sergipe");
            put("TO", "Tocantins");
        }};
        System.out.println(estadosBrasil);

        estadosBrasil.remove("MG");
        estadosBrasil.put("DF", "Distrito Federal");

        System.out.println("Quantidade de estados: " + estadosBrasil.size());

        estadosBrasil.remove("MS", "Mato Grosso do Sul");
        System.out.println(estadosBrasil);

        System.out.println("\nEstados:");
        for (Map.Entry<String, String> entry : estadosBrasil.entrySet()) {
            System.out.printf("%s (%s)%n", entry.getValue(), entry.getKey());
        }

        System.out.println("Possui Santa Catarina? " + estadosBrasil.containsKey("SC"));
        System.out.println("Possui Maranhão? " + estadosBrasil.containsValue("Maranhão"));
    }
}
