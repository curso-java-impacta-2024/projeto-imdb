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
			System.out.println("\nEscolha uma das opções abaixo: ");
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
				System.out.println("\nDigite a Duração d Filme: ");				
				filme.setDuracao(Double.parseDouble(scan.next()));
				System.out.println("\nDigite a Nota do Filme: ");
				filme.setNota(Double.parseDouble(scan.next()));
				System.out.println("\nDigite o Título do Filme: ");
				filme.setTitulo(scan.next());
				//Cadastro o Filme.
				cadastro.setFilme(filme);		
				
				System.out.println("\nDigite o ano da Série: ");
				serie.setAno(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a temporada da Série: ");
				serie.setTemporada(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o número de Episódios da Série: ");
				serie.setEpisodios(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a Nota da Série: ");
				serie.setNota(Double.parseDouble(scan.next()));
				System.out.println("\nDigite o Título da Série: ");
				serie.setTitulo(scan.next());
				//Cadastro a Série
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
				
				//LISTANDO OS ITENS
				cdao.select();
				//SOLICITANDO O USUÁRIO QUE ESCOLHA UM ITEM
				System.out.println("Selecione um dos itens acima para realizar a atualização:");
				cadastro = cdao.select( Integer.parseInt(scan.next()));
				//APRESENTANDO AO USUÁRIO A ESCOLHA DELE
				System.out.println("\n********** SUA ESCOLHA ********");
				System.out.println("\n********** Item:[ "+ cadastro.getId() +" ]********");
				System.out.println("NOME DO ADMIN : " + cadastro.getAdmin().getNome());
				System.out.println("NOME DO FILME : " + cadastro.getFilme().getTitulo());
				System.out.println("NOTA DO FILME : " + cadastro.getFilme().getNota());
				System.out.println("NOME DA SÉRIE: " + cadastro.getSerie().getTitulo());
				System.out.println("NOTA DA SÉRIE: " + cadastro.getSerie().getNota());
				System.out.println("*********************\n");
				
				System.out.println("\nAtualize o ano do filme: ");
				cadastro.getFilme().setAno( Integer.parseInt(scan.next()) );
				System.out.println("\nAtualize a bilheteria: ");
				cadastro.getFilme().setBilheteria(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize a nota do Filme: ");
				cadastro.getFilme().setNota(Integer.parseInt(scan.next()));
				System.out.println("\nAtualize o Título do Filme: ");
				cadastro.getFilme().setTitulo(scan.next());
				//Filme ATUALIZADO
				//Iniciando atualização da SÉRIE
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
				//SÉRIE ATUALIZADA
				//Executando o método de atualização no banco e verificando a
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
				System.out.println("\nSELECIONE UM DOS ITENS ACIMA PARA EXCLUSÃO");
				opt = Integer.parseInt(scan.next());

				if (cdao.delete(opt)) {
					System.out.println("\nItem excluído com sucesso");
				} else {
					System.out.println("\nOcorreu um erro durante o processo de exclusão");
				}
				break;
			default:
				key = false;
				System.out.println("\n Obrigado por utilizar nossos serviços");
			}

		}

		scan.close();

	}

}
