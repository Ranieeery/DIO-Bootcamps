public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiro uf: EstadoBrasileiro.values()) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
	  //Enums já são automaticamente instaciados, não sendo necessário um 'new'
    EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
	}
}
