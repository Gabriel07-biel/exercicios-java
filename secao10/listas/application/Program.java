package secao10.listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		//Adiciona elemento a lista na posição 2
		list.add(2, "Marco");
		
		//verifica o tamanho da lista.
		System.out.println(list.size());
		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");
		
		//remover elemento da lista especifico.
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------");
		//procurando em qual posição está o elemento na lista.
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-----------");
		
		//filtro para procurar nomes iniciados com a letra A. 
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------");
		
		//Encontrar primeiro elemento que começa com a letra A.
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}

}
