import java.util.Objects;
import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        String controle = "Sem Quedas";

        for (String velocidade : velocidades){
            if (Objects.equals(velocidade, "0")) {
                controle = "Queda de Conexao";
                break;
            }
        }
        return controle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}