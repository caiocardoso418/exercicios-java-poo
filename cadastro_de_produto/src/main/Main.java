package main;

import java.util.Locale;
import java.util.Scanner;

import produtos.Produtos;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

		
		System.out.println("Escolha o cenário para testar:");
        System.out.println("1 - Cadastro completo com estoque inicial");
        System.out.println("2 - Sobrecarga com estoque inicial zero e validação");
        System.out.print("Opção: ");
        
        int opcao = sc.nextInt();
        sc.nextLine();
        
        if (opcao == 1) {
            System.out.println("\n--- CADASTRO DE PRODUTO ---");
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço: ");
            double preco = sc.nextDouble();
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = sc.nextInt();

            Produtos prod = new Produtos(nome, preco, quantidade);

            System.out.println("\nProduto cadastrado com sucesso!");
            System.out.println("Dados do produto: " + prod);

            System.out.print("\nDeseja adicionar produtos ao estoque? Quantos? ");
            int qtdAdicionar = sc.nextInt();
            prod.adicionarEstoque(qtdAdicionar);
            System.out.println("Estoque atualizado: " + prod);

            System.out.print("\nDeseja remover produtos do estoque? Quantos? ");
            int qtdRemover = sc.nextInt();
            prod.removerEstoque(qtdRemover);
            System.out.println("Estoque atualizado: " + prod);

        } else if (opcao == 2) {
            System.out.println("\n--- CADASTRO DE PRODUTO (SOBRECARGA) ---");
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço: ");
            double preco = sc.nextDouble();
            System.out.println("(A quantidade inicial não foi informada, iniciando com 0...)");

            // Instancia usando o construtor sobrecarregado (2 parâmetros)
            Produtos prod = new Produtos(nome, preco);

            System.out.println("\nProduto cadastrado com sucesso!");
            System.out.println("Dados do produto: " + prod);

            System.out.println("\nTentando definir um preço negativo de teste...");
            prod.setPreco(-50.0); // Deve exibir mensagem de erro
            System.out.println("Dados permanecem: " + prod);

            System.out.print("\nDeseja adicionar produtos ao estoque? Quantos? ");
            int qtdAdicionar = sc.nextInt();
            prod.adicionarEstoque(qtdAdicionar);
            System.out.println("Estoque atualizado: " + prod);
        } else {
            System.out.println("Opção inválida!");
        }
		
		sc.close();
	}
}
