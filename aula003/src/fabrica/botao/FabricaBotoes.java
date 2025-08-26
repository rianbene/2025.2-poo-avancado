package fabrica.botao;

public interface FabricaBotoes {
	public static final int WINDOWS = 0;
	public static final int MAC = 1;
	public BotaoInterface createBotao(int tipoBotao);
}
