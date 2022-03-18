package com.gestion.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.model.Producto;
import com.gestion.productos.repository.ProductoRepositorio;

@Service
public class ProductoServicio {
	
	@Autowired
	ProductoRepositorio repositorio;
	
	public List<Producto> listarProductos(){
		return repositorio.findAll();
	}
	
	public void guardarProducto(Producto producto) {
		repositorio.save(producto);
	}
	
	public Producto obtenerProdcutoPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarPorId(Integer id) {
		repositorio.deleteById(id);
	}
}
