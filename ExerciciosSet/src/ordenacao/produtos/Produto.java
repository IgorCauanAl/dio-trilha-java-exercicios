package ordenacao.produtos;

import java.util.Objects;

public class Produto implements Comparable <Produto>{

	private String nome;
	private long cod;
	private double preco;
	private int quantidade;

	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int compareTo(Produto p) {
		
		return this.nome.compareTo(p.getNome());
	}
	
	
	
	
	

}
