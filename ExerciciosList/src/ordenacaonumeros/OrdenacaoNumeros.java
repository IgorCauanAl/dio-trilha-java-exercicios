package ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	List<Numero> listaNumeros;

	public OrdenacaoNumeros() {
		listaNumeros = new ArrayList<>();

	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(new Numero(numero));
	}
	
	public List<Numero> ordenarAscendente() {
		List<Numero> listaAscendente = new ArrayList<>(listaNumeros);
		
		if(!listaAscendente.isEmpty()) {
			Collections.sort(listaAscendente);
			return listaAscendente;
		}else
			throw new RuntimeException("Lista vazia");
	}
	
	public List<Numero> ordenarDescrescente(){
		List<Numero> listaDescrescente = new ArrayList<>(listaNumeros);
		if(!listaDescrescente.isEmpty()) {
			Collections.sort(listaDescrescente,Collections.reverseOrder());
			return listaDescrescente;
		}else
			throw new RuntimeException("Lista Vazia");
	}

}
