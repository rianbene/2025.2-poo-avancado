package zoo;

public abstract class Felino {
	private Integer altura;
	private Float peso;
	private Integer comprimento;
	
	public void correr() {
		
	}
	public void intensidadeRugido() {
		
	}
	
	public abstract void retornarRugido();
	
	public Integer getAltura() {
		return altura;
	}
	
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	public Float getPeso() {
		return peso;
	}
	
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	public Integer getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(Integer comprimento) {
		this.comprimento = comprimento;
	}
}
