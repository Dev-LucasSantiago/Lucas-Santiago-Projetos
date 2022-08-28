import java.util.Scanner;

public class Terceira {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1,n2,n3,n4,media;
		
		System.out.println("Primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Terceira nota: ");
		n3 = entrada.nextDouble();
		
		System.out.println("Quarta nota: ");
		n4 = entrada.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Sua média é: "+media);
	}

}
