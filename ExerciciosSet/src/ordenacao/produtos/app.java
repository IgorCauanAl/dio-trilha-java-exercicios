package ordenacao.produtos;

public class app {

	
	public static void main(String[] args) {
	
		CadastroProduto cadastro = new CadastroProduto();
		
		cadastro.adicionarProduto("Leite", 2l, 5.60, 130);
		cadastro.adicionarProduto("Chocolate", 4l, 8.20, 150);
		cadastro.adicionarProduto("Salgadinho", 5l, 3.30, 180);
		cadastro.adicionarProduto("Biscoito", 6l, 5.70, 190);
		
		System.out.println(cadastro.exibirProdutosPorNome());
		System.out.println(cadastro.exibirProdutosPorPreco());
		
	}
	
}
