package model;

/**
 * @author Grupo 2
 * @version 1.0
 */
public enum Plataforma {
	_2600("2600"), _3DO("3DO"), _3DS("3DS"), DC("DC"), DS("DS"), GB("GB"), GBA("GBA"), GC("GC"), GEN("GEN"), GG("GG"),
	NES("NES"), N64("N64"), NG("NG"), PC("PC"), PS2("PS2"), PS3("PS3"), PS4("PS4"), PSV("PSV"), SAT("SAT"), SCD("SCD"),
	SNES("SNES"), TG16("TG16"), Wii("Wii"), WiiU("WiiU"), WS("WS"), X360("X360"), XB("XB"), XOne("XOne");

	private String plataforma;

	private Plataforma(String plataforma) {
		this.setPlataforma(plataforma);
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
