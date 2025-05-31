import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiltroCandidatosPorHabilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a primeira linha: número de candidatos e habilidade buscada
        String[] primeiraLinha = scanner.nextLine().split(",", 2);
        int n = Integer.parseInt(primeiraLinha[0].trim());
        String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();

        List<String> candidatosComHabilidade = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            // Separar nome e habilidades
            String[] partes = linha.split("-", 2);
            String nome = partes[0].trim();
            String habilidades = partes.length > 1 ? partes[1].trim() : "";

            String[] habNome = habilidades.split(",");
            for (String hab : habNome) {
                if (hab.trim().toLowerCase().equals(habilidadeBuscada)) {
                    candidatosComHabilidade.add(nome);
                    break; // Adiciona o candidato apenas uma vez
                }
            }
        }

        if (candidatosComHabilidade.isEmpty()) {
            System.out.println("Nenhum candidato encontrado");
        } else {
            for (String candidato : candidatosComHabilidade) {
                System.out.println(candidato);
            }
        }

        scanner.close();
    }
}