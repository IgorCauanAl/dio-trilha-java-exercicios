package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class app {
 
	public static void main(String[] args) {
	
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Igor",20));
		pessoas.add(new Pessoa("Lucas",21));
		pessoas.add(new Pessoa("Joao",22));
		pessoas.add(new Pessoa("Marcos",25));
		
		
		Collections.sort(pessoas);
		
		
		
		for(Pessoa p : pessoas) {
			System.out.println(p.idade);
		}
		
	}
	
	
}
