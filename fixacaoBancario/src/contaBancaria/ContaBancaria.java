package contaBancaria;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;		
	}
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", titular: "
				+ titular
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
	
}
