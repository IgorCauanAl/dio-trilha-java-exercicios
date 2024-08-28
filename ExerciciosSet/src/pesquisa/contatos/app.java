package pesquisa.contatos;

public class app {
 public static void main(String[] args) {
	AgendaContatos agenda = new AgendaContatos();
	
	agenda.adicionarContato("Igor", 2323232);
	agenda.adicionarContato("Lucas", 2989898);
	agenda.adicionarContato("Fabio", 567567567);
	agenda.adicionarContato("Wesley", 24242424);
	agenda.adicionarContato("Wesley Guimares", 242424247);
	
	System.out.println(agenda.pesquisarPorNome("Wesley"));
	
	agenda.atualizarNumeroPorContato("Igor", 712342424);
	
	agenda.exibirContatos();
	
}
}
