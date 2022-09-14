package servicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Data;

/**
 * Clase que contiene los métodos para conectar las peticiones de la capa
 * control con la capa de datos.
 * 
 * @author Grupo 2 - Álvaro Román
 * @version 1.0: 14/09/2022
 */

@Data
public class ServiciosJuegos implements IServiciosJuegos {

	//LOGGER
	private static final Logger logger = LogManager.getLogger("ServiciosJuegos");
	
	private IDatosJuegos d = new DatosJuegos();

	/**
	 * Método que llama al método importarDatos() de la clase DatosJuegos.
	 * 
	 * @param -
	 * @return -
	 * @author Álvaro Román
	 * @version 1.0
	 * 
	 */

	@Override
	public void importarDatos() {
		// TODO Auto-generated method stub
		d.importarDatos();

	}

}
