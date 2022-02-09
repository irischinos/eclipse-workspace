package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {
	
	private int largo;
	private int ancho;

	/* constructor of CAJA*/
	
	public Caja(String referencia, int alto, int ancho, int largo) {
		super(referencia, alto); /* forma de referirnos al padre*/
		this.ancho = ancho;
		this.largo = largo;
	}
	
	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

	@Override
	public TipoContenedor getTipo() {
		return TipoContenedor.CAJA;
	}

}
