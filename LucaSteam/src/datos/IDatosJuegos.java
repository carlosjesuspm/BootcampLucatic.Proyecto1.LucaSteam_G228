package datos;

import model.Juego;

public interface IDatosJuegos {
	
	public void importarDatos();
	public void altaJuego(Juego juego);
	public void listadoGeneroPlataforma(String nombreGeneroJuego);
	public void mostrarListaJuegos();
	public void listadoConsolaNintendo();
	public void listadoEditores(String nombreEditor);
	public void filtrarSigloXX();
	public void modificarJuego(int rango);
	public void eliminarJuego(int rango);
	public void filtrarAnnoPar();
	
	
}
