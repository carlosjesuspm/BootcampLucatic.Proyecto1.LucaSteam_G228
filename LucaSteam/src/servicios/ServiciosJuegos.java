package servicios;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.DatosJuegos;
import datos.IDatosJuegos;
import lombok.Data;
import model.FactoriaJuegos;
import model.Juego;

/**
 * Clase que contiene los métodos para conectar las peticiones de la capa
 * control con la capa de datos.
 * 
 * @author Grupo 2 - Álvaro Román
 * @version 1.0: 14/09/2022
 */

@Data
public class ServiciosJuegos implements IServiciosJuegos {

	// LOGGER
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
		d.importarDatos();
	}
	
	/**
	 * Metodo que muestra los juegos de los datos con
	 * {@link DatosJuegos#mostrarJuegos()}
	 * 
	 * @author Grupo2
	 * @version 1.0
	 */
	@Override
	public void mostrarJuegos() {
		d.mostrarJuegos();
	}

	

	/**
	 * Metodo para dar de alta un juego pidiendo datos por teclado        
	 */
	@Override
	public void altaJuego() {
		Juego j = FactoriaJuegos.crearJuego();
		d.altaJuego(j);
	}

	/**
	 * 
	 * Método que importa datos de juegos de un archvio CSV llamando a la capa datos.
	 * @param String - ruta del fichero
	 * @author Álvaro Román
	 * @since 1.0
	 */	
	@Override
	public void importarDatos(String ruta_archivo) {
		// TODO Auto-generated method stub
		d.importarDatos(ruta_archivo);
		logger.info("Importando datos en la capa servicios.");
		
	}
	
	


	
}
