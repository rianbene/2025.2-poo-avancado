package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// lista();
		// set();
		// queue();
		collections();
	}

	private static void lista() {
		List<String> lista = new ArrayList<>();

		lista.add("Sizenando");
		lista.add("Cremilda");
		lista.add("Anildo");
		lista.add("Kira");
		lista.add("Nando Reis");
		lista.add("Mussoulini");
		lista.add("Bruce Wayne");
		lista.add("Caleb");
		System.out.println(lista + "\n");

		for (String item : lista) {
			System.out.println(item);
		}
		System.out.println("\n");

		lista.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("\n");
		String nome = lista.get(0);
		System.out.println(nome);
	}

	private static void set() {
		Set<String> set = new HashSet<>();
		set.add("Sizenando");
		set.add("Cremilda");
		set.add("Anildo");
		set.add("Kira");
		set.add("Nando Reis");
		set.add("Mussoulini");
		set.add("Bruce Wayne");
		set.add("Caleb");
		set.add("Cremilda");
		set.add("Anildo");
		// System.out.println(set + "\n");

		Pessoa p1 = new Pessoa();
		p1.nome = "Sizenando";

		Pessoa p2 = new Pessoa();
		p2.nome = "Sizenando";

		Pessoa p3 = p2;
		Set<Pessoa> s1 = new HashSet<>();
		s1.add(p1);
		s1.add(p2);
		s1.add(p1);
		s1.add(p2);
		s1.add(p3);
		System.out.println(s1);
		s1.forEach(p -> {
			System.out.println(p.nome);
		});
	}

	private static void queue() {
		Queue<String> fila = new LinkedList<>();
		fila.add("Java");
		fila.add("Python");
		fila.add("Javascript");

		System.out.println("Primeiro da fila: " + fila.poll());
		System.out.println("Primeiro da fila: " + fila.peek());
		System.out.println("Primeiro da fila: " + fila.element());
	}

	private static void collections() {
		List<String> lista = new ArrayList<>();

		lista.add("Sizenando");
		lista.add("Cremilda");
		lista.add("Anildo");
		lista.add("Kira");
		lista.add("Nando Reis");
		lista.add("Mussoulini");
		lista.add("Bruce Wayne");
		lista.add("Caleb");
		System.out.println(lista + "\n");

		Collections.sort(lista);
		System.out.println(lista + "\n");
		
		List<Pessoa> l1 = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		p1.nome = "Maria";
		p2.nome = "Luiza";
		p3.nome = "Ana";
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		
		//Collections.sort(l1);
	}
}