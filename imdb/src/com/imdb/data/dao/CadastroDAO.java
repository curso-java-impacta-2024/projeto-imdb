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

		// SE O BANCO ESTIVER VAZIO
		if (banco == null) {

			banco = new ArrayList<Cadastro>();

			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			Filme filme = new Filme();
			Serie serie = new Serie();

			// Criando o Administrador
			admin.setCredencial("A");
			admin.setNome("Basualdo");
			admin.setEmail("basualdo@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			// Criando o Filme
			filme.setAno(2024);
			filme.setBilheteria(100000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("Deadpool e Wolverine");
			filme.setId(1);
			cadastro.setFilme(filme);

			// Criando o Serie
			serie.setAno(2022);
			serie.setTemporada(6);
			serie.setEpisodios(65);
			serie.setNota(6);
			serie.setTitulo("Cobra Kai");
			serie.setId(1);
			cadastro.setId(1);
			cadastro.setSerie(serie);

			// Adicionando o cadastro na lista
			banco.add(cadastro);

			// NOVOS CADASTROs - CADASTRO 2
			cadastro = new Cadastro();

			admin.setCredencial("A");
			admin.setNome("Basualdo");
			admin.setEmail("basualdo@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			filme = new Filme();
			filme.setAno(2022);
			filme.setBilheteria(400000);
			filme.setDuracao(2.50D);
			filme.setNota(8);
			filme.setTitulo("Lady Bug");
			filme.setId(2);
			cadastro.setFilme(filme);

			serie = new Serie();
			serie.setAno(2021);
			serie.setTemporada(3);
			serie.setEpisodios(25);
			serie.setNota(6);
			serie.setTitulo("Street Food");
			serie.setId(2);
			cadastro.setId(2);
			cadastro.setSerie(serie);

			banco.add(cadastro);

			// NOVOS CADASTRO - CADASTRO 3
			cadastro = new Cadastro();
			admin.setCredencial("A");
			admin.setNome("Basualdo");
			admin.setEmail("basualdo@email.com");
			admin.setId(123456);
			cadastro.setAdmin(admin);

			filme = new Filme();
			filme.setAno(2023);
			filme.setBilheteria(800000);
			filme.setDuracao(3.10D);
			filme.setNota(10);
			filme.setTitulo("Missão Impossível");
			filme.setId(3);
			cadastro.setFilme(filme);

			serie = new Serie();
			serie.setAno(2014);
			serie.setTemporada(3);
			serie.setEpisodios(16);
			serie.setNota(8);
			serie.setTitulo("True Detective");
			serie.setId(3);
			cadastro.setId(3);
			cadastro.setSerie(serie);

			banco.add(cadastro);
		}

	}

	// BUSCA DA LISTA DOS DADOS CADASTRO NO BANCO
	public void select() {
		
		for (Cadastro cadastro: banco) {
			
			System.out.println("**********************************************");
			System.out.println("NOME DO ADMIN: " + cadastro.getAdmin().getNome());
			System.out.println("NOME DO FILME: " + cadastro.getFilme().getTitulo());
			System.out.println("NOTA DO FILME: " + cadastro.getFilme().getNota());
			System.out.println("NOME DA SERIE: " + cadastro.getSerie().getTitulo());
			System.out.println("NOTA DA SERIE: " + cadastro.getSerie().getNota());
			System.out.println("**********************************************");
		
		}
	}
	
	public Cadastro select() {
		
	}

}
