package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
