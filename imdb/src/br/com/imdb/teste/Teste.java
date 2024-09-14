package br.com.imdb.teste;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Midia;
import com.imdb.data.Serie;

import br.com.imdb.user.Admin;

public class Teste {

	public static void main(String[] args) {
		Midia midia = new Midia();
		Midia.testeAcesso();
		
		
			Cadastro c = new Cadastro();
			Admin a = Admin("15263452");
			Filme f = null;
			Serie s = null;
			
			c.setAdmin(a);
			c.setFilme(f);
			c.setSerie(s);
			
	}

}
