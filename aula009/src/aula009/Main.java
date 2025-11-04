package aula009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("linha1");
			Scanner sc = null;
			sc.close();
			int numero = 10 / 0;
			System.out.println("linha2");
		} catch (ArithmeticException e) {
			System.out.println("Erro matematico");
		} catch (NullPointerException e) {
			System.out.println("Erro objeto nulo");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Passou no finally");
		}
		System.out.println("linha3");
		
		try {
			verificarIdade(15);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void verificarIdade(int idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("Idade deve ser maior ou igual a 18");
		} else {
			System.out.println("Idade válida!");
		}
	}
}
