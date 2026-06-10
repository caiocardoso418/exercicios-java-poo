package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		} 
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma/n;
		
		System.out.println(media);
		
		
		sc.close();
	}
}
