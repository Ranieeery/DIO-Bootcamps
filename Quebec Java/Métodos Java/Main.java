import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String exercicio;
    System.out.printf("Digite qual exercício deseja resolver:\n" +
                      "- Calculadora \n" +
                      "- Mensagem \n" +
                      "- Empréstimo \n");
    exercicio = sc.next();
    
    switch(exercicio){
      case "Calculadora":
        resultadoCalculadora();
        break;
      case "Mensagem":
        resultadoHora();
        break;
      case "Empréstimo":
        resultadoEmprestimo();
        break;
      default:
        resultadoInvalido();
        break;
    }
    sc.close();
  }

  public static void resultadoCalculadora(){
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multiplicacao(3, 6);
        Calculadora.soma(3, 6);
  }

  public static void resultadoHora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a hora atual:");
        int hora = sc.nextInt();
        Mensagem.horaDia(hora);
        sc.close();
  }

  public static void resultadoEmprestimo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do empréstimo:");
        double valor = sc.nextDouble();
        System.out.println("Insira em quantas vezes gostaria de parcelar:");
        int parcela = sc.nextInt();
        Emprestimo.calculoEmprestimo(valor, parcela);
        sc.close();
  }

  public static void resultadoInvalido(){
    System.out.println("Insira um termo válido");
  }
  
}