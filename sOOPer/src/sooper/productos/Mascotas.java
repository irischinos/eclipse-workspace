package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascotas extends Producto {

	public Mascotas(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Categoria getCategoria() {
		// TODO Auto-generated method stub
		return Categoria.MASCOTAS;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}

}
