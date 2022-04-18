package com.juanmanuelsilva.peliculas;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.juanmanuelsilva.peliculas.entities.Pelicula;
import com.juanmanuelsilva.peliculas.repo.IPeliculasRepo;
import com.juanmanuelsilva.peliculas.services.IPeliculaService;

@SpringBootTest
class PeliculasApplicationTests {

	@Autowired
	IPeliculasRepo peliculasRepo;
	
	@Autowired
	IPeliculaService peliculasService;
	
	@Test
	void findAllPeliculasServicio() {
	
		List<Pelicula> peliculas = peliculasService.findAll();
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.getTitulo());
		}
		
	}
	

}
