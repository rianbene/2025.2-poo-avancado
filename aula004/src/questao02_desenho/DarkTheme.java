package questao02_desenho;

public class DarkTheme implements Botao, Janela {

	@Override
	public void desenharBotao() {
		System.out.println("Botao dark desenhado");

	}

	@Override
	public void desenharJanela() {
		System.out.println("Janela dark desenhada");

	}

}
