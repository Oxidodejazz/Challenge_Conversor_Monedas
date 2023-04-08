
public class Moneda extends Unidad {

	private double cotizacion;
	
	public Moneda (String nombre, String abreviatura, double cotizacion) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.cotizacion = cotizacion;
	}

	
	public double getCoeficiente() {
		// TODO Auto-generated method stub
		return cotizacion;
	}
	
}
