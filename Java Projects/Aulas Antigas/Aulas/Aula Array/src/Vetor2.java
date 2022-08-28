import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[5];
		
		System.out.println("Digite 5 números: ");
		
		for(int i = 0; i < 5; i++){
			System.out.println("Numero "+i+1+": ");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
		leitor.close();
	}

}
