
public class ControlBonificacion {
	private double suma;
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion()+this.suma;
		System.out.println("cálculo actual" + this.suma);
		return this.suma;
	}
	
}
