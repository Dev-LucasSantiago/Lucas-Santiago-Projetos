import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		float numero=0, soma, media;
		for(i=1; i<=100; i++) {
			System.out.println("Digite o "+i+"� pre�o: ");
			soma = entrada.nextFloat();
			
			numero += soma;
		}
		media = numero /100;
		System.out.println("A m�dia dos pre�os �: "+ media);
	}

}
