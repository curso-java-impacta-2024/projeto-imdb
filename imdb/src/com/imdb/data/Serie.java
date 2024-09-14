package com.imdb.data;

public class Serie extends Midia{
	
	private int temporada;
	private int episodios;
	
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
	
}
