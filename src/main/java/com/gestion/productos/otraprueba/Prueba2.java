package com.gestion.productos.otraprueba;

public class Prueba2 {

    private int numero;
    private String nombre;
    private boolean siExsite;

    public Prueba2(int numero, String nombre, boolean siExsite) {
        this.numero = numero;
        this.nombre = nombre;
        this.siExsite = siExsite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSiExsite() {
        return siExsite;
    }

    public void setSiExsite(boolean siExsite) {
        this.siExsite = siExsite;
    }

    @Override
    public String toString() {
        return "Prueba2{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", siExsite=" + siExsite +
                '}';
    }
}
