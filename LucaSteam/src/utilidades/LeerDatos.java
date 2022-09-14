package utilidades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

/**
 * implementación Scanner.
 * 
 * @author Lamia,
 * @version 1.0: 14/09/2022
 */



public class LeerDatos {
	private static final Logger logger = LogManager.getLogger("Nombre_Clase");

	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo String
	 */

	@SuppressWarnings("resource")
	public static String recogerString(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		logger.info("Hola, estoy en recoger string");
		return teclado.nextLine();

	}
	
	/**
	 * Método que lee por teclado y devuelve un string
	 * @param String devuelve mensaje
	 * @return String
	 * @author lamia
	 * @version 1.0
	 * 
	 * */
	public static String recogerString1(String mensaje) {
		System.out.println(mensaje);
		return recogerString1(mensaje);
	}

	@SuppressWarnings("resource")
	public static int recogerInt() {

		return new Scanner(System.in).nextInt();
	}

	/**
	 * Método registrar entrada datos
	 * @param String devuelve int
	 * @return int
	 * @author lamia
	 * @version 1.0
	 * 
	 */
	  
	 

	public static int recogerInt(String mensaje) {
		System.out.println(mensaje);
		return recogerInt();
	}
	/**
	 * Método que lee por teclado y devuelve un string
	 * @param String devuelve mensaje
	 * @return String
	 * @author lamia
	 * @version 1.0
	 * 
	 * */

	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo Float
	 */

	@SuppressWarnings("resource")
	public static float recogerFloat() {
		return new Scanner(System.in).nextFloat();
	}

	public static float recogerFloat(String msg) {
		System.out.println(msg);
		return recogerFloat();
	}

}
