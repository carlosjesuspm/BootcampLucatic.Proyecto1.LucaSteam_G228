package datos;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Data;
import model.Juego;
import utilidades.Fichero;


/**
 * Clase DatosJuegos: gestiona los datos de la aplicacion.
 * Implementa la interfaz IDatosJuegos.
 * @author Grupo2
 * @version 1
 * @date 14/09
 */
@Data
public class DatosJuegos implements IDatosJuegos{
	
	//LOGGER
	private static final Logger logger = LogManager.getLogger("DatosJuegos");
	
	private ArrayList<Juego> listaJuegos = new ArrayList<Juego>();
	private  ArrayList<Juego> listaFiltrada = new ArrayList<Juego>();
	
	
	
	/**
	 * Metodo importarDatos(): recoge los datos del CSV.
	 * 
	 * @author Grupo2 - Tamara
	 * @version 1
	 * @date 14/09
	 */
	@Override
	public void importarDatos() {
		listaJuegos = Fichero.leerCsv("vgsales.csv", true);
	}

	/**
	 * Metodo para mostrar una lista de todos los juegos
	 * 
	 * @author Grupo2 - Alonso
	 * @version 1.0
	 * @date 14/09
	 */
	@Override
	public void mostrarJuegos() {
		for (Juego juego : listaJuegos) {
			System.out.println(juego.toString());
		}
	}

	/**
	 * Metodo altaJuego(): Recibe un objeto de tipo Juego como argumento y lo añade
	 * al ArrayList<> listaJuego.
	 * 
	 * @author Grupo2 - Tamara
	 * @version 1
	 * @date 14/09
	 * @param Juego juego
	 */
	@Override
	public void altaJuego(Juego juego) {
		listaJuegos.add(juego);

	}
	
	public ArrayList<Juego> getJuegos() {
		return listaJuegos;
	}
	
	
	public void listadoGeneroPlataforma(String nombreGeneroJuego){
		listaFiltrada=(ArrayList<Juego>) listaJuegos.stream().filter(juego -> juego.getGenero().name().equalsIgnoreCase(nombreGeneroJuego)).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
		}

	public void listadoConsolaNintendo(){
		listaFiltrada=(ArrayList<Juego>) listaJuegos.stream().filter(juego -> juego.getEditor().equalsIgnoreCase("Nintendo")).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
	};
	
	public void listadoEditores(String nombreEditor){
		listaFiltrada=(ArrayList<Juego>) listaJuegos.stream().filter(juego -> juego.getEditor().equalsIgnoreCase(nombreEditor)).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
	};
	
	
	public void filtrarSigloXX(){};
	public void modificarJuego(int rango){};
	public void eliminarJuego(int rango){};
	public void filtrarAnnoPar(){};
	

}
