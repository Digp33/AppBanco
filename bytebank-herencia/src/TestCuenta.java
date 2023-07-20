
public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CueeeentaAhorros ca = new CueeeentaAhorros(1, 1);
		cc.depositar(1000);
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
