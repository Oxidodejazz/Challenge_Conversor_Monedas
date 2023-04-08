
public abstract class Unidad {

	protected String nombre;
	protected String abreviatura;
		
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAbreviatura() {
		return abreviatura;
	}

	protected abstract double getCoeficiente();
	
}
