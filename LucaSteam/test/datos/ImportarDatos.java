package datos;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import model.Juego;
import utilidades.Fichero;

/**
 * Clase Test para el metodo ImportarDatos
 * 
 * @author Grupo2 - Tamara
 * @version 1.0
 * @date 15/09
 */
public class ImportarDatos {

	/**
	 * Este método debe devolver true si el metodo guarda los datos en el
	 * ArrayList<>
	 * 
	 * @return true si lista guarda datos
	 */
	@Test
	public void deberGuardarDatosEnArrayList() throws IOException {

		ArrayList<Juego> lista = new ArrayList<Juego>();
		lista = Fichero.leerCsv("vgsales.csv", true);
		int tamanio = 16598;
		assertEquals(lista.size(), tamanio);

	}

	/**
	 * Este método debe dar error si la lista no contiene el mismo numero de
	 * archivos que se esperan.
	 * 
	 */
	@Test
	public void debeDarErrorSiListaVacia() throws IOException {
		ArrayList<Juego> lista = new ArrayList<Juego>();
		lista = Fichero.leerCsv("listavacia.csv", true);

		int tamanio = 16598;
		assertEquals(lista.size(), tamanio);
	}
}
