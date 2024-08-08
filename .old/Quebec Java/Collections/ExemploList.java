import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adiciona sete notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d)); //Conta a partir do 0

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 7.0");
        notas.set(notas.indexOf(5.0), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informadas:");
        for (double nota:notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator(); //Ctrl Alt V - cria variável
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        notas.removeIf(prox -> prox < 7);
        /*
         while (iterator1.hasNext()){
             Double next = iterator1.next();
             if (next < 7) iterator1.remove();
         }
        */
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

//      Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);

    }
}
