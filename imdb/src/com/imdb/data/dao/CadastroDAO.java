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
		
		if(banco == null) {
		
			banco = new ArrayList<Cadastro>();
		
			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			Serie serie = new Serie();
			Filme filme = new Filme();
			
			//cadastro 1 
			//criando Admin
			admin.setNome("Mari");
			admin.setEmail("mari@mari.com");
			admin.setId(1);
			admin.setCredencial("A");
			cadastro.setAdmin(admin);
			
			//criando Filme
			filme.setTitulo("Titanic");
			filme.setAno(1997);
			filme.setBilheteria(10000000);
			filme.setNota(9);
			filme.setDuracao(3.0D);
			cadastro.setFilme(filme);
			
			//criando Serie
			serie.setTitulo("The Big Bang Theory");
			serie.setAno(2019);
			serie.setTemporada(12);
			serie.setEpisodios(279);
			cadastro.setSerie(serie);
			
			//adicionando  cadastro na lista
			banco.add(cadastro);
			
			//=====================================================
			
			//cadastro 2
			//criando Admin
			Cadastro cadastro2 = new Cadastro();
			Serie serie2 = new Serie();
			Filme filme2 = new Filme();
			cadastro2.setAdmin(admin);
					
			//criando Filme
			filme2.setTitulo("Bastardos Inglorios");
			filme2.setAno(2009);
			filme2.setBilheteria(10000000);
			filme2.setNota(9);
			filme2.setDuracao(2.3D);
			cadastro2.setFilme(filme2);
					
			//criando Serie
			serie2.setTitulo("Game of Thrones");
			serie2.setAno(2011);
			serie2.setTemporada(8);
			serie2.setEpisodios(73);
			cadastro2.setSerie(serie2);
					
			//adicionando  cadastro na lista
			banco.add(cadastro2);
			
			//=======================================================
			
			//cadastro 3
			//criando Admin
			Cadastro cadastro3 = new Cadastro();
			Serie serie3 = new Serie();
			Filme filme3 = new Filme();
			cadastro3.setAdmin(admin);
							
			//criando Filme
			filme3.setTitulo("A Lista de Schindler");
			filme3.setAno(1993);
			filme3.setBilheteria(10000000);
			filme3.setNota(9);
			filme3.setDuracao(2.3D);
			cadastro3.setFilme(filme3);
							
			//criando Serie
			serie3.setTitulo("Dexter");
			serie3.setAno(2006);
			serie3.setTemporada(8);
			serie3.setEpisodios(96);
			cadastro3.setSerie(serie3);
							
			//adicionando  cadastro na lista
			banco.add(cadastro3);
		}	
		
	}
	
	public void select(){
		for(Cadastro cadastro : banco) {
			System.out.println("nome do admin: " + cadastro.getAdmin().getNome());
			System.out.println("nome do filme: " + cadastro.getFilme().getTitulo());
			System.out.println("nota da filme: " + cadastro.getFilme().getNota());
			System.out.println("nome do serie: " + cadastro.getSerie().getTitulo());
			System.out.println("************************************************");
		}
	}

}
