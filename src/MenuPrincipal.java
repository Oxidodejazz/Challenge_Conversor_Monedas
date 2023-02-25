import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	private static ArrayList<String> opcionesConversion = new ArrayList<>(Arrays.asList("Conversor de moneda", "Conversor de temperatura"));
	
	//constructor
	MenuPrincipal () {
		
				Object seleccion = JOptionPane.showInputDialog(
				   null, 
				   "Seleccione una opción de conversión",
				   "Menú",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // null para icono por defecto
				   opcionesConversion.toArray(),
				   "opcion 1");

				System.out.println(seleccion);
				System.out.println("El usuario ha elegido " + seleccion);
				
				if (seleccion == null)
				{
					System.out.println("El usuario salio ");
				}
				else {
					switch (seleccion.toString()) {
						case "Conversor de moneda":
						//new MenuConversorMoneda();
						System.out.println("El usuario eligió moneda");
						break;
						case "Conversor de temperatura":
							//new MenuConrversorTemperatura();
							System.out.println("El usuario eligió temperatura");
							break;
					}
				}
	}
}