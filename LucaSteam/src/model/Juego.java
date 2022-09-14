package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase entidad dedicada a crear objetos de tipo Juego <br>
 * Contenido de la clase creado con Lombok (getters, setters, equals, hashCode, toString) 
 * 
 * @author Alonso Gomez Casanova
 * @version 1.0: 14/09/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Juego {

	private int rango;
	private String nombre;
	private Plataforma plataforma;
	private LocalDate year;
	private Genero genero;
	private String editor;
	private int NA_ventas;
	private int EU_ventas;
	private int JP_ventas;
	private int Other_ventas;
	private int Global_ventas;
	
}
