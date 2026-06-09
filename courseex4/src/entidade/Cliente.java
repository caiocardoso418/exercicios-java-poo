package entidade;

public class Cliente {
	private int numeroConta;
	private String nome;
	private double valor;
	
	public Cliente(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public Cliente(int numeroConta, String nome, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(valorInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void deposito(double quantia) {
		valor += quantia;
	}
	
	public void saque(double quantia) {
		valor -= quantia + 5;
	}
	
	
	
	
	
	
	
	
}

	
