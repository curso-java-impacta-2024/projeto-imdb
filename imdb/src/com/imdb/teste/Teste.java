package com.imdb.teste;

import java.util.ArrayList;
import java.util.List;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.users.Admin;

public class Teste {

	public static void main(String[] args) {

		//Instance
		Cadastro cadastro = new Cadastro();
		Admin admin = new Admin();
		admin.setNome("Mari");
		admin.setEmail("mari@mari.com");
		admin.setId(1);
		admin.setCredencial("A");
		cadastro.setAdmin(admin);
		
		Filme filme = new Filme();
		filme.setTitulo("Titanic");
		filme.setAno(1997);
		filme.setBilheteria(10000000);
		filme.setNota(9);
		filme.setDuracao(3.0D);
		cadastro.setFilme(filme);
		
		Serie serie = new Serie();
		serie.setTitulo("The Big Bang Theory");
		serie.setAno(2019);
		serie.setTemporada(12);
		serie.setEpisodios(279);
		cadastro.setSerie(serie);
		
		String nome[] = new String[3]; //aqui é um array determinado com posicoes fixas
		nome[0] = "mari";
		nome[1] = "janu";
		nome[2] = "jackson";
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("mari");
		al.add("janu");
		
		List<Cadastro> lista = new ArrayList<Cadastro>();
		lista.add(cadastro);
		
		//================================================
		
		cadastro = new Cadastro();
		cadastro.setAdmin(admin);
		
		filme = new Filme();
		filme.setTitulo("Bastardos Inglorios");
		filme.setAno(2009);
		filme.setBilheteria(10000000);
		filme.setNota(9);
		filme.setDuracao(2.30D);
		cadastro.setFilme(filme);
		
		serie = new Serie();
		serie.setTitulo("Game of Thrones");
		serie.setAno(2019);
		serie.setTemporada(8);
		serie.setEpisodios(73);
		cadastro.setSerie(serie);
		
		lista.add(cadastro);
		
		for (Cadastro cadastro2 : lista) {
			System.out.println("Nome do Filme: " + cadastro2.getFilme().getTitulo());
			//System.out.println("Nome do admin cadastrado: " + cadastro2.getAdmin().getNome());
		}
		
		
	
	}

}
