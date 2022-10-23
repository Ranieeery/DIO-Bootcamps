public class Emprestimo{
  
  public static void calculoEmprestimo(double valor, int parcela){
    double valorTotal;
    
    valorTotal = valor * parcelasEmprestimo(parcela);
        System.out.printf("O valor final do empréstimo será de %.2f reais", valorTotal);
  }

  
  public static double parcelasEmprestimo(int parcela){
    double taxaJuros;
    switch(parcela){
      case 1:
      case 2: 
        taxaJuros = 1.0;
        break;
      case 3:
      case 4:
      case 5:
        taxaJuros = 1.27;
        break;
      case 6:
      case 7:
        taxaJuros = 1.5;
        break;
      default:
        taxaJuros = 1.78;
        break;
    }
    return taxaJuros;
  }
}