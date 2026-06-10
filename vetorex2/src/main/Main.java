package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		int soma = 0;
		double media = 0;
		
		int[] vetor = new int[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("digite um valor: ");

			vetor[i] = sc.nextInt();
		}
		
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i];

		}
		
			
		System.out.print("Valores: ");
		for(int i = 0; i < vetor.length; i++) {
		    System.out.print(" "+vetor[i]);
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.println("Soma: "+ soma);
		System.out.println("Media: "+media);
		
		sc.close();
	}
}
