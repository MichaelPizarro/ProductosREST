package com.gestion.productos.prueba;

public class EstoEsPrueba {
	
	private int numero;
	private String palabra;
	private float enumeracion;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public float getEnumeracion() {
		return enumeracion;
	}
	public void setEnumeracion(float enumeracion) {
		this.enumeracion = enumeracion;
	}

	@Override
	public String toString() {
		return "EstoEsPrueba{" +
				"numero=" + numero +
				", palabra='" + palabra + '\'' +
				", enumeracion=" + enumeracion +
				'}';
	}
}
