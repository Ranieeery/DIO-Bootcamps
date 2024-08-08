/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (Questao()) {
            case 1 -> {
                List<Double> temperatura = new ArrayList<>();
                int count = 0;
                while (count != 6) {
                    System.out.print("Digite a temperatura: ");
                    double temp = scanner.nextDouble();
                    temperatura.add(temp);
                    count++;
                }
                System.out.println();
                System.out.println(temperatura);
                Iterator<Double> iterator = temperatura.iterator();
                Double somatemp = 0d;
                while (iterator.hasNext()) {
                    Double next = iterator.next();
                    somatemp += next;
                }
                Double mediatemp = somatemp / temperatura.size();
                System.out.printf("Média das temperaturas: %.2f %n", mediatemp);
                count = 0;
                for (Double aDouble : temperatura) {
                    if (aDouble >= mediatemp) {
                        switch (count) {
                            case 0 -> System.out.println("1 - Janeiro: " + aDouble);
                            case 1 -> System.out.println("2 - Fevereiro: " + aDouble);
                            case 2 -> System.out.println("3 - Março: " + aDouble);
                            case 3 -> System.out.println("4 - Abril: " + aDouble);
                            case 4 -> System.out.println("5 - Maio: " + aDouble);
                            case 5 -> System.out.println("6 - Junho: " + aDouble);
                            default -> {
                            }

                        }
                    }
                    count++;
                }
            }
            case 2 -> {
                List<String> crimeResposta = new ArrayList<>();
                System.out.println("Perguntas:");
                System.out.println("1. Telefonou para a vítima?");
                crimeResposta.add(scanner.next());
                System.out.println("2. Esteve no local do crime?");
                crimeResposta.add(scanner.next());
                System.out.println("3. Mora perto da vítima?");
                crimeResposta.add(scanner.next());
                System.out.println("4. Devia para a vítima?");
                crimeResposta.add(scanner.next());
                System.out.println("5. Já trabalhou com a vítima?");
                crimeResposta.add(scanner.next());
                Iterator<String> iterator2 = crimeResposta.iterator();
                int count = 0;
                while (iterator2.hasNext()) {
                    if (iterator2.next().toUpperCase().charAt(0) == 'S') {
                        count++;
                    }
                }
                System.out.println("-----------------------");
                switch (count) {
                    case 2 -> System.out.println("Suspeita");
                    case 3, 4 -> System.out.println("Cúmplice");
                    case 5 -> System.out.println("Assassina");
                    default -> System.out.println("Inocente");
                }
            }
        }
    }

    public static int Questao() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Qual questão gostaria de ver a resolução:%n" + "1- Temperatura%n" + "2- Crime%n");
        return scanner.nextInt();
    }
}
