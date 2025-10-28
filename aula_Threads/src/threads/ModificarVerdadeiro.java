package threads;

public class ModificarVerdadeiro extends Thread {
	private Pessoa pessoa;

	public ModificarVerdadeiro(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public void run() {
		while (true) {
			if (pessoa.getStatus()) {
				System.out.println(pessoa.getMsg());
				pessoa.setStatus(false);
				pessoa.setMsg("Alterado para falso");
			}
			try {
				this.sleep(1000 * 3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
