public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int valor){
        return valor == 1 ? valor : valor * fatorial(valor - 1);
    }
}
