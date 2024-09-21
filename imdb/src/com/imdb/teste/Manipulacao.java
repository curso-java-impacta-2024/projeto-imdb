package com.imdb.teste;

import java.util.List;
import java.util.Scanner;
import com.imdb.data.Cadastro;
import com.imdb.data.dao.CadastroDAO;

public class Manipulacao {

	public Manipulacao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		boolean key = true;
		int opt = 0;
		CadastroDAO cdao;

		while (key) {
			System.out.println("BEM VINDO AO SISTEMA DE GERENCIAMENTO");
			System.out.println("\n escolha uma das opções abaixo");
			System.out.println("\n1 - Listar Dados:");
			System.out.println("\n2 - Cadastra:");
			System.out.println("\n3 - Atualizar:");
			System.out.println("\n4 - Excluir:");
			System.out.println("\n5 - Sair:");

			opt = Integer.parseInt(scan.next());

			switch (opt) {
			case 1:
				cdao = new CadastroDAO();
				

			}

		}

		scan.close();

	}

}
