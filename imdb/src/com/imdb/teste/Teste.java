package com.imdb.teste;

import java.util.ArrayList;
import java.util.List;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Midia;
import com.imdb.data.Serie;
import com.imdb.users.Admin;


public class Teste {

	public static void main(String[] args) {
		
		Cadastro cadastro = new Cadastro();	
		
		Admin admin = null;
		//Criando o Administrador
		admin = new Admin();
		admin.setCredencial("A");
		admin.setNome("Basualdo");
		admin.setEmail("basualdo@email.com");
		admin.setId(123456);		
		cadastro.setAdmin(admin);	
		
		Filme filme = null;
		//Criando o Filme
		filme = new Filme();
		filme.setAno(2024);
		filme.setBilheteria(100000);
		filme.setDuracao(3.50D);
		filme.setNota(10);
		filme.setTitulo("Deadpool e Wolverine");		
		cadastro.setFilme(filme);		
		
		Serie serie = null;
		serie = new Serie();
		serie.setAno(2022);
		serie.setTemporada(6);
		serie.setEpisodios(65);
		serie.setNota(6);
		serie.setTitulo("Cobra Kai");		
		cadastro.setSerie(serie);
		
//		ArrayList al = new ArrayList<String>();
//		
//		al.add("Carla");
//		al.add("Nalva");
//		al.add("Maria");
		
		List<Cadastro> lista = new ArrayList<Cadastro>();
		
		lista.add(cadastro);
		
		cadastro = new Cadastro();
		cadastro.setAdmin(admin);
	
		filme = new Filme();
		filme.setAno(2020);
		filme.setBilheteria(200000);
		filme.setDuracao(3.20D);
		filme.setNota(10);
		filme.setTitulo("Interestelar");		
		cadastro.setFilme(filme);		
		
		serie = new Serie();
		serie.setAno(2015);
		serie.setTemporada(8);
		serie.setEpisodios(80);
		serie.setNota(10);
		serie.setTitulo("Breaking Bad");		
		cadastro.setSerie(serie);
		
		lista.add(cadastro);
		
		for (Cadastro cad : lista) {
			System.out.println("Nome do Filme: " + cad.getFilme().getTitulo());
		}
		
		
		
		System.out.println("Nome do Admin: " + cadastro.getAdmin().getNome());

	}

}
