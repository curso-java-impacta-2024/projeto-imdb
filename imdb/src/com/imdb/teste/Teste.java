package com.imdb.teste;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Midia;
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
//		Filme filme = null;
//		//Criando o Filme
//		filme = new Filme();
//		filme.setAno(2024);
//		filme.setBilheteria(100000);
//		filme.setDuracao(3.50D);
//		filme.setNota(10);
//		filme.setTitulo("Deadpool e Wolverine");		
//		cadastro.setFilme(filme);		
//		
//		Serie serie = null;
//		serie = new Serie();
//		serie.setAno(2022);
//		serie.setTemporada(6);
//		serie.setEpisodios(65);
//		serie.setNota(6);
//		serie.setTitulo("Cobra Kai");		
//		cadastro.setSerie(serie);
//		
//		
//		List<Cadastro> lista = new ArrayList<Cadastro>();
//		
//		lista.add(cadastro);
//		
//		cadastro = new Cadastro();
//		cadastro.setAdmin(admin);
//	
//		filme = new Filme();
//		filme.setAno(2020);
//		filme.setBilheteria(200000);
//		filme.setDuracao(3.20D);
//		filme.setNota(10);
//		filme.setTitulo("Interestelar");		
//		cadastro.setFilme(filme);		
//		
//		serie = new Serie();
//		serie.setAno(2015);
//		serie.setTemporada(8);
//		serie.setEpisodios(80);
//		serie.setNota(10);
//		serie.setTitulo("Breaking Bad");		
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
//		try {
//			System.out.println("Digite o valor do primeiro número: ");
//			nr1 = Integer.parseInt(scan.next());		
//			System.out.println("Digite o valor do segundo número: ");		
//			nr2 = Integer.parseInt(scan.next());;
//		} catch(NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("Somente numero podem ser digitados: ");
//			nr1 = Integer.parseInt(scan.next());		
//			System.out.println("Digite o valor do segundo número: ");		
//			nr2 = Integer.parseInt(scan.next());;
//		}
//		
//		int resultado = 0;
//		
//		resultado = nr1 + nr2;
//		
//		System.out.println("O resultado da soma foi: " + resultado);;
		
		CadastroDAO cdao = new CadastroDAO();
		Cadastro cadastro = new Cadastro();
		Admin admin = new Admin();
		Filme filme = new Filme();
		Serie serie = new Serie();
		

		admin.setCredencial("A");
		admin.setNome("Basualdo");
		admin.setEmail("basualdo@email.com");
		admin.setId(123456);		
		cadastro.setAdmin(admin);	
		
		filme.setAno(2024);
		filme.setBilheteria(100000);
		filme.setDuracao(3.50D);
		filme.setNota(10);
		filme.setTitulo("Deadpool e Wolverine");		
		cadastro.setFilme(filme);		
		
		serie.setAno(2022);
		serie.setTemporada(6);
		serie.setEpisodios(65);
		serie.setNota(6);
		serie.setTitulo("Cobra Kai");		
		cadastro.setSerie(serie);
		
		//Executando o método de insert de CadastroDA.
		cdao.insert(cadastro);
		
		//Criando um List para recuperar o banco e mostrar no console.
		List<Cadastro> banco = null;
		
		//Executando o método select e retornando a lsita de cadastro para o banco local.
		banco = cdao.select();
		
//		cad = cdao.select(2);
//		
//		if (cad != null) {
//			System.out.println(cad.getFilme().getTitulo());
//		} else {
//			System.out.println("Registro não encontrado!");
//		}

	}

}
