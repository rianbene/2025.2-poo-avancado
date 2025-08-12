package zoo;

public class Leao extends Felino {
	private Integer tamanhoJuba;

	public Integer getTamanhoJuba() {
		return tamanhoJuba;
	}

	public void setTamanhoJuba(Integer tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}
	
	public void retornarRugido() {
		System.out.println("rugido leao");
	}
}
