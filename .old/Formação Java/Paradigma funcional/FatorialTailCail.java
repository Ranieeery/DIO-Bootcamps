public class FatorialTailCail {

    public static void main(String[] args) {
        System.out.println(fatorialA(100000));
    }

    public static double fatorialA(double valor) {
        return fatorialTailCail(valor, 1);
    }

    public static double fatorialTailCail(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialTailCail(valor - 1, numero * valor);
    }
}
