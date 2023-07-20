//extends se utiliza para saber que se va a heredar de otra clase
public class Gerente extends Funcionario implements Autenticable {
	public double getBonificacion() {
		//al poner"super" podemos acceder a los atributos y metodos de la clase padre sin tener que cambiar el acceso de los atributos
		return super.getSalario()+ + this.getSalario()*0.05;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
