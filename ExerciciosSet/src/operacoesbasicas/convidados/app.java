package operacoesbasicas.convidados;

public class app {
 public static void main(String[] args) {
	 
	ConjuntoConvidados conjunto = new ConjuntoConvidados();
	
	conjunto.adicionarConvidado("Igor", 20);
	conjunto.adicionarConvidado("Wesley", 20);
	conjunto.adicionarConvidado("Lucas", 30);
	conjunto.adicionarConvidado("Fabio", 40);
	
	conjunto.exibirConvidados();
	
	
	
	conjunto.removerConvidadoPorCodigoConvite(40);
	
	System.out.println(conjunto.contarConvidados());
	
	
	conjunto.exibirConvidados();
	
	
	
}
}
