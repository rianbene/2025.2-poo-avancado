package ex3Runnable;

public class Main {

	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		Thread t1 = new Thread(tarefa,"T1");
		Thread t2 = new Thread(tarefa,"T2");
		Thread t3 = new Thread(tarefa,"T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Todas as threads foram iniciadas");
	}

}
