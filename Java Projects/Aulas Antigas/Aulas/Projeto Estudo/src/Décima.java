import java.util.Scanner;

public class D�cima {
	/* Fa�a um algoritmo para ler: a quantidade adquirida e o pre�o unit�rio. Calcular e
	escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total a
	pagar (total a pagar = total - desconto), sabendo-se que:
	- Se quantidade <= 5 o desconto ser� de 2%
	- Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
	- Se quantidade > 10 o desconto ser� de 5% */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double qtdUnit, pre�oUnit, total, desconto;
		
		System.out.println("Digite a quantidade do produto: ");
		qtdUnit = entrada.nextDouble();
		
		System.out.println("Digite o pre�o do produto: ");
		pre�oUnit = entrada.nextDouble();
		
		total = pre�oUnit* qtdUnit;
		
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
		System.out.println("O com desconto �: "+ total);
	}

}
