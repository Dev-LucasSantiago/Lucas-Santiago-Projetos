import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x1=0, x2=0, y=0, z=0,i=0;
		
		System.out.println("Digite o valor de x1: ");
		x1 = entrada.nextInt();
		
		System.out.println("Digite o valor de x2: ");
		x2 = entrada.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = entrada.nextInt();
		
		while(x1 < x2) {
			for(i=1; i<=4; i++) {
				if(y>i) {
					z=z+1;
				}else {
					z=z+2;
				}
			}
			x1=x1+1;
		}
		System.out.println(z);
	}

}
