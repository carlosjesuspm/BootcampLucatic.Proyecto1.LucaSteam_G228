package utilidades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gui.Menu;
import model.Genero;
import model.Plataforma;

public class DatosMenus {

	private static final Logger logger = LogManager.getLogger("DatosMenus");

	/**
	 * Metodo para pedir un genero por teclado
	 * 
	 * @return {@link Genero} segun el dato introducido
	 */
	public static Genero pedirGenero() {
		Menu.menuGenero();
		Genero g = null;
		do {
			try {
				int i = LeerDatos.recogerInt("Elige un genero");
				if (i < 1 || i > Genero.values().length)
					throw new IndexOutOfBoundsException(i + " out of limits");
				g = Genero.values()[i - 1];
			} catch (IndexOutOfBoundsException e) {
				logger.error("Opcion introducida erronea: " + e.getMessage());
			}
		} while (g == null);
		return g;
	}

	/**
	 * Metodo para pedir una plataforma por teclado
	 * 
	 * @return {@link Plataforma} segun el dato introducido
	 */
	public static Plataforma pedirPlataforma() {
		Menu.menuPlataforma();
		Plataforma p = null;
		do {
			try {
				int i = LeerDatos.recogerInt("Elige una plataforma");
				if (i < 1 || i > Plataforma.values().length)
					throw new IndexOutOfBoundsException(i + " out of limits");
				p = Plataforma.values()[i - 1];
			} catch (IndexOutOfBoundsException e) {
				logger.error("Opcion introducida erronea: " + e.getMessage());
			}
		} while (p == null);
		return p;
	}
}
