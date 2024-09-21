package com.imdb.data;


import com.imdb.users.Admin;

public class Cadastro {
		
	private Admin admin;
	private Filme filme;
	private Serie serie;
	
	
	public Cadastro() {
		// TODO Auto-generated constructor stub
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	
	
}
