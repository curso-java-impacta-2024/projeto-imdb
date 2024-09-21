package com.imdb.data.dao;

import java.util.ArrayList;
import java.util.List;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.users.Admin;

public class CadastroDAO {

	public static List<Cadastro> banco = null;

	public CadastroDAO(Object object) {
		if (banco == null) {

			banco = new ArrayList<Cadastro>();

			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			Serie serie = new Serie();
			Filme filme = new Filme();
			// Serie serie = new Serie();

			// criando Admin
			admin.setNome("Mari");
			admin.setEmail("mari@mari.com");
			admin.setId(1);
			admin.setId(12345);
			admin.setCredencial("A");
			cadastro.setAdmin(admin);
			cadastro.setId(123);

			// criando Filme
			filme.setTitulo("Titanic");
			filme.setAno(1997);
			filme.setBilheteria(10000000);
			filme.setNota(9);
			filme.setDuracao(3.0D);
			filme.setId(1);
			cadastro.setFilme(filme);

			// criando Serie
			serie.setTitulo("The Big Bang Theory");
			serie.setAno(2019);
			serie.setTemporada(12);
			serie.setEpisodios(279);
			serie.setId(2);
			cadastro.setSerie(serie);

			// adicionando cadastro na lista
			Serie serie2 = new Serie();
			Filme filme2 = new Filme();
			Cadastro cadastro2 = null;
			cadastro2.setAdmin(admin);
			cadastro2.setId(456);

			// criando Filme
			filme2.setTitulo("Bastardos Inglorios");
			filme2.setAno(2009);
			filme2.setBilheteria(10000000);
			filme2.setNota(9);
			filme2.setDuracao(2.3D);
			filme2.setId(3);
			cadastro2.setFilme(filme2);

			// criando Serie
			serie2.setTitulo("Game of Thrones");
			serie2.setAno(2011);
			serie2.setTemporada(8);
			serie2.setEpisodios(73);
			serie2.setId(4);
			cadastro2.setSerie(serie2);

			// adicionando cadastro na lista
			Serie serie3 = new Serie();
			Filme filme3 = new Filme();
			Cadastro cadastro3 = null;
			cadastro3.setAdmin(admin);
			cadastro3.setId(789);

			// criando Filme
			filme3.setTitulo("A Lista de Schindler");
			filme3.setAno(1993);
			filme3.setBilheteria(10000000);
			filme3.setNota(9);
			filme3.setDuracao(2.3D);
			filme3.setId(5);
			cadastro3.setFilme(filme3);

			// criando Serie
			serie3.setTitulo("Dexter");
			serie3.setAno(2006);
			serie3.setTemporada(8);
			serie3.setEpisodios(96);
			serie3.setId(6);
			cadastro3.setSerie(serie3);

			// adicionando cadastro na lista
			System.out.println("************************************************");
		}
	}
	// public Cadastro select(int id) {
	//
	// }

	public void CadastroDAO1() {
		// TODO Auto-generated constructor stub
	}

	public void select() {

		for (Cadastro cadastro : banco) {
			System.out.println("\n********* Item: [ " + cadastro.getId() + " ]***********");
			System.out.println("NOME DO ADMIN : " + cadastro.getAdmin().getNome());
			System.out.println("NOME DO FILME : " + cadastro.getFilme().getTitulo());
			System.out.println("NOME DO FILME : " + cadastro.getFilme().getNota());
			System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getTitulo());
			System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getNota());
			System.out.println("***********************\n");

		}
	}

	public Cadastro select(int id) {

		for (int x = 0; x < banco.size(); x++) {
			if (banco.get(x).getId() == id) {
				return banco.get(x);
			}
		}
		return null;
	}

	public boolean delete(int id) {
		if(banco.remove(select(id))){
			return true;
		}
		return false;
	}
}
