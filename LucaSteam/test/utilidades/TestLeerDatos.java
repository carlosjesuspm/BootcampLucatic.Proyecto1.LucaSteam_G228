package utilidades;

import static org.junit.Assert.*;
import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;



public class TestLeerDatos {

	private static final Logger logger = LogManager.getLogger("ServiciosJuegos");

	@Test
	@Ignore
	public void testDebeRecogerString() throws InputMismatchException {

		String entradaString = LeerDatos.recogerString();
		String cadenaEsperada = "hola";
		logger.info("Test: testDebeRecogerString()");
		assertEquals(entradaString, cadenaEsperada);
	}

	@Test
	@Ignore
	public void testDebeRecogerInt() throws InputMismatchException {
		int entradaInt = LeerDatos.recogerInt();
		int intEsperado = 345;
		assertEquals(entradaInt, intEsperado);
	}

	@Test
	@Ignore

	public void testDebeRecogerFloat() throws InputMismatchException {

		float entradaFloat = LeerDatos.recogerFloat();
		float floatEsperado = 1.45f;
		assertEquals((Float) entradaFloat, (Float) floatEsperado);
	}

	@Test
	@Ignore

	public void testDebeDarErrorSiIntSiendoRecogerString() throws InputMismatchException {
		String entradaString = LeerDatos.recogerString();
		int intEsperado = 23;
		assertEquals(entradaString, intEsperado);

	}

	@Test
	@Ignore

	public void testDeberiaDarErrorSiFloatSiendoRecogerString() throws InputMismatchException {
		float entradaFloat = LeerDatos.recogerFloat();
		String StringEsperado = "hola";
		assertEquals(StringEsperado, (Float) entradaFloat);
	}

	@Test
	@Ignore
	public void testDeberiaDarErrorSiStringSiendoRecogerInt() throws InputMismatchException {
		int entradaInt = LeerDatos.recogerInt();
		String StringEsperado = "hi";
		assertEquals(entradaInt, StringEsperado);
	}

	@Test
	@Ignore

	public void testDeberiaDarErrorSiStringIntRecogerString() throws InputMismatchException {
		String entradaString = LeerDatos.recogerString();
		int intEsperado = 43;
		assertEquals(intEsperado, entradaString);
	}

	@Test
	@Ignore
	public void testExceptionDandoErrorAposta() {

		assertThrows(InputMismatchException.class, () -> {
			LeerDatos.recogerInt("hi");
		});

	}

	@Test

	public void testDeberiaErrorSiIntRecogiendoString() throws InputMismatchException {
		String entradaString = LeerDatos.recogerString();
		int intEsperado = 56;
		assertEquals(intEsperado, entradaString);
	}

}
	
	
	


