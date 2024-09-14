package com.imdb.users;

public class Admin extends Pessoa{
	private String credencial;
	

	public Admin() {
		
	}
	
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	
	public String getCredencial() {
		return credencial;
	}

}
