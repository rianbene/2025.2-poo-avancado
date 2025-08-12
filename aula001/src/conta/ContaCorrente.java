package conta;

public class ContaCorrente extends Conta implements ModeloConta, Prova{
	private float taxa;
	private float limite;
	
	@Override
	public void deposito (float valor) {
		setSaldo(getSaldo() + valor);
	};
	
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saque(float valor) {
		setSaldo(getSaldo() - valor - 1);
	}
}
