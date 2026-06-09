package main;

import curso.Curso;

public class Main {
	public static void main(String[] args) {
		Curso cursoJava = new Curso("Java Completo + POO", 19);
        Curso cursoConcurso = new Curso("Direito Administrativo para o BRB", 5);
        
        System.out.println(cursoJava);
        System.out.println(cursoConcurso);
	}
}
