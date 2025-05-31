import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se a próxima entrada é um número do tipo double
        if (scanner.hasNextDouble()) {
            // Lê o valor em Celsius fornecido pelo usuário
            double celsius = scanner.nextDouble();

            if (celsius >= -273.15) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(fahrenheit);
            } else {
                System.out.println("Entrada invalida");
            }

        } else {
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
}