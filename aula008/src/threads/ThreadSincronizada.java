package threads;

public class ThreadSincronizada extends Thread {
	int contador = 0;
	
	@Override
	public void run() {
		mostrarValor();
	}
	
	private void mostrarValor() {
		System.out.println(contador++);
	}
}
