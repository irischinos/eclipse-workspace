/* CONSTRUCTOR */
/* SIEMPRE se va a llamar igual que la clase
 * Las variables se declaran en la clase
 * Se dan valores a las variables DENTRO del constructor
 *  */

public class Robot {
	int ext;
	boolean extras;
	
	public Robot() {
		ext = 10;
		extras = true;
	}
	
	public Robot(String cadena) {
		ext = 1;
		extras = false;
	}
	
}


