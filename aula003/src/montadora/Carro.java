package montadora;

public class Carro {
	private String cor;
	private String modelo;
	
	private static Carro carro;
	
	private Carro(){};
	
	
	public static Carro build(){
		return new Carro();
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static Carro getCarro() {
		return carro;
	}

	public static void setCarro(Carro carro) {
		Carro.carro = carro;
	}
	
	
}
