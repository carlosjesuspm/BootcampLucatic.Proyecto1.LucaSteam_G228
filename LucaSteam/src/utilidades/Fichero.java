package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

	/**
	 * Método que escribe un objeto juego en un fichero CSV
	 * 
	 * @param Juego - Objeto de tipo juego.
	 * @author Álvaro Román
	 * @version 1.0
	 */	
	public static void escribirCsv(Juego juego) {
		
		try (FileWriter file = new FileWriter("vgsales.csv");
			BufferedWriter writer = new BufferedWriter(file);)
		{

			writer.write(juego.getRango()+","+juego.getNombre()+","+juego.getPlataforma().getPlataforma()+","+juego.getYear()+","+
					juego.getGenero()+","+juego.getEditor()+","+juego.getNA_ventas()+","+juego.getEU_ventas()+","+juego.getJP_ventas()+","+
					juego.getOther_ventas()+","+juego.getGlobal_ventas());
			
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
	public static void escribirCsv(ArrayList<Juego> juegos) {
		
		for (Juego juego : juegos) {
			escribirCsv(juego);
		}
		
	}
	
}
		
		
		

		
	
	
	
	
		
		
		
	
