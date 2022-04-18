package com.juanmanuelsilva.peliculas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanmanuelsilva.peliculas.entities.Pelicula;
import com.juanmanuelsilva.peliculas.services.IPeliculaService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestPeliculasController {
	@Autowired
	IPeliculaService peliculaService;
	
	@GetMapping(path = "/peliculas", produces = { MediaType.APPLICATION_JSON_VALUE} )
	List<Pelicula> getPeliculas() {
		return peliculaService.findAll();
	}
	
}
