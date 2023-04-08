import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	private static ArrayList<String> opcionesConversion = new ArrayList<>(Arrays.asList("Conversor de moneda", "Conversor horario"));
	
	MenuPrincipal () {
				
				Icon icono = new ImageIcon(getClass().getResource("/img/LogoAlura.png"));
				
				Object seleccion = JOptionPane.showInputDialog(
				   null, 
				   "Seleccione una opción de conversión",
				   "Menú Principal",
				   JOptionPane.PLAIN_MESSAGE,
				   icono, 
				   opcionesConversion.toArray(),
				   "opcion 1");
				
				if (seleccion == null) {
					mostrarCuadroCerrar();
				}
					else {
						switch (seleccion.toString()) {
							case "Conversor de moneda":
								ConversorMoneda conversorMoneda = new ConversorMoneda();
								this.armarMenuUnidad(conversorMoneda);
								break;
						
							case "Conversor horario":
								new ConversorHorario();
								//this.armarMenuUnidad(conversorHorario);
								mostrarCuadroCerrar();
								break;
						}
					}
				}
	
	private void armarMenuUnidad(Conversor conversor) {
		
		boolean bandera = true;
		double resultado = 0;
		DecimalFormat formato2Decimales = new DecimalFormat("#.00");
		
		while (bandera) {
		
			String cantidad = JOptionPane.showInputDialog(
				   null,
				   "Ingrese la cantidad de " + conversor.getTitulo() + " a convertir. (Separador decimal '.')",
				   "Conversor de " + conversor.getTitulo(),
				   JOptionPane.QUESTION_MESSAGE);
			
			if (cantidad==null) {
				mostrarCuadroCerrar();
				bandera = false;
			}
			else {
				if (!(validarNumero(cantidad))) {
					mostrarError("Sólo puede ingresar números");
				}
				else {
					Object seleccionUnidad = JOptionPane.showInputDialog(
						   null, 
						   "Seleccione las unidades a convertir",
						   "Conversor de " + conversor.getTitulo(),
						   JOptionPane.PLAIN_MESSAGE,
						   null, 
						   conversor.getConversionesDisponibles().toArray(),
						   "opcion 1");
								
					if (seleccionUnidad == null) {
						mostrarCuadroCerrar();
						bandera = false;
					}
						else {
							resultado = conversor.convertir((String) seleccionUnidad, Double.parseDouble(cantidad));
								
							JOptionPane.showMessageDialog(
								null,
								"La equivalencia de " + cantidad + " " + conversor.getUnidadOrigen((String) seleccionUnidad) + " es " + formato2Decimales.format(resultado) + " " + conversor.getUnidadDestino((String) seleccionUnidad),
								"Conversión realizada", 
								JOptionPane.PLAIN_MESSAGE);
								
							int continuar = JOptionPane.showConfirmDialog(null,	"¿Desea continuar?");
							if (continuar != 0) {
								mostrarCuadroCerrar();
								bandera = false;
							}
						}
				}
			}
		}
	}
	
	private void mostrarCuadroCerrar() {
		
		JOptionPane.showMessageDialog(
			null, 
			"Programa Terminado",
			"Adiós", 
			JOptionPane.INFORMATION_MESSAGE);
	}
	
	private boolean validarNumero(String cadena) {
	// Valida si un String esta en formato [numero] || [numero.numero]	
		if (cadena.matches("^[0-9]+([.][0-9]+)?$")) {
			return true;
		}
			else {
				return false;
			}
	}
	
	private void mostrarError(String cadena) {
		
		JOptionPane.showMessageDialog(
				null, 
				cadena,
				"Error", 
				JOptionPane.ERROR_MESSAGE);
	}

}