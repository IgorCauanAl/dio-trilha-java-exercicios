package ordenacaonumeros;

public class Numero implements Comparable<Numero>{

	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public int compareTo(Numero n) {
		// TODO Auto-generated method stub
		return Integer.compare(this.numero, n.getNumero());
	}
	
	public String toString() {
		return "Numero: " + numero;
	}
	
}
