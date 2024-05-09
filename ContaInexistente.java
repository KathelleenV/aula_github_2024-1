package banco;

public class ContaInexistente extends Exception {
	
	public ContaInexistente(int numConta){
		System.out.println("A conta de numero " + numConta + " eh inexistente!");
	}
}