package servicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.params.provider.NullEnum;

import datos.DatosJuegos;
import datos.IDatosJuegos;
import gui.Menu;
import lombok.Data;
import model.FactoriaJuegos;
import model.Genero;
import model.Juego;
import model.Plataforma;
import utilidades.DatosMenus;
import utilidades.LeerDatos;

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
	 * Metodo para filtrar listado de juegos por género
	 */
	public void listadoGenero() {
		Genero nombreGeneroJuego = DatosMenus.pedirGenero();
		d.listadoGenero(nombreGeneroJuego);
	};

	@Override
	public void listadoGeneroPlataforma() {
		d.listadoGenero(Genero.Platform);
	}


	
	public void listadoConsolaNintendo() {
	}

	public void listadoEditores(String nombreEditor) {
	}
	public void filtrarSigloXX() {
	}

	public void modificarJuego(int rango) {
	}

	public void eliminarJuego(int rango) {
	}

	public void filtrarAnnoPar() {
	}


	


}
