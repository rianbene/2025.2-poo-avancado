package exercicioThreadEException;

public class Main {

	public static void main(String[] args) {
		new CalculadoraThread(10, 0).start();
		new CalculadoraThread(20, 2).start();
		new CalculadoraThread(85, 4).start();
		new CalculadoraThread(17, 0).start();
		new CalculadoraThread(1189, 3).start();
	}

}
