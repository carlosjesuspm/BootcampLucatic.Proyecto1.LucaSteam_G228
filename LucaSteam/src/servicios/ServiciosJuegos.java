package servicios;

import java.util.InputMismatchException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.DatosJuegos;
import datos.IDatosJuegos;
import lombok.Data;
import model.FactoriaJuegos;
import model.Juego;
import utilidades.LeerDatos;
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
	 * Metodo para tratar las opciones del menu
	 * 
	 * @return {@code true} si la opcion elegida es salir (0)
	 */
	@Override
	public boolean elegirOpcion() {
		try {
			int opcion = pedirOpcion();
			switch (opcion) {
			case 0 -> {
				return false;
			}
			case 1 -> altaJuego();
			case 2 -> mostrarJuegos();
			default -> {
				logger.warn("Default case ha entrado, algo ha ido mal");
				return false;
			}
			}

		} catch (InputMismatchException e) {
			logger.error("Entrada por teclado erronea");
		}
		return true;
	}

	/**
	 * Metodo para pedir por teclado la opcion del menu elegida <br>
	 * Opciones de 0 al 2
	 * 
	 * @return La opcion elegida en formato {@link Integer}
	 */
	private int pedirOpcion() {
		boolean correcto = false;
		int opcion = 0;
		String entrada;

		do {
			entrada = LeerDatos.recogerString("Introduce una opcion.");
			try {
				opcion = Integer.parseInt(entrada);
				if (opcion < 0 || opcion > 2)
					throw new IndexOutOfBoundsException();
				correcto = true;
			} catch (NumberFormatException | IndexOutOfBoundsException e) {
				logger.warn("La opcion metida no es correcta");
			}
		} while (!correcto);
		return opcion;
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
	public void listadoGeneroPlataforma(){
		String nombreGeneroJuego=LeerDatos.recogerString("Introduce nombre plataforma: ");
		d.listadoGeneroPlataforma(nombreGeneroJuego);
	};


	
	public void listadoConsolaNintendo(){};
	public void listadoEditores(String nombreEditor){};
	public void filtrarSigloXX(){};
	public void modificarJuego(int rango){};
	public void eliminarJuego(int rango){};
	public void filtrarAnnoPar(){};

	
}
