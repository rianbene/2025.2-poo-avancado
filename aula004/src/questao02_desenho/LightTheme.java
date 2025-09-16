package questao02_desenho;

public class LightTheme implements Botao, Janela {

	@Override
	public void desenharBotao() {
		System.out.println("Botao light desenhado");

	}

	@Override
	public void desenharJanela() {
		System.out.println("Janela light desenhada");

	}

}
