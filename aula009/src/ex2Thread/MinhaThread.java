package ex2Thread;

public class MinhaThread extends Thread {
	private String nome;
	public MinhaThread(String nome) {
		this.nome = nome;
	}
	@Override
	public void run() {
		System.out.println("Executando a thread: " + nome);
		System.out.println("Executando a thread: " + nome);
		System.out.println("Executando a thread: " + nome);
		System.out.println("Executando a thread: " + nome);
		System.out.println("Executando a thread: " + nome);
	}
}
