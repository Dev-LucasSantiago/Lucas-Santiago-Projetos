import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float[][] notas = new float [3][2];
		
		int i,j;
		
		for(i=0;i<3;i++) {
			System.out.println("Digite a nota do Aluno - "+(i+1));
			for(j=0;j<2;j++) {
				System.out.println("Digite a nota - "+ (j+1));
				notas[i][j] = leitor.nextFloat();
			}
		}
		System.out.println("---Relatório de Notas---");
		
		for(i=0;i<3;i++) {
			System.out.println("Nota do Aluno - "+(i+1));
			for(j=0;j<2;j++) {
				System.out.println("Nota "+ (notas[i][j]));
			}
		}
		leitor.close();
	}

}
