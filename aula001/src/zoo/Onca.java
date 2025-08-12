package zoo;

public class Onca extends Felino {
	private Integer qtdPintas;

	public Integer getQtdPintas() {
		return qtdPintas;
	}

	public void setQtdPintas(Integer qtdPintas) {
		this.qtdPintas = qtdPintas;
	}
	
	public void retornarRugido() {
		System.out.println("rugido onca");
	}
}
