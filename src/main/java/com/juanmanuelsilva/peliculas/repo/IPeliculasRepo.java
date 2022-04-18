package com.juanmanuelsilva.peliculas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmanuelsilva.peliculas.entities.Pelicula;

public interface IPeliculasRepo extends JpaRepository<Pelicula, Integer>  {

}
