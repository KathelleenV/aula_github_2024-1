package banco;

public class Pessoa {
	
	private int cpf;
	private String nome;
	
    public Pessoa(int cpf, String nome){
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCpf(){
		return cpf;
	}
	
	public String getNome(){
		return nome;
	}
}