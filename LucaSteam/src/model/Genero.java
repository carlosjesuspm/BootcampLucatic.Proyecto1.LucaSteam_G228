package model;

/**
 * @author Grupo 2
 * @version 1.0
 */
public enum Genero {

	Action("Action"), Adventure("Adventure"), Fighting("Fighting"), Misc("Misc"), Platform("Platform"),
	Puzzle("Puzzle"), Racing("Racing"), RolePlaying("RolePlaying"), Shooter("Shooter"), Simulation("Simulation"),
	Sports("Sports"), Strategy("Strategy");

	private String genero;

	private Genero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}	
	
}
