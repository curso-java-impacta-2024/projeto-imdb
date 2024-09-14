package com.imdb.data;

public class Filme extends Midia{
	
	private int bilheteria;
	private Double duracao;
	
	public Filme() {
	
	}

	public int getBilheteria() {
		return bilheteria;
	}

	public void setBilheteria(int bilheteria) {
		this.bilheteria = bilheteria;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}
	

}
