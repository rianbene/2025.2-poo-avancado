package questao01_fisco;

public class Recibo implements DocumentoFiscal{

	@Override
	public void emitir() {
		System.out.println("Recibo emitido");
	}
 
}
