package questao01_fisco;

public class CupomFiscal implements DocumentoFiscal {

	@Override
	public void emitir() {
		System.out.println("Cupom fiscal emitido");
	}

}
