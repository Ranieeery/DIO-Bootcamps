import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};

        // Funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);

        // Imperativo
        for (int valorCheck : valores) {
            int valor = 0;
            if (valorCheck % 2 == 0) {
                valor = valorCheck * 2;

                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }
    }
}
