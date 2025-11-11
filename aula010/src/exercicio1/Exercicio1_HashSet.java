package exercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1_HashSet {
	static int resultado;

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<>();

		// Com o Scanner
		/*
		 * Scanner sc = new Scanner(System.in); int num = 0; while (num != -1) { num =
		 * sc.nextInt(); nums.add(num); }
		 */
		nums.add(10);
		nums.add(4);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		nums.add(12);
		nums.add(3);
		nums.add(6);
		System.out.println("Numero de elementos unicos: " + nums.size());

		for (int n : nums) {
			resultado += n;
		}
		
		System.out.println("Soma dos valores únicos: "+ resultado);
		
		resultado = 0;
		nums.forEach(item -> {
			resultado += item;
		});
		
		System.out.println("Soma dos valores únicos: "+ resultado);

	}
}
