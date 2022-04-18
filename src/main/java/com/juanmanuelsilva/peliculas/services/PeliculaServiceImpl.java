package com.juanmanuelsilva.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanmanuelsilva.peliculas.entities.Pelicula;
import com.juanmanuelsilva.peliculas.repo.IPeliculasRepo;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculasRepo peliculasRepo;
	
	@Override
	public List<Pelicula> findAll() {
		List<Pelicula> peliculas = peliculasRepo.findAll();
		return peliculas;
	}

}
