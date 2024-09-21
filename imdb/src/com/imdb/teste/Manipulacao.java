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
			key = false;
		case 2:
			
		}
	
		
		scan.close();
	}
		
		
  }
}