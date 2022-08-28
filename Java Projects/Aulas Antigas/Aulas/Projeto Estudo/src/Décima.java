import java.util.Scanner;

public class Décima {
	/* Faça um algoritmo para ler: a quantidade adquirida e o preço unitário. Calcular e
	escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a
	pagar (total a pagar = total - desconto), sabendo-se que:
	- Se quantidade <= 5 o desconto será de 2%
	- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
	- Se quantidade > 10 o desconto será de 5% */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double qtdUnit, preçoUnit, total, desconto;
		
		System.out.println("Digite a quantidade do produto: ");
		qtdUnit = entrada.nextDouble();
		
		System.out.println("Digite o preço do produto: ");
		preçoUnit = entrada.nextDouble();
		
		total = preçoUnit* qtdUnit;
		
		if(qtdUnit <= 5) {
			desconto = total *0.02;
			total = total - desconto;
		}else if(qtdUnit <= 10) {
			desconto = total *0.03;
			total = total - desconto;
		}else if(qtdUnit > 10){
			desconto = total *0.05;
			total = total - desconto;
		}
		System.out.println("O com desconto é: "+ total);
	}

}
