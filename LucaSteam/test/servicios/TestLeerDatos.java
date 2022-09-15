package servicios;

import static org.junit.Assert.*;

import java.util.InputMismatchException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import utilidades.LeerDatos;

public class TestLeerDatos {

	private static final Logger logger = LogManager.getLogger("ServiciosJuegos");
	

	@Test
	public void testDebeRecogerString()throws InputMismatchException {
		
		String entradaString = LeerDatos.recogerString();
		String cadenaEsperada="hola";
		logger.info("Test: testDebeRecogerString()");
		assertEquals(entradaString,cadenaEsperada);
	}
	
	@Test
	@Ignore
	public void testDebeRecogerInt() throws InputMismatchException{
		int entradaInt = LeerDatos.recogerInt("1");
		
		
	}
	
	@Test
	@Ignore
	public void testDebeRecogerFloat()throws InputMismatchException {
		
		
	}
	
	
	
}
