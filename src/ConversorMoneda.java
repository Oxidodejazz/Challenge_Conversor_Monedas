
public class ConversorMoneda extends Conversor {
				
	public ConversorMoneda() {
		
		titulo = "moneda";
		unidadLocal = new Moneda("Pesos argentinos","ARS",1);
		
		Moneda moneda1 = new Moneda("Dolares estadounidenses", "USD", 196.80);
		this.unidades.add(moneda1);
		Moneda moneda2 = new Moneda("Euros", "EUR", 208.75);
		this.unidades.add(moneda2);
		Moneda moneda3 = new Moneda("Libras esterlinas", "GBP", 237.31);
		this.unidades.add(moneda3);
		Moneda moneda4 = new Moneda("Yen japones", "JPY", 1.44);
		this.unidades.add(moneda4);
		Moneda moneda5 = new Moneda("Won sul-coreano", "KRW", 0.15);
		this.unidades.add(moneda5);
		
		this.generateConversionesDisponibles();
	}
	
	// Construye una lista con las descripciones de conversionesDisponibles	
	// y otra matcheando el (i) con (Origen-Destino) en codigo 
	@Override
	public void generateConversionesDisponibles() {
			
		for (int i = 0; i < unidades.size(); i++ ) {
			this.conversionesDisponibles.add(unidadLocal.getNombre() + " a " + unidades.get(i).getNombre());
			this.codigoConversiones.add(new String[]{unidadLocal.getAbreviatura(),unidades.get(i).getAbreviatura()});
			this.coeficienteConversiones.add( 1 / ( (unidades.get(i).getCoeficiente()) ) );	
		}
			
		for (int i = 0; i < unidades.size(); i++ ) {
			this.conversionesDisponibles.add(unidades.get(i).getNombre() + " a " + unidadLocal.getNombre() );
			this.codigoConversiones.add(new String[]{unidades.get(i).getAbreviatura(),unidadLocal.getAbreviatura()});
			this.coeficienteConversiones.add(unidades.get(i).getCoeficiente());	
		}			
	}
	
	
	@Override
	// Convierte cantidad de unidad origen a unidad destino
	public double convertir(String conversionElegida, double cantidad) {
		
		int i = 0;
		// Matchea el (i) de conversionesDisponibles con coeficienteConversiones 
		while (!(this.conversionesDisponibles.get(i).equals(conversionElegida))) {
			i++;
		}
		
		return cantidad * this.coeficienteConversiones.get(i);
	}
} 
		
	
	
