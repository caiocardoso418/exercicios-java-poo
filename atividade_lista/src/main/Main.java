package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import funcionario.Funcionario;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantidade de funcionario pra cadastrar: ");
		int n = sc.nextInt();
		
		for(int i=0; i< n; i++) {
			System.out.print("Id: ");
            int id = sc.nextInt();
            
            sc.nextLine();
            
			System.out.print("nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			
			list.add(new Funcionario(id, name, salary));
			
			System.out.print("Digite quem tera o aumento de salario: ");
			int idAumento = sc.nextInt();
			
			Funcionario emp = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
			
			
			
		
            
            
            
		}
		
		
		
		
		
		sc.close();
	}
}
