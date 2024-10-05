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
		Cadastro cadastro;

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
				
				cadastro = new Cadastro();
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

			case 3:
				cdao = new CadastroDAO();
				cadastro = new Cadastro();
				
				//LISTANDO OS ITENS
				cdao.select();
				//SOLICITANDO O USU�RIO QUE ESCOLHA UM ITEM
				System.out.println("Selecione um dos itens acima para realizar a atualiza��o:");
				cadastro = cdao.select( Integer.parseInt(scan.next()));
				//APRESENTANDO AO USU�RIO A ESCOLHA DELE
				System.out.println("\n********** SUA ESCOLHA ********");
				System.out.println("\n********** Item:[ "+ cadastro.getId() +" ]********");
				System.out.println("NOME DO ADMIN : " + cadastro.getAdmin().getNome());
				System.out.println("NOME DO FILME : " + cadastro.getFilme().getTitulo());
				System.out.println("NOTA DO FILME : " + cadastro.getFilme().getNota());
				System.out.println("NOME DA S�RIE: " + cadastro.getSerie().getTitulo());
				System.out.println("NOTA DA S�RIE: " + cadastro.getSerie().getNota());
				System.out.println("*********************\n");
				
				System.out.println("\nAtualize o ano do filme: ");
				cadastro.getFilme().setAno( Integer.parseInt(scan.next()) );
				System.out.println("\nAtualize a bilheteria: ");
				cadastro.getFilme().setBilheteria(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize a nota do Filme: ");
				cadastro.getFilme().setNota(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize o T�tulo do Filme: ");
				cadastro.getFilme().setTitulo(scan.next());
				//Filme ATUALIZADO
				//Iniciando atualiza��o da S�RIE
				System.out.println("\nAtualize o ano da S�rie: ");
				cadastro.getSerie().setAno(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize a quantidade de Temporadas: ");
				cadastro.getSerie().setTemporada(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize a quantidade de Epis�dios: ");
				cadastro.getSerie().setEpisodios(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize a nota da S�rie: ");
				cadastro.getSerie().setNota(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize o T�tulo da S�rie: ");
				cadastro.getSerie().setTitulo(scan.next());
				//S�RIE ATUALIZADA
				//Executando o m�todo de atualiza��o no banco e verificando a
				// consist�ncia do processo!!
				if(cdao.update(cadastro)) {
					System.out.println("Obras atualizadas com SUCESSO!");
				}else {
					System.out.println("Ocorreu um erro ao realizar a atualiza��o!!");
				}
				break;
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
