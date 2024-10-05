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

		//Instance
		//Cadastro cadastro = new Cadastro();
		Admin admin = new Admin();
		admin.setNome("Mari");
		admin.setEmail("mari@mari.com");
		admin.setId(1);
//		admin.setCredencial("A");
//		cadastro.setAdmin(admin);
//		
		Filme filme = new Filme();
//		filme.setTitulo("Titanic");
//		filme.setAno(1997);
//		filme.setBilheteria(10000000);
//		filme.setNota(9);
//		filme.setDuracao(3.0D);
//		cadastro.setFilme(filme);
//		
		Serie serie = new Serie();
//		serie.setTitulo("The Big Bang Theory");
//		serie.setAno(2019);
//		serie.setTemporada(12);
//		serie.setEpisodios(279);
//		cadastro.setSerie(serie);
//		
//		String nome[] = new String[3]; //aqui � um array determinado com posicoes fixas
//		nome[0] = "mari";
//		nome[1] = "janu";
//		nome[2] = "jackson";
//		
//		ArrayList<String> al = new ArrayList<String>(); nesse nao tem posicoes fixas
//		al.add("mari");
//		al.add("janu");
//		
//		List<Cadastro> lista = new ArrayList<Cadastro>();
//		lista.add(cadastro);
//		
//		//================================================
//		
		//cadastro = new Cadastro();
		//cadastro.setAdmin(admin);
		
//		filme = new Filme();
//		filme.setTitulo("Meu Malvado favorito");
//		filme.setAno(2020);
//		filme.setBilheteria(10000000);
//		filme.setNota(9);
//		filme.setDuracao(2.30D);
//		cadastro.setFilme(filme);
//		
//		serie = new Serie();
//		serie.setTitulo("Bridgerton");
//		serie.setAno(2023);
//		serie.setTemporada(8);
//		serie.setEpisodios(73);
//		cadastro.setSerie(serie);
//		
//		lista.add(cadastro);
//		
//		for (Cadastro cadastro2 : lista) {
//			System.out.println("Nome do Filme: " + cadastro2.getFilme().getTitulo());
//			//System.out.println("Nome do admin cadastrado: " + cadastro2.getAdmin().getNome());
//		}
//		

		
		//CadastroDAO cdao = new CadastroDAO();
		//executando o metodo select para simular consulta Database
		//List<Cadastro> bancoLista = cdao.select();
		
		//varrendo a lista e exibindo as infos 
//		for(Cadastro cadastro : bancoLista) {
//			System.out.println("nome do admin: " + cadastro.getAdmin().getNome());
//			System.out.println("nome do filme: " + cadastro.getFilme().getTitulo());
//			System.out.println("nota da filme: " + cadastro.getFilme().getNota());
//			System.out.println("nome do serie: " + cadastro.getSerie().getTitulo());
//			System.out.println("************************************************");
//		}
	
//		CadastroDAO cdao = new CadastroDAO();
//		Cadastro cad = new Cadastro();
		
		//METODO SELECT PARAR RECUPERAR INFO DO "BANCO"
//		cad = cdao.select(4);
//		
//		if(cad != null) {
//			System.out.println(cad.getFilme().getTitulo());
//		}else {
//			System.out.println("Registro n�o encontrado.");	
//		}
		
		
		//METODO INSERT / CADASTRAR NOVO OBJETO NO "BANCO"
		
//		cdao.insert(cadastro);
//		// cria uma lista 
//		List<Cadastro> banco = null;
//		
//		//executa o select para verificar se foi adicionado
//		banco = cdao.select();
//		
		
		// METODO UPDATE
		CadastroDAO cdao = new CadastroDAO();
		
		//imprimindo a lista 
		cdao.select();
		
		
		//recuperando o objeto para Editar
		Cadastro cadastro = cdao.select(3);
		
		//atualizando Filme
		cadastro.getFilme().setTitulo("Lady Bugada");
		cadastro.getFilme().setAno(2020);
		cadastro.getFilme().setBilheteria(10000000);
		cadastro.getFilme().setNota(3);
		cadastro.getFilme().setDuracao(2.3D);
		
		//chamando o metodo update
		cdao.update(cadastro);
		
		//imprimindo a lista para conferir alteracoes
		cdao.select();
						
		
		
	}

}
