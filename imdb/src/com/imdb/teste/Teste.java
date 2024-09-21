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
	//
	public static void main(String[] args) {
		//
		// Cadastro cadastro = new Cadastro();
		//
		// etTitulo("DeadPool e Wolwerine");
		// cadastro.setFilme(filme);
		// // Criando Serie
		// serie.setAAdmin admin = null;
		// // Criando o Administrador
		// admin = new Admin();
		// admin.setCredencial("A");
		// admin.setNome("Basualdo");
		// admin.setEmail("basualdo@email.com");
		// admin.setId(123456);
		// cadastro.setAdmin(admin);
		//
		// Filme filme = new Filme();
		// filme.setAno(2024);
		// filme.setBilheteria(10000);
		// filme.setDuracao(3.50D);
		// filme.setNota(10);
		// filme.sno(2014);
		// serie.setTemporada(3);
		// serie.setEpisodios(2);
		// serie.setNota(8.5);
		// serie.setTitulo("True Detective");
		// cadastro.setSerie(serie);
		// // Adicionando a cadastro na lista
		// banco.add(cadastro);
		//
		// // ==================================
		// // Criando o Administrador
		// admin = new Admin();
		// admin.setCredencial("A");
		// admin.setNome("Basualdo");
		// admin.setEmail("basualdo@email.com");
		// admin.setId(123456);
		// cadastro.setAdmin(admin);
		// // Criando filme
		// filme.setAno(2022);
		// filme.setBilheteria(40000);
		// filme.setDuracao(2.50D);
		// filme.setNota(7);
		// filme.setTitulo("Lady Bug");
		// cadastro.setFilme(filme);
		// // Criando Serie
		// serie.setAno(2022);
		// serie.setTemporada(6);
		// serie.setEpisodios(65);
		// serie.setNota(10);
		// serie.setTitulo("Cobra Kai");
		// cadastro.setSerie(serie);
		// // Adicionando a cadastro na lista
		// banco.add(cadastro);

		// cadastro = new Cadastro();
		// cadastro.setAdmin(admin);
		//
		// filme = new Filme();
		// filme.setAno(2015);
		// filme.setBilheteria.50D);
		// filme.setNota(5);
		// filme.setTitulo("Os Outros");
		// cadastro.setFilme(filme);
		//
		// serie = new Serie();
		// serie.setAno(2020);
		// serie.setTemporada(4);
		// serie.setEpisodios(40);
		// serie.setNota(4);
		// serie.setTitulo("UPLOAD");
		// cadastro.setSerie(serie);
		//
		// lista.add(cadastro);
		// for (Cadastro cad : lista) {
		// System.out.println("Nome do Filme: " + cad.getFilme().getTitulo());
		// }

		// Erros
		// Exceções

		// Scanner scan = new Scanner(System.in);
		//
		// int nr1 = 0;
		// int nr2 = 0;
		//
		// try {
		// System.out.println("Digite o valor do primeiro número :");
		// nr1 = Integer.parseInt(scan.next());
		// System.out.println("Digite o valor do segundo número :");
		// nr2 = Integer.parseInt(scan.next());
		// } catch (NumberFormatException e) {
		// e.printStackTrace();
		// System.out.println("Somente números podem ser digitados:");
		// System.out.println("Digite o valor do primeiro número :");
		// nr1 = Integer.parseInt(scan.next());
		// System.out.println("Digite o valor do segundo número :");
		// nr2 = Integer.parseInt(scan.next());
		// }
		//
		// int resultado = 0;
		//
		// resultado = nr1 + nr2;
		//
		// System.out.println("O resultado da soma foi :" + resultado);
		//
		CadastroDAO cdao = new CadastroDAO(null);
		Cadastro cad = new Cadastro();
		// Executando o metodo select e retornando a lista de casdastro.
//		List<Cadastro> bancoLista = cdao.select();

//		for (Cadastro cadastro : bancoLista) {
//			System.out.println("***********************");
//			System.out.println("NOME DO ADMIN : " + cadastro.getAdmin().getNome());
//			System.out.println("NOME DO FILME : " + cadastro.getFilme().getTitulo());
//			System.out.println("NOME DO FILME : " + cadastro.getFilme().getNota());
//			System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getTitulo());
//			System.out.println("NOME DO SÈRIE : " + cadastro.getSerie().getNota());
//			System.out.println("***********************");
//
//		}
		cad = cdao.select(2);
		if(cad != null) {
			System.out.println(cad.getFilme().getTitulo());
		}else {
			System.out.println("Resgistro não encontrado !");
		}
	}
}
