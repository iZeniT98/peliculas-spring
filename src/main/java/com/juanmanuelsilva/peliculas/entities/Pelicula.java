package com.juanmanuelsilva.peliculas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Identificador")
	private int idenfiticador;
	@Column(name="Titulo")
	private String titulo;
	@Column(name="Sinopsis")
	private String sinopsis;
	@Column(name="Estreno")
	private int estreno;
	@Column(name="Imagen")
	private String imagen;
	@Column(name="Video")
	private String video;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int identificador, String titulo, String sinopsis, int estreno, String imagen, String video) {
		super();
		this.idenfiticador = identificador;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.estreno = estreno;
		this.imagen = imagen;
		this.video = video;
	}

	public int getIdenfiticador() {
		return idenfiticador;
	}

	public void setIdenfiticador(int idenfiticador) {
		this.idenfiticador = idenfiticador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getEstreno() {
		return estreno;
	}

	public void setEstreno(int estreno) {
		this.estreno = estreno;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}


	
	
	
	
	
	
}
