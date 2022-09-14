package model;

public enum Genero {

	Action("Accion"), Adventure("Adventura"), Fighting("Lucha"), Misc("Mistico"), Platform("Plataforma"),
	Puzzle("Puzzle"), Racing("Carreras"), RolePlaying("Juegos de rol"), Shooter("Disparos"), Simulation("Simulacion"),
	Sports("Deportes"), Strategy("Estrategia");

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
