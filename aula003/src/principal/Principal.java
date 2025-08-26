package principal;

import fabrica.botao.Fabrica;
import fabrica.botao.FabricaBotoes;
import fabrica.metodo.CriadorDocumento;
import montadora.Carro;
import padroes.projeto.Database;
import padroes.projeto.FabricaMetodo;

public class Principal {

	public static void main(String[] args) {
		Database d3 = Database.getInstance();
		Database d4 = Database.getInstance();
		//
		CriadorDocumento cd = new CriadorDocumento();

		FabricaMetodo fm = cd.createDocument();
		
		fm.open();
		
		//
		Fabrica f = new Fabrica();
		f.createBotao(FabricaBotoes.WINDOWS).desenhar();
		
		Carro c = Carro.build();
		
	}

}
