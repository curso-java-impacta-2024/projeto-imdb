package com.imdb.teste;

import java.util.List;
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
			System.out.println("BEM VINDO AO SISTEMA DE GERENCIAMENTO");
			System.out.println("\nEscolha uma das op��es abaixo: ");
			System.out.println("\n1 - Listar Dados: ");
			System.out.println("\n2 - Cadastrar: ");
			System.out.println("\n3 - Atualizar: ");
			System.out.println("\n4 - Excluir: ");
			System.out.println("\n5 - Sair: ");

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
				

				admin.setCredencial("A");
				admin.setNome("Basualdo");
				admin.setEmail("basualdo@email.com");
				admin.setId(123456);		
				cadastro.setAdmin(admin);	
				
				System.out.println("Digite o Ano do Filme: ");
				filme.setAno(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a Bilheteria do Filme: ");
				filme.setBilheteria(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a Dura��o d Filme: ");				
				filme.setDuracao(Double.parseDouble(scan.next()));
				System.out.println("\nDigite a Nota do Filme: ");
				filme.setNota(Double.parseDouble(scan.next()));
				System.out.println("\nDigite o T�tulo do Filme: ");
				filme.setTitulo(scan.next());
				//Cadastro o Filme.
				cadastro.setFilme(filme);		
				
				System.out.println("\nDigite o ano da S�rie: ");
				serie.setAno(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a temporada da S�rie: ");
				serie.setTemporada(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o n�mero de Epis�dios da S�rie: ");
				serie.setEpisodios(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a Nota da S�rie: ");
				serie.setNota(Double.parseDouble(scan.next()));
				System.out.println("\nDigite o T�tulo da S�rie: ");
				serie.setTitulo(scan.next());
				//Cadastro a S�rie
				cadastro.setSerie(serie);

				//Executando o m�todo de inser��o no banco e verificando a
				// consist�ncia do processo!!
				if(cdao.insert(cadastro)) {
					System.out.println("Obras cadastradas com SUCESSO!");
				}else {
					System.out.println("Ocorreu um erro ao realizar o cadastro!!");
				}
				break;

			// case 3:
			case 4:
				cdao = new CadastroDAO();
				cdao.select();
				System.out.println("\nSELECIONE UM DOS ITENS ACIMA PARA EXCLUS�O");
				opt = Integer.parseInt(scan.next());

				if (cdao.delete(opt)) {
					System.out.println("\nItem exclu�do com sucesso");
				} else {
					System.out.println("\nOcorreu um erro durante o processo de exclus�o");
				}
				break;
			default:
				key = false;
				System.out.println("\n Obrigado por utilizar nossos servi�os");
			}

		}

		scan.close();

	}

}
