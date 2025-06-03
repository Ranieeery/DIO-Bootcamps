import java.util.*;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número de tarefas
        int n = Integer.parseInt(sc.nextLine());

        // TODO: Crie uma lista para armazenar as tarefas como pares (nome, prioridade):
        var tarefas = new ArrayList<Tarefa>();

        // TODO: Leia cada linha, separada por nome e prioridade e adiciona à lista:
        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine().trim();
            String[] partes = linha.split(",");
            String nome = partes[0];
            int prioridade = Integer.parseInt(partes[1].trim());
            tarefas.add(new Tarefa(nome, prioridade));
        }

        // TODO: Ordene a lista pela prioridade crescente:
        tarefas.sort(Comparator.comparingInt(t -> t.prioridade));

        // Imprime a lista ordenada no formato "tarefa - prioridade":
        for (Tarefa t : tarefas) {
            System.out.println(t.nome + " - " + t.prioridade);
        }

        sc.close();
    }

    // Classe auxiliar para armazenar nome e prioridade:
    static class Tarefa {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }
}