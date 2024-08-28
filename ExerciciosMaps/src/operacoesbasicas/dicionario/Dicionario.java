package operacoesbasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> mapDicionario;

	public Dicionario() {
		
		this.mapDicionario = new HashMap<>();
	}
	
	public void adicionarPalavra(String nome, String definicao) {
		mapDicionario.put(nome, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!mapDicionario.isEmpty()) {
			mapDicionario.remove(palavra);
		}else
			System.out.println("Lista vazia");
	}
	
	
	
}
