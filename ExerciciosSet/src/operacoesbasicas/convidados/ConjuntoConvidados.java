package operacoesbasicas.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {


	Set<Convidado> setConvidados;
	
	public ConjuntoConvidados() {
		setConvidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		setConvidados.add(new Convidado(nome,codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado removerPorCodigo = null;
		
		if(!setConvidados.isEmpty()) {
			for(Convidado c : setConvidados) {
				if(c.getCodigo() == codigoConvite) {
					removerPorCodigo = c;
					break;
				
				}

			}
			
			setConvidados.remove(removerPorCodigo);
			
		}else
			throw new RuntimeException("Lista vazia");
		
	}
	
	public int contarConvidados() {
		return setConvidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(setConvidados);
	}
	 
}
