package datos;
import model.Juego;

/**
 * Interfaz IDatosJuegos: contiene métodos para desarrollar en las clases que la
 * implementen (Clase DatosJuegos).
 * 
 * @author Grupo2 - Tamara
 * @version 1
 * @date 14/09
 */

public interface IDatosJuegos {

	public void importarDatos();
	public void altaJuego(Juego juego);
	public void mostrarJuegos();
	public void listadoGeneroPlataforma(String nombreGeneroJuego);
	public void listadoConsolaNintendo();
	public void listadoEditores(String nombreEditor);
	public void filtrarSigloXX();
	public void modificarJuego(int rango);
	public void eliminarJuego(int rango);
	public void filtrarAnnoPar();
	
}
