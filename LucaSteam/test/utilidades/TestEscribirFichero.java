package utilidades;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import model.FactoriaJuegos;
import model.Juego;

public class TestEscribirFichero {

	@Test
	public void testEscribirJuego() {

		// Creamos un objeto juego
		Juego j = FactoriaJuegos.crearJuego("1", "Wii Sports", "Wii", "2006", "Sports", "Nintendo", "41.49", "29.02",
				"3.77", "8.46", "82.74");

		// Escribo el objeto juego que he creado en el fichero CSV
		Fichero.escribirCsv(j, "prueba.csv");

		// Leo el fichero CSV que he escrito
		ArrayList<Juego> juegos;
		try {
			juegos = Fichero.leerCsv("prueba.csv", false);

			// Comprebo si ha escrito el juego que le he dicho
			assertEquals(juegos.get(0).getNombre(), "Wii Sports");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
