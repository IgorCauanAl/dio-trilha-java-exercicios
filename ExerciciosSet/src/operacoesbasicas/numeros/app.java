package operacoesbasicas.numeros;

public class app {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
		
		conjunto.adicionarPalavra("Maça");
		conjunto.adicionarPalavra("Banana");
		conjunto.adicionarPalavra("Leite");
		conjunto.adicionarPalavra("Biscoito");
		
		conjunto.exibirPalavras();
		conjunto.removerPalavra("Leite");
		conjunto.exibirPalavras();
		
		
	}
	
	
}
