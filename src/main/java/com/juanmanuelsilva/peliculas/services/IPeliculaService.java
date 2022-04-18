package com.juanmanuelsilva.peliculas.services;

import java.util.List;

import com.juanmanuelsilva.peliculas.entities.Pelicula;

public interface IPeliculaService {
	
	public List<Pelicula> findAll();
	
}
