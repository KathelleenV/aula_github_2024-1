package banco;

import java.util.ArrayList;

public class Banco {
	
    private ArrayList<Conta> arrayDeContas;

    public Banco(){
        arrayDeContas = new ArrayList<Conta>();
	}

	public void inserir(Conta c){
		arrayDeContas.add(c);
	}
	
	public Conta pesquisar(int numConta) throws ContaInexistente{
		for(Conta pConta : arrayDeContas){
			if(pConta.getNumero() == numConta){
				return pConta;
			}
		}
        throw new ContaInexistente(numConta);
	}

	public void deposito(int numConta, double valor) throws ContaInexistente{
		Conta procurarConta = pesquisar(numConta);
		procurarConta.credito(valor);
	}
	
	public void saque(int numConta, double valor) throws ContaInexistente, SaldoInsuficiente{
		Conta procurarConta = pesquisar(numConta);
		procurarConta.debito(valor);
	}
	
	public double saldo(int numConta) throws ContaInexistente{
		Conta procurarConta = pesquisar(numConta);
		return procurarConta.getSaldo();
	}
	
	public void transferencia(int numConta1, int numConta2, double valor) throws ContaInexistente, SaldoInsuficiente{
		Conta procurarConta1, procurarConta2;
		procurarConta1 = pesquisar(numConta1);
		procurarConta2 = pesquisar(numConta2);
		procurarConta1.debito(valor);
		procurarConta2.credito(valor);
	}

	public String gerarExtrato(int numConta) throws ContaInexistente{
		Conta procurarConta = pesquisar(numConta);
		return procurarConta.getExtrato();
	}
}