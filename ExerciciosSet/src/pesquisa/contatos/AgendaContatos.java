package pesquisa.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	Set<Contato> listaContatos;

	public AgendaContatos() {
		listaContatos = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		listaContatos.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(listaContatos);
	}

	public Set<Contato> pesquisarPorNome(String nome) {

		Set<Contato> listaNome = new HashSet();
		if (!listaContatos.isEmpty()) {
			for (Contato c : listaContatos) {
				if (c.getNome().startsWith(nome)) {
					listaNome.add(c);
				}
			}
			return listaNome;
		} else
			throw new RuntimeException("Lista vazia");

	}

	public Contato atualizarNumeroPorContato(String nome, int numeroNovo) {

		Contato contatoAtualizado = null;

		if (!listaContatos.isEmpty()) {
         for(Contato c : listaContatos) {
        	 if(c.getNome().equalsIgnoreCase(nome)) {
        		 c.setNumeroTelefone(numeroNovo);
        		 contatoAtualizado = c;
        		 break;
        	 }
         }
         
         return contatoAtualizado;
         
		}else
			throw new RuntimeException("Lista vazia");

	}
}