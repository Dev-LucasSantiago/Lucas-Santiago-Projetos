import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		Scanner Leitor = new Scanner(System.in);
		Venda Lojinha = new Venda();
		 
		System.out.println("Digite o produto :");
		Lojinha.Produto = Leitor.next();
		
		
		System.out.println("O produto listado é : "+Lojinha.Produto);
		Leitor.close();
	}

}
