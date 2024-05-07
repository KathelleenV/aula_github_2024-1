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
	
	public Conta pesquisar(int numConta){
		for(Conta pConta : arrayDeContas){
			if(pConta.getNumero() == numConta){
				return pConta;
			}
		}
	}

	public void deposito(int numConta, double valor){
		Conta procurarConta = pesquisar(numConta);
		procurarConta.credito(valor);
	}
	
	public void saque(int numConta, double valor){
		Conta procurarConta = pesquisar(numConta);
		procurarConta.debito(valor);
	}
	
	public double saldo(int numConta){
		Conta procurarConta = pesquisar(numConta);
		return procurarConta.getSaldo();
	}
	
	public void transferencia(int numConta1, int numConta2, double valor){	
	}
}