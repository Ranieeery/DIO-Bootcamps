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
                Set<FavLang> linguas = new HashSet<>(){{
                    add(new FavLang("Java", 1991, "Intellij"));
                    add(new FavLang("C#", 2000, "VisualStudio"));
                    add(new FavLang("Ruby", 1995, "RubyMine"));
                }};
                Set<FavLang> linguasOrdem = new LinkedHashSet<>(linguas);
                System.out.println(linguasOrdem);

                System.out.println("Ordem de nome: ");
                Set<FavLang> linguasNome = new TreeSet<>(linguas);
                for (FavLang ordemNome: linguasNome) System.out.println(ordemNome);
                System.out.println();

                System.out.println("Ordem IDE: ");
                Set<FavLang> linguasIDE = new TreeSet<FavLang>(new ComparatorIDE());
                linguasIDE.addAll(linguas);
                for (FavLang ordemIDE : linguasIDE) System.out.println(ordemIDE);
                System.out.println();

                System.out.println("Ordem ano:");
                Set<FavLang> linguasAno = new TreeSet<FavLang>(new ComparatorAno());
                linguasAno.addAll(linguas);
                for (FavLang ordemAno : linguasAno) System.out.println(ordemAno);
                System.out.println();

                System.out.println("Ordem ano e nome:");
                Set<FavLang> linguasAnoNome = new TreeSet<FavLang>(new ComparatorAnoNome());
                linguasAnoNome.addAll(linguas);
                for (FavLang ordemAnoNome : linguasAnoNome) System.out.println(ordemAnoNome);
                System.out.println();

                System.out.println("Ordem nome, ano e IDE:");
                Set<FavLang> linguasNomeAnoIDE = new TreeSet<FavLang>(new ComparatorNomeAnoIDE());
                linguasNomeAnoIDE.addAll(linguas);
                System.out.println(linguasNomeAnoIDE);
            }
        }
    }

    public static int Questao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual questão gostaria de ver a resolução:%n" + "1- Arco Íris%n" + "2- Linguagem%n");
        return scanner.nextInt();
    }
}

class FavLang implements Comparable<FavLang>{
    public String nome;
    public Integer ano;
    public String IDE;

    public FavLang(String nome, Integer ano, String IDE) {
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIDE() {
        return IDE;
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
    public int compareTo(FavLang linguagemFavorita) { //Ordem de nome
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIDE implements Comparator<FavLang>{ //Ordem de IDE
    @Override
    public int compare(FavLang o1, FavLang o2) {
        return o1.IDE.compareToIgnoreCase(o2.IDE);
    }
}

class ComparatorAno implements Comparator<FavLang> { //Ordem de IDE
    @Override
    public int compare(FavLang o1, FavLang o2) {
        return o1.ano.compareTo(o2.ano);
    }
}

class ComparatorAnoNome implements Comparator<FavLang>{ //Ordem de Ano e Nome
    @Override
    public int compare(FavLang o1, FavLang o2){
        int ano = o1.getAno().compareTo(o2.getAno());
        if (ano != 0) return ano;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
class ComparatorNomeAnoIDE implements Comparator<FavLang>{ //Ordem de Nome, Ano e IDE
    @Override
    public int compare(FavLang o1, FavLang o2){
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int ano = o1.getAno().compareTo(o2.getAno());
        if (ano != 0) return ano;

        return (o1.getIDE().compareToIgnoreCase(o2.getIDE()));
    }
}



