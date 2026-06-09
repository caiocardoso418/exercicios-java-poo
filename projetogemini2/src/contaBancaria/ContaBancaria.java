package contaBancaria;

public class ContaBancaria {
	public String titular;
	public double saldo; 
	
	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		} else {
			System.out.println("*\"Saldo inválido! Iniciando com R$ 0.0\"*");
			this.saldo = 0.0;
		}
	}
	
	public String toString() {
		return "Cliente" + this.titular + "Saldo" + this.saldo;
	}
	
}
