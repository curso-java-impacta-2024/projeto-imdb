package com.imdb.teste;

import java.util.List;

import com.imdb.data.Cadastro;
import com.imdb.data.dAO.CadastroDAO;

public class Teste {

	public static void main(String[] args) {

//		Cadastro cadastro = new Cadastro();
//		
//		Admin admin = null;
//		//Criando o Administrador
//		admin = new Admin();
//		admin.setCredencial("A");
//		admin.setNome("Basualdo");
//		admin.setEmail("basualdo@email.com");
//		admin.setId(123456);
//		cadastro.setAdmin(admin);
//		
//		Filme filme = new Filme();
//		filme.setAno(2024);
//		filme.setBilheteria(10000);
//		filme.setDuracao(3.50D);
//		filme.setNota(10);
//		filme.setTitulo("DeadPool e Wolwerine");
//		cadastro.setFilme(filme);
//				
//		Serie serie = new Serie();
//		serie.setAno(2022);
//		serie.setTemporada(6);
//		serie.setEpisodios(65);
//		serie.setNota(10);
//		serie.setTitulo("Cobra Kai");
//		cadastro.setSerie(serie);
//		
//		List<Cadastro> lista = new ArrayList<Cadastro>();
//		
//		lista.add(cadastro);
//		
//		//==================================
//		
//		cadastro = new Cadastro();
//		cadastro.setAdmin(admin);
//		
//		filme = new Filme();
//		filme.setAno(2015);
//		filme.setBilheteria(2000);
//		filme.setDuracao(2.50D);
//		filme.setNota(5);
//		filme.setTitulo("Os Outros");
//		cadastro.setFilme(filme);
//				
//		serie = new Serie();
//		serie.setAno(2020);
//		serie.setTemporada(4);
//		serie.setEpisodios(40);
//		serie.setNota(4);
//		serie.setTitulo("UPLOAD");
//		cadastro.setSerie(serie);
//		
//		lista.add(cadastro);
//		
//		for (Cadastro cad : lista) {
//			System.out.println("Nome do Filme: " + cad.getFilme().getTitulo());
//		}
		
		
		//Erros
		//Exceções
		
		/*Scanner scan = new Scanner(System.in);
		
		int nr1 = 0;
		int nr2 = 0;
		
		try{
			System.out.println("Digite o valor do primeiro número :");
			nr1 = Integer.parseInt(scan.next());
			System.out.println("Digite o valor do segundo número :");		
			nr2 = Integer.parseInt(scan.next());
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Somente números podem ser digitados:");
			System.out.println("Digite o valor do primeiro número :");
			nr1 = Integer.parseInt(scan.next());
			System.out.println("Digite o valor do segundo número :");		
			nr2 = Integer.parseInt(scan.next());
		}
		
		int resultado = 0;
		
		resultado = nr1+nr2;
		
		System.out.println("O resultado da soma foi :" + resultado);
		*/
		
		
		CadastroDAO cdao = new CadastroDAO();
		Cadastro cad = new Cadastro();
		
		// Executando o m´w
		/*List<Cadastro> bancoLista = cdao.select();
		
		for(Cadastro cadastro : bancoLista) {
			
			System.out.println("******************************************");
			System.out.println("Nome do admin: " + cadastro.getAdmin().getNome());
			System.out.println("Nome do filme" + cadastro.getFilme().getTitulo());
			System.out.println("Nota do filme" + cadastro.getFilme().getNota());
			System.out.println("Nome da serie" + cadastro.getFilme().getTitulo());
			System.out.println("Nota da serie" + cadastro.getFilme().getNota());
			System.out.println("******************************************");
			
			
			
		}*/
		
		//cdao.select();
		
		
		cad = cdao.select(3);
		
		if(cad != null ) {
			
			System.out.println(cad.getFilme().getTitulo());
			
		} else {
			
			System.out.println("Registro não encontrado!");
			
		}
		
		
	}

}
