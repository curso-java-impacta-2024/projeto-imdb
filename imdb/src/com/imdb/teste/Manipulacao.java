package com.imdb.teste;

import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.data.dao.CadastroDAO;
import com.imdb.users.Admin;

public class Manipulacao {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean key = true;
		int opt = 0;
		CadastroDAO cdao;
		
		while(key) {
		System.out.println("Bem vindo ao sistema de Gerenciamento");
		System.out.println("\nSelecione uma das opções abaixo");
		System.out.println("\n1 - Listar Dados");
		System.out.println("\n2 - Cadastrar");
		System.out.println("\n3 - Atualizar");
		System.out.println("\n4 - Excluir");
		System.out.println("\n5 - Sair");
		
		opt = Integer.parseInt(scan.next());
		
		switch(opt) {
		case 1: 
			cdao = new CadastroDAO();
			cdao.select();
			break;
		case 2:
			cdao = new CadastroDAO();
			
			Cadastro cadastro = new Cadastro();
			Admin admin = new Admin();
			admin.setNome("Mari");
			admin.setEmail("mari@mari.com");
			admin.setId(1);
			cadastro.setAdmin(admin);
			Filme filme = new Filme();
			Serie serie = new Serie();
			//filme = new Filme();
			
			System.out.println("Digite o nome do Filme: ");
			filme.setTitulo(scan.next());
			System.out.println("\nDigite o ano do Filme: ");
			filme.setAno(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a bilheteria do Filme: ");
			filme.setBilheteria(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a nota do Filme: ");
			filme.setNota(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a nota do Filme: ");
			filme.setDuracao(Double.parseDouble(scan.next()));
			cadastro.setFilme(filme);
			
			//serie = new Serie();
			System.out.println("Digite o nome da Serie: ");
			serie.setTitulo(scan.next());
			System.out.println("\nDigite o ano da Serie: ");
			serie.setAno(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a quantidade de temporadas: ");
			serie.setTemporada(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a quantidade de episodios: ");
			serie.setEpisodios(Integer.parseInt(scan.next()));
			cadastro.setSerie(serie);
			
			
			//Executando o método de inserção no banco e verificando a
			// consistência do processo!!
			if(cdao.insert(cadastro)) {
				System.out.println("Obras cadastradas com SUCESSO!");
			}else {
				System.out.println("Ocorreu um erro ao realizar o cadastro!!");
			}
			
			break; 
			
		case 4:
			cdao = new CadastroDAO();
			cdao.select();
			System.out.println("\nSelecione um item para excluir");
			opt = Integer.parseInt(scan.next());
			
			if(cdao.delete(opt)) {
				System.out.println("\nItem excluído");
			}else {
				System.out.println("\nOcorreu um erro durante o processo");
			}
			break;
		default:
			key = false;
			System.out.println("Obrigado por utilizar nossos serviços!");
		}
	
		
	}
		
	scan.close();		
  }
}