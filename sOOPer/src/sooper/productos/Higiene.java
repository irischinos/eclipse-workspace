package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Higiene extends Producto {

	public Higiene(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Categoria getCategoria() {
		// TODO Auto-generated method stub
		return Categoria.HIGIENE;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}

}
