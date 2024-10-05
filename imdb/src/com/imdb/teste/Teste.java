package com.imdb.teste;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.data.dao.CadastroDAO;
import com.imdb.users.Admin;

public class Teste {

	public static void main(String[] args) {

//		Cadastro cadastro = new Cadastro();
//		
//		Admin admin = null;
//		//Criando o Administrador
//		admin = new Admin();
//		admin.setCredencial("A");
//		admin.setNome("Basualdo");
//		admin.setEmail("basualdo@email.com");
//		admin.setId(123456);
//		cadastro.setAdmin(admin);
//		
//		Filme filme = new Filme();
//		filme.setAno(2024);
//		filme.setBilheteria(10000);
//		filme.setDuracao(3.50D);
//		filme.setNota(10);
//		filme.setTitulo("DeadPool e Wolwerine");
//		cadastro.setFilme(filme);
//				
//		Serie serie = new Serie();
//		serie.setAno(2022);
//		serie.setTemporada(6);
//		serie.setEpisodios(65);
//		serie.setNota(10);
//		serie.setTitulo("Cobra Kai");
//		cadastro.setSerie(serie);
//		
//		List<Cadastro> lista = new ArrayList<Cadastro>();
//		
//		lista.add(cadastro);
//		
//		//==================================
//		
//		cadastro = new Cadastro();
//		cadastro.setAdmin(admin);
//		
//		filme = new Filme();
//		filme.setAno(2015);
//		filme.setBilheteria(2000);
//		filme.setDuracao(2.50D);
//		filme.setNota(5);
//		filme.setTitulo("Os Outros");
//		cadastro.setFilme(filme);
//				
//		serie = new Serie();
//		serie.setAno(2020);
//		serie.setTemporada(4);
//		serie.setEpisodios(40);
//		serie.setNota(4);
//		serie.setTitulo("UPLOAD");
//		cadastro.setSerie(serie);
//		
//		lista.add(cadastro);
//		
//		for (Cadastro cad : lista) {
//			System.out.println("Nome do Filme: " + cad.getFilme().getTitulo());
//		}
		
		
		//Erros
		//Exceções
		
//		Scanner scan = new Scanner(System.in);
//		
//		int nr1 = 0;
//		int nr2 = 0;
//		
//		try{
//			System.out.println("Digite o valor do primeiro número :");
//			nr1 = Integer.parseInt(scan.next());
//			System.out.println("Digite o valor do segundo número :");		
//			nr2 = Integer.parseInt(scan.next());
//		}catch(NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("Somente números podem ser digitados:");
//			System.out.println("Digite o valor do primeiro número :");
//			nr1 = Integer.parseInt(scan.next());
//			System.out.println("Digite o valor do segundo número :");		
//			nr2 = Integer.parseInt(scan.next());
//		}
//		
//		int resultado = 0;
//		
//		resultado = nr1+nr2;
//		
//		System.out.println("O resultado da soma foi :" + resultado);
		
		CadastroDAO cdao = new CadastroDAO();
		Cadastro cadastro = null;
		Admin admin = new Admin();
		Filme filme = new Filme();
		Serie serie = new Serie();
		
//		//IMPRIMINDO A LISTA DE DADOS PARA VER COMO ESTAVA ANTES
//		cdao.select();
		
		//Recuperando um objeto para EDITAR através do método select(id)
			cadastro = cdao.select(2);
		// Alterando o FILME
			cadastro.getFilme().setAno(2020);
			cadastro.getFilme().setBilheteria(3000);
			cadastro.getFilme().setDuracao(3.50D);
			cadastro.getFilme().setNota(3);
			cadastro.getFilme().setTitulo("Lady Bugada");
		//Chamando o método UPDATE e inserindo o objeto cadastro alterado
		cdao.update(cadastro);
		
		//IMPRIMINDO A LISTA DE DADOS PARA CONFERIR AS ALTERAÇÕES
		cdao.select();
			
//		
//		//Criando o Administrador
//		admin.setCredencial("A");
//		admin.setNome("Basualdo");
//		admin.setEmail("basualdo@email.com");
//		admin.setId(123456);
//		cadastro.setAdmin(admin);
//		
//		filme.setAno(2023);
//		filme.setBilheteria(4000);
//		filme.setDuracao(3.50D);
//		filme.setNota(5);
//		filme.setTitulo("MINIONS");
//		cadastro.setFilme(filme);
//
//		serie.setAno(2021);
//		serie.setTemporada(3);
//		serie.setEpisodios(22);
//		serie.setNota(3);
//		serie.setTitulo("TEMPEST");
//		cadastro.setSerie(serie);
		
		//Executando o método de insert de CadastroDAO
//		cdao.insert(cadastro);
		
		//Criando um List para recuperar o banco e mostrar no console:
//		List<Cadastro> banco = null;
		
		//Executando o método select e retornando a lista de cadastro para
		// o banco local
		
//		banco = cdao.select();
		
//		cad = cdao.select(3);
//		
//		if(cad != null) {
//			System.out.println(cad.getFilme().getTitulo());
//		}else {
//			System.out.println("Registro não encontrado!");
//		}
		
		
		
		
//		Filme filme = new Filme();
//		Filme filme2 = new Filme();
//		
//		filme.setTitulo("FILME");
//		filme2.setTitulo("FILME");
//		
//		if(filme == filme2) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//		
//		System.out.println(filme);
//		System.out.println(filme2);
		
	}

}
