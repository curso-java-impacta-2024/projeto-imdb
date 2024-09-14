package br.com.imdb.user;

public class User {
private String acesso;



public User(String acesso) {
	super();
	this.acesso = acesso;
}

/**
 * @return the acesso
 */
public String getAcesso() {
	return acesso;
}

/**
 * @param acesso the acesso to set
 */
public void setAcesso(String acesso) {
	this.acesso = acesso;
}


}
