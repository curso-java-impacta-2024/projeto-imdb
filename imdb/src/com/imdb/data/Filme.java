package com.imdb.data;

public class Filme extends Midia{
	
	private int bilheteria;
	private double duracao;
	private double nota;
	
	public Filme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBilheteria() {
		return bilheteria;
	}

	public void setBilheteria(int bilheteria) {
		this.bilheteria = bilheteria;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	

	
	
}
