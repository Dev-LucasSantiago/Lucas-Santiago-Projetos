import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
			int tam;
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite o tamanho do vetor: ");;
			tam = leitor.nextInt();
			
			int[] vet = new int[tam];
			
			for(int i = 0; i<tam; i++) {
				vet[i]= i+1;
			}
			
			for(int i=0; i<tam; i++) {
				System.out.println(vet[i]);
			}
			leitor.close();
	}

}
