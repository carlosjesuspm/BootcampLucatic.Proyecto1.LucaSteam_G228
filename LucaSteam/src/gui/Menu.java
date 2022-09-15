package gui;

import model.Genero;
import model.Plataforma;

/**
 * Clase Menu - Muestra el menú en pantalla
 * 
 * @author Grupo2 - Tamara
 * @version 1
 * @date 14/09
 *
 */

public class Menu {

	/**
	 * Metodo estatico para mostrar el menu principal
	 * 
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	public static void menuPrincipal() {
		System.out.println("*************LUCASTEAM*************");
		System.out.println("1. Dar de alta juego");
		System.out.println("2. Mostrar juegos");
		System.out.println("3. Filtrar juegos por genero");
		System.out.println("4. Mostrar juegos de genero \"Plataforma\"");
		System.out.println("0. Salir");
	}

	/**
	 * Metodo estatico para mostrar un menu de los generos
	 * 
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	public static void menuGenero() {
		System.out.println("*************GENERO*************");

		for (int i = 0; i < Genero.values().length; i++) {
			System.out.println((i + 1) + " - " + Genero.values()[i].getGenero());
		}
	}

	/**
	 * Metodo estatico para mostrar un menu de las plataformas disponibles
	 * 
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	public static void menuPlataforma() {
		System.out.println("*************PLATAFORMA*************");

		for (int i = 0; i < Plataforma.values().length; i++) {
			System.out.println((i + 1) + " - " + Plataforma.values()[i].getPlataforma());
		}
	}

}
