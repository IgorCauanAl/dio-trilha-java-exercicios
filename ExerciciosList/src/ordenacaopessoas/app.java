package ordenacaopessoas;

public class app {
 public static void main(String[] args) {
	
	OrdenacaoPessoas ordenar = new OrdenacaoPessoas();
	
	ordenar.adicionarPessoas("Fabio", 50, 1.70);
	ordenar.adicionarPessoas("Igor", 20, 1.80);
	ordenar.adicionarPessoas("Lucas", 17, 1.60);
	
	
	System.out.println(ordenar.ordenarIdade());
	System.out.println(ordenar.ordenarPorAltura());
	
	
}
}
