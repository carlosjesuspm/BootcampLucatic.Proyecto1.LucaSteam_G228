package utilidades;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * implementación Scanner.
 * 
 * @author Grupo 2
 * @version 1.0: 14/09/2022
 */

public class LeerDatos {
	private static final Logger logger = LogManager.getLogger("Nombre_Clase");

	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo String
	 */

	@SuppressWarnings("resource")
	public static String recogerString() {
		Scanner teclado = new Scanner(System.in);
		try {

			return teclado.nextLine();
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return teclado.nextLine();
	}

	/**
	 * Método que lee por teclado y devuelve un string
	 * 
	 * @param String devuelve mensaje
	 * @return String
	 * 
	 */

	public static String recogerString1(String mensaje) {
		try {
			System.out.println(mensaje);
			return recogerString1(mensaje);
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return recogerString1(mensaje);
	}

	@SuppressWarnings("resource")
	public static int recogerInt() {
		Scanner teclado = new Scanner(System.in);
		try {

			return teclado.nextInt();
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return teclado.nextInt();
	}

	/**
	 * Método registrar entrada datos
	 * 
	 * @param String devuelve int
	 * @return int
	 * 
	 */

	public static int recogerInt(String mensaje) {
		try {
			System.out.println(mensaje);
			return recogerInt(mensaje);
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return recogerInt(mensaje);
	}

	/**
	 * Método que lee por teclado y devuelve un string
	 * 
	 * @param String devuelve mensaje
	 * @return String
	 * 
	 */

	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo Float
	 */

	@SuppressWarnings("resource")
	public static float recogerFloat() {
		Scanner teclado = new Scanner(System.in);
		try {

			return teclado.nextFloat();
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return teclado.nextFloat();
	}

	public static float recogerFloat(String mensaje) {
		try {
			System.out.println(mensaje);
			return recogerFloat(mensaje);
		} catch (InputMismatchException e) {
			logger.info("Este dato introducido no es correcto");
		}
		return recogerFloat(mensaje);
	}

}
