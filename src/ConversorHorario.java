import javax.swing.JOptionPane;

public class ConversorHorario extends Conversor {
				
	public ConversorHorario() {
		
		mostrarEnConstruccion("Esta sección está en construcción");
		
	}
	
	private void mostrarEnConstruccion(String cadena) {
			
			JOptionPane.showMessageDialog(
					null, 
					cadena,
					"En construcción", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	
	@Override
	public double convertir(String conversionElegida, double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void generateConversionesDisponibles() {
		// TODO Auto-generated method stub
		
	}
}