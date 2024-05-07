package banco;

public class Conta {
	 
	private int numero;
	protected double saldo;
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
	
	public Pessoa getTitular(){
		return titular;
	}

	public void credito(double valor){
		
	}
	
    public void debito(double valor){
		
	}
}