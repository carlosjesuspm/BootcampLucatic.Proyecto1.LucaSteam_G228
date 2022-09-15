package utilidades;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.FactoriaJuegos;
import model.Juego;

public class TestEscribirFichero {

		
		
	
	@Test
	public void test1() {
		
		Juego j = FactoriaJuegos.crearJuego("1","Wii Sports","Wii","2006","Sports","Nintendo","41.49","29.02","3.77","8.46","82.74");
		
		assertNull(j);
		assertNotNull(j);
		
		
	}
		
	
	@Test
	public void test3() {

		//Creamos un objeto juego
		Juego j = FactoriaJuegos.crearJuego("1","Wii Sports","Wii","2006","Sports","Nintendo","41.49","29.02","3.77","8.46","82.74");
		
		//Escribo el objeto juego que he creado en el fichero CSV
		Fichero.escribirCsv(j, "prueba.csv");
		
		//Leo el fichero CSV que he escrito
		ArrayList<Juego> juegos = Fichero.leerCsv("prueba.csv", false);
		
		//Comprebo si ha escrito el juego que le he dicho
		assertEquals(juegos.get(0).getNombre(), "Wii Sportrs");
		
		//Que no escriba algo distinto a un juego
		
		
	}
	

}
