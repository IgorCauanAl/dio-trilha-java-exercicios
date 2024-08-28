package ordenacaopessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoas(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa> ordenarIdade(){
		List<Pessoa>pessoasPorIdade = new ArrayList<>(listaPessoas);
		
		if(!pessoasPorIdade.isEmpty()) {
			Collections.sort(pessoasPorIdade);
			return pessoasPorIdade;
		}else
		  throw new RuntimeException("A lista está vazia!");
		
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa>pessoasPorAltura = new ArrayList<>(listaPessoas);
		
		if(!pessoasPorAltura.isEmpty()) {
			Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			return pessoasPorAltura;
		} else
			throw new RuntimeException("Lista vazia");
	}
	

	
}
