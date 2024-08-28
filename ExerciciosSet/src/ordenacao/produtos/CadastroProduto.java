package ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	Set<Produto> listaProdutos;
	
	public CadastroProduto() {
		
		listaProdutos = new HashSet<>();
		
	}
	
	
	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		
		listaProdutos.add(new Produto(nome,codigo,preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosNome = new TreeSet<>(listaProdutos);
		
		if(!listaProdutos.isEmpty()) {
			return produtosNome;
		}else
			throw new RuntimeException ("Lista vazia");
	}
	
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new OrdenandoPorPreco());
		
		if(!listaProdutos.isEmpty()) {
			produtosPorPreco.addAll(listaProdutos);
			return produtosPorPreco;
		}else
			throw new RuntimeException("Lista vazia");
		
		
	}
	
	
}
