/*  Crear objeto */
public class Robot {
	int ext = 10;
	boolean extras = true;
	
	/* M�todo implementado*/
	public void caminar() {
		// System.out.println("Estoy caminando");
		ext = ext + 2;
	}
	
	/* sobrecarga de m�todos */
	public void caminar(int numero) {
		ext = ext +  numero;
	}
	
	public void caminar(String cadena) {
		System.out.println(cadena);
	}
	
	public void caminar(int numero, int numero2) {
		ext = ext +  numero;
	}
	
	/* m�todo vac�o */
	/*public void caminar() {
		
	}*/
}
