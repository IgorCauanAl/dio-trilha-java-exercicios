package operacoesbasicas.contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContato() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		} else
			throw new RuntimeException("Lista Vazia");
	}

	public void exibirContatos() {
		if (!agendaContatoMap.isEmpty()) {
			System.out.println(agendaContatoMap);
		}
	}

	public Integer pesquisaPorNome(String nome) {
		Integer pesquisaPorNome = null;

		if (!agendaContatoMap.isEmpty()) {
			pesquisaPorNome = agendaContatoMap.get(nome);
		
		if (pesquisaPorNome == null) {
			System.out.println("Contato não encontrado na agenda!");
		}
		}else
		 System.out.println("Lista vazia");

		return pesquisaPorNome;
	}

}
