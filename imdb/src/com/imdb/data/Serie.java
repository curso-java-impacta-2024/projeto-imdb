package com.imdb.data;

public class Serie extends Midia{
	
	private int temporada;
	private int episodios;
	private double nota;
	
	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	
}
