package APSparadigmas;

import java.util.Scanner;

public class APS {

	public static void main(String[] args) {
		//Scanner para pegar o tamanho dejesado do vetor
		Scanner scan = new Scanner(System.in);
		
		//Print na tela pegando o tamanho do vetor
		System.out.print("Tamanho do vetor: ");
		int tamanho = scan.nextInt();		//Variável do tipo inteiro recebendo o tamanho
		int[] vetor = new int[tamanho];		//Declaração de vetor do tipo inteiro
		
		//Laço com condição do tamanho do vetor
		for(int i = 0;i < tamanho;i++) {
			vetor[i] = (int)(Math.random()*100);	//Atribuindo um número de 0 a 100 em cada posição 
			System.out.println("Vetor de Numero "+i+" recebe: "+vetor[i]);	
			//Print mostrando Posição do vetor e o número recebido
		}
		scan.close(); //Encerrando o Scanner
	}

} //Fim
