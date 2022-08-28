package PrimeiraQuestao;
import java.util.Scanner;


public class primeira01 {

	public static void main(String[] args) {
        ListaLigada<Integer> prodQtd = new ListaLigada<Integer>(); 
        ListaLigada<Integer> prodbatch = new ListaLigada<Integer>();
        ListaLigada<Double> prodPreco = new ListaLigada<Double>();
        Scanner sc = new Scanner(System.in);
        double price, discount;
        int mfbatch, quantity;
        
        System.out.println("Quantos produtos você vai adicionar ? ");
        int products = sc.nextInt();
        
        for (int i = 0; i < products; i++) {
            System.out.printf("Código do fabricante do produto #%d:", i+1);
            mfbatch = (int) Math.floor(Math.random() * 9999);
            prodbatch.Adiciona(mfbatch);
            System.out.println(mfbatch);
            
            System.out.printf("Preço do produto por unidade #%d $", i+1);
            do {
                price = Math.floor(Math.random() * 99);
            } while (price < 0);
            prodPreco.Adiciona(price);
            System.out.println(price);
            
            System.out.printf("Tamanho do estoque do produto #%d:", i+1);
            do {
                quantity = (int) Math.floor(Math.random() * 9999);
            } while (quantity < 500);
            prodQtd.Adiciona(quantity);
            System.out.println(quantity);
            System.out.println("---");
        }
        
        System.out.print("Imposto de desconto:");
        discount = sc.nextDouble();
        System.out.println("[DADOS ATUALIZADOS]");
        for (int i = 0; i < products; i++) {
            double x = prodPreco.get(i).getValor();
            prodPreco.Remove(i+1);
            prodPreco.Adiciona((x - x * discount) / 100);
            System.out.printf("Produto %d: $%.2f\n", prodbatch.get(i).getValor(), prodPreco.get(i).getValor());
        }
        sc.close();
    }

}
