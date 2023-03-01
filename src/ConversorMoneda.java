import java.util.ArrayList;
import java.util.Iterator;

public class ConversorMoneda {
	
	private Moneda unidadLocal;
	private ArrayList<Moneda> unidades = new ArrayList();
	private ArrayList<String> conversionesDisponibles = new ArrayList();
		
	
	
	public ConversorMoneda() {
		
		this.unidadLocal = new Moneda("Pesos argentinos","ARS",1);
		Moneda m1 = new Moneda("Dolares estadounidenses ", "USD", 196.80);
		this.unidades.add(m1);
		Moneda m2 = new Moneda("Euros", "EUR", 208.75);
		this.unidades.add(m2);
		Moneda m3 = new Moneda("Libras esterlinas", "GBP", 237.31);
		this.unidades.add(m3);
		Moneda m4 = new Moneda("Yen japones", "JPY", 1.44);
		this.unidades.add(m4);
		Moneda m5 = new Moneda("Won sul-coreano", "KRW", 0.15);
		this.unidades.add(m5);
		
		this.conversionesDisponibles = this.generateConversionesDisponibles();
				
	}
	
	private ArrayList<String> generateConversionesDisponibles() {
		
		ArrayList<String> resultado = new ArrayList();
		
		for (int i = 0; i < unidades.size(); i++ ) {
			resultado.add(unidadLocal.getNombre() + " a " + unidades.get(i).getNombre());
		};
		for (int i = 0; i < unidades.size(); i++ ) {
			resultado.add(unidades.get(i).getNombre() + " a " + unidadLocal.getNombre() );
		};
		return resultado;
	}
	
	public ArrayList<String> getConversionesDisponibles() {
	
		return conversionesDisponibles;
	}
	
	
}