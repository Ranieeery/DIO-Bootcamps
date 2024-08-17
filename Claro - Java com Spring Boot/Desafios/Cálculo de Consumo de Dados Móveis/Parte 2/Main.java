import java.util.Scanner;

public class Main {

    // Função para converter GB para MB
    public static int gbParaMb(double gb) {
        return (int) gb * 1024;
    }

    // Função principal para verificar o limite de dados móveis
    public static void verificarLimiteDeDados(double limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = gbParaMb(limiteGb);

        if (consumoTotalMb >= limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            System.out.printf("Voce ainda possui %s MB disponiveis.", limiteMb - consumoTotalMb);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        verificarLimiteDeDados(limiteGb, consumoTotalMb);

        scanner.close();
    }
}