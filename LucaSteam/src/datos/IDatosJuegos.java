package datos;

import model.Genero;
import model.Juego;

public interface IDatosJuegos {

	public void importarDatos();

	public void mostrarJuegos();

	public void altaJuego(Juego juego);

	public void listadoGenero(Genero nombreGeneroJuego);

	public void listadoEditores(String nombreEditor);

}
