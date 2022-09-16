package control;

import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import gui.Menu;
import servicios.ServiciosJuegos;
import utilidades.LeerDatos;

/**
 * Control de la aplicacion siendo el comienzo el metodo {@link #start()}
 * 
 * @author Grupo2
 * @version 1.0
 *
 */
public class LucaSteam {

	public static final int ULTIMA_OPCION = 4;

	private ServiciosJuegos s = new ServiciosJuegos();
	private static final Logger logger = LogManager.getLogger("LucaSteam");

	/**
	 * Metodo para inicio de LucaSteam
	 * 
	 * @author Grupo 2
	 * @version 1.0: 14-09-2022
	 */
	public void start() {
		s.importarDatos();
		do {
			Menu.menuPrincipal();
			System.out.println();
		} while (elegirOpcion());
		System.out.println("Adios muy buenas");
	}

	/**
	 * Metodo para tratar las opciones del menu
	 * 
	 * @return {@code true} si la opcion elegida es salir (0)
	 * @author Grupo2
	 * @version 1.0
	 */
	public boolean elegirOpcion() {
		try {
			int opcion = pedirOpcion();
			switch (opcion) {
			case 0 -> {
				return false;
			}
			case 1 -> s.altaJuego();
			case 2 -> s.mostrarJuegos();
			case 3 -> s.listadoGenero();
			case 4 -> s.listadoGeneroPlataforma();
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
	 * Opciones de 0 al 3
	 * 
	 * @return La opcion elegida en formato {@link Integer}
	 * @author Grupo2
	 */
	private int pedirOpcion() {
		boolean correcto = false;
		int opcion = 0;
		String entrada;

		do {
			entrada = LeerDatos.recogerString("Introduce una opcion.");
			try {
				opcion = Integer.parseInt(entrada);
				if (opcion < 0 || opcion > ULTIMA_OPCION)
					throw new IndexOutOfBoundsException();
				correcto = true;
			} catch (NumberFormatException | IndexOutOfBoundsException e) {
				logger.warn("La opcion metida no es correcta");
			}
		} while (!correcto);
		return opcion;
	}
}
