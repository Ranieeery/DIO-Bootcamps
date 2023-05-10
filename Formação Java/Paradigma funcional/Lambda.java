public class Lambda {
    public static void main(String[] args) {
        Function function = x -> "Sr. " + x;
        System.out.println(function.gerarNome("Teste"));
    }

    //Interface funcional
    @FunctionalInterface
    interface Function {
        String gerarNome(String valor);
    }
}
