import java.util.Scanner;

public class CorporateEmailValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedDomain = "company.com";
        String email = scanner.nextLine().trim();

        // TODO: Verifique se o e-mail contém o domínio esperado
        String[] splitted = email.split("@");

        System.out.println(splitted[1].equals(expectedDomain) ? "E-mail valido" : "E-mail invalido");

        scanner.close();
    }
}