package main;

import java.util.Scanner;

import pessoas.Pessoas;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int quantidade = sc.nextInt();
		
		Pessoas[] vetor = new Pessoas[quantidade];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoas(nome, idade, altura);
		}
		
		double somaAltura = 0;
		int menoresDe16 = 0;
		
		for(int i=0; i<vetor.length; i++) {
			somaAltura += vetor[i].getAltura();
			
			if (vetor[i].getIdade() < 16) {
				menoresDe16++;
			}
		}
		
		double mediaAltura = somaAltura / quantidade;
		double porcentagem = ((double)menoresDe16 / quantidade) * 100.0;
		
		System.out.println("Altura media: "+ mediaAltura);
		System.out.println("Pessoas com menos de 16 anos: "+porcentagem);
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		
		sc.close();
	}
}
