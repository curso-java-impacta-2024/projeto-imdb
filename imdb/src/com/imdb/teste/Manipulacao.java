package com.imdb.teste;

import java.util.Scanner;

import com.imdb.data.dao.CadastroDAO;

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