package curso;

public class Curso {
	String nomeDoCurso;
	int porcentagemConcluida;
	
	public Curso(String nomeDoCurso, int porcentagemConcluida) {
		this.nomeDoCurso = nomeDoCurso;
		this.porcentagemConcluida = porcentagemConcluida;
	}
	
	public String toString() {
		return "Curso: "+ this.nomeDoCurso +   " Concluído: " + this.porcentagemConcluida;
	}
	
	
}
