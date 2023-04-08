import java.util.ArrayList;

public abstract class Conversor {
	
	protected String titulo;
	protected Unidad unidadLocal;
	protected ArrayList<Unidad> unidades = new ArrayList<>();
	protected ArrayList<String> conversionesDisponibles = new ArrayList<>();
	protected ArrayList<String[]> codigoConversiones = new ArrayList<String[]>();
	// codigoConversiones.get(0)[0]--(index matchea con conversionesDisponibles) [0 Unidad Origen] [1 Unidad Destino]
	protected ArrayList<Double> coeficienteConversiones = new ArrayList<>(); //Double es wrapper de double
	
		
	// Devuelve una lista con las descripciones de las conversiones dispobibles
	public ArrayList<String> getConversionesDisponibles() {
			return this.conversionesDisponibles;
	}
	
	// Devuelve unidad Origen
	public String getUnidadOrigen(String conversion) {
		
		String respuesta = null;
		for (int i = 0; i < conversionesDisponibles.size(); i++) {
			if (conversion.equals(conversionesDisponibles.get(i))) {
				respuesta = codigoConversiones.get(i)[0];
				break;
			}
		}
		return respuesta;
	}
	
	
	// Devuelve Unidad destino
	public String getUnidadDestino(String conversion) {
		
		String respuesta = null;
		for (int i = 0; i < conversionesDisponibles.size(); i++) {
			if (conversion.equals(conversionesDisponibles.get(i))) {
				respuesta = codigoConversiones.get(i)[1];
				break;
			}
		}
		return respuesta;
	}
	
	
	public String getTitulo() {
		return this.titulo;
	}
		
	// Convierte cantidad de unidad origen a unidad destino
	public abstract double convertir(String conversionElegida, double cantidad);

	public abstract void generateConversionesDisponibles();
		
	
} 
		
	
	
