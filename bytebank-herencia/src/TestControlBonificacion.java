
public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario Daniel = new Contador();
		Daniel.setSalario(45000);
		Gerente Liz = new Gerente();
		Liz.setSalario(35000);
		Contador Angela = new Contador();
		Angela.setSalario(50000);
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		///El metodo va a llamar a cada uno dependiendo  
		controlBonificacion.registrarSalario(Daniel);
		controlBonificacion.registrarSalario(Liz);
		controlBonificacion.registrarSalario(Angela);
	}

}
