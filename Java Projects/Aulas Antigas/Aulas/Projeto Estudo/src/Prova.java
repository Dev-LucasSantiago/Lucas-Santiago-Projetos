import java.util.Scanner;

public class Prova {

		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			int Vetor = 2;
			
			float F[] = new float [Vetor];
			float G[] = new float [Vetor];
			
			for (int i = 0; i < Vetor; i++) {
				System.out.println("Digite o "+(i+1)+"° valor de F: ");
				F[i] = leitor.nextInt();
			}
			for (int i = 0; i < Vetor; i++ ) {
				System.out.println("Digite o "+(i+1)+"° valor de G: ");
				G[i] = leitor.nextInt();
			}
			
			for (int i = 0; i < Vetor; i++) {
				System.out.println("O valor de F.G é: " + (G[i] * F[i]));
			}
			leitor.close();
		}
	}