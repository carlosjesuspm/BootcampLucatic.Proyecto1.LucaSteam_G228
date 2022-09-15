package datos;

import static org.junit.Assert.*;

import org.junit.Test;
import model.FactoriaJuegos;


public class AltaJuego {

	@Test
	public void addJuego() {
		DatosJuegos d = new DatosJuegos();
		d.altaJuego(FactoriaJuegos.crearJuego());
		assertEquals(d.getJuegos().size(), 1);
	}

	@Test
	public void testEmpty() {
		DatosJuegos d = new DatosJuegos();
		assertEquals(d.getJuegos().size(), 0);

	}

}
