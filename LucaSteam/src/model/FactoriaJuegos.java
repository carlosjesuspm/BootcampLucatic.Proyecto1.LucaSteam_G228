package model;

import utilidades.LeerDatos;

public class FactoriaJuegos {

	/**
	 * 
	 * Metodo para crear un objeto {@link Juego} con los argumentos pasados
	 * 
	 * @author Grupo 2
	 * @version 1.0 14/09/22
	 * 
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
		j.setYear(year);
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
	 * Metodo para crear juego pidiendo datos por teclado
	 * 
	 * @return Objeto {@link Juego} representando los datos introducidos por teclado
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	public static Juego crearJuego() {
		Juego j = new Juego();
		j.setRango(LeerDatos.recogerInt("Introduce rango juego: "));
		j.setNombre(LeerDatos.recogerString("Introduce nombre juego: "));
		j.setPlataforma(stringToPlataforma(LeerDatos.recogerString("Introduce nombre de la plataforma: ")));
		j.setYear(LeerDatos.recogerString("Introduce año del juego: "));
		j.setGenero(stringToGenero(LeerDatos.recogerString("Introduce género del juego: ")));
		j.setEditor(LeerDatos.recogerString("Introduce nombre editor: "));
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
	 * 
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	private static Plataforma stringToPlataforma(String plataforma) throws IllegalArgumentException {
		for (Plataforma object : Plataforma.values()) {
			if (plataforma.toLowerCase().equals(object.getPlataforma().toLowerCase()))
				return object;
		}
		throw new IllegalArgumentException("Unexpected value: " + plataforma);
	}

	/**
	 * Metodo privado que transforma el valor de la {@link Genero} de String a
	 * Genero
	 * 
	 * @param genero String que contiene el valor del valor {@link Genero}
	 * @return El valor en {@link Genero}
	 * @throws IllegalArgumentException Si el valor introducido no consta como valor
	 *                                  en {@link Genero}
	 * @author Grupo2
	 * @version 1.0
	 * @date 14/09
	 */
	private static Genero stringToGenero(String genero) throws IllegalArgumentException {
		for (Genero object : Genero.values()) {
			if (genero.toLowerCase().equals(object.getGenero().toLowerCase()))
				return object;
		}
		throw new IllegalArgumentException("Unexpected value: " + genero);
	}
}
