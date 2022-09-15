package utilidades;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import model.Juego;
import utilidades.Fichero;

public class TestLeerCsv {

	@Test
	public void testLeerArchivoCorrectoConCabecera() {
		ArrayList<Juego> juegos = new ArrayList<>();
		try {
			juegos = Fichero.leerCsv("vgsales.csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(juegos);
	}
	
	@Test
	public void testLeerArchivoCorrectoSinnCabecera() {
		ArrayList<Juego> juegos = new ArrayList<>();
		try {
			juegos = Fichero.leerCsv("vgsales.csv", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(juegos);	
	}
	
	@Test
	public void testLeerArchivoNoExiste() {
		assertThrows(IOException.class, () -> {
			Fichero.leerCsv("vgsale.csv", false);
	    });
	}

}
