public class Calculadora {
  public static void soma(double numero1, double numero2){
    double resultado = numero1 + numero2;
    System.out.printf("O valor da soma de %.2f com %.2f é %.2f%n", numero1, numero2, resultado);
  }

  public static void subtracao(double numero1, double numero2){
    double resultado = numero1 - numero2;
    System.out.printf("O valor da subtração de %.2f com %.2f é %.2f%n", numero1, numero2, resultado);
  }

  public static void multiplicacao(double numero1, double numero2){
    double resultado = numero1 * numero2;
    System.out.printf("O valor da subtração de %.2f com %.2f é %.2f%n", numero1, numero2, resultado);
  }

  public static void divisao(double numero1, double numero2){
    double resultado = numero1 / numero2;
    System.out.printf("O valor da divisão de %.2f com %.2f é %.2f%n", numero1, numero2, resultado);
  }
}
