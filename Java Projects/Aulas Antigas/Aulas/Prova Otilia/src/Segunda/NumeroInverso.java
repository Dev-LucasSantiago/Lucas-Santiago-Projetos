package Segunda;

import java.util.Scanner;

public class NumeroInverso {

	    public static void main(String[] args) {
	    	Scanner print = new Scanner(System.in);
	    	System.out.print("Digite o numero invertido: ");
	    	int numero = print.nextInt();
	        System.out.println("O numero invertido é: "+inverter(numero, 0));
	        print.close();
	    }

	    private static int inverter(int n, int total) {
	        if (n == 0)
	            return total;
	        else return inverter(n / 10, total *10 + n % 10);
	    }
	    
	}


