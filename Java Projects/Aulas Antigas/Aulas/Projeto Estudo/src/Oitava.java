import java.util.Scanner;

public class Oitava {
	//Fazer um programa que imprima qual o menor e qual o maior valor de dois números A
	//e B, lidos através do teclado.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Valor de A: ");
		a = entrada.nextFloat();
		
		System.out.println("Valor de B: ");
		b = entrada.nextFloat();
		
		if(a > b ){
			System.out.println("Valor A:"+a+" É maior que B:"+b);
		}else {
			System.out.println("Valor B:"+b+" É maior que A:"+a);
		}
	}

}
