package com.juanmanuelsilva.peliculas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Identificador;
	private String Titulo;
	private String Sinopsis;
	private int Estreno;
	private String Imagen;
	private String Video;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int identificador, String titulo, String sinopsis, int estreno, String imagen, String video) {
		super();
		Identificador = identificador;
		Titulo = titulo;
		Sinopsis = sinopsis;
		Estreno = estreno;
		Imagen = imagen;
		Video = video;
	}

	public int getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public int getEstreno() {
		return Estreno;
	}

	public void setEstreno(int estreno) {
		Estreno = estreno;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getVideo() {
		return Video;
	}

	public void setVideo(String video) {
		Video = video;
	}
	
	
	
	
	
	
}
