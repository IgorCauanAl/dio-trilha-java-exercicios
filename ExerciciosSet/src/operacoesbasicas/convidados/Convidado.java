package operacoesbasicas.convidados;

import java.util.Objects;

public class Convidado {
	
	private String nome;
	private int codigo;
	
	public Convidado(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		
	}

	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigo == other.codigo;
	}
	
	
	public String toString() {
		return " Nome:  " + nome + " Codigo: " + codigo;
	}
	
	

}
