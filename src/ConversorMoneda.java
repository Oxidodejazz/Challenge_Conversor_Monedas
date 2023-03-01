import java.util.ArrayList;
import java.util.Iterator;

public class ConversorMoneda {
	
	private Moneda unidadLocal;
	private ArrayList<Moneda> unidades = new ArrayList();
	private ArrayList<String> conversionesDisponibles = new ArrayList();
	private ArrayList<String[]> codigoConversiones = new ArrayList<String[]>();
	// codigoConversiones.get(0)[0]--(index matchea con conversionesDisponibles) [0 Unidad Origen] [1 Unidad Destino]
		
		
	public ConversorMoneda() {
		
		this.unidadLocal = new Moneda("Pesos argentinos","ARS",1);
		
		Moneda m1 = new Moneda("Dolares estadounidenses", "USD", 196.80);
		this.unidades.add(m1);
		Moneda m2 = new Moneda("Euros", "EUR", 208.75);
		this.unidades.add(m2);
		Moneda m3 = new Moneda("Libras esterlinas", "GBP", 237.31);
		this.unidades.add(m3);
		Moneda m4 = new Moneda("Yen japones", "JPY", 1.44);
		this.unidades.add(m4);
		Moneda m5 = new Moneda("Won sul-coreano", "KRW", 0.15);
		this.unidades.add(m5);
		
		this.generateConversionesDisponibles();
		
		System.out.println(this.convertir(m1.getNombre() + " a " + this.unidadLocal.getNombre(), 20000));
				
	}

	// Construye una lista con las descripciones de conversionesDisponibles	
	// y otro matcheando el (i) con (Origen-Destino) en codigo 
	private void generateConversionesDisponibles() {
						
		for (int i = 0; i < unidades.size(); i++ ) {
			this.conversionesDisponibles.add(unidadLocal.getNombre() + " a " + unidades.get(i).getNombre());
			this.codigoConversiones.add(new String[]{unidadLocal.getAbreviatura(),unidades.get(i).getAbreviatura()});
					
		};
		for (int i = 0; i < unidades.size(); i++ ) {
			this.conversionesDisponibles.add(unidades.get(i).getNombre() + " a " + unidadLocal.getNombre() );
			this.codigoConversiones.add(new String[]{unidades.get(i).getAbreviatura(),unidadLocal.getAbreviatura()});   
		};
	}
	
	
	// Devuelve una lista con las descripciones de las conversiones dispobibles
	public ArrayList<String> getConversionesDisponibles() {
			return this.conversionesDisponibles;
	}
	
	// Convierte cantidad de unidad origen a unidad destino
	public double convertir(String conversionElegida, double cantidad) {
		
		int i = 0;
		int i2 = 0;
		
		// Matchea el (i) de conversionesDisponibles con codigoConversiones  
		while (!(this.conversionesDisponibles.get(i).equals(conversionElegida))) {
			i++;
		}
		// Caso Moneda Origen Local
		if (this.codigoConversiones.get(i)[0] == this.unidadLocal.getAbreviatura()) {
			
			while (!(this.codigoConversiones.get(i)[1] == this.unidades.get(i2).getAbreviatura())) {
				i2++;
			}
			return this.unidades.get(i2).getCotizacion() * cantidad;
		} 
		// Caso Moneda Origen Extrajera
		else {
			
			while (!(this.codigoConversiones.get(i)[0] == this.unidades.get(i2).getAbreviatura())) {
				i2++;
			}
			return cantidad / this.unidades.get(i2).getCotizacion();
	}
		
} 
		
	
	
}