import java.util.*;

public class EndpointMaisAcessado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a linha com os endpoints separados por espaço
        String linha = sc.nextLine().trim();

        // TODO: Divida em array:
        String[] endpoints = linha.split(" ");

        // TODO: Crie um mapa para contar frequência:
        Map<String, Integer> frequencia = new HashMap<>();
        String maisAcessado = null;

        // TODO: Contabilize a frequência mantendo ordem de entrada:
        for (String endpoint : endpoints) {
            frequencia.put(endpoint, frequencia.getOrDefault(endpoint, 0) + 1);

            // TODO: Encontre o endpoint com maior frequência:
            if (maisAcessado == null || frequencia.get(endpoint) > frequencia.get(maisAcessado)) {
                maisAcessado = endpoint;
            }
        }

        // Imprime o endpoint mais acessado
        System.out.println(maisAcessado);

        sc.close();
    }
}