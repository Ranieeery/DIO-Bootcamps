public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (e exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
  
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {		
		int contagem = parametroDois - parametroUm;
	}
}
