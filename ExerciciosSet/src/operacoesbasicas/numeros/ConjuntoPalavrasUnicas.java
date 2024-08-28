package operacoesbasicas.numeros;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	Set<String> setPalavras;

	public ConjuntoPalavrasUnicas() {
		setPalavras = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		setPalavras.add(palavra);
	}

	public void removerPalavra(String palavra) {

		if (!setPalavras.isEmpty()) {
			if (setPalavras.contains(palavra)) {
				setPalavras.remove(palavra);
			}else
				System.out.println("Palavra nao esta na lista");
		}else
			System.out.println("Conjunto vazio");
	}

	public boolean verificarPalavras(String palavra) {
		return setPalavras.contains(palavra);
	}

	public void exibirPalavras() {
		System.out.println(setPalavras);
	}

}
