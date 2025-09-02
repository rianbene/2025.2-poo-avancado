package questao02_desenho;

public class LightFactory implements GUIFactory {

	@Override
	public Botao criarBotao() {

		return new LightTheme();
	}

	@Override
	public Janela criarJanela() {

		return new LightTheme();
	}

}
