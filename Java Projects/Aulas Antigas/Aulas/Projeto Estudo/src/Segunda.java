import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double base, altura,area,perimetro;
		
		System.out.println("Digite a base do retângulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Digite a altura do retângulo: ");
		altura = entrada.nextFloat();
		
		area = base*altura;
		
		perimetro = (base+altura)*2;
		
		System.out.println("A área do retângulo é: "+ area);
		
		System.out.println("O perímetro do retângulo é: "+ perimetro);
		
	}

}
