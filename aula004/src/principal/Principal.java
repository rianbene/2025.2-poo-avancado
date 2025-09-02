package principal;

import questao01_fisco.ContabilidadeFiscal;
import questao01_fisco.DocumentoFiscal;
import questao02_desenho.Botao;
import questao02_desenho.DarkFactory;
import questao02_desenho.GUIFactory;
import questao02_desenho.Janela;
import questao02_desenho.LightFactory;

public class Principal {

	public static void main(String[] args) {
		ContabilidadeFiscal cf = new ContabilidadeFiscal();
		cf.setTipoDocumento(2);
		DocumentoFiscal doc = cf.criarDocumento();
		doc.emitir();
		
		int tema = 1;
		GUIFactory fabrica;
		if (tema == 0) {
			fabrica = new LightFactory();
		} else {
			fabrica = new DarkFactory();
		}
		Botao b = fabrica.criarBotao();
		Janela j = fabrica.criarJanela();
		b.desenharBotao();
		j.desenharJanela();
	}

}
