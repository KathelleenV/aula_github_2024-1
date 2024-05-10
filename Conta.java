package banco;

public class Conta {
	 
	private int numero;
	protected double saldo;
	protected String extrato = "";
	private Pessoa titular;
	
	public Conta(int numero, Pessoa titular){
		this.numero = numero;
		this.titular = titular;
	}
	
	public int getNumero(){
		return numero;
	}

	public double getSaldo(){
		return saldo;
	}
	
	public String getExtrato(){
		return extrato;
	}

	public Pessoa getTitular(){
		return titular;
	}

	public void credito(double valor){
		saldo = saldo + valor;
		extrato = extrato + "Credito: R$" + valor + ". Saldo: R$" + saldo + "\n";
	}
	
    public void debito(double valor) throws SaldoInsuficiente{
		if(saldo >= valor){
			saldo = saldo - valor;
			extrato = extrato + "Debito: R$" + valor + ". Saldo: R$" + saldo + "\n";
		}else{
			throw new SaldoInsuficiente(getNumero(), getSaldo());
		}
	}
}