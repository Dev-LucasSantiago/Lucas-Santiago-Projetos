import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // (°F - 32) x5/9 = °C
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor em °F: ");
        double F = scan.nextDouble();
        
        final double ajuste = 32;
        final double x = 5.0/9.0;

        double celsius = x*(F - ajuste);

         System.out.print(celsius+" °C");
    }
}
