package com.imdb.data.dAO;

import java.util.ArrayList;
import java.util.List;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.users.Admin;

public class CadastroDAO {

	public static List<Cadastro> banco = null;

	public CadastroDAO() {

		if (banco == null) {

			// TODO Auto-generated constructor stub

			banco = new ArrayList<Cadastro>();

			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			Serie serie = new Serie();
			Filme filme = new Filme();

			
			
			// Criando o Administrador
			admin = new Admin();
			
			admin.setCredencial("A");
			admin.setNome("Basualdo");
			admin.setEmail("basualdo@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			
			filme = new Filme();
			// Criando o filme
			filme.setAno(2024);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("DeadPool e Wolwerine");
			cadastro.setFilme(filme);

			
			serie = new Serie();
			// Criando a série
			serie.setAno(2022);
			serie.setTemporada(6);
			serie.setEpisodios(65);
			serie.setNota(10);
			serie.setTitulo("Cobra Kai");
			cadastro.setSerie(serie);

			// Adicionando o cadastro na lista

			banco.add(cadastro);

			// =======================================================

			cadastro = new Cadastro();
			// Criando o Administrador
			admin = new Admin();
			admin.setCredencial("A");
			admin.setNome("Gisele");
			admin.setEmail("gisele@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			filme = new Filme();

			// Criando o filme
			filme.setAno(2024);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("Batman");
			cadastro.setFilme(filme);

			serie = new Serie();

			// Criando a série
			serie.setAno(2022);
			serie.setTemporada(3);
			serie.setEpisodios(65);
			serie.setNota(5);
			serie.setTitulo("Street food");
			cadastro.setSerie(serie);

			banco.add(cadastro);

			// =======================================================

			cadastro = new Cadastro();
			// Criando o Administrador
			admin = new Admin();
			admin.setCredencial("A");
			admin.setNome("Renato");
			admin.setEmail("renato@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			filme = new Filme();
			// Criando o filme
			filme.setAno(2023);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("Vingadores");
			cadastro.setFilme(filme);

			
			serie = new Serie();
			// Criando a série
			serie.setAno(2022);
			serie.setTemporada(3);
			serie.setEpisodios(65);
			serie.setNota(8.5);
			serie.setTitulo("CSI");
			cadastro.setSerie(serie);

			banco.add(cadastro);

		}

	}

	 Cadastro cadastro =  new Cadastro();
	
	public List<Cadastro> select() {
		
		System.out.println("******************************************");
		System.out.println("Nome do admin: " + cadastro.getAdmin().getNome());
		System.out.println("Nome do filme" + cadastro.getFilme().getTitulo());
		System.out.println("Nota do filme" + cadastro.getFilme().getNota());
		System.out.println("Nome da serie" + cadastro.getFilme().getTitulo());
		System.out.println("Nota da serie" + cadastro.getFilme().getNota());
		System.out.println("******************************************");
		
		
	
		return banco;

	}

}
