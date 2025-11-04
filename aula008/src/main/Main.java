package main;

import threads.MinhaRunnable;
import threads.MinhaThread;
import threads.ModificarFalso;
import threads.ModificarVerdadeiro;
import threads.Pessoa;
import threads.ThreadSincronizada;

public class Main {

	public static void main(String[] args) {
		// primeiroExemplo();
		// segundoExemplo();
		// sysout();
		// exemploSono();
		//terceiroExemplo();
		quartoExemplo();
	}
	
	private static void primeiroExemplo() {
		MinhaThread t = new MinhaThread();
		t.start();
	}

	private static void segundoExemplo() {
		Thread t = new Thread(new MinhaRunnable());
		t.start();
	}

	private static void terceiroExemplo() {
		ThreadSincronizada t = new ThreadSincronizada();
		t.start();
		for (int i = 0; i < 5; i++) {
			t.run();
		}
	}

	private static void sysout() {
		System.out.println("main 1");
		System.out.println("main 2");
		System.out.println("main 3");
		System.out.println("main 4");
		System.out.println("main 5");
		System.out.println("main 6");
		System.out.println("main 7");
		System.out.println("main 8");
		System.out.println("main 9");
	}

	private static void exemploSono() {
		MinhaThread thr = new MinhaThread();
		for (int i = 0; i < 3; i++) {
			try {
				thr.run();
				thr.sleep(1000 * 3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void quartoExemplo() {
		Pessoa p = new Pessoa();
		p.setStatus(false);
		ModificarFalso mf = new ModificarFalso(p);
		ModificarVerdadeiro mv = new ModificarVerdadeiro(p);
		mf.start();
		mv.start();		
	}
}
