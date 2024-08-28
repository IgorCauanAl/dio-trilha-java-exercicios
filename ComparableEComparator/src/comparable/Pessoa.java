package comparable;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public int compareTo(Pessoa outraPessoa) {
		return Integer.compare(this.idade,outraPessoa.idade);
	}
	
}
