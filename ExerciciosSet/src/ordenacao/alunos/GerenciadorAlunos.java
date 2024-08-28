package ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	Set<Aluno> setAlunos;

	public GerenciadorAlunos() {
		setAlunos = new HashSet<>();
	}

	public void adicionarAlunos(String nome, long matricula, double media) {
		setAlunos.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		Aluno removerAluno = null;

		if (!setAlunos.isEmpty()) {
			for (Aluno al : setAlunos) {
				if (al.getMedia() == matricula) {
					removerAluno = al;
					break;
				}
			}
			setAlunos.remove(removerAluno);
		} else
			throw new RuntimeException("Lista vazia");

		
	}

	public Set<Aluno> exibirAlunosPorNome() {
     Set<Aluno> alunoPorNome = new TreeSet<>(setAlunos);
     
     if(!setAlunos.isEmpty()) {
    	 return alunoPorNome;
     }else
    	 throw new RuntimeException("Lista vazia");
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
		
		if(!setAlunos.isEmpty()) {
			alunoPorNota.addAll(setAlunos);
			return alunoPorNota;
		}else
			throw new RuntimeException("Lista vazia");
	}
	
	public void exibirAlunos() {
		System.out.println(setAlunos);
	}
}
