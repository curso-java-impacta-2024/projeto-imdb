package com.imdb.teste;

import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.data.dao.CadastroDAO;
import com.imdb.users.Admin;

public class Manipulacao {

	public Manipulacao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean key = true;
		int opt = 0;
		CadastroDAO cdao;

		while (key) {
			System.out.println("BEM VINDO AO SISTEMA DE GERIENCIAMENTO");
			System.out.println("\nEscolha uma das opções abaixo:");
			System.out.println("\n1 - Listar Dados:");
			System.out.println("\n2 - Cadastrar:");
			System.out.println("\n3 - Atualizar:");
			System.out.println("\n4 - Excluir:");
			System.out.println("\n5 - Sair:");

			opt = Integer.parseInt(scan.next());

			switch (opt) {
			case 1:
				cdao = new CadastroDAO();
				cdao.select();
				break;
			case 2:
				cdao = new CadastroDAO();
				
				Cadastro cadastro = new Cadastro();
				Admin admin = new Admin();
				Filme filme = new Filme();
				Serie serie = new Serie();
				
				//Criando o Administrador
				admin.setCredencial("A");
				admin.setNome("Basualdo");
				admin.setEmail("basualdo@email.com");
				admin.setId(123456);
				cadastro.setAdmin(admin);
				
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
			case 4:
				cdao = new CadastroDAO();
				cdao.select();
				System.out.println("\nSELECIONE UM DOS ITENS ACIMA PARA EXCLUSÃO!");
				opt = Integer.parseInt(scan.next());
				 if(cdao.delete(opt)){
					 System.out.println("\nItem excluído com SUCESSO!");
				 }else {
					 System.out.println("\nOcorreu um erro durante o processo de exclusão!");
				 }
				break;
			default:
				key = false;
				System.out.println("\nObrigado por utilizar nossos serviços!");
			}
		}

		scan.close();
		
		//Subindo para a main!

	}

}
