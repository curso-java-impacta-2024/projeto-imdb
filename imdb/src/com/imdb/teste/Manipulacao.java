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
		Cadastro cadastro = new Cadastro();
		
		
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
			
			cadastro = new Cadastro();
			Admin admin = new Admin();
			admin.setNome("Mari");
			admin.setEmail("mari@mari.com");
			admin.setId(12345);
			admin.setCredencial("A");
			cadastro.setAdmin(admin);
			Filme filme = new Filme();
			Serie serie = new Serie();
			
			System.out.println("Digite o ano do filme: ");
			filme.setAno( Integer.parseInt(scan.next()) );
			System.out.println("\nDigite a bilheteria: ");
			filme.setBilheteria(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a duração: ");
			filme.setDuracao( Double.parseDouble(scan.next()));
			System.out.println("\nDigite a nota do Filme: ");
			filme.setNota(Integer.parseInt(scan.next()));
			System.out.println("\nDigite o Título do Filme: ");
			filme.setTitulo(scan.next());
			//Cadastrando o FILME
			cadastro.setFilme(filme);
			//Iniciando o preenchimento da SÉRIE
			System.out.println("\nDigite o ano da Série: ");
			serie.setAno(Integer.parseInt(scan.next()));
			System.out.println("\nDigite o a quantidade de Temporadas: ");
			serie.setTemporada(Integer.parseInt(scan.next()));
			System.out.println("\nDigite o a quantidade de Episódios: ");
			serie.setEpisodios(Integer.parseInt(scan.next()));
			System.out.println("\nDigite a nota da Série: ");
			serie.setNota(Integer.parseInt(scan.next()));
			System.out.println("\nDigite o Título da Série: ");
			serie.setTitulo(scan.next());
			//Cadastrando a SÉRIE
			cadastro.setSerie(serie);
			//Executando o método de inserção no banco e verificando a
			// consistência do processo!!
			if(cdao.insert(cadastro)) {
				System.out.println("Obras cadastradas com SUCESSO!");
			}else {
				System.out.println("Ocorreu um erro ao realizar o cadastro!!");
			}
			break;

			
		case 3:
			cdao = new CadastroDAO();
			cadastro = new Cadastro();
			cdao.select();
			
			System.out.println("Selecione um dos items para atualizacao");
			cadastro = cdao.select(Integer.parseInt(scan.next()));
			
			System.out.println("\n************ Item: [ " + cadastro.getId() + " ] ******************");
			System.out.println("nome do admin: " + cadastro.getAdmin().getNome());
			System.out.println("nome do filme: " + cadastro.getFilme().getTitulo());
			System.out.println("nota da filme: " + cadastro.getFilme().getNota());
			System.out.println("nome do serie: " + cadastro.getSerie().getTitulo());
			System.out.println("************************************************\n");
		
					
			
			System.out.println("Atualiza o nome do filme: ");
			cadastro.getFilme().setTitulo(scan.next());
			System.out.println("\nAtualize o ano do filme: ");
			cadastro.getFilme().setAno(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a Bilheteria do filme: ");
			cadastro.getFilme().setBilheteria(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a nota do Filme: ");
			cadastro.getFilme().setNota(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a duracao do Filme: ");
			cadastro.getFilme().setDuracao(Double.parseDouble(scan.next()));
			
			
			System.out.println("\nAtualize o ano da Série: ");
			cadastro.getSerie().setAno(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a quantidade de Temporadas: ");
			cadastro.getSerie().setTemporada(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a quantidade de Episódios: ");
			cadastro.getSerie().setEpisodios(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize a nota da Série: ");
			cadastro.getSerie().setNota(Integer.parseInt(scan.next()));
			System.out.println("\nAtualize o Título da Série: ");
			cadastro.getSerie().setTitulo(scan.next());
			
			
			//Executando o método de inserção no banco e verificando a
			// consistência do processo!!
			if(cdao.update(cadastro)) {
				System.out.println("Obras atualizadas com SUCESSO!");
			}else {
				System.out.println("Ocorreu um erro ao realizar a atualização!!");
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