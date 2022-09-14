package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase entidad dedicada a crear objetos de tipo Juego <br>
 * Contenido de la clase creado con Lombok (getters, setters, equals, hashCode, toString) 
 * 
 * @author Grupo 2
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
	private double naVentas;
	private double euVentas;
	private double jpVentas;
	private double otherVentas;
	private double globalVentas;
	
}
