import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double base, altura,area,perimetro;
		
		System.out.println("Digite a base do ret�ngulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Digite a altura do ret�ngulo: ");
		altura = entrada.nextFloat();
		
		area = base*altura;
		
		perimetro = (base+altura)*2;
		
		System.out.println("A �rea do ret�ngulo �: "+ area);
		
		System.out.println("O per�metro do ret�ngulo �: "+ perimetro);
		
	}

}
