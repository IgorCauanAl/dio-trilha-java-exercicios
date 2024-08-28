package pesquisa.listatarefas;

import java.util.Objects;

public class Tarefas {

	private String descricao;
	private boolean feito;
	
	public Tarefas(String descricao) {
		this.descricao = descricao;
		this.feito = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public boolean getFeito() {
		return feito;
	}
	
	public void setFeito(boolean feito) {
		this.feito = feito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefas other = (Tarefas) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Tarefas [descricao=" + descricao + "]";
	}
	
	
}
