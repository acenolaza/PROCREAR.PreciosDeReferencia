package ar.gob.anses.procrear.preciosdereferencia.dto;

import java.math.BigDecimal;

public class Producto {
	private String EAN;
	private String nombre;
	private String detalle;
	private String marca;
	private BigDecimal precio;
	private Proveedor proveedor;

	public Producto(String EAN, String nombre, String detalle, String marca,
			BigDecimal precio, Proveedor proveedor) {
		this.EAN = EAN;
		this.nombre = nombre;
		this.detalle = detalle;
		this.marca = marca;
		this.precio = precio;
		this.proveedor = proveedor;
	}

	public String getEAN() {
		return EAN;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public String getMarca() {
		return marca;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	@Override
	public String toString() {
		return nombre + " " + proveedor.getNombre();
	}
}