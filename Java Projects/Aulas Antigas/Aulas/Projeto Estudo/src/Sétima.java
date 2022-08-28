import java.util.Scanner;

public class Sétima {
//Fazer um programa para ler um valor numérico qualquer x e dois valores a e b tais que
//	a < b, teste se x está no intervalo fechado [a,b].
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float x;
		float a = 10;
		float b = 20;
		
		System.out.println("Digite um Valor: ");
		x = entrada.nextFloat();
		
		if(x > a){
			if(x < b) {
				System.out.println("A:"+a+" - X:"+x+" - B:"+b);
			}else {
				System.out.println("A:"+a+" - B: "+b);
			}
		}else {
			System.out.println("A:"+a+" - B:"+b);
		}
	}

}
