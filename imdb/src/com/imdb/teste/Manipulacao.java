package com.imdb.teste;

import java.util.List;
import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.Filme;
import com.imdb.data.Serie;
import com.imdb.data.dAO.CadastroDAO;
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
		
		while(key) {
			
			System.out.println("BEM VINDO AO SISTEMA DE GERENCIAMENTO");
			System.out.println("\nEscolha uma das op��es abaixo:");
			System.out.println("\n - Listar Dados:");
			System.out.println("\n - Cadastrar:");
			System.out.println("\n - Atualizar:");
			System.out.println("\n - Excluir:");
			
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
				filme.setAno(Integer.parseInt(scan.next()) );
				System.out.println("\n Digite a bilheteria: ");
				filme.setBilheteria(Integer.parseInt(scan.next()));
				System.out.println("\n Digite a dura��o:");
				filme.setDuracao(Double.parseDouble(scan.next()));
				System.out.println("\n Digite a nota do filme:");
				filme.setNota(Integer.parseInt(scan.next()));
				System.out.println("\n Digite o titulo do filme:");
				filme.setTitulo(scan.next());
				cadastro.setFilme(filme);

				System.out.println("Digite o ano da S�rie: ");
				serie.setAno(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a quantidade de Temporadas: ");
				serie.setTemporada(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a quantidade de Epis�dios: ");
				serie.setEpisodios(Integer.parseInt(scan.next()));
				System.out.println("\nDigite a nota da Serie: ");
				serie.setNota(Integer.parseInt(scan.next()));
				System.out.println("\nDigite o titulo da serie: ");
				serie.setTitulo(scan.next());
				
				cadastro.setSerie(serie);


				// Executando om�todo deinsert de CadastroDAO
				cdao.insert(cadastro);
				
				
				
				
			case 4:
				cdao = new CadastroDAO();
				cdao.select();
				System.out.println("\n SELECIONE UM DOS ITENS ACIMA PARA EXCLUS�O");
				opt = Integer.parseInt(scan.next());
				
				  if(cdao.delete(opt)){
					System.out.println("\nItem excluido com SUCESSO! ");
				} else {
					
					System.out.println("\nOcorreu um erro durante o processo de exclus�o!");
					
				};
				break;
				
			default:
				key = false;
				System.out.println("\nObrigado por utilizar nossos servi�os");
				
				
			}
			
		
				
		}
		
		
		
		
		scan.close();
		
	

	}

}
