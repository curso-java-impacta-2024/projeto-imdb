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
			filme.setId(1);
			filme.setAno(2024);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("DeadPool e Wolwerine");
			cadastro.setFilme(filme);
			cadastro.setId(1);

			
			serie = new Serie();
			// Criando a série
			serie.setId(1);
			serie.setAno(2022);
			serie.setTemporada(6);
			serie.setEpisodios(65);
			serie.setNota(10);
			serie.setTitulo("Cobra Kai");
			cadastro.setSerie(serie);
			cadastro.setId(1);

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
			filme.setId(2);
			filme.setAno(2024);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("Batman");
			cadastro.setFilme(filme);
			cadastro.setId(2);
			
			serie = new Serie();

			// Criando a série
			serie.setId(2);
			serie.setAno(2022);
			serie.setTemporada(3);
			serie.setEpisodios(65);
			serie.setNota(5);
			serie.setTitulo("Street food");
			cadastro.setSerie(serie);
			cadastro.setId(2);
			
			
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
			filme.setId(3);
			filme.setAno(2023);
			filme.setBilheteria(10000);
			filme.setDuracao(3.50D);
			filme.setNota(10);
			filme.setTitulo("Vingadores");
			cadastro.setFilme(filme);
			cadastro.setId(3);

			
			serie = new Serie();
			// Criando a série
			serie.setId(3);
			serie.setAno(2022);
			serie.setTemporada(3);
			serie.setEpisodios(65);
			serie.setNota(8.5);
			serie.setTitulo("CSI");
			cadastro.setSerie(serie);
			cadastro.setId(3);

			banco.add(cadastro);

		}

	}

	 Cadastro cadastro =  new Cadastro();
	
	 public List<Cadastro> select() {
		 
		 
		 for (Cadastro cadastro : banco ) {

				System.out.println("\n**********Item:["+ cadastro.getId() + "]**********");
				System.out.println("Nome do admin: " + cadastro.getAdmin().getNome());
				System.out.println("Nome do filme" + cadastro.getFilme().getTitulo());
				System.out.println("Nota do filme" + cadastro.getFilme().getNota());
				System.out.println("Nome da serie" + cadastro.getFilme().getTitulo());
				System.out.println("Nota da serie" + cadastro.getFilme().getNota());
				System.out.println("*********************\n");
				
			 
		 }
		 
		 return banco;
		 
		
	 }
	 
	 public Cadastro select(int id) {
		 
		 for(int x = 0 ; x < banco.size(); x++) {
			 if (banco.get(x).getId() == id) {
				 
				 return banco.get(x);
				 
			 }
		 }
		 
		 return null;
		
		 
	 }
	 
	 public boolean delete(int id) {
		 
		 if(banco.remove(select(id))) {
			 
			 return true;
			 
		 }
		 
		 return false;
		 
	 }

	 
	 public boolean insert(Cadastro cadastro) {
		 
		 int idCad = 0;
		 int idFilme = 0;
		 int idSerie = 0;
		 
		 Cadastro ultimoObj = banco.get(banco.size() - 1);
		 
		 idCad = ultimoObj.getId()+1;
		 idFilme = ultimoObj.getFilme().getId() + 1;
		 idSerie = ultimoObj.getSerie().getId() + 1;
		 
		 
		 cadastro.setId(idCad);
		 cadastro.getFilme().setId(idFilme);
		 cadastro.getSerie().setId(idSerie);
		 
		 
		 
		 
		 return banco.add(cadastro);
		 
	 }

	 
	 public boolean update(Cadastro cadastro)  {
		 	 
		 for(int x = 0; x < banco.size(); x++) {
			 
			 if (banco.get(x).getId() == cadastro.getId()) {
			
				 banco.set(x,cadastro);
				 
				 
				 
				 
				 return true;
				 
			 }
			 
		 }
		 
		 return false;
		 
		 
	 }
	 
	 	
}


