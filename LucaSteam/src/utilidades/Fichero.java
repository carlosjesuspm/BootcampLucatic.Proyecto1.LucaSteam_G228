package utilidades;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import model.Juego;
import org.apache.logging.log4j.Logger;

/**
 * Clase para tratar fichero CSV.
 * 
 * @author Lamia,
 * @version 1.0: 14/09/2022
 */

public class Fichero {
	private static final Logger logger = LogManager.getLogger("Nombre_Clase");

	/**
	 * Descripción del método: Metodo que convierte Csv en ArrayList.
	 * 
	 * @param 0
	 * @return ArrayList<Juego>
	 * @author Lamia
	 * @version 1.0
	 */
	public static ArrayList<Juego> leerCsv() {
		/*
		 * Tener en cuenta si la primera linea del CSV es cabecera o contenido.
		 * Posibilidad pasar booleano indicando cabecera, si hay cabecera en lineas
		 * quitar la linea 0.
		 */
		try {
			List<String> lineas = Files.readAllLines(Paths.get("vgsales.csv"));
			for (String string : lineas) {
				String[] palabras = string.split(",");

			}
			System.out.println(lineas.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
