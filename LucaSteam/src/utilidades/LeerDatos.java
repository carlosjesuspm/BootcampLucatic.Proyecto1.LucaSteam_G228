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

	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo String
	 * 
	 * @param String devuelve mensaje
	 * @return String
	 */

	@SuppressWarnings("resource")
	public static String recogerString() throws InputMismatchException{
		Scanner teclado = new Scanner(System.in);
		return teclado.nextLine();
	}


	public static String recogerString(String mensaje) throws InputMismatchException{
			System.out.println(mensaje);
			return recogerString(mensaje);
	}

	
	/**
	 * Método registrar entrada datos
	 * 
	 * @param String devuelve int
	 * @return int
	 * 
	 */
	
	@SuppressWarnings("resource")
	public static int recogerInt() throws InputMismatchException{
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}

	public static int recogerInt(String mensaje)throws InputMismatchException {
		System.out.println(mensaje);
		return recogerInt(mensaje);
	}


	/**
	 * En este método el objetivo es registrar la entradas de datos por parte del
	 * usuario de tipo Float
	 * 
	 * @param String devuelve float
	 * @return float
	 */

	@SuppressWarnings("resource")
	public static float recogerFloat() throws InputMismatchException {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextFloat();
	}

	public static float recogerFloat(String mensaje) throws InputMismatchException{
		System.out.println(mensaje);
		return recogerFloat(mensaje);
	}

}
