package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numero voce vai digitar: ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Numero pares: ");
		int pares = 0;

		for(int i=0 ; i<vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(" "+vetor[i]);
				pares ++;
			}
		}
		
		System.out.println("");
		System.out.print("Quantidades de numeros pares: ");
		System.out.println(pares);
		
		
		
		
		
		sc.close();
	}
	
	
}
