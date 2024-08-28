package ordenacao.alunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private long matricula;
	private double media;

	public Aluno(String nome, long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
	}

	@Override
	public int compareTo(Aluno al) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(al.getNome()) ;
	}
	
	
	

}
