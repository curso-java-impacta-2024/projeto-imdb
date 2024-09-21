package com.imdb.teste;

import java.util.List;
import java.util.Scanner;

import com.imdb.data.Cadastro;
import com.imdb.data.dAO.CadastroDAO;

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
