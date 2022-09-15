package datos;

import java.util.ArrayList;

import model.Juego;

public interface IDatosJuegos {
	
	public void importarDatos();
	public void mostrarJuegos();
	public void altaJuego(Juego juego);
	public ArrayList<Juego> getJuegos();
	
}
