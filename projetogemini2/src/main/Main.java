package main;

import contaBancaria.ContaBancaria;

public class Main {
	public static void main(String[] args) {
		ContaBancaria saldoPositivo = new ContaBancaria("Caio", 1500.00);
		ContaBancaria saldoNegativo = new ContaBancaria("Bruno", -500.00);
		
		System.out.println(saldoPositivo);
        System.out.println(saldoNegativo);


				
	}
}
