package conta;

public class ContaPoupanca extends Conta implements ModeloConta, Prova{
	private float rendimento;
	
	@Override
	public void deposito (float valor) {
		setSaldo((getSaldo() + valor) + ((getSaldo() + valor)*rendimento/100));
	}
	
	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saque(float valor) {
		setSaldo(getSaldo()-valor);
	}
}
