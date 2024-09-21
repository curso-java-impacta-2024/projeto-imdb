package com.imdb.data.dao;

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

			banco = new ArrayList<Cadastro>();

			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			Serie serie = new Serie();
			Filme filme = new Filme();
			// Serie serie = new Serie();


			cadastro.setFilme(filme);
			// Criando Serie

			// Criando o Administrador
			cadastro = new Cadastro();
			admin = new Admin();
			admin.setCredencial("A");
			admin.setNome("Basualdo");
			admin.setEmail("basualdo@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);
			
			filme = new Filme();
			filme.setAno(2024);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setAno(2014);
			//Criando Serie
			serie = new Serie();
			serie.setTemporada(3);
			serie.setEpisodios(2);
			serie.setNota(8.5);
			serie.setTitulo("True Detective");
			cadastro.setSerie(serie);
			// Adicionando a cadastro na lista
			banco.add(cadastro);
		}

	
	
	for (Cadastro cadastro : banco) {
		System.out.println("***********************");
		System.out.println("NOME DO ADMIN : " + cadastro.getAdmin().getNome());
		System.out.println("NOME DO FILME : " + cadastro.getFilme().getTitulo());
		System.out.println("NOME DO FILME : " + cadastro.getFilme().getNota());
		System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getTitulo());
		System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getNota());
		System.out.println("***********************");

	}
	}

}
