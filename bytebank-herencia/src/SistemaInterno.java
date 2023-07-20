
public class SistemaInterno {
	private String clave = "56789"; 
	public boolean autentica(Autenticable gerente)
	{ 
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("LogIn Exitoso");
			return true;
		}else {
			System.out.println("Login Fallido");
		}
		
		return false;
	}

}
