package pesquisa.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	Set<Tarefas> listaTarefas;

	public ListaTarefas() {
		listaTarefas = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefas(descricao));
	}

	public Set<Tarefas> removerTarefas(String descricao) {
		Tarefas removendo = null;

		if (!listaTarefas.isEmpty()) {
			for (Tarefas t : listaTarefas) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					removendo = t;
					listaTarefas.remove(removendo);
					break;
				}
			}

			return listaTarefas;

		} else
			throw new RuntimeException("Lista vazia");
	}

	public void exibirTarefas() {
		System.out.println(listaTarefas);
	}

	public int contarTarefas() {
		return listaTarefas.size();
	}

	public Set<Tarefas> obterTarefasConcluidas() {
		Set<Tarefas> listaTarefasConcluidas = new HashSet<>();

		for (Tarefas t : listaTarefas) {
			if (!t.getFeito()) {
				listaTarefasConcluidas.add(t);
			}

		}
		
		return listaTarefasConcluidas;
	}

	public Set<Tarefas> obterTarefasPendentes() {
		Set<Tarefas> listaTarefasPendentes = new HashSet<>();

		for (Tarefas t : listaTarefas) {
			if (t.getFeito()) {
				listaTarefasPendentes = new HashSet<>();
			}
		}
		return listaTarefasPendentes;
	}

	public void marcarTarefasConcluida(String descricao) {

		for (Tarefas t : listaTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setFeito(true);
			}
		}

	}
	
	public void marcarTarefasPendente(String descricao) {
		Tarefas tarefaPendente = null;
		 for(Tarefas t : listaTarefas) {
			 if(t.getDescricao().equalsIgnoreCase(descricao)) {
				 tarefaPendente= t;
				 break;
			 }
			
		 }
		 
		 if(tarefaPendente != null ) {
			 if(tarefaPendente.getFeito()) {
				 tarefaPendente.setFeito(false);
			 }
		 }else
			 System.out.println("Tarefa nao encontrada na lista");
	}
	
	public void limparLista() {
		if(listaTarefas.isEmpty()) {
			System.out.println("Lista já está vazia");
		}else
			listaTarefas.clear();
	}

}
