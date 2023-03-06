import java.util.ArrayList;

public class TestUnidades {

	
	public static void main(String[] args) {
	
		//ConversorMoneda u = new ConversorMoneda();
		//System.out.println(u.convertir(1, "ARS", "GBP"));
		
		//Moneda m1 = new Moneda("Dolar Est", "USD", 201);
		//Moneda m2 = new Moneda("Dolar Est", "USD", 201);
		//Moneda m3 = new Moneda("Dolar Est", "USD", 201);
		
		ArrayList<String> op = new ArrayList();
		
		ConversorMoneda cm = new ConversorMoneda();
		op = cm.getConversionesDisponibles();
		System.out.println(op);
		System.out.println(cm.convertir(op.get(5),101.6260162601626));
		
		
		
		
		//System.out.println(m.getNombre());
		//System.out.println(m.getAbreviatura());
		//System.out.println(m.getCotizacion());
		
		
	}
	
	
	
	
	
}
