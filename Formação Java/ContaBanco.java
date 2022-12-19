import java.util.Scanner;

public class ContaBanco {
  public static void main(String[] args){
    ContaTerminal conta = new ContaTerminal();
    conta.contaTerminal();
  }
}

class ContaTerminal {
  public void contaTerminal(){
    Scanner scanner = new Scanner(System.in);
    int contaCliente;
    double saldoCliente;
    String nomeCliente, agenciaCliente;

    System.out.println("Digite o número da conta");
    contaCliente = scanner.nextInt();
    System.out.println("Digite a agência da conta");
    agenciaCliente = scanner.next();
    System.out.println("Digite o seu nome");
    nomeCliente = scanner.next();
    System.out.println("Digite o saldo da conta");
    saldoCliente = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente.toUpperCase(), agenciaCliente, contaCliente, saldoCliente);
  }
}
