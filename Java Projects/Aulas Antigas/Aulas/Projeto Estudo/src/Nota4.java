import java.util.Scanner;

public class Nota4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1,nota2,nota3,nota4, media;
		
		
		System.out.println("Digite a sua 1� nota:");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a sua 2� nota:");
		nota2 = entrada.nextDouble();
		
		System.out.println("Digite a sua 3� nota:");
		nota3 = entrada.nextDouble();
		
		System.out.println("Digite a sua 4� nota:");
		nota4 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 6) {
			System.out.println("Sua m�dia � "+ media);
			System.out.println("Voc� foi Aprovado!");
		}else {
			System.out.println("Sua m�dia � "+ media);
			System.out.println("Voc� foi Reprovado!");
		}
	}

}
