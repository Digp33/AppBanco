
public class TestReferencias {
	public static void main(String[] args) {
		//El elemento más generico puede ser adaptado al elemento más específico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		Gerente gerente = new Gerente();
		gerente.setNombre("Ximena");
		funcionario.setSalario(20000);
		gerente.setSalario(40000);
		
	}

}
