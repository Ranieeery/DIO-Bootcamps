import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
        switch (Questao()) {
            case 1 -> {
                Set<String> arcoIris = new HashSet<>();
                arcoIris.add("Vermelho");
                arcoIris.add("Laranja");
                arcoIris.add("Amarelo");
                arcoIris.add("Verde");
                arcoIris.add("Azul");
                arcoIris.add("Anil");
                arcoIris.add("Violeta");
                Set<String> arcoIrisOrdem = new LinkedHashSet<>(arcoIris);

                System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
                for (String cores : arcoIris) System.out.println(cores);

                System.out.printf("A quantidade de cores que o arco-íris tem: %s%n", arcoIris.size());

                System.out.println("Exiba as cores em ordem alfabética: ");
                Set<String> cores = new TreeSet<>(arcoIris);
                System.out.println(cores);

                System.out.println("Exiba as cores na ordem inversa da que foi informada ");
                List<String> coresInverso = new ArrayList<>(arcoIrisOrdem);
                Collections.reverse(coresInverso);
                System.out.println(coresInverso);

                System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
                for (String cor : arcoIris) if (cor.charAt(0) == 'V') System.out.println(cor);
                System.out.println("--------------------------");

                System.out.println("Remova todas as cores que não começam com a letra “v”: ");
                arcoIris.removeIf(corRem -> corRem.charAt(0) != 'V');
                System.out.println(arcoIris);

                System.out.println("Limpe o conjunto: ");
                arcoIris.clear();

                System.out.printf("O conjunto está vazio?%n%b", arcoIris.isEmpty());
            }
            case 2 -> {
                Set<LinguaguemFavorita> linguas = new HashSet<>(){{
                    add(new LinguaguemFavorita("Java", 1991, "Intellij"));
                    add(new LinguaguemFavorita("C#", 2000, "VisualStudio"));
                    add(new LinguaguemFavorita("Ruby", 1995, "RubyMine"));
                }};
                Set<LinguaguemFavorita> linguasOrdem = new LinkedHashSet<>(linguas);
                System.out.println(linguasOrdem);
                System.out.println(linguas);
            }
        }
    }

    public static int Questao() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Qual questão gostaria de ver a resolução:%n" + "1- Arco Íris%n" + "2- Linguagem%n");
        return scanner.nextInt();
    }
}

class LinguaguemFavorita implements Comparable<LinguaguemFavorita>{
    public String nome;
    public Integer ano;
    public String IDE;

    public LinguaguemFavorita(String nome, Integer ano, String IDE) {
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguaguemFavorita o) {
        return 0;
    }
}


