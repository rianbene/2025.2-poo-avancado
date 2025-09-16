package adapter;

public class PagamentoNovo implements ProcessarPagamento {

	PagamentoAntigo antigo;
	
	public PagamentoNovo() {
		antigo = new PagamentoAntigo();
	}
	
	@Override
	public double processar(double valor) {
		// regras de negocio
		return (true) ? antigo.pagar(valor) : 0;
	}

}
