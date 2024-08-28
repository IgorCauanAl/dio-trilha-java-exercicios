package pesquisa.listatarefas;

public class app {
 public static void main(String[] args) {
	ListaTarefas tarefas = new ListaTarefas();
	
	tarefas.adicionarTarefa("Limpar casa");
	tarefas.adicionarTarefa("Limpar banheiro");
	tarefas.adicionarTarefa("Limpar carro");
	tarefas.adicionarTarefa("Limpar moto");
	
	
	
	tarefas.marcarTarefasConcluida("Limpar carro");
	tarefas.marcarTarefasPendente("Limpar casa");
	
	System.out.println(tarefas.obterTarefasConcluidas());
	System.out.println(tarefas.obterTarefasPendentes());
}
}
