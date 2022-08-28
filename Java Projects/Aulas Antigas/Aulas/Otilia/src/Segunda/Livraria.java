package Segunda;

import java.util.Scanner;

public class Livraria {

	public static void main(String[] args) {
		Scanner Leitor = new Scanner(System.in);
		LivroDeLivraria EmprestaLivro = new LivroDeLivraria();

		System.out.print("Escreva seu Nome: ");
		EmprestaLivro.NomePessoa = Leitor.next();
		
		System.out.print("Quantos Dias de Empréstimo :");
		EmprestaLivro.QtdDias = Leitor.nextInt();

		System.out.print("Nome do Livro: ");
		EmprestaLivro.NomeLivro = Leitor.next();
		
		System.out.print("Nome do Autor: ");
		EmprestaLivro.Autor = Leitor.next();
				
		
		System.out.println("Livro " +EmprestaLivro.NomeLivro+" foi emprestado para "+ EmprestaLivro.NomePessoa+" por "+EmprestaLivro.QtdDias+" dias.");
	}

}
