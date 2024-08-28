package ordenacao.alunos;

import java.util.Comparator;

public class ComparatorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno al1, Aluno al2) {
		// TODO Auto-generated method stub
		return Double.compare(al1.getMedia(), al2.getMedia());
	}

}
