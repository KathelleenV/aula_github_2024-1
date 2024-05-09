package banco;

public class SaldoInsuficiente extends Exception{

	public SaldoInsuficiente(int numConta, double saldo){
		super("A conta de numero " + numConta + " nao possui saldo suficiente. Saldo atual R$" + saldo + "!");
	}
}