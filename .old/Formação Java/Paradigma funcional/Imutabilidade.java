import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = new Scanner(System.in).nextInt();
        UnaryOperator<Integer> retornarDobro = x2 -> x2 * 2;
        System.out.println(retornarDobro.apply(valor));
    }
}
