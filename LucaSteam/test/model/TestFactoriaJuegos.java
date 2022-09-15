package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactoriaJuegos {

	@Test
	void testCrearJuegoMano() {
		// juego = 1, hola, N64, 2000, Racing, Alonso, 1, 1, 1, 1, 0
		Juego j;
		j = FactoriaJuegos.crearJuego();
		assertNotNull(j);
		assertEquals(j.getRango(), 1);
		assertEquals(j.getNombre(), "hola");
		assertEquals(j.getPlataforma(), Plataforma.N64);
		assertEquals(j.getYear(), "2000");
		assertEquals(j.getGenero(), Genero.Racing);
		assertEquals(j.getEditor(), "Alonso");
	}

}
