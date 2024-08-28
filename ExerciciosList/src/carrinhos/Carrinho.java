package carrinhos;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	List<Item> carrinho;
	
	public Carrinho() {
		this.carrinho = new ArrayList<>();
	}
	
	
	public void adicionarItem(String nome,double preco, int quantidade) {
		carrinho.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		
		List <Item> itemParaRemover = new ArrayList<>();
		for(Item i: carrinho) {
			if(i.getNome().equalsIgnoreCase(nome)){
				itemParaRemover.add(i);
			}
		}
		carrinho.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal(){
		double total = 0;
 		
		
		for(Item i: carrinho) {
		 total += i.getPreco() * i.getQuantidade();
		
		}
		return total;
	}
	
	public void exibirItens() {
		System.out.println(carrinho.toString());
	}
	
	
}
