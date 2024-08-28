package ordenacaonumeros;

public class app {

	public static void main(String[] args) {
	
		OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
		
		ordenacao.adicionarNumero(5);
		ordenacao.adicionarNumero(3);
		ordenacao.adicionarNumero(4);
		ordenacao.adicionarNumero(2);
		ordenacao.adicionarNumero(1);
		
		System.out.println(ordenacao.ordenarAscendente().toString());
		System.out.println(ordenacao.ordenarDescrescente().toString());
	}

}
