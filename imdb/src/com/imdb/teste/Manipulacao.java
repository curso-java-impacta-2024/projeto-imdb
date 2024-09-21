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
			System.out.println("\nEscolha uma das opções abaixo:");
			System.out.println("\n - Listar Dados:");
			System.out.println("\n - Cadastrar:");
			System.out.println("\n - Atualizar:");
			System.out.println("\n - Excluir:");
			
			opt = Integer.parseInt(scan.next());
			
			
			switch (opt) {
			case 1:
				cdao = new CadastroDAO();
				cdao.select();
				
			}
			
			
		}
		
		
		
		
		scan.close();
		
		
		

	}

}
