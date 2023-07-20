
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero); 
	}
	
	@Override
	public boolean retirar(double valorRetiro) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(valorRetiro + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo=this.saldo+valor;
	}

}
