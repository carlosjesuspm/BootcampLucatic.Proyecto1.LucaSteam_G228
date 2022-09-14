package control;

import java.util.InputMismatchException;

import gui.Menu;
import servicios.IServiciosJuegos;
import servicios.ServiciosJuegos;
import utilidades.LeerDatos;

/**
 * Control de la aplicacion siendo el comienzo el metodo {@link #start()}
 * 
 * @author agome
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
		} while(pedirOpcion());
	}

	
	// tratar en servicios por logica de empresa TODO
	private boolean pedirOpcion() {
		try {
			String s = LeerDatos.recogerString("Introduce una opcion");
			if (s == "0") return false;
		} catch (InputMismatchException e) {
			
		}
		return true;
	}
}
