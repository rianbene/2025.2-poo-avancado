package threads;

public class ModificarFalso extends Thread {
	private Pessoa pessoa;

	public ModificarFalso(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public void run() {
		while (true) {
			if (!pessoa.getStatus()) {
				System.out.println(pessoa.getMsg());
				pessoa.setStatus(true);
				pessoa.setMsg("Alterado para verdadeiro");
			}
			try {
				this.sleep(1000 * 5);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
