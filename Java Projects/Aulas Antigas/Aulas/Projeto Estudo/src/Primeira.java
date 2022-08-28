import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2,soma;
		
		System.out.println("Digite o número 1: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o número 2: ");
		n2 = entrada.nextInt();
		
		
		soma = n1 + n2;
		
		System.out.println("A soma dos dois números é: "+ soma);
	}

}
