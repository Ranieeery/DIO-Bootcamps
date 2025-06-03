import java.util.*;

public class EndpointGetLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia a linha com os nomes separados por espaço:
        String linha = sc.nextLine().trim();

        // TODO: Divida os nomes em um array:
        String[] nomes = linha.split(" ");

        // TODO: Ordene os nomes alfabeticamente:
        Arrays.sort(nomes);

        // TODO: Use o StringBuilder para construir a saída no formato JSON simples:
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // TODO: Itere e adicione aspas e vírgulas entre os nome:s
        Iterator<String> nome = Arrays.stream(nomes).iterator();

        while (nome.hasNext()) {
            sb.append("\"").append(nome.next()).append("\"");
            if (nome.hasNext()) {
                sb.append(", ");
            }
        }

        sb.append("]");

        // Imprime a lista formatada
        System.out.println(sb.toString());

        sc.close();
    }
}