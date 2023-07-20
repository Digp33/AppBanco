
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario daniel = new Gerente();
		daniel.setNombre("Daniel");
		daniel.setNumeroIdentificacion("456364");
		daniel.setSalario(57370);
		System.out.println(daniel.getSalario());
		System.out.println(daniel.getBonificacion());
	}

}
