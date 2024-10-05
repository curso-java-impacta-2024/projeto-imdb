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
			System.out.println("\nEscolha uma das op��es abaixo:");
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
				System.out.println("\nDigite a dura��o: ");
				filme.setDuracao( Double.parseDouble(scan.next()));
				System.out.println("\nDigite a nota do Filme: ");
				filme.setNota(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o T�tulo do Filme: ");
				filme.setTitulo(scan.next());
				//Cadastrando o FILME
				cadastro.setFilme(filme);
				//Iniciando o preenchimento da S�RIE
				System.out.println("\nDigite o ano da S�rie: ");
				serie.setAno(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o a quantidade de Temporadas: ");
				serie.setTemporada(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o a quantidade de Epis�dios: ");
				serie.setEpisodios(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a nota da S�rie: ");
				serie.setNota(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o T�tulo da S�rie: ");
				serie.setTitulo(scan.next());
				//Cadastrando a S�RIE
				cadastro.setSerie(serie);
				//Executando o m�todo de inser��o no banco e verificando a
				// consist�ncia do processo!!
				if(cdao.insert(cadastro)) {
					System.out.println("Obras cadastradas com SUCESSO!");
				}else {
					System.out.println("Ocorreu um erro ao realizar o cadastro!!");
				}
				break;
			case 4:
				cdao = new CadastroDAO();
				cdao.select();
				System.out.println("\nSELECIONE UM DOS ITENS ACIMA PARA EXCLUS�O!");
				opt = Integer.parseInt(scan.next());
				 if(cdao.delete(opt)){
					 System.out.println("\nItem exclu�do com SUCESSO!");
				 }else {
					 System.out.println("\nOcorreu um erro durante o processo de exclus�o!");
				 }
				break;
			default:
				key = false;
				System.out.println("\nObrigado por utilizar nossos servi�os!");
			}
		}

		scan.close();
		
		//Subindo para a main!

	}

}
