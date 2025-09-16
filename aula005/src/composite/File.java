package composite;

import java.time.LocalTime;

public class File implements Component {
	private String name;
	private LocalTime dataCriacao;

	public File(String name) {
		this.name = name;
		this.dataCriacao = LocalTime.now();
	}

	@Override
	public void showDetails() {
		System.out.println("Arquivo: " + name);
//		System.out.println("Data de Criacao: " + dataCriacao);
	}
}
