package exercicioThreadEException;

public class CalculadoraThread extends Thread {
	private int a, b;

	public CalculadoraThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		try {
			if (b == 0) {
				throw new DivisaoPorZeroException("Erro: Divisor é igual a zero");
			}
			System.out.println("Resultado: " + (a/b));
		} catch (DivisaoPorZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
