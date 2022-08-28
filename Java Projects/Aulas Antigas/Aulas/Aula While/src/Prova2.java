import java.util.Scanner;

public class Prova2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float idade;
		
		System.out.println("Digite a idade do participante: ");
		idade = entrada.nextFloat();
		
		if(idade >= 18) {
			System.out.println("Participante Adulto");
		} else{
			if(idade >= 16) {
				System.out.println("Participante Juvenil");
			}else {
				if(idade >= 14) {
					System.out.println("Participante Infantil");
				}else {
					if(idade >= 12) {
						System.out.println("Participante Mirim");
					}else {
						if(idade >= 10) {
							System.out.println("Mirim, mas não participa");
						} else {
							System.out.println("Não participa");
						}
					}
				}
			}
		}
	}

}
