package control;

import gui.Menu;
import servicios.ServiciosJuegos;

/**
 * Control de la aplicacion siendo el comienzo el metodo {@link #start()}
 * 
 * @author Grupo2
 * @version 1.0
 *
 */
public class LucaSteam {

	private ServiciosJuegos s = new ServiciosJuegos();

	/**
	 * Metodo para inicio de LucaSteam
	 * 
	 * @author Grupo 2
	 * @version 1.0: 14-09-2022
	 */
	public void start() {
		s.importarDatos();
		do {
			Menu.mostrarMenu();
		} while (!s.elegirOpcion());
	}
}
