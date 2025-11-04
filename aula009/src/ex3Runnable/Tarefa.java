package ex3Runnable;

public class Tarefa implements Runnable {
	//private String nome;

	/*public Tarefa(String n) {
		nome = n;
	}*/

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
