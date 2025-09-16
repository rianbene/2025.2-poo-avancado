package questao01_fisco;

public class NotaFiscal implements DocumentoFiscal {

	@Override
	public void emitir() {
		System.out.println("Nota fiscal emitida");
	}

}
