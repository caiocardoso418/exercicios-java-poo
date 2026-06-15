package produtos;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		if(preco >= 0.0) {
			this.preco = preco;
		}else {
			System.out.println("Erro: O preço do produto não pode ser negativo! Iniciando com R$ 0.0");
			this.preco = 0.0;
		}
		
		if(quantidade >= 0) {
			this.quantidade = quantidade;
		}else {
			System.out.println("Erro: A quantidade do produto não pode ser negativo! Iniciando com 0");
			this.quantidade = 0;
		}
	}
	
	public Produtos(String nome, double preco) {
		this(nome, preco, 0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco >= 0.0) {
			this.preco = preco;
		}else {
			System.out.println("Erro: O preço do produto não pode ser negativo!");
			
		}
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0) {
			this.quantidade = quantidade;
		}else {
			System.out.println("Erro: A quantidade do produto não pode ser negativo!");
		}
	}
	
	public void adicionarEstoque(int quantidade) {
		if(quantidade>= 0) {
			this.quantidade += quantidade;
		}else {
            System.out.println("Erro: A quantidade a adicionar deve ser maior que zero!");

		}
	}
	
	public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else if (quantidade <= 0) {
            System.out.println("Erro: A quantidade a remover deve ser maior que zero!");
        } else {
            System.out.println("Erro: Quantidade insuficiente em estoque!");
        }
    }
	
	public String toString() {
        return nome 
            + ", R$ " 
            + String.format("%.2f", preco) 
            + ", " 
            + quantidade 
            + " unidades em estoque.";
    }
	
}
