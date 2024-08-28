package ordenacao.alunos;

public class app {
 public static void main(String[] args) {
	GerenciadorAlunos gerenciar = new GerenciadorAlunos();
	
	gerenciar.adicionarAlunos("Igor",543423432,7.0);
	gerenciar.adicionarAlunos("Fabio",4124124,5.0);
	gerenciar.adicionarAlunos("Wesley",34567534,9.0);
	gerenciar.adicionarAlunos("Lucas",123456,8.3);
	
	gerenciar.exibirAlunos();
	
	System.out.println(gerenciar.exibirAlunosPorNome());
	System.out.println(gerenciar.exibirAlunosPorNota());
	
	gerenciar.removerAluno(543423432);
	
	gerenciar.exibirAlunos();
}
}
