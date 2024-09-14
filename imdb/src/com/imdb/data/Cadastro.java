package com.imdb.data;

import br.com.imdb.user.Admin;

public class Cadastro {
	private Admin admin;
	private Filme filme;
	private Serie Serie;
	
	
	public Cadastro() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	/**
	 * @return the filme
	 */
	public Filme getFilme() {
		return filme;
	}
	/**
	 * @param filme the filme to set
	 */
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return Serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		Serie = serie;
	}
	
	
}
