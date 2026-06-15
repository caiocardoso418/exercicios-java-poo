package aulaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Jerson");
		lista.add("Bob");
		lista.add("Clebaer");
		lista.add("Machado");
		
		lista.add(4, "Marco");
		
		System.out.println(lista.size());
		
		lista.remove("Cleber");
		
		lista.remove(1);
		
		System.out.println("----------------------");

		lista.removeIf(x -> x.charAt(0) == 'M');

		for(String x : lista) {
			System.out.println(x);
		}
		
		
		System.out.println("----------------------");
		
		System.out.println("---------------------");
		System.out.println("procura bob: " + lista.indexOf("Bob"));
		System.out.println("procura marco: " + lista.indexOf("marco"));
		
		System.out.println("------------------");

		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		
		for(String x : resultado) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);


	}
}
