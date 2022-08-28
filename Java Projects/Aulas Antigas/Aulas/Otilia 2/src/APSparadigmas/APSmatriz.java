package APSparadigmas;

import java.util.Scanner;

public class APSmatriz {

	public static void main(String[] args) {
				//Chamando o Scanner como scan
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Tamanho da Matriz [C]: ");	//Pegando o tamanho da coluna
				int tamColuna = scan.nextInt();					//Atribuindo o tamanho da coluna na variável
				System.out.print("Tamanho da Matriz [L]: ");	//Pegando o tamanho da Linha
				int tamLinha = scan.nextInt();					//Atribuindo o tamanho da linha na variável
				int[][] matriz = new int[tamColuna][tamLinha];	//Declarando a matriz 
				
				
				for(int i = 0;i < tamColuna;i++) {					//Laço para coluna
					for(int j =0; j < tamLinha; j++) {				//Laço para linha
						matriz[i][j] = (int)(Math.random()*100);	//Atribuindo números aleatórois de 0 a 100
						System.out.println("Num: "+matriz[i][j]);	//Printando na tela os números da matriz
					}
					System.out.println("---------- "+i);	//Separação da coluna
				}
				scan.close(); 	//Finalizando o Scanner
			}
}//Fim
