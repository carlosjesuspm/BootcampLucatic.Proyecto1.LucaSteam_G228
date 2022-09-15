package servicios;

/**
 * Interfaz que contiene los métodos que tiene que implementar la capa servicios.
 * Estos métodos conectan las peticiones de la capa control con la capa de datos.
 *  
 * @author Grupo 2
 * @version 1.0: 14/09/2022
 */

public interface IServiciosJuegos {

	public void importarDatos();
	public void importarDatos(String ruta_archivo);
	public void mostrarJuegos();
	public void altaJuego();

	
	
		
	
}
