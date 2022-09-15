package datos;
import java.util.ArrayList;
import model.Juego;

public interface IDatosJuegos {
	
	public void importarDatos();
	public void mostrarJuegos();
	public void altaJuego(Juego juego);
	public void listadoGeneroPlataforma(String nombreGeneroJuego);
	public void listadoConsolaNintendo();
	public void listadoEditores(String nombreEditor);
	public void filtrarSigloXX();
	public void modificarJuego(int rango);
	public void eliminarJuego(int rango);
	public void filtrarAnnoPar();
	
}
