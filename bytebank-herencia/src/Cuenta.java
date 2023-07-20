//entidad cuenta, es para ir haciendo abstracción de el objeto, osea, sacar todos los atributos de un objeto
public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total;
	
	public static int getTotal() {
		return total;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cuenta (int agencia, int numero) {
		this.agencia=agencia;
		this.numero=numero;
		System.out.println("Creando una Cuenta");
		Cuenta.total ++;
	}
	//se puede inicializar desde esta clase como Cliente titular = new Cliente();
	
	public abstract void depositar(double valor);
	
	public boolean retirar (double valorRetiro) {
		if (this.saldo>=valorRetiro) {
			this.saldo-=valorRetiro;
			return true ;
		}else {
			return false;
		}
	}
	public boolean transferir (double transferencia, Cuenta cuenta) {
		if (this.saldo>=transferencia) {
			this.retirar(transferencia);
			cuenta.depositar(transferencia);
			return true ;
			}else {
				return false;
			}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
