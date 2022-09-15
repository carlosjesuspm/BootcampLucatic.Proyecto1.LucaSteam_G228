package datos;

import model.Genero;
import model.Juego;

public interface IDatosJuegos {
	
	public void importarDatos();
	public void mostrarJuegos();
	public void altaJuego(Juego juego);
	public void listadoGenero(Genero nombreGeneroJuego);
	public void listadoConsolaNintendo();
	public void listadoEditores(String nombreEditor);
	public void filtrarSigloXX();
	public void modificarJuego(int rango);
	public void eliminarJuego(int rango);
	public void filtrarAnnoPar();
	
}
