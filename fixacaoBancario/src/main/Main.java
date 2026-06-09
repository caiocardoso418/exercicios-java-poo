package main;

import java.util.Locale;
import java.util.Scanner;
import contaBancaria.ContaBancaria; 

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Criamos a variável da conta aqui fora do IF para ela existir no programa todo
        ContaBancaria conta;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("Enter account holder: ");
        String titular = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            
            // DICA: Aqui você usa o CONSTRUTOR 1 (que recebe numero, titular e depositoInicial)
            conta = new ContaBancaria(numeroConta, titular, depositoInicial);
            
        } else {
            // DICA: Aqui você usa o CONSTRUTOR 2 (que recebe apenas numero e titular)
            conta = new ContaBancaria(numeroConta, titular);
        }

        // STEP 8: Exibição e Fluxo de Testes
        System.out.println("\nAccount data:");
        // DICA: Se você fez o toString(), basta mandar imprimir a variável 'conta'
        System.out.println(conta);

        // --- PARTE DO DEPÓSITO ---
        System.out.print("\nEnter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        // DICA: Chame o seu método de depósito aqui usando a variável 'conta'
        conta.deposito(valorDeposito);
        
        System.out.println("Updated account data:");
        // DICA: Imprima a conta atualizada aqui
        System.out.println(conta);

        // --- PARTE DO SAQUE ---
        System.out.print("\nEnter a withdraw value: ");
        double valorSaque = sc.nextDouble();
        // DICA: Chame o seu método de saque aqui
        conta.saque(valorSaque);
        
        System.out.println("Updated account data:");
        System.out.println(conta);
        
        sc.close(); 
    }
}
