import java.util.Scanner;

public class Sexta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1,n2;
		System.out.print("Digite o primeiro número: ");
		n1=entrada.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		n2=entrada.nextFloat();
		
		if(n1 < n2) {
			System.out.println(n1+" - "+n2);
		}else {
			System.out.println(n2+" - "+n1);
		}
	}

}
