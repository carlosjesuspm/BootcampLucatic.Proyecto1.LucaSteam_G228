package datos;

import java.util.ArrayList;
import lombok.Data;
import model.Juego;
import utilidades.Fichero;

/**
 * Clase DatosJuegos: gestiona los datos de la aplicacion.
 * Implementa la interfaz IDatosJuegos.
 * @author Grupo2
 * @version 1
 * @date 14/09
 */
@Data
public class DatosJuegos implements IDatosJuegos{
	
	private ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
	
	/**
	 * Metodo importarDatos(): recoge los datos del CSV.
	 * 
	 * @author Grupo2 - Tamara
	 * @version 1
	 * @date 14/09
	 */
	@Override
	public void importarDatos() {
		listaJuegos = Fichero.leerCsv();
	}
	
	

}
