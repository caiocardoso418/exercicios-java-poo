package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		
		System.out.println("Entra com os dados de altura e largura: ");
		
		
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("perimetro = %.2f%n", retangulo.perimeter());
		System.out.printf("diagonal = %.2f%n", retangulo.diagonal());

		
		
		sc.close();
	}
}
