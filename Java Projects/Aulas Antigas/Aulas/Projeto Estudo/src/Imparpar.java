import java.util.*;
public class Imparpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println("Este n�mero � PAR!");
		} else if(numero % 2 == 1){
			System.out.println("Este n�mero � �MPAR!");
		}
		
	}

}
