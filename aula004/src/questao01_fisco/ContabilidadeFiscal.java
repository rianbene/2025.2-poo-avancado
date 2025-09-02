package questao01_fisco;

public class ContabilidadeFiscal extends Fabrica {
	private int tipoDocumento;

	@Override
	public DocumentoFiscal criarDocumento() {
		switch (tipoDocumento) {
		case 0:
			return new NotaFiscal();
		case 1:
			return new CupomFiscal();
		case 2:
			return new Recibo();
		default:
			return new NotaFiscal();
		}
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
}
