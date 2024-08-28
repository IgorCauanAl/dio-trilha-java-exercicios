package carrinhos;

public class app {

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		
		
		carrinho.adicionarItem("Maça", 2, 5);
		carrinho.adicionarItem("Laranja", 5, 3);
		
		System.out.println(carrinho.calcularValorTotal());
		
		carrinho.exibirItens();
		
	}
	
	

	
	
	
	
}
