import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

//        System.out.println("Exiba a posição da nota 5: ");

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

//        System.out.println("Substitua a nota 5 pela nota 6.0");

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator(); //Ctrl Alt V - cria variável
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma); //Como no Set não repete números, a soma é menor do que se usasse List

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota na posição 0");

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        notas.removeIf(prox -> prox < 7);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}