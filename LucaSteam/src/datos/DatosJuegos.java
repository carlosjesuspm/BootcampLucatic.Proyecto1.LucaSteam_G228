package datos;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
	
	//LOGGER
	private static final Logger logger = LogManager.getLogger("DatosJuegos");
	
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
		listaJuegos = Fichero.leerCsv("vgsales.csv", true);
	}
	
	

}
