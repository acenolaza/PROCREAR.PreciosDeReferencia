package ar.gob.anses.procrear.preciosdereferencia.dto;

public class Proveedor {
	private String nombre;
	private int logoResourceId;

	public Proveedor(String nombre, int logoResourceId) {
		this.nombre = nombre;
		this.logoResourceId = logoResourceId;
	}

	public String getNombre() {
		return nombre;
	}

	public int getLogoResourceId() {
		return logoResourceId;
	}
}
