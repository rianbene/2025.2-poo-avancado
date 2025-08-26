package fabrica.botao;

public class Fabrica implements FabricaBotoes {

	@Override
	public BotaoInterface createBotao(int tipoBotao) {
		
		BotaoInterface fb = null;
		switch (tipoBotao) {
		case FabricaBotoes.WINDOWS:
			fb = new BotaoWindows(); 
			break;
		case FabricaBotoes.MAC:
			fb = new BotaoMac(); 
			break;
		}
		return fb;
	}
}
