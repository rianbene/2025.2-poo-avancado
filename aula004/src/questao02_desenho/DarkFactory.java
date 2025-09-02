package questao02_desenho;

public class DarkFactory implements GUIFactory {

	@Override
	public Botao criarBotao() {
		return new DarkTheme();
	}

	@Override
	public Janela criarJanela() {
		return new DarkTheme();
	}

}
