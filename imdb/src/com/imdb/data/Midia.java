package com.imdb.data;

public class Midia {
	private String titulo;
	private int ano;
	private double nota;
	
	public Midia() {
		super();
	}
	
	public static String testeAcesso() {
		String teste = "x";
		return teste;
	}


	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTitulo() {
		return titulo;
	}
	
	
}
