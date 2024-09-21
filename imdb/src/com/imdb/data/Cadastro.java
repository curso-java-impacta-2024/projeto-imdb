package com.imdb.data;


import com.imdb.users.Admin;

public class Cadastro {
		
	private Admin admin;
	private Filme filme;
	private Serie serie;
	private int id;
	public Cadastro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cadastro(Admin admin, Filme filme, Serie serie, int id) {
		super();
		this.admin = admin;
		this.filme = filme;
		this.serie = serie;
		this.id = id;
	}
}
	
	
	
	
