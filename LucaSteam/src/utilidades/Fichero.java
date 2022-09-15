package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import model.FactoriaJuegos;
import model.Juego;
import org.apache.logging.log4j.Logger;

/**
 * Clase para tratar fichero CSV.
 *
 * @author Lamia,
 * @version 1.0: 14/09/2022
 */

public class Fichero {
	private static final Logger logger = LogManager.getLogger("Fichero");

	/**
	 * Descripción del método: Metodo que convierte Csv en ArrayList.
	 *
	 * @param ruta La ruta del archivo csv que se quiere leer
	 * @param tieneCabecera {@code true} tiene cabecera, de otra manera no tiene
	 * @return ArrayList<Juego> que contiene los juegos introducidos
	 * @author Grupo 2
	 * @version 2.0
	 * @throws IOException 
	 */
	public static ArrayList<Juego> leerCsv(String ruta, boolean tieneCabecera) throws IOException {
		ArrayList<Juego> juegos = new ArrayList<>();
		try {
			List<String> lineas = Files.readAllLines(Paths.get(ruta));
			// eliminamos la primera linea si es que el fichero tiene cabecera
			if (tieneCabecera)
				lineas.remove(0);
			for (String string : lineas) {
				try {
					String[] palabras = string.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
					juegos.add(FactoriaJuegos.crearJuego(palabras[0], palabras[1], palabras[2], palabras[3], palabras[4],
							palabras[5], palabras[6], palabras[7], palabras[8], palabras[9], palabras[10]));
				} catch (NumberFormatException e) {
					logger.warn(e.getMessage() + " en " + string);
				} catch (IllegalArgumentException e) {
					logger.warn(e.getMessage() + " en " + string);
				}
			}
			return juegos;
		} catch (IOException e) {
			logger.warn(e.getMessage());
			throw e;
		}

	}

	/**
	 * Método que escribe un objeto juego en un fichero CSV
	 *
	 * @param Juego - Objeto de tipo juego.
	 * @author Grupo 2
	 * @version 1.0
	 */
	public static void escribirCsv(Juego juego, String ruta_fichero) {

		try (FileWriter file = new FileWriter(ruta_fichero, true);
			BufferedWriter writer = new BufferedWriter(file);)
		{

			writer.write(juego.getRango()+","+juego.getNombre()+","+juego.getPlataforma().getPlataforma()+","+juego.getYear()+","+
					juego.getGenero()+","+juego.getEditor()+","+juego.getNaVentas()+","+juego.getEuVentas()+","+juego.getJpVentas()+","+
					juego.getOtherVentas()+","+juego.getGlobalVentas());

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			logger.warn("Problema al escribir el fichero. Método escribirCsv()");

		}
	}

	/**
	 * Método que escribe un objeto juego en un fichero CSV
	 *
	 * @param Juego - Objeto de tipo juego.
	 * @author Álvaro Román
	 * @version 1.0
	 */
	public static void escribirCsv(ArrayList<Juego> juegos, String ruta_fichero) {

		for (Juego juego : juegos) {
			escribirCsv(juego, ruta_fichero);
		}

	}

}













