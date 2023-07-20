
public class CueeeentaAhorros extends Cuenta {

	public CueeeentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo=this.saldo+valor;
	}

}
