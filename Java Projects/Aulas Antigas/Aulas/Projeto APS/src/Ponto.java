import java.util.Calendar;
import java.util.Scanner;

public class Ponto {
	
	
	
	//Essa Fução puxa a data para o ponto
	public static Calendar pegaData(){
		Calendar data = Calendar.getInstance();
		return data;
		}
	
	public static void main(String[] args) {
		
		
		String[][] usuario = new String [5][1]; //Uma matriz para colocar o nome dos usuários
		
		Scanner leitor = new Scanner(System.in); 
		
		int mat,retorno = 0; //Variáveis de laço para o programa sempre continuar rodando
		
		//Usuários já cadastrados, por que não tem banco de dados
		usuario[0][0] = "Antónia Adriana Vasconcelos Freitas"; // Nome dos alunos dessa APS
		usuario[1][0] = "Lucas Souza Santiago";
		usuario[2][0] = "Taisia Evellin Marçal de Oliveira";
		usuario[3][0] = "Vitor Gabriel da Silva Alves";
		usuario[4][0] = "Leonardo Silveira";
		
		
		
		System.out.println("---BEM VINDO AO SISTEMA DE PONTO---"+"\nFeito pelos Alunos(as): \n---Adriana, Lucas, Taísia e Vitor---"); //Tela de boas vindas dos programa
		
		//while retorno fazendo um Laço infinito para sempre voltar a matrícula
		while(retorno != 1) {
			System.out.print("Digite a sua MATRÍCULA: ");
			mat = leitor.nextInt(); //nextInt Puxando a matrícula e inserindo na variável mat
			
			//while com a variável "mat", enquanto "mat" for diferente de 0 então faça
			while(mat != 0){
				//if com condição, para verificar se a matrícula dos usuários estão corretas
				if(mat == 1000) {
					System.out.print("======================================\n");
					//Print na tela mostrando o nome do usuário, Data, hora, confirmando o resgistro do ponto 
					System.out.println(usuario[0][0]+"\n"+pegaData().getTime()+"\nSEU PONTO FOI REGISTRADO COM SUCESSO!");
					mat = 0;//atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
				}else if(mat == 2000) {
					System.out.print("======================================\n");
					//Print na tela mostrando o nome do usuário, Data, hora, confirmando o resgistro do ponto 
					System.out.println(usuario[1][0]+"\n"+pegaData().getTime()+"\nSEU PONTO FOI REGISTRADO COM SUCESSO!");
					mat = 0;//atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
				}else if(mat == 3000) {
					System.out.print("======================================\n");
					//Print na tela mostrando o nome do usuário, Data, hora, confirmando o resgistro do ponto 
					System.out.println(usuario[2][0]+"\n"+pegaData().getTime()+"\nSEU PONTO FOI REGISTRADO COM SUCESSO!");
					mat = 0; //atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
				}else if(mat == 4000) {
					System.out.print("======================================\n");
					//Print na tela mostrando o nome do usuário, Data, hora, confirmando o resgistro do ponto 
					System.out.println(usuario[3][0]+"\n"+pegaData().getTime()+"\nSEU PONTO FOI REGISTRADO COM SUCESSO!");
					mat = 0;//atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
				}else if(mat == 5000) {
					System.out.print("======================================\n");
					//Print na tela mostrando o nome do usuário, Data, hora, confirmando o resgistro do ponto 
					System.out.println(usuario[4][0]+"\n"+pegaData().getTime()+"\nSEU PONTO FOI REGISTRADO COM SUCESSO!");
					mat = 0; //atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
					
					//else finalizando o if, se  não então o usuário não está registrado no sistema
				}else {
					System.out.print("======================================\n");
					System.out.println("---USUÁRIO NÃO REGISTRADO!---");
					mat = 0;//atribuindo valor 0 a variável "mat" para o laço parar e o programa prosseguir
				}
			}
		}
			leitor.close(); //Fechamento do scanner
		}
}