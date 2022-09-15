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
	
	

	
	public void altaJuego(Juego juego) {};
	public void listadoGeneroPlataforma(String nombreGeneroJuego){};
	public void listadoConsolaNintendo(){};
	public void listadoEditores(String nombreEditor){};
	public void filtrarSigloXX(){};
	public void modificarJuego(int rango){};
	public void eliminarJuego(int rango){};
	public void filtrarAnnoPar(){}


	
}
