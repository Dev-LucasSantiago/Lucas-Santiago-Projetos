import java.util.Scanner;

public class Nona {
//	Faça um programa que, dada a idade de uma pessoa, determine sua classificação de
//	idade: “maior de idade”, “menor de idade”, ou “pessoa idosa” (idade superior ou igual
//	a 65 anos).
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 65) {
			System.out.println("Pessoa Idosa!");
		}else if(idade >= 18) {
			System.out.println("Pessoa Adulta!");
			
		}else {
			System.out.println("Menor de Idade!");
		}
	}

}
