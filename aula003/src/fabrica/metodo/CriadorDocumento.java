package fabrica.metodo;

import padroes.projeto.Criacao;
import padroes.projeto.FabricaMetodo;

public class CriadorDocumento extends Criacao {

	@Override
	public FabricaMetodo createDocument() {
		// Regras de negocio
		// Regras de negocio
		int tipoDocumento = 0;
		// Regras de negocio

		FabricaMetodo fm;
		if (tipoDocumento == 0) {
			fm = new Word();
		} else {
			
			fm = new Pdf();
		}

		return fm;
	}

}
