package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * implementación Scanner.
 * 
 * @author Grupo 2
 * @version 1.0: 14/09/2022
 */

public class LeerDatos {
	private static final Logger logger = LogManager.getLogger("LeerDatos");

	/**
	 * Metodo para leer entrada por teclado con clase {@link Scanner}
	 * 
	 * @return El objeto {@code String} que representa la entrada de teclado
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	@SuppressWarnings("resource")
	public static String recogerString() throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}

	/**
	 * Metodo para leer entrada por teclado con clase {@link Scanner} mostrando
	 * mensaje
	 * 
	 * @param mensaje Mensaje para mostrar por consola
	 * @return Objeto {@link String} que representa la entrada por teclado
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	public static String recogerString(String mensaje) throws InputMismatchException {
		System.out.println(mensaje);
		return recogerString();
	}

	/**
	 * Metodo para leer entrada numerica {@link Integer} por teclado con
	 * {@link Scanner}
	 * 
	 * @return Objeto {@link String} que representa la entrada por teclado numerica
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	@SuppressWarnings("resource")
	public static int recogerInt() throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	/**
	 * Metodo para leer entrada numerica {@link Integer} por teclado con
	 * {@link Scanner} mostrando mensaje
	 * 
	 * @param mensaje Mensaje que se quiere mostrar
	 * @return Objeto {@link Integer} que representa la entrada por teclado numerica
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	public static int recogerInt(String mensaje) throws InputMismatchException {
		System.out.println(mensaje);
		return recogerInt();
	}

	/**
	 * Metodo para leer la entrada numerica {@link Float} por teclado con
	 * {@link Scanner}
	 * 
	 * @return Objeto {@link Float} que representa la entrada por teclado
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	@SuppressWarnings("resource")
	public static float recogerFloat() throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextFloat();
	}

	/**
	 * Metodo para leer la entrada numerica {@link Float} por teclado con
	 * {@link Scanner} mostrando mensaje
	 * 
	 * @param mensaje Mensaje que se quiere mostrar
	 * @return Objeto {@link Float} que representa la entrada por teclado
	 * @throws InputMismatchException Si el tipo de los datos no es el correcto
	 * @author Grupo2
	 * @version 1.0
	 */
	public static float recogerFloat(String mensaje) throws InputMismatchException {
		System.out.println(mensaje);
		return recogerFloat();
	}

}
