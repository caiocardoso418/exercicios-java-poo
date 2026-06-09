package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine()
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Enter initial deposit value:");
			double inicialDep = sc.nextDouble();
			cliente = new Cliente()
		}

		
		
		
		
		
		
		sc.close();
	}
}
