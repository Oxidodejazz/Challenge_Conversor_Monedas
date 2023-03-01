
public class Moneda {

	private String nombre;
	private String abreviatura;
	private double cotizacion;
	
	public Moneda (String nombre, String abreviatura, double cotizacion) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.cotizacion = cotizacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}
	
	public double getCotizacion() {
		return cotizacion;
	}
	
	
}
