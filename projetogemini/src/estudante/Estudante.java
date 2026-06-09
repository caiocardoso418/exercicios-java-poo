package estudante;

public class Estudante {
	public String nome;
	public int semestre;
	
	public Estudante(String nome, int semestre) {
		this.nome = nome;
		this.semestre = semestre;
				
	}
	
	public String toString() {
		return "nome-" + this.nome +  " semestre-" + this.semestre;
	}
}
