package model;

import java.time.LocalDate;

public class FactoriaJuegos {

	/**
	 * 
	 * Metodo para crear un objeto {@link Juego} con los argumentos pasados
	 * 
	 * @param rango        Rango del juego en String
	 * @param nombre       Nombre del juego en String
	 * @param plataforma   Plataforma del juego en String
	 * @param year         Fecha del juego en String
	 * @param genero       Genero del juego en String
	 * @param editor       Editor del juego en String
	 * @param naVentas     Ventas en Norte America en String
	 * @param euVentas     Ventas en Europa en String
	 * @param jpVentas     Ventas en Japon en String
	 * @param otherVentas  Ventas en otros lugares en String
	 * @param globalVentas Ventas Globales en String
	 * @return El objeto creado a partir de los argumentos pasados
	 * @throws NumberFormatException    El valor numerico pasado como String es
	 *                                  erroneo
	 * @throws IllegalArgumentException Un valor de Enum pasado como String es
	 *                                  erroneo
	 */
	public static Juego crearJuego(String rango, String nombre, String plataforma, String year, String genero,
			String editor, String naVentas, String euVentas, String jpVentas, String otherVentas, String globalVentas)
			throws NumberFormatException, IllegalArgumentException {

		Juego j = new Juego();
		j.setRango(Integer.parseInt(rango));
		j.setNombre(nombre);
		j.setPlataforma(stringToPlataforma(plataforma));
		j.setYear(LocalDate.of(Integer.parseInt(year), 0, 0));
		j.setGenero(stringToGenero(genero));
		j.setEditor(editor);
		j.setNaVentas(Double.parseDouble(naVentas));
		j.setEuVentas(Double.parseDouble(euVentas));
		j.setJpVentas(Double.parseDouble(jpVentas));
		j.setOtherVentas(Double.parseDouble(otherVentas));
		j.setGlobalVentas(Double.parseDouble(globalVentas));
		return j;
	}

	/**
	 * Metodo privado que transforma el valor de la {@link Plataforma} de String a
	 * Plataforma
	 * 
	 * @param plataforma String que contiene el valor del valor {@link Plataforma}
	 * @return El valor en {@link Plataforma}
	 * @throws IllegalArgumentException Si el valor introducido no consta como valor
	 *                                  en {@link Plataforma}
	 */
	private static Plataforma stringToPlataforma(String plataforma) throws IllegalArgumentException {
		Plataforma p;
		switch (plataforma) {
		case "2600" -> p = Plataforma._2600;
		case "3DO" -> p = Plataforma._3DO;
		case "3DS" -> p = Plataforma._3DS;
		case "DC" -> p = Plataforma.DC;
		case "DS" -> p = Plataforma.DS;
		case "GB" -> p = Plataforma.GB;
		case "GBA" -> p = Plataforma.GBA;
		case "GC" -> p = Plataforma.GC;
		case "GEN" -> p = Plataforma.GEN;
		case "GG" -> p = Plataforma.GG;
		case "NES" -> p = Plataforma.NES;
		case "N64" -> p = Plataforma.N64;
		case "NG" -> p = Plataforma.NG;
		case "PC" -> p = Plataforma.PC;
		case "PS2" -> p = Plataforma.PS2;
		case "PS3" -> p = Plataforma.PS3;
		case "PS4" -> p = Plataforma.PS4;
		case "PSV" -> p = Plataforma.PSV;
		case "SAT" -> p = Plataforma.SAT;
		case "SCD" -> p = Plataforma.SCD;
		case "SNES" -> p = Plataforma.SNES;
		case "TG16" -> p = Plataforma.TG16;
		case "Wii" -> p = Plataforma.Wii;
		case "WiiU" -> p = Plataforma.WiiU;
		case "WS" -> p = Plataforma.WS;
		case "X360" -> p = Plataforma.X360;
		case "XB" -> p = Plataforma.XB;
		case "XOne" -> p = Plataforma.XOne;

		default -> throw new IllegalArgumentException("Unexpected value: " + plataforma);
		}
		return p;
	}

	/**
	 * Metodo privado que transforma el valor de la {@link Genero} de String a
	 * Genero
	 * 
	 * @param genero String que contiene el valor del valor {@link Genero}
	 * @return El valor en {@link Genero}
	 * @throws IllegalArgumentException Si el valor introducido no consta como valor
	 *                                  en {@link Genero}
	 */
	private static Genero stringToGenero(String genero) throws IllegalArgumentException {
		Genero g;

		switch (genero) {
		case "Action" -> g = Genero.Action;
		case "Adventure" -> g = Genero.Adventure;
		case "Fighting" -> g = Genero.Fighting;
		case "Misc" -> g = Genero.Misc;
		case "Platform" -> g = Genero.Platform;
		case "Puzzle" -> g = Genero.Puzzle;
		case "Racing" -> g = Genero.Racing;
		case "RolePlaying" -> g = Genero.RolePlaying;
		case "Shooter" -> g = Genero.Shooter;
		case "Simulation" -> g = Genero.Simulation;
		case "Sports" -> g = Genero.Sports;
		case "Strategy" -> g = Genero.Strategy;

		default -> throw new IllegalArgumentException("Unexpected value: " + genero);
		}

		return g;
	}
}
